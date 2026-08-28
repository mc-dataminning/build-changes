import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cfq extends cfk implements bue, bun<cfq.a> {
   private static final akj<String> bY = akn.a(cfq.class, akl.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cxr cc;
   @Nullable
   private UUID cd;

   public cfq(bsy<? extends cfq> $$0, dbw $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(iz $$0, dbz $$1) {
      return $$1.a_($$0.d()).a(dez.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsy<cfq> $$0, dbx $$1, btr $$2, iz $$3, azf $$4) {
      return $$1.a_($$3.d()).a(awo.ca) && a($$1, $$3);
   }

   @Override
   public void a(are $$0, btm $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cfq.a.a ? cfq.a.b : cfq.a.a);
         this.cd = $$2;
         this.a(avz.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akn.a $$0) {
      super.a($$0);
      $$0.a(bY, cfq.a.a.d);
   }

   @Override
   public bqs b(cmv $$0, bqr $$1) {
      cun $$2 = $$0.b($$1);
      if ($$2.a(cuq.pq) && !this.p_()) {
         boolean $$3 = false;
         cun $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cun(cuq.vU);
            $$4.b(km.G, this.cc);
            this.cc = null;
         } else {
            $$4 = new cun(cuq.pr);
         }

         cun $$6 = cup.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avy $$7;
         if ($$3) {
            $$7 = avz.oR;
         } else {
            $$7 = avz.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqs.a(this.dP().B);
      } else if ($$2.a(cuq.rV) && this.a()) {
         this.a(awa.h);
         this.a(dwt.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bqs.a(this.dP().B);
      } else if (this.u() == cfq.a.b && $$2.a(awx.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(li.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxr> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqs.e;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(li.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avz.oP, 2.0F, 1.0F);
         }

         return bqs.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awa $$0) {
      this.dP().a(null, this, avz.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cfk $$1 = bsy.w.a(this.dP());
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
               this.dP().b(new cjf(this.dP(), this.du(), this.e(1.0), this.dA(), new cun(this.u().e.b())));
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
         cxr.b.encodeStart(vf.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ur $$0) {
      super.a($$0);
      this.a(cfq.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxr.b.parse(vf.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cxr> n(cun $$0) {
      dmz $$1 = dmz.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cfq.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cfq.a u() {
      return cfq.a.a(this.ao.a(bY));
   }

   @Nullable
   public cfq c(are $$0, bsm $$1) {
      cfq $$2 = bsy.as.a((dbw)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cfq)$$1));
      }

      return $$2;
   }

   private cfq.a a(cfq $$0) {
      cfq.a $$1 = this.u();
      cfq.a $$2 = $$0.u();
      cfq.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cfq.a.b ? cfq.a.a : cfq.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azs {
      a("red", dez.cg.o()),
      b("brown", dez.cf.o());

      public static final azs.a<cfq.a> c = azs.a(cfq.a::values);
      final String d;
      final dsa e;

      private a(final String $$0, final dsa $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dsa a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cfq.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
