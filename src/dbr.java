import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbr extends cwj {
   public static final MapCodec<dbr> a = b(dbr::new);
   public static final djy<dkb> b = djq.bf;
   public static final djr c = djq.w;
   public static final dka d = djq.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dbr> a() {
      return a;
   }

   public dbr(diz.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkb.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private dja b(ctj $$0, hx $$1, dja $$2) {
      dkb $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dkb $$4 = $$0.a_($$1.d()).A();
         dkb $$5 = $$4.e() ? dkb.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public dja a(cpa $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public dja a(dja $$0, ic $$1, dja $$2, ctj $$3, hx $$4, hx $$5) {
      boolean $$6 = $$1.o() == ic.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cwj $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable blp $$0, dja $$1, cti $$2, hx $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dnk.H, $$3);
      }
   }

   @Override
   public bjv a(dja $$0, cti $$1, hx $$2, cfb $$3, bju $$4, eli $$5) {
      cmr $$6 = $$3.b($$4);
      if ($$6.a(asj.aG) && $$5.b() == ic.b) {
         return bjv.d;
      } else if ($$1.B) {
         return bjv.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arw.ag);
         return bjv.b;
      }
   }

   @Override
   public void a(dja $$0, cti $$1, hx $$2, cfb $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(arw.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(dja $$0, cti $$1, hx $$2, int $$3, int $$4) {
      dkb $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jx.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ih<arl> $$10;
      if ($$5.d()) {
         ahd $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ih.a(arl.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, arn.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ahd a(cti $$0, hx $$1) {
      return $$0.c_($$1.c()) instanceof dhz $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(djb.a<cwj, dja> $$0) {
      $$0.a(b, c, d);
   }
}
