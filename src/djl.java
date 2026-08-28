import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class djl extends dke implements drl {
   public static final MapCodec<djl> a = b(djl::new);
   public static final dyh b = dyg.I;

   @Override
   public MapCodec<djl> a() {
      return a;
   }

   protected djl(dxp.d $$0) {
      super($$0);
      this.l(this.m().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected boolean e_(dxq $$0) {
      return $$0.y().c();
   }

   @Override
   protected dqp a_(dxq $$0) {
      return dqp.a;
   }

   @Override
   protected float c(dxq $$0, dgf $$1, ji $$2) {
      return 1.0F;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$0.c(b)) {
         $$2.a($$3, etx.c, etx.c.a($$1));
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      return this.m().b(b, Boolean.valueOf($$0.q().b_($$0.a()).a() == etx.c));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   public cxh a(@Nullable bvy $$0, dha $$1, ji $$2, dxq $$3) {
      if ($$0 instanceof cpr $$4 && $$4.b()) {
         return drl.super.a($$0, $$1, $$2, $$3);
      }

      return cxh.k;
   }

   @Override
   public boolean a(@Nullable bvy $$0, dgf $$1, ji $$2, dxq $$3, etv $$4) {
      if ($$0 instanceof cpr $$5 && $$5.b()) {
         return drl.super.a($$0, $$1, $$2, $$3, $$4);
      }

      return false;
   }
}
