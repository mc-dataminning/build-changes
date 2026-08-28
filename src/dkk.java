import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkk extends dfb {
   public static final MapCodec<dkk> a = b(dkk::new);
   public static final dtc<dtf> b = dsu.bf;
   public static final dsv c = dsu.w;
   public static final dte d = dsu.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkk> a() {
      return a;
   }

   public dkk(dsd.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtf.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dse b(dcb $$0, iz $$1, dse $$2) {
      dtf $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dtf $$4 = $$0.a_($$1.d()).A();
         dtf $$5 = $$4.e() ? dtf.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dse a(cyc $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dse a(dse $$0, je $$1, dse $$2, dcb $$3, iz $$4, iz $$5) {
      boolean $$6 = $$1.o() == je.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, dfb $$3, iz $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsw $$0, dse $$1, dca $$2, iz $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dwx.H, $$3);
      }
   }

   @Override
   protected bqy a(cur $$0, dse $$1, dca $$2, iz $$3, cmz $$4, bqv $$5, evp $$6) {
      return $$0.a(awy.bg) && $$6.b() == je.b ? bqy.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqw a(dse $$0, dca $$1, iz $$2, cmz $$3, evp $$4) {
      if ($$1.B) {
         return bqw.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
         return bqw.c;
      }
   }

   @Override
   protected void a(dse $$0, dca $$1, iz $$2, cmz $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dse $$0, dca $$1, iz $$2, int $$3, int $$4) {
      dtf $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(li.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ji<avz> $$10;
      if ($$5.d()) {
         alf $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ji.a(avz.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awb.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private alf a(dca $$0, iz $$1) {
      return $$0.c_($$1.c()) instanceof dqv $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsf.a<dfb, dse> $$0) {
      $$0.a(b, c, d);
   }
}
