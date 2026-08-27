import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class dpk {
   public static final Codec<dpk> h = jb.aa.q().dispatch(dpk::a, dpl::a);

   protected abstract dpl<?> a();

   public abstract void a(dpk.a var1);

   public static final class a {
      private final cms a;
      private final BiConsumer<gu, dcb> b;
      private final apf c;
      private final ObjectArrayList<gu> d;
      private final ObjectArrayList<gu> e;
      private final ObjectArrayList<gu> f;

      public a(cms $$0, BiConsumer<gu, dcb> $$1, apf $$2, Set<gu> $$3, Set<gu> $$4, Set<gu> $$5) {
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

      public void a(gu $$0, dcs $$1) {
         this.a($$0, cpo.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(gu $$0, dcb $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(gu $$0) {
         return this.a.a($$0, dca.a::i);
      }

      public cms a() {
         return this.a;
      }

      public apf b() {
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
