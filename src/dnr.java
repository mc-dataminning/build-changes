import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnr extends dij {
   public static final MapCodec<dnr> a = b(dnr::new);
   public static final dwl<dwo> b = dwe.bf;
   public static final dwf c = dwe.w;
   public static final dwn d = dwe.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dnr> a() {
      return a;
   }

   public dnr(dvn.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dwo.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dvo b(dfi $$0, jh $$1, dvo $$2) {
      dwo $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dwo $$4 = $$0.a_($$1.e()).E();
         dwo $$5 = $$4.e() ? dwo.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dvo a(czw $$0) {
      return this.b($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dvo a(dvo $$0, dfi $$1, dfu $$2, jh $$3, jm $$4, jh $$5, dvo $$6, azv $$7) {
      boolean $$8 = $$4.o() == jm.a.b;
      return $$8 ? this.b($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dvo $$0, dff $$1, jh $$2, dij $$3, @Nullable esw $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bui $$0, dvo $$1, dff $$2, jh $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, eak.H, $$3);
      }
   }

   @Override
   protected bsh a(cwf $$0, dvo $$1, dff $$2, jh $$3, cor $$4, bsg $$5, ezn $$6) {
      return (bsh)($$0.a(axm.bx) && $$6.c() == jm.b ? bsh.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsh a(dvo $$0, dff $$1, jh $$2, cor $$3, ezn $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awy.ag);
      }

      return bsh.a;
   }

   @Override
   protected void a_(dvo $$0, dff $$1, jh $$2, cor $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awy.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dvo $$0, dff $$1, jh $$2, int $$3, int $$4) {
      dwo $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(ls.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jq<awn> $$10;
      if ($$5.d()) {
         all $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jq.a(awn.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awp.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private all a(dff $$0, jh $$1) {
      return $$0.c_($$1.d()) instanceof duf $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dvp.a<dij, dvo> $$0) {
      $$0.a(b, c, d);
   }
}
