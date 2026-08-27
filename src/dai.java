import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dai extends cva {
   public static final MapCodec<dai> a = b(dai::new);
   public static final dig<dij> b = dhy.bf;
   public static final dhz c = dhy.w;
   public static final dii d = dhy.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dai> a() {
      return a;
   }

   public dai(dhh.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dij.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dhi b(csb $$0, ht $$1, dhi $$2) {
      dij $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dij $$4 = $$0.a_($$1.d()).A();
         dij $$5 = $$4.e() ? dij.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dhi a(cnr $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dhi a(dhi $$0, hx $$1, dhi $$2, csb $$3, ht $$4, ht $$5) {
      boolean $$6 = $$1.o() == hx.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cva $$3, ht $$4, boolean $$5) {
      boolean $$6 = $$1.B($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bkq $$0, dhi $$1, csa $$2, ht $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dls.H, $$3);
      }
   }

   @Override
   public bix a(dhi $$0, csa $$1, ht $$2, cdu $$3, biw $$4, ejq $$5) {
      clj $$6 = $$3.b($$4);
      if ($$6.a(aro.aG) && $$5.b() == hx.b) {
         return bix.d;
      } else if ($$1.B) {
         return bix.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arb.ag);
         return bix.b;
      }
   }

   @Override
   public void a(dhi $$0, csa $$1, ht $$2, cdu $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arb.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dhi $$0, csa $$1, ht $$2, int $$3, int $$4) {
      dij $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(js.V, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ib<aqq> $$10;
      if ($$5.d()) {
         agi $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ib.a(aqq.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aqs.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private agi a(csa $$0, ht $$1) {
      return $$0.c_($$1.c()) instanceof dgo $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dhj.a<cva, dhi> $$0) {
      $$0.a(b, c, d);
   }
}
