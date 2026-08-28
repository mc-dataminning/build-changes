import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnw extends dkd implements drj {
   public static final MapCodec<dnw> a = b(dnw::new);
   private static final dyf c = dye.J;
   protected static final fcl b = dkd.a(2.0, 10.0, 2.0, 14.0, 16.0, 14.0);

   @Override
   public MapCodec<dnw> a() {
      return a;
   }

   protected dnw(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(c);
   }

   @Override
   protected etq b_(dxo $$0) {
      return $$0.c(c) ? etr.c.a(false) : super.b_($$0);
   }

   @Nullable
   @Override
   public dxo a(dax $$0) {
      dxo $$1 = super.a($$0);
      if ($$1 != null) {
         etq $$2 = $$0.q().b_($$0.a());
         return $$1.b(c, Boolean.valueOf($$2.a() == etr.c));
      } else {
         return null;
      }
   }

   @Override
   protected boolean a(dxo $$0, dhc $$1, jh $$2) {
      jh $$3 = $$2.d();
      dxo $$4 = $$1.a_($$3);
      return $$4.c($$1, $$3, jm.a);
   }

   @Override
   protected fcl a(dxo $$0, dge $$1, jh $$2, fbw $$3) {
      return b;
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      if ($$4 == jm.b && !this.a($$0, $$1, $$3)) {
         return dkf.a.m();
      } else {
         if ($$0.c(c)) {
            $$2.a($$3, etr.c, etr.c.a($$1));
         }

         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      }
   }
}
