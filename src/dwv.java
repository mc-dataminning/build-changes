import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwv extends dno {
   public static final MapCodec<dwv> a = b(dwv::new);
   public static final ecq b = ecg.aH;
   public static final ecq c = ecg.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fgw g = dno.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fgw h = dno.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dwv> a() {
      return a;
   }

   public dwv(ebp.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(dkj $$0, iw $$1, ebq $$2, bxe $$3) {
      if (!$$3.cd()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, double $$4) {
      if (!($$3 instanceof cqd)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dkj $$0, ebq $$1, iw $$2, bxe $$3, int $$4) {
      if ($$1.a(dnq.mL) && $$0 instanceof asb $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dkj $$0, iw $$1, ebq $$2) {
      $$0.a(null, $$1, awy.Bm, awz.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(egq.f, $$1, egq.a.a($$2));
         $$0.c(2001, $$1, dno.j($$2));
      }
   }

   @Override
   protected void b(ebq $$0, asb $$1, iw $$2, bai $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awy.Bn, awz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(egq.c, $$2, egq.a.a($$0));
         } else {
            $$1.a(null, $$2, awy.Bo, awz.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(egq.f, $$2, egq.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dno.j($$0));
               clc $$6 = bxn.bC.a($$1, bxm.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.h($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(djn $$0, iw $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(djn $$0, iw $$1) {
      return $$0.a_($$1).a(axn.J);
   }

   @Override
   protected void a(ebq $$0, dkj $$1, iw $$2, ebq $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dkj $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dkj $$0, csi $$1, iw $$2, ebq $$3, @Nullable dyo $$4, dak $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(ebq $$0, ded $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public ebq a(ded $$0) {
      ebq $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected fgw a(ebq $$0, djn $$1, iw $$2, fgh $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(ebr.a<dno, ebq> $$0) {
      $$0.a(b, c);
   }

   private boolean a(asb $$0, bxe $$1) {
      if ($$1 instanceof clc || $$1 instanceof cjo) {
         return false;
      } else {
         return !($$1 instanceof byf) ? false : $$1 instanceof csi || $$0.O().c(dkf.d);
      }
   }
}
