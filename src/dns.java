import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dns extends dfa {
   public static final MapCodec<dns> a = b(dns::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ewl g = dfa.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ewl h = dfa.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dtd e = dst.aE;
   public static final dtd f = dst.aD;

   @Override
   public MapCodec<dns> a() {
      return a;
   }

   public dns(dsc.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dbz $$0, iz $$1, dsd $$2, bsv $$3) {
      if (!$$3.bW()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, float $$4) {
      if (!($$3 instanceof ckx)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dbz $$0, dsd $$1, iz $$2, bsv $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dfc.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dbz $$0, iz $$1, dsd $$2) {
      $$0.a(null, $$1, awa.Af, awb.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dww.f, $$1, dww.a.a($$2));
         $$0.c(2001, $$1, dfa.i($$2));
      }
   }

   @Override
   protected void b(dsd $$0, arf $$1, iz $$2, azh $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, awa.Ag, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dww.c, $$2, dww.a.a($$0));
         } else {
            $$1.a(null, $$2, awa.Ah, awb.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dww.f, $$2, dww.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dfa.i($$0));
               cgh $$6 = btb.bh.a((dbz)$$1);
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

   public static boolean a(dbf $$0, iz $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbf $$0, iz $$1) {
      return $$0.a_($$1).a(awp.H);
   }

   @Override
   protected void b(dsd $$0, dbz $$1, iz $$2, dsd $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dbz $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dbz $$0, cmy $$1, iz $$2, dsd $$3, @Nullable dpi $$4, cuq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dsd $$0, cyb $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsd a(cyb $$0) {
      dsd $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ewl a(dsd $$0, dbf $$1, iz $$2, evx $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dbz $$0, bsv $$1) {
      if ($$1 instanceof cgh || $$1 instanceof cfb) {
         return false;
      } else {
         return !($$1 instanceof btq) ? false : $$1 instanceof cmy || $$0.ab().b(dbv.c);
      }
   }
}
