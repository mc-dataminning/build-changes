import java.util.Optional;
import java.util.UUID;
import javax.annotation.Nullable;

public class cer extends cel implements bte, btn<cer.a> {
   private static final ajy<String> ch = akc.a(cer.class, aka.e);
   private static final int ci = 1024;
   private static final String ck = "stew_effects";
   @Nullable
   private cxv cl;
   @Nullable
   private UUID cm;

   public cer(bsb<? extends cer> $$0, dca $$1) {
      super($$0, $$1);
   }

   @Override
   public boolean dW() {
      return false;
   }

   @Override
   public float a(ir $$0, dcd $$1) {
      return $$1.a_($$0.d()).a(dfe.gd) ? 10.0F : $$1.w($$0);
   }

   public static boolean c(bsb<cer> $$0, dcb $$1, bss $$2, ir $$3, ayt $$4) {
      return $$1.a_($$3.d()).a(awe.cd) && a($$1, $$3);
   }

   @Override
   public void a(aqt $$0, bsn $$1) {
      UUID $$2 = $$1.cE();
      if (!$$2.equals(this.cm)) {
         this.a(this.t() == cer.a.a ? cer.a.b : cer.a.a);
         this.cm = $$2;
         this.a(avo.pn, 2.0F, 1.0F);
      }
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(ch, cer.a.a.d);
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.qJ) && !this.o_()) {
         boolean $$3 = false;
         cuh $$4;
         if (this.cl != null) {
            $$3 = true;
            $$4 = new cuh(cuk.xF);
            $$4.b(ke.F, this.cl);
            this.cl = null;
         } else {
            $$4 = new cuh(cuk.qK);
         }

         cuh $$6 = cuj.a($$2, $$0, $$4, false);
         $$0.a($$1, $$6);
         avn $$7;
         if ($$3) {
            $$7 = avo.pq;
         } else {
            $$7 = avo.pp;
         }

         this.a($$7, 1.0F, 1.0F);
         return bqa.a(this.dU().C);
      } else if ($$2.a(cuk.ts) && this.a()) {
         this.a(avq.h);
         this.a(dxv.M, $$0);
         if (!this.dU().C) {
            $$2.a(1, $$0, d($$1));
         }

         return bqa.a(this.dU().C);
      } else if (this.t() == cer.a.b && $$2.a(awm.O)) {
         if (this.cl != null) {
            for (int $$9 = 0; $$9 < 2; $$9++) {
               this.dU().a(lb.ac, this.dz() + this.al.j() / 2.0, this.e(0.5), this.dF() + this.al.j() / 2.0, 0.0, this.al.j() / 5.0, 0.0);
            }
         } else {
            Optional<cxv> $$10 = this.n($$2);
            if ($$10.isEmpty()) {
               return bqa.d;
            }

            $$2.a(1, $$0);

            for (int $$11 = 0; $$11 < 4; $$11++) {
               this.dU().a(lb.p, this.dz() + this.al.j() / 2.0, this.e(0.5), this.dF() + this.al.j() / 2.0, 0.0, this.al.j() / 5.0, 0.0);
            }

            this.cl = $$10.get();
            this.a(avo.po, 2.0F, 1.0F);
         }

         return bqa.a(this.dU().C);
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(avq $$0) {
      this.dU().a(null, this, avo.pr, $$0, 1.0F, 1.0F);
      if (!this.dU().x_()) {
         cel $$1 = bsb.y.a(this.dU());
         if ($$1 != null) {
            ((aqt)this.dU()).a(lb.w, this.dz(), this.e(0.5), this.dF(), 1, 0.0, 0.0, 0.0, 0.0);
            this.ao();
            $$1.b(this.dz(), this.dB(), this.dF(), this.dK(), this.dM());
            $$1.t(this.eI());
            $$1.bj = this.bj;
            if (this.ag()) {
               $$1.b(this.ah());
               $$1.o(this.cJ());
            }

            if (this.ge()) {
               $$1.gc();
            }

            $$1.n(this.cz());
            this.dU().b($$1);

            for (int $$2 = 0; $$2 < 5; $$2++) {
               this.dU().b(new cig(this.dU(), this.dz(), this.e(1.0), this.dF(), new cuh(this.t().e.b())));
            }
         }
      }
   }

   @Override
   public boolean a() {
      return this.bI() && !this.o_();
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      $$0.a("Type", this.t().c());
      if (this.cl != null) {
         cxv.b.encodeStart(uy.a, this.cl).result().ifPresent($$1 -> $$0.a("stew_effects", $$1));
      }
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      this.a(cer.a.a($$0.l("Type")));
      if ($$0.b("stew_effects", 9)) {
         cxv.b.parse(uy.a, $$0.c("stew_effects")).result().ifPresent($$0x -> this.cl = $$0x);
      }
   }

   private Optional<cxv> n(cuh $$0) {
      dnt $$1 = dnt.a($$0.f());
      return $$1 != null ? Optional.of($$1.getSuspiciousEffects()) : Optional.empty();
   }

   public void a(cer.a $$0) {
      this.as.a(ch, $$0.d);
   }

   public cer.a t() {
      return cer.a.a(this.as.a(ch));
   }

   @Nullable
   public cer c(aqt $$0, brp $$1) {
      cer $$2 = bsb.at.a((dca)$$0);
      if ($$2 != null) {
         $$2.a(this.a((cer)$$1));
      }

      return $$2;
   }

   private cer.a a(cer $$0) {
      cer.a $$1 = this.t();
      cer.a $$2 = $$0.t();
      cer.a $$3;
      if ($$1 == $$2 && this.al.a(1024) == 0) {
         $$3 = $$1 == cer.a.b ? cer.a.a : cer.a.b;
      } else {
         $$3 = this.al.h() ? $$1 : $$2;
      }

      return $$3;
   }

   public static enum a implements azg {
      a("red", dfe.cR.n()),
      b("brown", dfe.cQ.n());

      public static final azg.a<cer.a> c = azg.a(cer.a::values);
      final String d;
      final dtc e;

      private a(String $$0, dtc $$1) {
         this.d = $$0;
         this.e = $$1;
      }

      public dtc a() {
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
