import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class doy extends djm {
   public static final MapCodec<doy> a = b(doy::new);
   public static final dxu<dxx> b = dxn.bi;
   public static final dxo c = dxn.B;
   public static final dxw d = dxn.aU;
   public static final int e = 3;

   @Override
   public MapCodec<doy> a() {
      return a;
   }

   public doy(dww.d $$0) {
      super($$0);
      this.l(this.F.b().b(b, dxx.a).b(d, Integer.valueOf(0)).b(c, Boolean.valueOf(false)));
   }

   private dwx a(dgl $$0, ji $$1, dwx $$2) {
      dxx $$3 = $$0.a_($$1.d()).E();
      if ($$3.e()) {
         return $$2.b(b, $$3);
      } else {
         dxx $$4 = $$0.a_($$1.e()).E();
         dxx $$5 = $$4.e() ? dxx.a : $$4;
         return $$2.b(b, $$5);
      }
   }

   @Override
   public dwx a(dag $$0) {
      return this.a($$0.q(), $$0.a(), this.m());
   }

   @Override
   protected dwx a(dwx $$0, dgl $$1, dgx $$2, ji $$3, jn $$4, ji $$5, dwx $$6, azh $$7) {
      boolean $$8 = $$4.o() == jn.a.b;
      return $$8 ? this.a($$1, $$3, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   @Override
   protected void a(dwx $$0, dgi $$1, ji $$2, djm $$3, @Nullable euh $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.b(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable buk $$0, dwx $$1, dgi $$2, ji $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).l()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, ebt.H, $$3);
      }
   }

   @Override
   protected bsj a(cwp $$0, dwx $$1, dgi $$2, ji $$3, cox $$4, bsi $$5, faw $$6) {
      return (bsj)($$0.a(awy.bw) && $$6.c() == jn.b ? bsj.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6));
   }

   @Override
   protected bsj a(dwx $$0, dgi $$1, ji $$2, cox $$3, faw $$4) {
      if (!$$1.C) {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.ag);
      }

      return bsj.a;
   }

   @Override
   protected void a_(dwx $$0, dgi $$1, ji $$2, cox $$3) {
      if (!$$1.C) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(awk.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dwx $$0, dgi $$1, ji $$2, int $$3, int $$4) {
      dxx $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lt.ac, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jr<avz> $$10;
      if ($$5.d()) {
         aku $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jr.a(avz.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, awb.c, 3.0F, $$7, $$1.A.g());
      return true;
   }

   @Nullable
   private aku a(dgi $$0, ji $$1) {
      return $$0.c_($$1.d()) instanceof dvo $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dwy.a<djm, dwx> $$0) {
      $$0.a(b, c, d);
   }
}
