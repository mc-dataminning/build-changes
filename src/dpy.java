import com.mojang.serialization.MapCodec;

public class dpy extends dmq {
   public static final MapCodec<dpy> b = b(dpy::new);
   public static final dyl c = dyk.x;

   @Override
   public MapCodec<dpy> a() {
      return b;
   }

   public dpy(dxt.d $$0) {
      super($$0);
      this.l(this.F.b().b(a, jm.d).b(c, Boolean.valueOf(false)));
   }

   @Override
   protected void a(dxv.a<dkl, dxu> $$0) {
      $$0.a(a, c);
   }

   @Override
   protected dxu a(dxu $$0, drb $$1) {
      return $$0.b(a, $$1.a($$0.c(a)));
   }

   @Override
   protected dxu a(dxu $$0, dpk $$1) {
      return $$0.a($$1.a($$0.c(a)));
   }

   @Override
   protected void a(dxu $$0, ash $$1, jh $$2, bam $$3) {
      if ($$0.c(c)) {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(false)), 2);
      } else {
         $$1.a($$2, $$0.b(c, Boolean.valueOf(true)), 2);
         $$1.a($$2, this, 2);
      }

      this.a($$1, $$2, $$0);
   }

   @Override
   protected dxu a(dxu $$0, dhk $$1, dhw $$2, jh $$3, jm $$4, jh $$5, dxu $$6, bam $$7) {
      if ($$0.c(a) == $$4 && !$$0.c(c)) {
         this.a($$1, $$2, $$3);
      }

      return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   private void a(dhk $$0, dhw $$1, jh $$2) {
      if (!$$0.B_() && !$$1.T().a($$2, this)) {
         $$1.a($$2, this, 2);
      }
   }

   protected void a(dhh $$0, jh $$1, dxu $$2) {
      jm $$3 = $$2.c(a);
      jh $$4 = $$1.a($$3.g());
      eve $$5 = eva.a($$0, $$3.g(), null);
      $$0.b($$4, this, $$5);
      $$0.a($$4, this, $$3, $$5);
   }

   @Override
   protected boolean f_(dxu $$0) {
      return true;
   }

   @Override
   protected int b(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.a($$1, $$2, $$3);
   }

   @Override
   protected int a(dxu $$0, dgm $$1, jh $$2, jm $$3) {
      return $$0.c(c) && $$0.c(a) == $$3 ? 15 : 0;
   }

   @Override
   protected void b(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.B_() && $$0.c(c) && !$$1.T().a($$2, this)) {
            dxu $$5 = $$0.b(c, Boolean.valueOf(false));
            $$1.a($$2, $$5, 18);
            this.a($$1, $$2, $$5);
         }
      }
   }

   @Override
   protected void a(dxu $$0, dhh $$1, jh $$2, dxu $$3, boolean $$4) {
      if (!$$0.a($$3.b())) {
         if (!$$1.C && $$0.c(c) && $$1.T().a($$2, this)) {
            this.a($$1, $$2, $$0.b(c, Boolean.valueOf(false)));
         }
      }
   }

   @Override
   public dxu a(dbf $$0) {
      return this.m().b(a, $$0.d().g().g());
   }
}
