import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dbx extends cwp {
   public static final MapCodec<dbx> a = b(dbx::new);
   public static final dke<dkh> b = djw.bf;
   public static final djx c = djw.w;
   public static final dkg d = djw.aR;
   public static final int e = 3;

   @Override
   public MapCodec<dbx> a() {
      return a;
   }

   public dbx(djf.d $$0) {
      super($$0);
      this.k(this.E.b().a(b, dkh.a).a(d, Integer.valueOf(0)).a(c, Boolean.valueOf(false)));
   }

   private djg b(ctp $$0, hx $$1, djg $$2) {
      dkh $$3 = $$0.a_($$1.c()).A();
      if ($$3.e()) {
         return $$2.a(b, $$3);
      } else {
         dkh $$4 = $$0.a_($$1.d()).A();
         dkh $$5 = $$4.e() ? dkh.a : $$4;
         return $$2.a(b, $$5);
      }
   }

   @Override
   public djg a(cpg $$0) {
      return this.b($$0.q(), $$0.a(), this.o());
   }

   @Override
   public djg a(djg $$0, ic $$1, djg $$2, ctp $$3, hx $$4, hx $$5) {
      boolean $$6 = $$1.o() == ic.a.b;
      return $$6 ? this.b($$3, $$4, $$0) : super.a($$0, $$1, $$2, $$3, $$4, $$5);
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cwp $$3, hx $$4, boolean $$5) {
      boolean $$6 = $$1.C($$2);
      if ($$6 != $$0.c(c)) {
         if ($$6) {
            this.a(null, $$0, $$1, $$2);
         }

         $$1.a($$2, $$0.a(c, Boolean.valueOf($$6)), 3);
      }
   }

   private void a(@Nullable blu $$0, djg $$1, cto $$2, hx $$3) {
      if ($$1.c(b).e() || $$2.a_($$3.c()).i()) {
         $$2.a($$3, this, 0, 0);
         $$2.a($$0, dnq.H, $$3);
      }
   }

   @Override
   public bka a(djg $$0, cto $$1, hx $$2, cfh $$3, bjz $$4, elo $$5) {
      cmx $$6 = $$3.b($$4);
      if ($$6.a(aso.aG) && $$5.b() == ic.b) {
         return bka.d;
      } else if ($$1.B) {
         return bka.a;
      } else {
         $$0 = $$0.a(d);
         $$1.a($$2, $$0, 3);
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asb.ag);
         return bka.b;
      }
   }

   @Override
   public void a(djg $$0, cto $$1, hx $$2, cfh $$3) {
      if (!$$1.B) {
         this.a($$3, $$0, $$1, $$2);
         $$3.a(asb.af);
      }
   }

   public static float b(int $$0) {
      return (float)Math.pow(2.0, (double)($$0 - 12) / 12.0);
   }

   @Override
   public boolean a(djg $$0, cto $$1, hx $$2, int $$3, int $$4) {
      dkh $$5 = $$0.c(b);
      float $$7;
      if ($$5.b()) {
         int $$6 = $$0.c(d);
         $$7 = b($$6);
         $$1.a(jx.X, (double)$$2.u() + 0.5, (double)$$2.v() + 1.2, (double)$$2.w() + 0.5, (double)$$6 / 24.0, 0.0, 0.0);
      } else {
         $$7 = 1.0F;
      }

      ih<arq> $$10;
      if ($$5.d()) {
         ahg $$9 = this.a($$1, $$2);
         if ($$9 == null) {
            return false;
         }

         $$10 = ih.a(arq.a($$9));
      } else {
         $$10 = $$5.a();
      }

      $$1.a(null, (double)$$2.u() + 0.5, (double)$$2.v() + 0.5, (double)$$2.w() + 0.5, $$10, ars.c, 3.0F, $$7, $$1.z.g());
      return true;
   }

   @Nullable
   private ahg a(cto $$0, hx $$1) {
      return $$0.c_($$1.c()) instanceof dif $$2 ? $$2.f() : null;
   }

   @Override
   protected void a(djh.a<cwp, djg> $$0) {
      $$0.a(b, c, d);
   }
}
