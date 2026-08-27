import com.mojang.serialization.Codec;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.Comparator;
import java.util.Set;
import java.util.function.BiConsumer;

public abstract class ecr {
   public static final Codec<ecr> h = kr.Z.q().dispatch(ecr::a, ecs::a);

   protected abstract ecs<?> a();

   public abstract void a(ecr.a var1);

   public static final class a {
      private final czd a;
      private final BiConsumer<ib, doz> b;
      private final axr c;
      private final ObjectArrayList<ib> d;
      private final ObjectArrayList<ib> e;
      private final ObjectArrayList<ib> f;

      public a(czd $$0, BiConsumer<ib, doz> $$1, axr $$2, Set<ib> $$3, Set<ib> $$4, Set<ib> $$5) {
         this.a = $$0;
         this.b = $$1;
         this.c = $$2;
         this.f = new ObjectArrayList($$5);
         this.d = new ObjectArrayList($$3);
         this.e = new ObjectArrayList($$4);
         this.d.sort(Comparator.comparingInt(jg::v));
         this.e.sort(Comparator.comparingInt(jg::v));
         this.f.sort(Comparator.comparingInt(jg::v));
      }

      public void a(ib $$0, dpq $$1) {
         this.a($$0, dca.ff.n().a($$1, Boolean.valueOf(true)));
      }

      public void a(ib $$0, doz $$1) {
         this.b.accept($$0, $$1);
      }

      public boolean a(ib $$0) {
         return this.a.a($$0, doy.a::i);
      }

      public czd a() {
         return this.a;
      }

      public axr b() {
         return this.c;
      }

      public ObjectArrayList<ib> c() {
         return this.d;
      }

      public ObjectArrayList<ib> d() {
         return this.e;
      }

      public ObjectArrayList<ib> e() {
         return this.f;
      }
   }
}
