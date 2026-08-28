import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dkr extends dfi {
   public static final MapCodec<dkr> a = b(dkr::new);
   public static final dtj<dtm> b = dtb.bf;
   public static final dtc c = dtb.w;
   public static final dtl d = dtb.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dkr> a() {
      return a;
   }

   public dkr(dsk.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dtm.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dsl b(dch $$0, ja $$1, dsl $$2) {
      dtm $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dtm $$4 = $$0.a_($$1.d()).A();
         dtm $$5 = $$4.e() ? dtm.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dsl a(cxn $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dsl a(dsl $$0, jf $$1, dsl $$2, dch $$3, ja $$4, ja $$5) {
      boolean $$6 = $$1.o() == jf.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dsl $$0, dcg $$1, ja $$2, dfi $$3, ja $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsh $$0, dsl $$1, dcg $$2, ja $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxh.H, $$3);
      }
   }

   @Override
   protected bqj a(cud $$0, dsl $$1, dcg $$2, ja $$3, cml $$4, bqg $$5, ewd $$6) {
      return $$0.a(awf.bg) && $$6.b() == jf.b ? bqj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqh a(dsl $$0, dcg $$1, ja $$2, cml $$3, ewd $$4) {
      if ($$1.B) {
         return bqh.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.ag);
         return bqh.c;
      }
   }

   @Override
   protected void a_(dsl $$0, dcg $$1, ja $$2, cml $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avr.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dsl $$0, dcg $$1, ja $$2, int $$3, int $$4) {
      dtm $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lj.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jj<avg> $$10;
      if ($$5.d()) {
         akk $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jj.a(avg.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avi.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akk a(dcg $$0, ja $$1) {
      return $$0.c_($$1.c()) instanceof drd $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dsm.a<dfi, dsl> $$0) {
      $$0.a(b, c, d);
   }
}
