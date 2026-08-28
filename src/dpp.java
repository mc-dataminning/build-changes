import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dpp extends dkd {
   public static final MapCodec<dpp> a = b(dpp::new);
   public static final dyl<dyo> b = dye.bi;
   public static final dyf c = dye.B;
   public static final dyn d = dye.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dpp> a() {
      return a;
   }

   public dpp(dxn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dyo.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dxo b(dhc $$0, jh $$1, dxo $$2) {
      dyo $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dyo $$4 = $$0.a_($$1.e()).E();
         dyo $$5 = $$4.e() ? dyo.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dxo a(dax $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dxo a(dxo $$0, dhc $$1, dho $$2, jh $$3, jm $$4, jh $$5, dxo $$6, bac $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dxo $$0, dgz $$1, jh $$2, dkd $$3, @Nullable euy $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bvb $$0, dxo $$1, dgz $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, eck.H, $$3);
      }
   }

   @Override
   protected bta a(cxg $$0, dxo $$1, dgz $$2, jh $$3, cpo $$4, bsz $$5, fbn $$6) {
      return (bta)($$0.a(axt.by) && $$6.c() == jm.b ? bta.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bta a(dxo $$0, dgz $$1, jh $$2, cpo $$3, fbn $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axf.ag);
      }

      return bta.a;
   }

   @Override
   protected void a_(dxo $$0, dgz $$1, jh $$2, cpo $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(axf.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dxo $$0, dgz $$1, jh $$2, int $$3, int $$4) {
      dyo $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ls.ac, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jq<awu> $$10;
      if ($$5.d()) {
         alp $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jq.a(awu.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aww.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private alp a(dgz $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof dwf $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dxp.a<dkd, dxo> $$0) {
      $$0.a(b, c, d);
   }
}
