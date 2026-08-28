import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends dhv {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dwl<jm> b = dwe.P;
   public static final dwf c = dwe.u;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jm.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C && $$1.c_($$2) instanceof dsk $$5) {
         $$3.a($$5);
         $$3.a(awy.ar);
         cng.a($$3, true);
      }

      return bsh.a;
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dvo $$3, boolean $$4) {
      bsd.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dvo $$0, arq $$1, jh $$2, azv $$3) {
      dsr $$4 = $$1.c_($$2);
      if ($$4 instanceof dsk) {
         ((dsk)$$4).k();
      }
   }

   @Nullable
   @Override
   public dsr a(jh $$0, dvo $$1) {
      return new dsk($$0, $$1);
   }

   @Override
   protected dop a_(dvo $$0) {
      return dop.c;
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
   protected dvo a(dvo $$0, dow $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dvo a(dvo $$0, dnf $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dvo a(czw $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
