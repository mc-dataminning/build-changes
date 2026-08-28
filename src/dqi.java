import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dqi extends dku {
   public static final MapCodec<dqi> a = b(dqi::new);
   public static final dzk<dzn> b = dzc.bi;
   public static final dzd c = dzc.A;
   public static final dzm d = dzc.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dqi> a() {
      return a;
   }

   public dqi(dyl.d $$0) {
      super($$0);
      this.l(this.B.b().b(b, dzn.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dym a(dhs $$0, jj $$1, dym $$2) {
      dzn $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dzn $$4 = $$0.a_($$1.e()).E();
         dzn $$5 = $$4.e() ? dzn.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dym a(dbn $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dym a(dym $$0, dhs $$1, die $$2, jj $$3, jo $$4, jj $$5, dym $$6, azs $$7) {
      boolean $$8 = $$4.o() == jo.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dym $$0, dhp $$1, jj $$2, dku $$3, @Nullable ewb $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bvs $$0, dym $$1, dhp $$2, jj $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, edm.H, $$3);
      }
   }

   @Override
   protected btq a(cxy $$0, dym $$1, dhp $$2, jj $$3, cqi $$4, btp $$5, fcq $$6) {
      return (btq)($$0.a(axi.bw) && $$6.c() == jo.b ? btq.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected btq a(dym $$0, dhp $$1, jj $$2, cqi $$3, fcq $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awu.ag);
      }

      return btq.a;
   }

   @Override
   protected void a_(dym $$0, dhp $$1, jj $$2, cqi $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awu.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dym $$0, dhp $$1, jj $$2, int $$3, int $$4) {
      dzn $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lv.ad, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      js<awj> $$10;
      if ($$5.d()) {
         ald $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = js.a(awj.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awl.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private ald a(dhp $$0, jj $$1) {
      return $$0.c_($$1.d()) instanceof dxb $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dyn.a<dku, dym> $$0) {
      $$0.a(b, c, d);
   }
}
