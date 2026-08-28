import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class duv extends dlu {
   public static final MapCodec<duv> a = b(duv::new);
   public static final eao b = eae.aH;
   public static final eao c = eae.aG;
   public static final int d = 2;
   public static final int e = 1;
   public static final int f = 4;
   private static final feq g = dlu.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final feq h = dlu.b(14.0, 0.0, 7.0);

   @Override
   public MapCodec<duv> a() {
      return a;
   }

   public duv(dzn.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, Integer.valueOf(0)).b(c, Integer.valueOf(1)));
   }

   @Override
   public void a(dip $$0, iu $$1, dzo $$2, bwa $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dip $$0, dzo $$1, iu $$2, bwa $$3, double $$4) {
      if (!($$3 instanceof com)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dip $$0, dzo $$1, iu $$2, bwa $$3, int $$4) {
      if ($$1.a(dlw.mH) && $$0 instanceof aro $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dip $$0, iu $$1, dzo $$2) {
      $$0.a(null, $$1, awl.Bg, awm.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(c);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(c, Integer.valueOf($$3 - 1)), 2);
         $$0.a(eeo.f, $$1, eeo.a.a($$2));
         $$0.c(2001, $$1, dlu.j($$2));
      }
   }

   @Override
   protected void b(dzo $$0, aro $$1, iu $$2, azt $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(b);
         if ($$4 < 2) {
            $$1.a(null, $$2, awl.Bh, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(b, Integer.valueOf($$4 + 1)), 2);
            $$1.a(eeo.c, $$2, eeo.a.a($$0));
         } else {
            $$1.a(null, $$2, awl.Bi, awm.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(eeo.f, $$2, eeo.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(c); $$5++) {
               $$1.c(2001, $$2, dlu.j($$0));
               cjs $$6 = bwj.bB.a($$1, bwi.e);
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

   public static boolean a(dhv $$0, iu $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dhv $$0, iu $$1) {
      return $$0.a_($$1).a(axa.J);
   }

   @Override
   protected void a(dzo $$0, dip $$1, iu $$2, dzo $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dip $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dip $$0, cqs $$1, iu $$2, dzo $$3, @Nullable dwn $$4, cys $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dzo $$0, dcl $$1) {
      return !$$1.h() && $$1.n().a(this.h()) && $$0.c(c) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dzo a(dcl $$0) {
      dzo $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(c, Integer.valueOf(Math.min(4, $$1.c(c) + 1))) : super.a($$0);
   }

   @Override
   protected feq a(dzo $$0, dhv $$1, iu $$2, feb $$3) {
      return $$0.c(c) == 1 ? g : h;
   }

   @Override
   protected void a(dzp.a<dlu, dzo> $$0) {
      $$0.a(b, c);
   }

   private boolean a(aro $$0, bwa $$1) {
      if ($$1 instanceof cjs || $$1 instanceof cii) {
         return false;
      } else {
         return !($$1 instanceof bwz) ? false : $$1 instanceof cqs || $$0.O().c(dil.c);
      }
   }
}
