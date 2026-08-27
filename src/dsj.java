import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsj {
   public static final Codec<dsj> h = jb.aa.q().dispatch(dsj::a, dsk::a);

   protected abstract dsk<?> a();

   public abstract void a(dsj.a var1);

   public static final class a {
      private final cps a;
      private final BiConsumer<gu, dfa> b;
      private final aru c;
      private final ObjectArrayList<gu> d;
      private final ObjectArrayList<gu> e;
      private final ObjectArrayList<gu> f;

      public a(cps $$0, BiConsumer<gu, dfa> $$1, aru $$2, Set<gu> $$3, Set<gu> $$4, Set<gu> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(hz::v));
         this.e.sort(Comparator.comparingInt(hz::v));
         this.f.sort(Comparator.comparingInt(hz::v));
      }

      public void a(gu $$0, dfr $$1) {
         this.a($$0, csn.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gu $$0, dfa $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gu $$0) {
         return this.a.a($$0, dez.a::i);
      }

      public cps a() {
         return this.a;
      }

      public aru b() {
         return this.c;
      }

      public ObjectArrayList<gu> c() {
         return this.d;
      }

      public ObjectArrayList<gu> d() {
         return this.e;
      }

      public ObjectArrayList<gu> e() {
         return this.f;
      }
   }
}
