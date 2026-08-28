import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class din extends dmk {
   public static final MapCodec<din> a = b(din::new);
   public static final dxv<jn> b = dnl.aF;
   private static final fbv c = djn.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final fbv d = djn.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final fbv e = djn.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final fbv f = djn.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final fbv g = djn.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final fbv h = djn.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final fbv i = djn.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final fbv j = fbs.a(c, d, e, f);
   private static final fbv k = fbs.a(c, g, h, i);
   private static final wp l = wp.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<din> a() {
      return a;
   }

   public din(dwx.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, jn.c));
   }

   @Override
   public dwy a(dah $$0) {
      return this.m().b(b, $$0.g().h());
   }

   @Override
   protected bsl a(dwy $$0, dgj $$1, ji $$2, coy $$3, fax $$4) {
      if (!$$1.C) {
         $$3.a($$0.c($$1, $$2));
         $$3.a(awk.aC);
      }

      return bsl.a;
   }

   @Nullable
   @Override
   protected bsn b(dwy $$0, dgj $$1, ji $$2) {
      return new bst(($$2x, $$3, $$4) -> new csg($$2x, $$3, csq.a($$1, $$2)), l);
   }

   @Override
   protected fbv a(dwy $$0, dfo $$1, ji $$2, fbg $$3) {
      jn $$4 = $$0.c(b);
      return $$4.o() == jn.a.a ? j : k;
   }

   @Override
   protected void a(clc $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dgj $$0, ji $$1, dwy $$2, dwy $$3, clc $$4) {
      if (!$$4.bb()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dgj $$0, ji $$1, clc $$2) {
      if (!$$2.bb()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public btc a(bum $$0) {
      return $$0.dW().b($$0);
   }

   @Nullable
   public static dwy e(dwy $$0) {
      if ($$0.a(djp.hp)) {
         return djp.hq.m().b(b, $$0.c(b));
      } else {
         return $$0.a(djp.hq) ? djp.hr.m().b(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dwy a(dwy $$0, dqf $$1) {
      return $$0.b(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dwz.a<djn, dwy> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dwy $$0, etp $$1) {
      return false;
   }

   @Override
   public int b(dwy $$0, dfo $$1, ji $$2) {
      return $$0.a($$1, $$2).ak;
   }
}
