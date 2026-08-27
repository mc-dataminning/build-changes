import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class buv extends bup implements bjo, bjv<buv.a> {
   private static final adx<String> bT = aea.a(buv.class, adz.e);
   private static final int bU = 1024;
   @Nullable
   private bhr bW;
   private int bX;
   @Nullable
   private UUID bY;

   public buv(bik<? extends buv> $$0, cpk $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gv $$0, cpn $$1) {
      return $$1.a_($$0.d()).a(csl.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bik<buv> $$0, cpl $$1, bja $$2, gv $$3, art $$4) {
      return $$1.a_($$3.d()).a(apj.bS) && a($$1, $$3);
   }

   @Override
   public void a(aki $$0, biv $$1) {
      UUID $$2 = $$1.cv();
      if (!$$2.equals(this.bY)) {
         this.a(this.q() == buv.a.a ? buv.a.b : buv.a.a);
         this.bY = $$2;
         this.a(aou.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(bT, buv.a.a.d);
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.oC) && !this.i_()) {
         boolean $$3 = false;
         ciw $$4;
         if (this.bW != null) {
            $$3 = true;
            $$4 = new ciw(ciz.va);
            ckg.a($$4, this.bW, this.bX);
            this.bW = null;
            this.bX = 0;
         } else {
            $$4 = new ciw(ciz.oD);
         }

         ciw $$6 = ciy.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         aot $$7;
         if ($$3) {
            $$7 = aou.nm;
         } else {
            $$7 = aou.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bgo.a(this.dK().B);
      } else if ($$2.a(ciz.rg) && this.a()) {
         this.a(aov.h);
         this.a(dji.M, $$0);
         if (!this.dK().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bgo.a(this.dK().B);
      } else if (this.q() == buv.a.b && $$2.a(apr.O)) {
         if (this.bW != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dK().a(iw.Z, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }
         } else {
            Optional<Pair<bhr, Integer>> $$10 = this.l($$2);
            if (!$$10.isPresent()) {
               return bgo.d;
            }

            Pair<bhr, Integer> $$11 = $$10.get();
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dK().a(iw.q, this.dp() + this.ag.j() / 2.0, this.e(0.5), this.dv() + this.ag.j() / 2.0, 0.0, this.ag.j() / 5.0, 0.0);
            }

            this.bW = (bhr)$$11.getLeft();
            this.bX = (Integer)$$11.getRight();
            this.a(aou.nk, 2.0F, 1.0F);
         }

         return bgo.a(this.dK().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(aov $$0) {
      this.dK().a(null, this, aou.nn, $$0, 1.0F, 1.0F);
      if (!this.dK().r_()) {
         bup $$1 = bik.t.a(this.dK());
         if ($$1 != null) {
            ((aki)this.dK()).a(iw.x, this.dp(), this.e(0.5), this.dv(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ak();
            $$1.b(this.dp(), this.dr(), this.dv(), this.dA(), this.dC());
            $$1.c(this.et());
            $$1.aU = this.aU;
            if (this.ac()) {
               $$1.b(this.ad());
               $$1.n(this.cA());
            }

            if (this.fH()) {
               $$1.fF();
            }

            $$1.m(this.cq());
            this.dK().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dK().b(new bye(this.dK(), this.dp(), this.e(1.0), this.dv(), new ciw(this.q().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bv() && !this.i_();
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      $$0.a("Type", this.q().c());
      if (this.bW != null) {
         $$0.a("EffectId", bhr.a(this.bW));
         $$0.a("EffectDuration", this.bX);
      }
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      this.a(buv.a.a($$0.l("Type")));
      if ($$0.b("EffectId", 99)) {
         this.bW = bhr.a($$0.h("EffectId"));
      }

      if ($$0.b("EffectDuration", 99)) {
         this.bX = $$0.h("EffectDuration");
      }
   }

   private Optional<Pair<bhr, Integer>> l(ciw $$0) {
      dan $$1 = dan.a($$0.d());
      return $$1 != null ? Optional.of(Pair.of($$1.a(), $$1.b())) : Optional.empty();
   }

   public void a(buv.a $$0) {
      this.an.b(bT, $$0.d);
   }

   public buv.a q() {
      return buv.a.a(this.an.b(bT));
   }

   @Nullable
   public buv c(aki $$0, bib $$1) {
      buv $$2 = bik.ao.a((cpk)$$0);
      if ($$2 != null) {
         $$2.a(this.a((buv)$$1));
      }

      return $$2;
   }

   private buv.a a(buv $$0) {
      buv.a $$1 = this.q();
      buv.a $$2 = $$0.q();
      buv.a $$3;
      if ($$1 == $$2 && this.ag.a(1024) == 0) {
         $$3 = $$1 == buv.a.b ? buv.a.a : buv.a.b;
      } else {
         $$3 = this.ag.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements asf {
      a("red", csl.cg.n()),
      b("brown", csl.cf.n());

      public static final asf.a<buv.a> c = asf.a(buv.a::values);
      final String d;
      final dey e;

      private a(String $$0, dey $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dey a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static buv.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
