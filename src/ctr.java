import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public abstract class ctr extends cum {
   private final cjx a;

   protected ctr(cjx $$0, dhh.d $$1) {
      super($$1);
      this.a = $$0;
   }

   @Override
   protected abstract MapCodec<? extends ctr> a();

   @Override
   public boolean a(dhi $$0) {
      return true;
   }

   @Override
   public dfd a(ht $$0, dhi $$1) {
      return new det($$0, $$1, this.a);
   }

   @Override
   public void a(csa $$0, ht $$1, dhi $$2, @Nullable blg $$3, clj $$4) {
      if ($$0.B) {
         $$0.a($$1, dff.t).ifPresent($$1x -> $$1x.b($$4));
      } else if ($$4.A()) {
         $$0.a($$1, dff.t).ifPresent($$1x -> $$1x.a($$4.y()));
      }
   }

   @Override
   public clj a(csd $$0, ht $$1, dhi $$2) {
      dfd $$3 = $$0.c_($$1);
      return $$3 instanceof det ? ((det)$$3).f() : super.a($$0, $$1, $$2);
   }

   public cjx b() {
      return this.a;
   }
}
