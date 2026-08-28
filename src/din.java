import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class din extends dhv {
   public static final MapCodec<din> a = b(din::new);
   public static final dwf[] b = new dwf[]{dwe.k, dwe.l, dwe.m};
   protected static final fal c = fai.a(dij.a(1.0, 0.0, 1.0, 15.0, 2.0, 15.0), dij.a(7.0, 0.0, 7.0, 9.0, 14.0, 9.0));

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b[0], Boolean.valueOf(false)).b(b[1], Boolean.valueOf(false)).b(b[2], Boolean.valueOf(false)));
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
   }

   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsu($$0, $$1);
   }

   @Nullable
   @Override
   public <T extends dsr> dss<T> a(dff $$0, dvo $$1, dst<T> $$2) {
      return $$0.C ? null : a($$2, dst.l, dsu::a);
   }

   @Override
   protected fal a(dvo $$0, dek $$1, jh $$2, ezw $$3) {
      return c;
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsu $$5) {
         $$3.a($$5);
         $$3.a(awy.aa);
      }

      return bsh.a;
   }

   @Override
   public void a(dvo $$0, dff $$1, jh $$2, azv $$3) {
      double $$4 = (double)$$2.u() + 0.4 + (double)$$3.i() * 0.2;
      double $$5 = (double)$$2.v() + 0.7 + (double)$$3.i() * 0.3;
      double $$6 = (double)$$2.w() + 0.4 + (double)$$3.i() * 0.2;
      $$1.a(ls.ae, $$4, $$5, $$6, 0.0, 0.0, 0.0);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected boolean c_(dvo $$0) {
      return true;
   }

   @Override
   protected int a(dvo $$0, dff $$1, jh $$2) {
      return crs.a($$1.c_($$2));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b[0], b[1], b[2]);
   }

   @Override
   protected boolean a(dvo $$0, esd $$1) {
      return false;
   }
}
