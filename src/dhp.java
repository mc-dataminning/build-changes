import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhp extends dch {
   public static final MapCodec<dhp> a = b(dhp::new);
   public static final dqg<dqj> b = dpy.bf;
   public static final dpz c = dpy.w;
   public static final dqi d = dpy.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dhp> a() {
      return a;
   }

   public dhp(dph.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqj.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dpi b(czh $$0, id $$1, dpi $$2) {
      dqj $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dqj $$4 = $$0.a_($$1.d()).A();
         dqj $$5 = $$4.e() ? dqj.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dpi a(cux $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dpi a(dpi $$0, ij $$1, dpi $$2, czh $$3, id $$4, id $$5) {
      boolean $$6 = $$1.o() == ij.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, dch $$3, id $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bqa $$0, dpi $$1, czg $$2, id $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dub.H, $$3);
      }
   }

   @Override
   protected boh a(crs $$0, dpi $$1, czg $$2, id $$3, cka $$4, boe $$5, esf $$6) {
      return $$0.a(avm.aG) && $$6.b() == ij.b ? boh.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected bof a(dpi $$0, czg $$1, id $$2, cka $$3, esf $$4) {
      if ($$1.B) {
         return bof.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(auz.ag);
         return bof.b;
      }
   }

   @Override
   protected void a(dpi $$0, czg $$1, id $$2, cka $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(auz.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dpi $$0, czg $$1, id $$2, int $$3, int $$4) {
      dqj $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kn.Y, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      in<aun> $$10;
      if ($$5.d()) {
         ajv $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = in.a(aun.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aup.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ajv a(czg $$0, id $$1) {
      return $$0.c_($$1.c()) instanceof doa $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dpj.a<dch, dpi> $$0) {
      $$0.a(b, c, d);
   }
}
