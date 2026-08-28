import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dey extends diu {
   public static final MapCodec<dey> a = b(dey::new);
   public static final dtw b = dju.aE;
   private static final exv c = dfy.a(2.0, 0.0, 2.0, 14.0, 4.0, 14.0);
   private static final exv d = dfy.a(3.0, 4.0, 4.0, 13.0, 5.0, 12.0);
   private static final exv e = dfy.a(4.0, 5.0, 6.0, 12.0, 10.0, 10.0);
   private static final exv f = dfy.a(0.0, 10.0, 3.0, 16.0, 16.0, 13.0);
   private static final exv g = dfy.a(4.0, 4.0, 3.0, 12.0, 5.0, 13.0);
   private static final exv h = dfy.a(6.0, 5.0, 4.0, 10.0, 10.0, 12.0);
   private static final exv i = dfy.a(3.0, 10.0, 0.0, 13.0, 16.0, 16.0);
   private static final exv j = exs.a(c, d, e, f);
   private static final exv k = exs.a(c, g, h, i);
   private static final wz l = wz.c("container.repair");
   private static final float m = 2.0F;
   private static final int n = 40;

   @Override
   public MapCodec<dey> a() {
      return a;
   }

   public dey(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, ji.c));
   }

   @Override
   public dtc a(cyd $$0) {
      return this.o().a(b, $$0.g().h());
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, ewy $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avz.aC);
         return bqr.c;
      }
   }

   @Nullable
   @Override
   protected bqv b(dtc $$0, dcw $$1, jd $$2) {
      return new brb(($$2x, $$3, $$4) -> new cpw($$2x, $$3, cqg.a($$1, $$2)), l);
   }

   @Override
   protected exv a(dtc $$0, dcc $$1, jd $$2, exh $$3) {
      ji $$4 = $$0.c(b);
      return $$4.o() == ji.a.a ? j : k;
   }

   @Override
   protected void a(cjg $$0) {
      $$0.b(2.0F, 40);
   }

   @Override
   public void a(dcw $$0, jd $$1, dtc $$2, dtc $$3, cjg $$4) {
      if (!$$4.aX()) {
         $$0.c(1031, $$1, 0);
      }
   }

   @Override
   public void a(dcw $$0, jd $$1, cjg $$2) {
      if (!$$2.aX()) {
         $$0.c(1029, $$1, 0);
      }
   }

   @Override
   public brk a(bsr $$0) {
      return $$0.dP().b($$0);
   }

   @Nullable
   public static dtc e(dtc $$0) {
      if ($$0.a(dga.gS)) {
         return dga.gT.o().a(b, $$0.c(b));
      } else {
         return $$0.a(dga.gT) ? dga.gU.o().a(b, $$0.c(b)) : null;
      }
   }

   @Override
   protected dtc a(dtc $$0, dmm $$1) {
      return $$0.a(b, $$1.a($$0.c(b)));
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b);
   }

   @Override
   protected boolean a(dtc $$0, ept $$1) {
      return false;
   }

   @Override
   public int b(dtc $$0, dcc $$1, jd $$2) {
      return $$0.d($$1, $$2).ak;
   }
}
