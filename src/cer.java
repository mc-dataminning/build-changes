import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cer extends cel implements btf, bto<cer.a> {
   private static final ajr<String> bY = ajv.a(cer.class, ajt.e);
   private static final int bZ = 1024;
   private static final String cb = "stew_effects";
   @Nullable
   private cws cc;
   @Nullable
   private UUID cd;

   public cer(bsa<? extends cer> $$0, dax $$1) {
      super($$0, $$1);
   }

   @Override
   public float a(io $$0, dba $$1) {
      return $$1.a_($$0.d()).a(dea.fl) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsa<cer> $$0, day $$1, bss $$2, io $$3, ayk $$4) {
      return $$1.a_($$3.d()).a(avw.ca) && a($$1, $$3);
   }

   @Override
   public void a(aqm $$0, bsn $$1) {
      UUID $$2 = $$1.cz();
      if (!$$2.equals(this.cd)) {
         this.a(this.u() == cer.a.a ? cer.a.b : cer.a.a);
         this.cd = $$2;
         this.a(avh.oO, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(ajv.a $$0) {
      super.a($$0);
      $$0.a(bY, cer.a.a.d);
   }

   @Override
   public bpu b(clw $$0, bpt $$1) {
      cto $$2 = $$0.b($$1);
      if ($$2.a(ctr.pq) && !this.p_()) {
         boolean $$3 = false;
         cto $$4;
         if (this.cc != null) {
            $$3 = true;
            $$4 = new cto(ctr.vU);
            $$4.b(kb.G, this.cc);
            this.cc = null;
         } else {
            $$4 = new cto(ctr.pr);
         }

         cto $$6 = ctq.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avg $$7;
         if ($$3) {
            $$7 = avh.oR;
         } else {
            $$7 = avh.oQ;
         }

         this.a($$7, 1.0F, 1.0F);
         return bpu.a(this.dP().B);
      } else if ($$2.a(ctr.rV) && this.a()) {
         this.a(avi.h);
         this.a(dvu.M, $$0);
         if (!this.dP().B) {
            $$2.a(1, $$0, d($$1));
         }

         return bpu.a(this.dP().B);
      } else if (this.u() == cer.a.b && $$2.a(awe.O)) {
         if (this.cc != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dP().a(ky.ae, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }
         } else {
            Optional<cws> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bpu.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dP().a(ky.p, this.du() + this.ah.j() / 2.0, this.e(0.5), this.dA() + this.ah.j() / 2.0, 0.0, this.ah.j() / 5.0, 0.0);
            }

            this.cc = $$10.get();
            this.a(avh.oP, 2.0F, 1.0F);
         }

         return bpu.a(this.dP().B);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avi $$0) {
      this.dP().a(null, this, avh.oS, $$0, 1.0F, 1.0F);
      if (!this.dP().x_()) {
         cel $$1 = bsa.w.a(this.dP());
         if ($$1 != null) {
            ((aqm)this.dP()).a(ky.w, this.du(), this.e(0.5), this.dA(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.du(), this.dw(), this.dA(), this.dF(), this.dH());
            $$1.t(this.eA());
            $$1.aZ = this.aZ;
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
               this.dP().b(new cig(this.dP(), this.du(), this.e(1.0), this.dA(), new cto(this.u().e.b())));
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
         cws.b.encodeStart(ur.a, this.cc).ifSuccess($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      this.a(cer.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cws.b.parse(ur.a, $$0.c("stew_effects")).ifSuccess($$0x -> this.cc = $$0x);
      }
   }

   private Optional<cws> n(cto $$0) {
      dma $$1 = dma.a($$0.g());
      return $$1 != null ? Optional.of($$1.b()) : Optional.empty();
   }

   public void a(cer.a $$0) {
      this.ao.a(bY, $$0.d);
   }

   public cer.a u() {
      return cer.a.a(this.ao.a(bY));
   }

   @Nullable
   public cer c(aqm $$0, bro $$1) {
      cer $$2 = bsa.as.a((dax)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cer)$$1));
      }

      return $$2;
   }

   private cer.a a(cer $$0) {
      cer.a $$1 = this.u();
      cer.a $$2 = $$0.u();
      cer.a $$3;
      if ($$1 == $$2 && this.ah.a(1024) == 0) {
         $$3 = $$1 == cer.a.b ? cer.a.a : cer.a.b;
      } else {
         $$3 = this.ah.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements ayx {
      a("red", dea.cg.n()),
      b("brown", dea.cf.n());

      public static final ayx.a<cer.a> c = ayx.a(cer.a::values);
      final String d;
      final drb e;

      private a(String $$0, drb $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public drb a() {
         return this.e;
      }

      @Override
      public String c() {
         return this.d;
      }

      static cer.a a(String $$0) {
         return c.a($$0, a);
      }
   }
}
