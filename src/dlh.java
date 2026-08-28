import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dfy {
   public static final MapCodec<dlh> a = b(dlh::new);
   public static final dua<dud> b = dts.bf;
   public static final dtt c = dts.w;
   public static final duc d = dts.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dlh> a() {
      return a;
   }

   public dlh(dtb.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dud.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dtc b(dcx $$0, jd $$1, dtc $$2) {
      dud $$3 = $$0.a_($$1.d()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dud $$4 = $$0.a_($$1.e()).A();
         dud $$5 = $$4.e() ? dud.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dtc a(cyd $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   protected dtc a(dtc $$0, ji $$1, dtc $$2, dcx $$3, jd $$4, jd $$5) {
      boolean $$6 = $$1.o() == ji.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dtc $$0, dcw $$1, jd $$2, dfy $$3, jd $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bsr $$0, dtc $$1, dcw $$2, jd $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.d()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dxz.H, $$3);
      }
   }

   @Override
   protected bqt a(cuq $$0, dtc $$1, dcw $$2, jd $$3, cmx $$4, bqq $$5, eww $$6) {
      return $$0.a(awn.bf) && $$6.b() == ji.b ? bqt.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bqr a(dtc $$0, dcw $$1, jd $$2, cmx $$3, eww $$4) {
      if ($$1.B) {
         return bqr.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avz.ag);
         return bqr.c;
      }
   }

   @Override
   protected void a_(dtc $$0, dcw $$1, jd $$2, cmx $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avz.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dtc $$0, dcw $$1, jd $$2, int $$3, int $$4) {
      dud $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(lm.aa, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      jm<avo> $$10;
      if ($$5.d()) {
         akr $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = jm.a(avo.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, avq.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akr a(dcw $$0, jd $$1) {
      return $$0.c_($$1.d()) instanceof dru $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dtd.a<dfy, dtc> $$0) {
      $$0.a(b, c, d);
   }
}
