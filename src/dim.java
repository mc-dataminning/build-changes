import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dim extends dmj {
   public static final MapCodec<dim> a = b(dim::new);
   public static final dxu<jn> b = dnk.aF;
   private static final fbu c = djm.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fbu d = djm.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fbu e = djm.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fbu f = djm.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fbu g = djm.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fbu h = djm.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fbu i = djm.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fbu j = fbr.a(c, d, e, f);
   private static final fbu k = fbr.a(c, g, h, i);
   private static final wp l = wp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dim> a() {
      return a;
   }

   public dim(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwx a(dag $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsk a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aC);
      }

      return bsk.a;
   }

   @Nullable
   @Override
   protected bsm b(dwx $$0, dgi $$1, ji $$2) {
      return new bss(($$2x, $$3, $$4) -> new csf($$2x, $$3, csp.a($$1, $$2)), l);
   }

   @Override
   protected fbu a(dwx $$0, dfn $$1, ji $$2, fbf $$3) {
      jn $$4 = $$0.c(b);
      return $$4.o() == jn.a.a ? j : k;
   }

   @Override
   protected void a(clb $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgi $$0, ji $$1, dwx $$2, dwx $$3, clb $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgi $$0, ji $$1, clb $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btb a(bul $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dwx e(dwx $$0) {
      if ($$0.a(djo.hp)) {
         return djo.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(djo.hq) ? djo.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dwx a(dwx $$0, dqe $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwx $$0, eto $$1) {
      return false;
   }

   @Override
   public int b(dwx $$0, dfn $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
