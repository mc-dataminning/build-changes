import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnp extends dex {
   public static final MapCodec<dnp> a = b(dnp::new);
   public static final int b = 2;
   public static final int c = 1;
   public static final int d = 4;
   private static final ewi g = dex.a(3.0, 0.0, 3.0, 12.0, 7.0, 12.0);
   private static final ewi h = dex.a(1.0, 0.0, 1.0, 15.0, 7.0, 15.0);
   public static final dta e = dsq.aE;
   public static final dta f = dsq.aD;

   @Override
   public MapCodec<dnp> a() {
      return a;
   }

   public dnp(drz.d $$0) {
      super($$0);
      this.k(this.E.b().a(e, Integer.valueOf(0)).a(f, Integer.valueOf(1)));
   }

   @Override
   public void a(dbw $$0, iz $$1, dsa $$2, bss $$3) {
      if (!$$3.bW()) {
         this.a($$0, $$2, $$1, $$3, 100);
      }

      super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(dbw $$0, dsa $$1, iz $$2, bss $$3, float $$4) {
      if (!($$3 instanceof cku)) {
         this.a($$0, $$1, $$2, $$3, 3);
      }

      super.a($$0, $$1, $$2, $$3, $$4);
   }

   private void a(dbw $$0, dsa $$1, iz $$2, bss $$3, int $$4) {
      if (this.a($$0, $$3)) {
         if (!$$0.B && $$0.z.a($$4) == 0 && $$1.a(dez.mf)) {
            this.a($$0, $$2, $$1);
         }
      }
   }

   private void a(dbw $$0, iz $$1, dsa $$2) {
      $$0.a(null, $$1, avz.Af, awa.e, 0.7F, 0.9F + $$0.z.i() * 0.2F);
      int $$3 = $$2.c(f);
      if ($$3 <= 1) {
         $$0.b($$1, false);
      } else {
         $$0.a($$1, $$2.a(f, Integer.valueOf($$3 - 1)), 2);
         $$0.a(dwt.f, $$1, dwt.a.a($$2));
         $$0.c(2001, $$1, dex.i($$2));
      }
   }

   @Override
   protected void b(dsa $$0, are $$1, iz $$2, azf $$3) {
      if (this.a($$1) && a($$1, $$2)) {
         int $$4 = $$0.c(e);
         if ($$4 < 2) {
            $$1.a(null, $$2, avz.Ag, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, $$0.a(e, Integer.valueOf($$4 + 1)), 2);
            $$1.a(dwt.c, $$2, dwt.a.a($$0));
         } else {
            $$1.a(null, $$2, avz.Ah, awa.e, 0.7F, 0.9F + $$3.i() * 0.2F);
            $$1.a($$2, false);
            $$1.a(dwt.f, $$2, dwt.a.a($$0));

            for (int $$5 = 0; $$5 < $$0.c(f); $$5++) {
               $$1.c(2001, $$2, dex.i($$0));
               cge $$6 = bsy.bh.a((dbw)$$1);
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

   public static boolean a(dbc $$0, iz $$1) {
      return b($$0, $$1.d());
   }

   public static boolean b(dbc $$0, iz $$1) {
      return $$0.a_($$1).a(awo.H);
   }

   @Override
   protected void b(dsa $$0, dbw $$1, iz $$2, dsa $$3, boolean $$4) {
      if (a($$1, $$2) && !$$1.B) {
         $$1.c(2012, $$2, 15);
      }
   }

   private boolean a(dbw $$0) {
      float $$1 = $$0.f(1.0F);
      return (double)$$1 < 0.69 && (double)$$1 > 0.65 ? true : $$0.z.a(500) == 0;
   }

   @Override
   public void a(dbw $$0, cmv $$1, iz $$2, dsa $$3, @Nullable dpf $$4, cun $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      this.a($$0, $$2, $$3);
   }

   @Override
   protected boolean a(dsa $$0, cxy $$1) {
      return !$$1.h() && $$1.n().a(this.r()) && $$0.c(f) < 4 ? true : super.a($$0, $$1);
   }

   @Nullable
   @Override
   public dsa a(cxy $$0) {
      dsa $$1 = $$0.q().a_($$0.a());
      return $$1.a(this) ? $$1.a(f, Integer.valueOf(Math.min(4, $$1.c(f) + 1))) : super.a($$0);
   }

   @Override
   protected ewi a(dsa $$0, dbc $$1, iz $$2, evu $$3) {
      return $$0.c(f) > 1 ? h : g;
   }

   @Override
   protected void a(dsb.a<dex, dsa> $$0) {
      $$0.a(e, f);
   }

   private boolean a(dbw $$0, bss $$1) {
      if ($$1 instanceof cge || $$1 instanceof cey) {
         return false;
      } else {
         return !($$1 instanceof btn) ? false : $$1 instanceof cmv || $$0.ab().b(dbs.c);
      }
   }
}
