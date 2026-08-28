import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dwj extends dnc {
   public static final MapCodec<dwj> a = b(dwj::new);
   public static final ece b = ebu.aH;
   public static final ece c = ebu.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final fgk g = dnc.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fgk h = dnc.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<dwj> a() {
      return a;
   }

   public dwj(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(djx $$0, iv $$1, ebe $$2, bwt $$3) {
      if (!$$3.cd()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(djx $$0, ebe $$1, iv $$2, bwt $$3, double $$4) {
      if (!($$3 instanceof cps)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(djx $$0, ebe $$1, iv $$2, bwt $$3, int $$4) {
      if ($$1.a(dne.mL) && $$0 instanceof ars $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(djx $$0, iv $$1, ebe $$2) {
      $$0.a(null, $$1, awp.Bm, awq.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ege.f, $$1, ege.a.a($$2));
         $$0.c(2001, $$1, dnc.j($$2));
      }
   }

   @Override
   protected void b(ebe $$0, ars $$1, iv $$2, azx $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awp.Bn, awq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ege.c, $$2, ege.a.a($$0));
         } else {
            $$1.a(null, $$2, awp.Bo, awq.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ege.f, $$2, ege.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dnc.j($$0));
               ckr $$6 = bxc.bC.a($$1, bxb.e);
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

   public static boolean a(djb $$0, iv $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(djb $$0, iv $$1) {
      return $$0.a_($$1).a(axe.J);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, ebe $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(djx $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(djx $$0, crx $$1, iv $$2, ebe $$3, @Nullable dyc $$4, czy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(ebe $$0, ddr $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public ebe a(ddr $$0) {
      ebe $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected fgk a(ebe $$0, djb $$1, iv $$2, ffv $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c);
   }

   private boolean a(ars $$0, bwt $$1) {
      if ($$1 instanceof ckr || $$1 instanceof cjd) {
         return false;
      } else {
         return !($$1 instanceof bxu) ? false : $$1 instanceof crx || $$0.O().c(djt.d);
      }
   }
}
