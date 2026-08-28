import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dsh extends djk {
   public static final MapCodec<dsh> a = b(dsh::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final fbs g = djk.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final fbs h = djk.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dxu e = dxl.aH;
   public static final dxu f = dxl.aG;

   @Override
   public MapCodec<dsh> a() {
      return a;
   }

   public dsh(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dgg $$0, ji $$1, dwv $$2, buj $$3) {
      if (!$$3.ce()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dgg $$0, dwv $$1, ji $$2, buj $$3, float $$4) {
      if (!($$3 instanceof cmp)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dgg $$0, dwv $$1, ji $$2, buj $$3, int $$4) {
      if ($$1.a(djm.mH) && $$0 instanceof arc $$5 && this.a($$5, $$3) && $$0.A.a($$4) == 0) {
         this.a($$5, $$2, $$1);
      }
   }

   private void a(dgg $$0, ji $$1, dwv $$2) {
      $$0.a(null, $$1, avz.AW, awa.e, 0.7F, 0.9F + $$0.A.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(ebr.f, $$1, ebr.a.a($$2));
         $$0.c(2001, $$1, djk.j($$2));
      }
   }

   @Override
   protected void b(dwv $$0, arc $$1, ji $$2, azg $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avz.AX, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(ebr.c, $$2, ebr.a.a($$0));
         } else {
            $$1.a(null, $$2, avz.AY, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(ebr.f, $$2, ebr.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, djk.j($$0));
               chx $$6 = buq.bA.a($$1, bup.e);
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

   public static boolean a(dfl $$0, ji $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dfl $$0, ji $$1) {
      return $$0.a_($$1).a(awo.J);
   }

   @Override
   protected void b(dwv $$0, dgg $$1, ji $$2, dwv $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.C) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dgg $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.A.a(500) == 0;
   }

   @Override
   public void a(dgg $$0, cov $$1, ji $$2, dwv $$3, @Nullable dtx $$4, cwn $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dwv $$0, dae $$1) {
      return !$$1.h() && $$1.n().a(this.j()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dwv a(dae $$0) {
      dwv $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected fbs a(dwv $$0, dfl $$1, ji $$2, fbd $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(e, f);
   }

   private boolean a(arc $$0, buj $$1) {
      if ($$1 instanceof chx || $$1 instanceof cgq) {
         return false;
      } else {
         return !($$1 instanceof bvf) ? false : $$1 instanceof cov || $$0.O().b(dgc.c);
      }
   }
}
