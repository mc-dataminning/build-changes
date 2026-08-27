import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhg extends dby {
   public static final MapCodec<dhg> a = b(dhg::new);
   public static final dpx<dqa> b = dpp.bf;
   public static final dpq c = dpp.w;
   public static final dpz d = dpp.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dhg> a() {
      return a;
   }

   public dhg(doy.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqa.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private doz b(cyy $$0, ib $$1, doz $$2) {
      dqa $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dqa $$4 = $$0.a_($$1.d()).A();
         dqa $$5 = $$4.e() ? dqa.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public doz a(cuo $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected doz a(doz $$0, ih $$1, doz $$2, cyy $$3, ib $$4, ib $$5) {
      boolean $$6 = $$1.o() == ih.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, dby $$3, ib $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bpv $$0, doz $$1, cyx $$2, ib $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dts.H, $$3);
      }
   }

   @Override
   protected boc a(crj $$0, doz $$1, cyx $$2, ib $$3, cjt $$4, bnz $$5, erw $$6) {
      return $$0.a(avk.aG) && $$6.b() == ih.b ? boc.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected boa a(doz $$0, cyx $$1, ib $$2, cjt $$3, erw $$4) {
      if ($$1.B) {
         return boa.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(auw.ag);
         return boa.b;
      }
   }

   @Override
   protected void a(doz $$0, cyx $$1, ib $$2, cjt $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(auw.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(doz $$0, cyx $$1, ib $$2, int $$3, int $$4) {
      dqa $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kl.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      il<aul> $$10;
      if ($$5.d()) {
         ajt $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = il.a(aul.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aun.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ajt a(cyx $$0, ib $$1) {
      return $$0.c_($$1.c()) instanceof dnr $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dpa.a<dby, doz> $$0) {
      $$0.a(b, c, d);
   }
}
