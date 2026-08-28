import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpo extends dgv {
   public static final MapCodec<dpo> a = b(dpo::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final eyx g = dgv.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final eyx h = dgv.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dva e = duq.aE;
   public static final dva f = duq.aD;

   @Override
   public MapCodec<dpo> a() {
      return a;
   }

   public dpo(dtz.d $$0) {
      super($$0);
      this.l(this.E.b().b(e, Integer.valueOf(0)).b(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dds $$0, je $$1, dua $$2, btj $$3) {
      if (!$$3.cb()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dds $$0, dua $$1, je $$2, btj $$3, float $$4) {
      if (!($$3 instanceof clo)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dds $$0, dua $$1, je $$2, btj $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dgx.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dds $$0, je $$1, dua $$2) {
      $$0.a(null, $$1, awd.Ao, awe.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.b(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dyx.f, $$1, dyx.a.a($$2));
         $$0.c(2001, $$1, dgv.j($$2));
      }
   }

   @Override
   protected void b(dua $$0, arg $$1, je $$2, azk $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awd.Ap, awe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.b(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dyx.c, $$2, dyx.a.a($$0));
         } else {
            $$1.a(null, $$2, awd.Aq, awe.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dyx.f, $$2, dyx.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dgv.j($$0));
               cgw $$6 = btq.bh.a($$1, btp.e);
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

   public static boolean a(dcx $$0, je $$1) {
      return b($$0, $$1.e());
   }

   public static boolean b(dcx $$0, je $$1) {
      return $$0.a_($$1).a(aws.I);
   }

   @Override
   protected void b(dua $$0, dds $$1, je $$2, dua $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dds $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dds $$0, cnp $$1, je $$2, dua $$3, @Nullable dre $$4, cvl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dua $$0, cyw $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dua a(cyw $$0) {
      dua $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.b(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected eyx a(dua $$0, dcx $$1, je $$2, eyj $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dub.a<dgv, dua> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dds $$0, btj $$1) {
      if ($$1 instanceof cgw || $$1 instanceof cfp) {
         return false;
      } else {
         return !($$1 instanceof buf) ? false : $$1 instanceof cnp || $$0.ac().b(ddo.c);
      }
   }
}
