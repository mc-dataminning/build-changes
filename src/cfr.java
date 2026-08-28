import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfr extends cfl implements buf, buo<cfr.a> {
   private static final akj<String> bY = akn.a(cfr.class, akl.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cxs cc;
   @Nullable
   private UUID cd;

   public cfr(bsz<? extends cfr> $$0, dbx $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iz $$0, dca $$1) {
      return $$1.a_($$0.d()).a(dfa.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsz<cfr> $$0, dby $$1, bts $$2, iz $$3, azg $$4) {
      return $$1.a_($$3.d()).a(awo.ca) && a($$1, $$3);
   }

   @Override
   public void a(are $$0, btn $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cfr.a.a ? cfr.a.b : cfr.a.a);
         this.cd = $$2;
         this.a(avz.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, cfr.a.a.d);
   }

   @Override
   public bqt b(cmw $$0, bqs $$1) {
      cuo $$2 = $$0.b($$1);
      if ($$2.a(cur.pq) && !this.p_()) {
         boolean $$3 = false;
         cuo $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cuo(cur.vU);
            $$4.b(km.H, this.cc);
            this.cc = null;
         } else {
            $$4 = new cuo(cur.pr);
         }

         cuo $$6 = cuq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avy $$7;
         if ($$3) {
            $$7 = avz.oR;
         } else {
            $$7 = avz.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqt.a(this.dP().B);
      } else if ($$2.a(cur.rV) && this.a()) {
         this.a(awa.h);
         this.a(dwu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqt.a(this.dP().B);
      } else if (this.u() == cfr.a.b && $$2.a(awx.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(li.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxs> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqt.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(li.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avz.oP, 2.0F, 1.0F);
         }

         return bqt.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awa $$0) {
      this.dP().a(null, this, avz.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cfl $$1 = bsz.w.a(this.dP());
         if ($$1 != null) {
            ((are)this.dP()).a(li.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.t(this.eA());
            $$1.aY = this.aY;
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            if (this.fW()) {
               $$1.fU();
            }

            $$1.n(this.cu());
            this.dP().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dP().b(new cjg(this.dP(), this.du(), this.e(1.0), this.dA(), new cuo(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.p_();
   }

   @Override
   public void b(ur $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cxs.b.encodeStart(vf.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfr.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxs.b.parse(vf.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cxs> n(cuo $$0) {
      dna $$1 = dna.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfr.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cfr.a u() {
      return cfr.a.a(this.ao.a(bY));
   }

   @Nullable
   public cfr c(are $$0, bsn $$1) {
      cfr $$2 = bsz.as.a((dbx)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfr)$$1));
      }

      return $$2;
   }

   private cfr.a a(cfr $$0) {
      cfr.a $$1 = this.u();
      cfr.a $$2 = $$0.u();
      cfr.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfr.a.b ? cfr.a.a : cfr.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azt {
      a("red", dfa.cg.o()),
      b("brown", dfa.cf.o());

      public static final azt.a<cfr.a> c = azt.a(cfr.a::values);
      final String d;
      final dsb e;

      private a(final String $$0, final dsb $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsb a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfr.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
