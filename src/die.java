import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class die extends dcv {
   public static final MapCodec<die> a = b(die::new);
   public static final dqw<dqz> b = dqo.bf;
   public static final dqp c = dqo.w;
   public static final dqy d = dqo.aR;
   public static final int e = 3;

   @Override
   public MapCodec<die> a() {
      return a;
   }

   public die(dpx.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dqz.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dpy b(czv $$0, im $$1, dpy $$2) {
      dqz $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dqz $$4 = $$0.a_($$1.d()).A();
         dqz $$5 = $$4.e() ? dqz.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dpy a(cvl $$0) {
      return this.b($$0.q(), $$0.a(), this.n());
   }

   @Override
   protected dpy a(dpy $$0, ir $$1, dpy $$2, czv $$3, im $$4, im $$5) {
      boolean $$6 = $$1.o() == ir.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, dcv $$3, im $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable bql $$0, dpy $$1, czu $$2, im $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dur.H, $$3);
      }
   }

   @Override
   protected bos a(csd $$0, dpy $$1, czu $$2, im $$3, ckl $$4, bop $$5, etb $$6) {
      return $$0.a(avw.aG) && $$6.b() == ir.b ? bos.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   protected boq a(dpy $$0, czu $$1, im $$2, ckl $$3, etb $$4) {
      if ($$1.B) {
         return boq.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avj.ag);
         return boq.b;
      }
   }

   @Override
   protected void a(dpy $$0, czu $$1, im $$2, ckl $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(avj.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   protected boolean a(dpy $$0, czu $$1, im $$2, int $$3, int $$4) {
      dqz $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(kw.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      iv<auy> $$10;
      if ($$5.d()) {
         akf $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = iv.a(auy.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, ava.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private akf a(czu $$0, im $$1) {
      return $$0.c_($$1.c()) instanceof dop $$2 ? $$2.d() : null;
   }

   @Override
   protected void a(dpz.a<dcv, dpy> $$0) {
      $$0.a(b, c, d);
   }
}
