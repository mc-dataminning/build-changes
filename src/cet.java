import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cet extends cen implements bth, btq<cet.a> {
   private static final ajs<String> bY = ajw.a(cet.class, aju.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cwu cc;
   @Nullable
   private UUID cd;

   public cet(bsc<? extends cet> $$0, daz $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(io $$0, dbc $$1) {
      return $$1.a_($$0.d()).a(dec.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsc<cet> $$0, dba $$1, bsu $$2, io $$3, aym $$4) {
      return $$1.a_($$3.d()).a(avx.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqn $$0, bsp $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cet.a.a ? cet.a.b : cet.a.a);
         this.cd = $$2;
         this.a(avi.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(bY, cet.a.a.d);
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.pq) && !this.p_()) {
         boolean $$3 = false;
         ctq $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new ctq(ctt.vU);
            $$4.b(kb.G, this.cc);
            this.cc = null;
         } else {
            $$4 = new ctq(ctt.pr);
         }

         ctq $$6 = cts.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avh $$7;
         if ($$3) {
            $$7 = avi.oR;
         } else {
            $$7 = avi.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bpw.a(this.dP().B);
      } else if ($$2.a(ctt.rV) && this.a()) {
         this.a(avj.h);
         this.a(dvw.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpw.a(this.dP().B);
      } else if (this.u() == cet.a.b && $$2.a(awf.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(ky.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cwu> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bpw.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(ky.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avi.oP, 2.0F, 1.0F);
         }

         return bpw.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avj $$0) {
      this.dP().a(null, this, avi.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cen $$1 = bsc.w.a(this.dP());
         if ($$1 != null) {
            ((aqn)this.dP()).a(ky.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.t(this.eA());
            $$1.aY = this.aY;
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cE());
            }

            if (this.fV()) {
               $$1.fT();
            }

            $$1.n(this.cu());
            this.dP().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dP().b(new cii(this.dP(), this.du(), this.e(1.0), this.dA(), new ctq(this.u().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bD() && !this.p_();
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      $$0.a("Type", this.u().c());
      if (this.cc != null) {
         cwu.b.encodeStart(ur.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cet.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cwu.b.parse(ur.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cwu> n(ctq $$0) {
      dmc $$1 = dmc.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cet.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cet.a u() {
      return cet.a.a(this.ao.a(bY));
   }

   @Nullable
   public cet c(aqn $$0, brq $$1) {
      cet $$2 = bsc.as.a((daz)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cet)$$1));
      }

      return $$2;
   }

   private cet.a a(cet $$0) {
      cet.a $$1 = this.u();
      cet.a $$2 = $$0.u();
      cet.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cet.a.b ? cet.a.a : cet.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayz {
      a("red", dec.cg.n()),
      b("brown", dec.cf.n());

      public static final ayz.a<cet.a> c = ayz.a(cet.a::values);
      final String d;
      final drd e;

      private a(String $$0, drd $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public drd a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cet.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
