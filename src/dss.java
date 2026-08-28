import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dss extends dnc {
   public static final MapCodec<dss> a = b(dss::new);
   public static final ecc<ecf> b = ebu.bi;
   public static final ebv c = ebu.A;
   public static final ece d = ebu.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dss> a() {
      return a;
   }

   public dss(ebd.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ecf.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private ebe a(dka $$0, iv $$1, ebe $$2) {
      ecf $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         ecf $$4 = $$0.a_($$1.e()).E();
         ecf $$5 = $$4.e() ? ecf.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public ebe a(ddr $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected ebe a(ebe $$0, dka $$1, dkm $$2, iv $$3, jb $$4, iv $$5, ebe $$6, azx $$7) {
      boolean $$8 = $$4.o() == jb.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(ebe $$0, djx $$1, iv $$2, dnc $$3, @Nullable eyw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bwt $$0, ebe $$1, djx $$2, iv $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ege.H, $$3);
      }
   }

   @Override
   protected bur a(czy $$0, ebe $$1, djx $$2, iv $$3, crx $$4, buq $$5, ffm $$6) {
      return (bur)($$0.a(axm.bx) && $$6.c() == jb.b ? bur.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bur a(ebe $$0, djx $$1, iv $$2, crx $$3, ffm $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awz.ag);
      }

      return bur.a;
   }

   @Override
   protected void a_(ebe $$0, djx $$1, iv $$2, crx $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awz.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(ebe $$0, djx $$1, iv $$2, int $$3, int $$4) {
      ecf $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ly.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jf<awo> $$10;
      if ($$5.d()) {
         ali $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jf.a(awo.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awq.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private ali a(djx $$0, iv $$1) {
      return $$0.c_($$1.d()) instanceof dzs $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(ebf.a<dnc, ebe> $$0) {
      $$0.a(b, c, d);
   }
}
