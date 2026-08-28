import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class drv extends dmf {
   public static final MapCodec<drv> a = b(drv::new);
   public static final ebf<ebi> b = eax.bi;
   public static final eay c = eax.A;
   public static final ebh d = eax.aU;
   public static final int e = 3;

   @Override
   public MapCodec<drv> a() {
      return a;
   }

   public drv(eag.d $$0) {
      super($$0);
      this.l(this.C.b().b(b, ebi.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private eah a(djd $$0, iu $$1, eah $$2) {
      ebi $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         ebi $$4 = $$0.a_($$1.e()).E();
         ebi $$5 = $$4.e() ? ebi.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public eah a(dcw $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected eah a(eah $$0, djd $$1, djp $$2, iu $$3, ja $$4, iu $$5, eah $$6, azv $$7) {
      boolean $$8 = $$4.o() == ja.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(eah $$0, dja $$1, iu $$2, dmf $$3, @Nullable exw $$4, boolean $$5) {
      boolean $$6 = $$1.D($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bwf $$0, eah $$1, dja $$2, iu $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, efh.H, $$3);
      }
   }

   @Override
   protected bud a(czd $$0, eah $$1, dja $$2, iu $$3, crc $$4, buc $$5, fem $$6) {
      return (bud)($$0.a(axk.bx) && $$6.c() == ja.b ? bud.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bud a(eah $$0, dja $$1, iu $$2, crc $$3, fem $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.ag);
      }

      return bud.a;
   }

   @Override
   protected void a_(eah $$0, dja $$1, iu $$2, crc $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(eah $$0, dja $$1, iu $$2, int $$3, int $$4) {
      ebi $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lx.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      je<awm> $$10;
      if ($$5.d()) {
         alg $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = je.a(awm.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awo.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alg a(dja $$0, iu $$1) {
      return $$0.c_($$1.d()) instanceof dyv $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(eai.a<dmf, eah> $$0) {
      $$0.a(b, c, d);
   }
}
