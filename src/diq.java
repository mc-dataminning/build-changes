import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class diq extends diw {
   public static final MapCodec<diq> a = b(diq::new);
   public static final dxs<jn> b = dxl.S;
   public static final dxm c = dxl.z;

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   public diq(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if ($$1 instanceof arc $$5 && $$1.c_($$2) instanceof dtq $$6) {
         $$3.a($$6);
         $$3.a(awj.ar);
         cnk.a($$5, $$3, true);
      }

      return bsi.a;
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      bse.a($$0, $$3, $$1, $$2);
      super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   protected void a(dwv $$0, arc $$1, ji $$2, azg $$3) {
      dtx $$4 = $$1.c_($$2);
      if ($$4 instanceof dtq) {
         ((dtq)$$4).k();
      }
   }

   @Nullable
   @Override
   public dtx a(ji $$0, dwv $$1) {
      return new dtq($$0, $$1);
   }

   @Override
   protected boolean c_(dwv $$0) {
      return true;
   }

   @Override
   protected int a(dwv $$0, dgg $$1, ji $$2) {
      return csa.a($$1.c_($$2));
   }

   @Override
   protected dwv a(dwv $$0, dqc $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected dwv a(dwv $$0, doj $$1) {
      return $$0.a($$1.a($$0.c(b)));
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c);
   }

   @Override
   public dwv a(dae $$0) {
      return this.m().b(b, $$0.d().g());
   }
}
