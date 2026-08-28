import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dow extends djk {
   public static final MapCodec<dow> a = b(dow::new);
   public static final dxs<dxv> b = dxl.bi;
   public static final dxm c = dxl.B;
   public static final dxu d = dxl.aU;
   public static final int e = 3;

   @Override
   public MapCodec<dow> a() {
      return a;
   }

   public dow(dwu.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxv.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dwv a(dgj $$0, ji $$1, dwv $$2) {
      dxv $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dxv $$4 = $$0.a_($$1.e()).E();
         dxv $$5 = $$4.e() ? dxv.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dwv a(dae $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dwv a(dwv $$0, dgj $$1, dgv $$2, ji $$3, jn $$4, ji $$5, dwv $$6, azg $$7) {
      boolean $$8 = $$4.o() == jn.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwv $$0, dgg $$1, ji $$2, djk $$3, @Nullable euf $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable buj $$0, dwv $$1, dgg $$2, ji $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ebr.H, $$3);
      }
   }

   @Override
   protected bsi a(cwn $$0, dwv $$1, dgg $$2, ji $$3, cov $$4, bsh $$5, fau $$6) {
      return (bsi)($$0.a(awx.bw) && $$6.c() == jn.b ? bsi.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsi a(dwv $$0, dgg $$1, ji $$2, cov $$3, fau $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awj.ag);
      }

      return bsi.a;
   }

   @Override
   protected void a_(dwv $$0, dgg $$1, ji $$2, cov $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awj.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dwv $$0, dgg $$1, ji $$2, int $$3, int $$4) {
      dxv $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lt.ac, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jr<avy> $$10;
      if ($$5.d()) {
         aku $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jr.a(avy.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awa.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private aku a(dgg $$0, ji $$1) {
      return $$0.c_($$1.d()) instanceof dvm $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dww.a<djk, dwv> $$0) {
      $$0.a(b, c, d);
   }
}
