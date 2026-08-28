import com.mojang.serialization.MapCodec;
import java.util.function.Function;
import javax.annotation.Nullable;

public class dtj extends dpx implements dnr {
   public static final MapCodec<dtj> c = b(dtj::new);
   public static final int d = 4;
   public static final ecq e = ecg.aw;
   public static final eco<ecm> f = dpx.b;
   private static final int g = 3;
   private static final int h = 1;
   private static final fgw i = dno.b(6.0, -1.0, 3.0);
   private static final fgw D = dno.b(10.0, -1.0, 5.0);
   private final Function<ebq, fgw> R = this.b();

   @Override
   public MapCodec<dtj> a() {
      return c;
   }

   public dtj(ebp.d $$0) {
      super($$0);
   }

   private Function<ebq, fgw> b() {
      int[] $$0 = new int[]{0, 9, 11, 22, 26};
      return this.a($$1 -> {
         int $$2 = ($$1.c(e) == 0 ? 4 : 6) + $$0[$$1.c(e)];
         int $$3 = $$1.c(e) == 0 ? 6 : 10;

         return switch ((ecm)$$1.c(f)) {
            case b -> dno.b((double)$$3, -1.0, (double)Math.min(16, -1 + $$2));
            case a -> dno.b((double)$$3, 0.0, (double)Math.max(0, -1 + $$2 - 16));
         };
      });
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      return this.m();
   }

   @Override
   public fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return this.R.apply($$0);
   }

   @Override
   public fgw b(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      if ($$0.c(f) == ecm.b) {
         return $$0.c(e) == 0 ? i : D;
      } else {
         return fgt.a();
      }
   }

   @Override
   public ebq a(ebq $$0, dkm $$1, dky $$2, iw $$3, jc $$4, iw $$5, ebq $$6, bai $$7) {
      if (b($$0.c(e))) {
         return super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      } else {
         return $$0.a($$1, $$3) ? $$0 : dnq.a.m();
      }
   }

   @Override
   public boolean a(ebq $$0, dkm $$1, iw $$2) {
      return o($$0) && !b($$1, $$2) ? false : super.a($$0, $$1, $$2);
   }

   @Override
   protected boolean b(ebq $$0, djn $$1, iw $$2) {
      return $$0.a(dnq.cN);
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(e);
      super.a($$0);
   }

   @Override
   public void a(ebq $$0, dkj $$1, iw $$2, bxe $$3, bxx $$4) {
      if ($$1 instanceof asb $$5 && $$3 instanceof cpp && $$5.O().c(dkf.d)) {
         $$5.a($$2, true, $$3);
      }
   }

   @Override
   public boolean a(ebq $$0, ded $$1) {
      return false;
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, byf $$3, dak $$4) {
   }

   @Override
   public boolean f(ebq $$0) {
      return $$0.c(f) == ecm.b && !this.q($$0);
   }

   @Override
   public void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      float $$4 = dpl.a(this, $$1, $$2);
      boolean $$5 = $$3.a((int)(25.0F / $$4) + 1) == 0;
      if ($$5) {
         this.a($$1, $$0, $$2, 1);
      }
   }

   private void a(asb $$0, ebq $$1, iw $$2, int $$3) {
      int $$4 = Math.min($$1.c(e) + $$3, 4);
      if (this.a($$0, $$2, $$1, $$4)) {
         ebq $$5 = $$1.b(e, Integer.valueOf($$4));
         $$0.a($$2, $$5, 2);
         if (b($$4)) {
            $$0.a($$2.d(), $$5.b(f, ecm.a), 3);
         }
      }
   }

   private static boolean a(dkm $$0, iw $$1) {
      ebq $$2 = $$0.a_($$1);
      return $$2.l() || $$2.a(dnq.lh);
   }

   private static boolean b(dkm $$0, iw $$1) {
      return dpl.a($$0, $$1);
   }

   private static boolean o(ebq $$0) {
      return $$0.a(dnq.lh) && $$0.c(f) == ecm.b;
   }

   private static boolean b(int $$0) {
      return $$0 >= 3;
   }

   private boolean a(dkm $$0, iw $$1, ebq $$2, int $$3) {
      return !this.q($$2) && b($$0, $$1) && (!b($$3) || a($$0, $$1.d()));
   }

   private boolean q(ebq $$0) {
      return $$0.c(e) >= 4;
   }

   @Nullable
   private dtj.a c(dkm $$0, iw $$1, ebq $$2) {
      if (o($$2)) {
         return new dtj.a($$1, $$2);
      } else {
         iw $$3 = $$1.e();
         ebq $$4 = $$0.a_($$3);
         return o($$4) ? new dtj.a($$3, $$4) : null;
      }
   }

   @Override
   public boolean a(dkm $$0, iw $$1, ebq $$2) {
      dtj.a $$3 = this.c($$0, $$1, $$2);
      return $$3 == null ? false : this.a($$0, $$3.a, $$3.b, $$3.b.c(e) + 1);
   }

   @Override
   public boolean a(dkj $$0, bai $$1, iw $$2, ebq $$3) {
      return true;
   }

   @Override
   public void a(asb $$0, bai $$1, iw $$2, ebq $$3) {
      dtj.a $$4 = this.c($$0, $$2, $$3);
      if ($$4 != null) {
         this.a($$0, $$4.b, $$4.a, 1);
      }
   }

   static record a(iw a, ebq b) {
   }
}
