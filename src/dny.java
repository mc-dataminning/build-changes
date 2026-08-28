import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dny extends dke implements drl {
   public static final MapCodec<dny> a = b(dny::new);
   private static final dyh b = dyg.I;
   private static final fcr c = dke.b(12.0, 10.0, 16.0);

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   protected dny(dxp.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxr.a<dke, dxq> $$0) {
      $$0.a(b);
   }

   @Override
   protected etw b_(dxq $$0) {
      return $$0.c(b) ? etx.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxq a(dax $$0) {
      dxq $$1 = super.a($$0);
      if ($$1 != null) {
         etw $$2 = $$0.q().b_($$0.a());
         return $$1.b(b, Boolean.valueOf($$2.a() == etx.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxq $$0, dhc $$1, ji $$2) {
      ji $$3 = $$2.d();
      dxq $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jn.a);
   }

   @Override
   protected fcr a(dxq $$0, dgf $$1, ji $$2, fcc $$3) {
      return c;
   }

   @Override
   protected dxq a(dxq $$0, dhc $$1, dho $$2, ji $$3, jn $$4, ji $$5, dxq $$6, azh $$7) {
      if ($$4 == jn.b && !this.a($$0, $$1, $$3)) {
         return dkg.a.m();
      } else {
         if ($$0.c(b)) {
            $$2.a($$3, etx.c, etx.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
