import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dtu extends dku {
   public static final MapCodec<dtu> a = b(dtu::new);
   public static final dzm b = dzc.aH;
   public static final dzm c = dzc.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fdo g = dku.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fdo h = dku.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dtu> a() {
      return a;
   }

   public dtu(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(dhp $$0, jj $$1, dym $$2, bvs $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dhp $$0, dym $$1, jj $$2, bvs $$3, double $$4) {
      if (!($$3 instanceof coc)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dhp $$0, dym $$1, jj $$2, bvs $$3, int $$4) {
      if ($$1.a(dkw.mH) && $$0 instanceof arn $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dhp $$0, jj $$1, dym $$2) {
      $$0.a(null, $$1, awk.Bg, awl.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(edm.f, $$1, edm.a.a($$2));
         $$0.c(2001, $$1, dku.j($$2));
      }
   }

   @Override
   protected void b(dym $$0, arn $$1, jj $$2, azs $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awk.Bh, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(edm.c, $$2, edm.a.a($$0));
         } else {
            $$1.a(null, $$2, awk.Bi, awl.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(edm.f, $$2, edm.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dku.j($$0));
               cjk $$6 = bwb.bA.a($$1, bwa.e);
               if ($$6 != null) {
                  $$6.c_(-24000);
                  $$6.i($$2);
                  $$6.b((double)$$2.u() + 0.3 + (double)$$5 * 0.2, (double)$$2.v(), (double)$$2.w() + 0.3, 0.0F, 0.0F);
                  $$1.b($$6);
               }
            }
         }
      }
   }

   public static boolean a(dgv $$0, jj $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dgv $$0, jj $$1) {
      return $$0.a_($$1).a(awz.J);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dym $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dhp $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dhp $$0, cqi $$1, jj $$2, dym $$3, @Nullable dvl $$4, cxy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dym $$0, dbn $$1) {
      return !$$1.h() && $$1.n().a(this.i()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dym a(dbn $$0) {
      dym $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected fdo a(dym $$0, dgv $$1, jj $$2, fcz $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c);
   }

   private boolean a(arn $$0, bvs $$1) {
      if ($$1 instanceof cjk || $$1 instanceof cia) {
         return false;
      } else {
         return !($$1 instanceof bwr) ? false : $$1 instanceof cqi || $$0.O().c(dhl.c);
      }
   }
}
