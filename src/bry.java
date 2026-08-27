import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;
import org.apache.commons.lang3.tuple.Pair;

public class bry extends brs implements bgr, bgy<bry.a> {
   private static final aby<String> bT = acb.a(bry.class, aca.e);
   private static final int bU = 1024;
   @Nullable
   private bey bW;
   private int bX;
   @Nullable
   private UUID bY;

   public bry(bfn<? extends bry> $$0, cmm $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(gu $$0, cmp $$1) {
      return $$1.a_($$0.d()).a(cpo.fl) ? 10.0F : $$1.v($$0);
   }

   public static boolean c(bfn<bry> $$0, cmn $$1, bgd $$2, gu $$3, apf $$4) {
      return $$1.a_($$3.d()).a(amw.bQ) && a($$1, $$3);
   }

   @Override
   public void a(aif $$0, bfy $$1) {
      UUID $$2 = $$1.ct();
      if (!$$2.equals(this.bY)) {
         this.a(this.r() == bry.a.a ? bry.a.b : bry.a.a);
         this.bY = $$2;
         this.a(amh.nj, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(bT, bry.a.a.d);
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(cgc.oC) && !this.h_()) {
         boolean $$3 = false;
         cfz $$4;
         if (this.bW != null) {
            $$3 = true;
            $$4 = new cfz(cgc.va);
            chj.a($$4, this.bW, this.bX);
            this.bW = null;
            this.bX = 0;
         } else {
            $$4 = new cfz(cgc.oD);
         }

         cfz $$6 = cgb.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         amg $$7;
         if ($$3) {
            $$7 = amh.nm;
         } else {
            $$7 = amh.nl;
         }

         this.a($$7, 1.0F, 1.0F);
         return bdx.a(this.dI().B);
      } else if ($$2.a(cgc.rg) && this.a()) {
         this.a(ami.h);
         this.a(dgl.N, $$0);
         if (!this.dI().B) {
            $$2.a(1, $$0, $$1x -> $$1x.d($$1));
         }

         return bdx.a(this.dI().B);
      } else if (this.r() == bry.a.b && $$2.a(ane.O)) {
         if (this.bW != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dI().a(iv.Z, this.dn() + this.af.j() / 2.0, this.e(0.5), this.dt() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }
         } else {
            Optional<Pair<bey, Integer>> $$10 = this.l($$2);
            if (!$$10.isPresent()) {
               return bdx.d;
            }

            Pair<bey, Integer> $$11 = $$10.get();
            if (!$$0.fO().d) {
               $$2.h(1);
            }

            for (int $$12 = 0; $$12 < 4; $$12++) {
               this.dI().a(iv.q, this.dn() + this.af.j() / 2.0, this.e(0.5), this.dt() + this.af.j() / 2.0, 0.0, this.af.j() / 5.0, 0.0);
            }

            this.bW = (bey)$$11.getLeft();
            this.bX = (Integer)$$11.getRight();
            this.a(amh.nk, 2.0F, 1.0F);
         }

         return bdx.a(this.dI().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ami $$0) {
      this.dI().a(null, this, amh.nn, $$0, 1.0F, 1.0F);
      if (!this.dI().r_()) {
         brs $$1 = bfn.t.a(this.dI());
         if ($$1 != null) {
            ((aif)this.dI()).a(iv.x, this.dn(), this.e(0.5), this.dt(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ai();
            $$1.b(this.dn(), this.dp(), this.dt(), this.dy(), this.dA());
            $$1.t(this.er());
            $$1.aV = this.aV;
            if (this.aa()) {
               $$1.b(this.ab());
               $$1.n(this.cy());
            }

            if (this.fH()) {
               $$1.fF();
            }

            $$1.m(this.co());
            this.dI().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dI().b(new bvh(this.dI(), this.dn(), this.e(1.0), this.dt(), new cfz(this.r().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bs() && !this.h_();
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      $$0.a("Type", this.r().c());
      if (this.bW != null) {
         $$0.a("EffectId", bey.a(this.bW));
         $$0.a("EffectDuration", this.bX);
      }
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      this.a(bry.a.a($$0.l("Type")));
      if ($$0.b("EffectId", 99)) {
         this.bW = bey.a($$0.h("EffectId"));
      }

      if ($$0.b("EffectDuration", 99)) {
         this.bX = $$0.h("EffectDuration");
      }
   }

   private Optional<Pair<bey, Integer>> l(cfz $$0) {
      cxq $$1 = cxq.a($$0.d());
      return $$1 != null ? Optional.of(Pair.of($$1.a(), $$1.b())) : Optional.empty();
   }

   public void a(bry.a $$0) {
      this.am.b(bT, $$0.d);
   }

   public bry.a r() {
      return bry.a.a(this.am.b(bT));
   }

   @Nullable
   public bry c(aif $$0, bfe $$1) {
      bry $$2 = bfn.ao.a((cmm)$$0);
      if ($$2 != null) {
         $$2.a(this.a((bry)$$1));
      }

      return $$2;
   }

   private bry.a a(bry $$0) {
      bry.a $$1 = this.r();
      bry.a $$2 = $$0.r();
      bry.a $$3;
      if ($$1 == $$2 && this.af.a(1024) == 0) {
         $$3 = $$1 == bry.a.b ? bry.a.a : bry.a.b;
      } else {
         $$3 = this.af.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements apr {
      a("red", cpo.cg.n()),
      b("brown", cpo.cf.n());

      public static final apr.a<bry.a> c = apr.a(bry.a::values);
      final String d;
      final dcb e;

      private a(String $$0, dcb $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dcb a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static bry.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
