import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dny extends diq {
   public static final MapCodec<dny> a = b(dny::new);
   public static final dws<dwv> b = dwl.bf;
   public static final dwm c = dwl.w;
   public static final dwu d = dwl.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dny> a() {
      return a;
   }

   public dny(dvu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwv.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dvv b(dfp $$0, jh $$1, dvv $$2) {
      dwv $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dwv $$4 = $$0.a_($$1.e()).E();
         dwv $$5 = $$4.e() ? dwv.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dvv a(dad $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dvv a(dvv $$0, dfp $$1, dgb $$2, jh $$3, jm $$4, jh $$5, dvv $$6, azu $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvv $$0, dfm $$1, jh $$2, diq $$3, @Nullable etd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bul $$0, dvv $$1, dfm $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ear.H, $$3);
      }
   }

   @Override
   protected bsk a(cwm $$0, dvv $$1, dfm $$2, jh $$3, cou $$4, bsj $$5, ezu $$6) {
      return (bsk)($$0.a(axl.bx) && $$6.c() == jm.b ? bsk.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsk a(dvv $$0, dfm $$1, jh $$2, cou $$3, ezu $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.ag);
      }

      return bsk.a;
   }

   @Override
   protected void a_(dvv $$0, dfm $$1, jh $$2, cou $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awx.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dvv $$0, dfm $$1, jh $$2, int $$3, int $$4) {
      dwv $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ls.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jq<awm> $$10;
      if ($$5.d()) {
         alj $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jq.a(awm.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awo.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alj a(dfm $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dum $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dvw.a<diq, dvv> $$0) {
      $$0.a(b, c, d);
   }
}
