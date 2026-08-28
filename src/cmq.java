import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmq extends cmp implements coi {
   private static final Logger a = LogUtils.getLogger();
   private static final ajx<Boolean> b = akb.a(cmq.class, ajz.k);
   private static final ajx<coh> c = akb.a(cmq.class, ajz.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private un ch;
   @Nullable
   private dfe ci;
   private int cj;

   public cmq(buq<? extends cmq> $$0, dgg $$1) {
      super($$0, $$1);
      mb.x.a(this.ae).ifPresent($$0x -> this.a(this.gz().a((coj)$$0x.a())));
   }

   @Override
   protected void a(akb.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new coh(col.c, coj.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coh.c.encodeStart(ue.a, this.gz()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (un)dfe.a.encodeStart(this.dY().a(ue.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gy() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<coh> $$1 = coh.c.parse(new Dynamic(ue.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dfe.a.parse(this.dY().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.ci = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.ch = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cj = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && this.gy()) {
         int $$0 = this.gB();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.g((arc)this.dW());
         }
      }

      super.h();
   }

   @Override
   public bsi b(cov $$0, bsh $$1) {
      cwn $$2 = $$0.b($$1);
      if ($$2.a(cwr.qF)) {
         if (this.b(btq.r)) {
            $$2.a(1, $$0);
            if (!this.dW().C) {
               this.a($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bsi.b;
         } else {
            return bsi.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gy() && this.cj == 0;
   }

   public boolean gy() {
      return this.au().a(b);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.au().a(b, true);
      this.e(btq.r);
      this.a(new bto(btq.e, $$1, Math.min(this.dW().am().a() - 1, 0)));
      this.dW().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dF(), this.dH(), avz.EA, this.dn(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arc $$0) {
      this.a(buq.bC, bue.a(this, false, false), $$1 -> {
         for (bur $$2 : this.a($$0, $$0xx -> !dcz.a($$0xx, dcy.E))) {
            bvx $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gz());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.t(this.cj);
         $$1.a($$0, $$0.d_($$1.dw()), bup.i, null);
         $$1.g($$0);
         if (this.cg != null) {
            cov $$4 = $$0.b(this.cg);
            if ($$4 instanceof ard) {
               ap.s.a((ard)$$4, this, $$1);
               $$0.a(cgg.a, $$4, $$1);
            }
         }

         $$1.a(new bto(btq.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dw(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.cf = $$0;
   }

   private int gB() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         ji.a $$2 = new ji.a();

         for (int $$3 = (int)this.dB() - 4; $$3 < (int)this.dB() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dD() - 4; $$4 < (int)this.dD() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dH() - 4; $$5 < (int)this.dH() + 4 && $$1 < 14; $$5++) {
                  dwv $$6 = this.dW().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(djm.fk) || $$6.b() instanceof djd) {
                     if (this.ae.i() < 0.3F) {
                        $$0++;
                     }

                     $$1++;
                  }
               }
            }
         }
      }

      return $$0;
   }

   @Override
   public float fh() {
      return this.e_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public avy u() {
      return avz.Ey;
   }

   @Override
   public avy e(bsz $$0) {
      return avz.EC;
   }

   @Override
   public avy o_() {
      return avz.EB;
   }

   @Override
   public avy t() {
      return avz.ED;
   }

   @Override
   protected cwn gp() {
      return cwn.j;
   }

   public void a(dfe $$0) {
      this.ci = $$0;
   }

   public void a(un $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvy a(dgx $$0, bsg $$1, bup $$2, @Nullable bvy $$3) {
      this.a(this.gz().a(col.a($$0.t(this.dw()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(coh $$0) {
      coh $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public coh gz() {
      return this.al.a(c);
   }

   public int gA() {
      return this.cj;
   }

   public void s(int $$0) {
      this.cj = $$0;
   }
}
