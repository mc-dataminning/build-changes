import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dby extends cwq {
   public static final MapCodec<dby> a = b(dby::new);
   public static final dkf<dki> b = djx.bf;
   public static final djy c = djx.w;
   public static final dkh d = djx.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dby> a() {
      return a;
   }

   public dby(djg.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dki.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private djh b(ctq $$0, hx $$1, djh $$2) {
      dki $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dki $$4 = $$0.a_($$1.d()).A();
         dki $$5 = $$4.e() ? dki.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public djh a(cph $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public djh a(djh $$0, ic $$1, djh $$2, ctq $$3, hx $$4, hx $$5) {
      boolean $$6 = $$1.o() == ic.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cwq $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable blv $$0, djh $$1, ctp $$2, hx $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dnr.H, $$3);
      }
   }

   @Override
   public bkb a(djh $$0, ctp $$1, hx $$2, cfi $$3, bka $$4, elp $$5) {
      cmy $$6 = $$3.b($$4);
      if ($$6.a(asp.aG) && $$5.b() == ic.b) {
         return bkb.d;
      } else if ($$1.B) {
         return bkb.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asc.ag);
         return bkb.b;
      }
   }

   @Override
   public void a(djh $$0, ctp $$1, hx $$2, cfi $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asc.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(djh $$0, ctp $$1, hx $$2, int $$3, int $$4) {
      dki $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jx.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ih<arr> $$10;
      if ($$5.d()) {
         ahg $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ih.a(arr.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, art.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ahg a(ctp $$0, hx $$1) {
      return $$0.c_($$1.c()) instanceof dig $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(dji.a<cwq, djh> $$0) {
      $$0.a(b, c, d);
   }
}
