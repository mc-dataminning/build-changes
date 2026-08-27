import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dsi {
   public static final Codec<dsi> h = jb.aa.q().dispatch(dsi::a, dsj::a);

   protected abstract dsj<?> a();

   public abstract void a(dsi.a var1);

   public static final class a {
      private final cpr a;
      private final BiConsumer<gu, dez> b;
      private final aru c;
      private final ObjectArrayList<gu> d;
      private final ObjectArrayList<gu> e;
      private final ObjectArrayList<gu> f;

      public a(cpr $$0, BiConsumer<gu, dez> $$1, aru $$2, Set<gu> $$3, Set<gu> $$4, Set<gu> $$5) {
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

      public void a(gu $$0, dfq $$1) {
         this.a($$0, csm.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gu $$0, dez $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gu $$0) {
         return this.a.a($$0, dey.a::i);
      }

      public cpr a() {
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
