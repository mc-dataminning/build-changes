import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmr extends cmq implements coj {
   private static final Logger a = LogUtils.getLogger();
   private static final ajy<Boolean> b = akc.a(cmr.class, aka.k);
   private static final ajy<coi> c = akc.a(cmr.class, aka.u);
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
   private dff ci;
   private int cj;

   public cmr(bur<? extends cmr> $$0, dgh $$1) {
      super($$0, $$1);
      mb.x.a(this.ae).ifPresent($$0x -> this.a(this.gC().a((cok)$$0x.a())));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new coi(com.c, cok.b, 1));
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      coi.c.encodeStart(ue.a, this.gC()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (un)dff.a.encodeStart(this.dX().a(ue.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gB() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<coi> $$1 = coi.c.parse(new Dynamic(ue.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dff.a.parse(this.dX().a(ue.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dV().C && this.bL() && this.gB()) {
         int $$0 = this.gE();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.g((ard)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.qF)) {
         if (this.b(btr.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.a($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bsj.b;
         } else {
            return bsj.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gt() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gB() && this.cj == 0;
   }

   public boolean gB() {
      return this.au().a(b);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.au().a(b, true);
      this.e(btr.r);
      this.a(new btp(btr.e, $$1, Math.min(this.dV().am().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awa.EA, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(ard $$0) {
      this.a(bur.bC, buf.a(this, false, false), $$1 -> {
         for (bus $$2 : this.a($$0, $$0xx -> !dda.a($$0xx, dcz.E))) {
            bvy $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gC());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.t(this.cj);
         $$1.a($$0, $$0.d_($$1.dv()), buq.i, null);
         $$1.g($$0);
         if (this.cg != null) {
            cow $$4 = $$0.b(this.cg);
            if ($$4 instanceof are) {
               ap.s.a((are)$$4, this, $$1);
               $$0.a(cgh.a, $$4, $$1);
            }
         }

         $$1.a(new btp(btr.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.cf = $$0;
   }

   private int gE() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         ji.a $$2 = new ji.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dww $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(djn.fk) || $$6.b() instanceof dje) {
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
   public avz u() {
      return awa.Ey;
   }

   @Override
   public avz e(bta $$0) {
      return awa.EC;
   }

   @Override
   public avz o_() {
      return awa.EB;
   }

   @Override
   public avz t() {
      return awa.ED;
   }

   @Override
   protected cwo gs() {
      return cwo.j;
   }

   public void a(dff $$0) {
      this.ci = $$0;
   }

   public void a(un $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.a(this.gC().a(com.a($$0.t(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(coi $$0) {
      coi $$1 = this.gC();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public coi gC() {
      return this.al.a(c);
   }

   public int gD() {
      return this.cj;
   }

   public void s(int $$0) {
      this.cj = $$0;
   }
}
