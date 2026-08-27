import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dcg extends cwy {
   public static final MapCodec<dcg> a = b(dcg::new);
   public static final dkn<dkq> b = dkf.bf;
   public static final dkg c = dkf.w;
   public static final dkp d = dkf.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dcg> a() {
      return a;
   }

   public dcg(djo.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkq.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private djp b(cty $$0, hx $$1, djp $$2) {
      dkq $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dkq $$4 = $$0.a_($$1.d()).A();
         dkq $$5 = $$4.e() ? dkq.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public djp a(cpp $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public djp a(djp $$0, ic $$1, djp $$2, cty $$3, hx $$4, hx $$5) {
      boolean $$6 = $$1.o() == ic.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cwy $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable blw $$0, djp $$1, ctx $$2, hx $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dnz.H, $$3);
      }
   }

   @Override
   public bke a(cng $$0, djp $$1, ctx $$2, hx $$3, cfq $$4, bkb $$5, ely $$6) {
      return $$0.a(asq.aG) && $$6.b() == ic.b ? bke.e : super.a($$0, $$1, $$2, $$3, $$4, $$5, $$6);
   }

   @Override
   public bkc a(djp $$0, ctx $$1, hx $$2, cfq $$3, ely $$4) {
      if ($$1.B) {
         return bkc.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asd.ag);
         return bkc.b;
      }
   }

   @Override
   public void a(djp $$0, ctx $$1, hx $$2, cfq $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asd.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(djp $$0, ctx $$1, hx $$2, int $$3, int $$4) {
      dkq $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jx.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ih<ars> $$10;
      if ($$5.d()) {
         ahh $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ih.a(ars.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, aru.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ahh a(ctx $$0, hx $$1) {
      return $$0.c_($$1.c()) instanceof dio $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(djq.a<cwy, djp> $$0) {
      $$0.a(b, c, d);
   }
}
