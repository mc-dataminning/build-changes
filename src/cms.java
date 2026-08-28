import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cms extends cmr implements coh {
   private static final Logger a = LogUtils.getLogger();
   private static final akm<Boolean> b = akq.a(cms.class, ako.k);
   private static final akm<cog> c = akq.a(cms.class, ako.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vi ch;
   @Nullable
   private dek ci;
   private int cj;

   public cms(bus<? extends cms> $$0, dfm $$1) {
      super($$0, $$1);
      lz.x.a(this.ae).ifPresent($$0x -> this.a(this.gx().a((coi)$$0x.a())));
   }

   @Override
   protected void a(akq.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cog(cok.c, coi.b, 1));
   }

   @Override
   public void b(ul $$0) {
      super.b($$0);
      cog.c.encodeStart(uz.a, this.gx()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vi)dek.a.encodeStart(this.dX().a(uz.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gw() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(ul $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cog> $$1 = cog.c.parse(new Dynamic(uz.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dek.a.parse(this.dX().a(uz.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dV().C && this.bL() && this.gw()) {
         int $$0 = this.gz();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.g((arp)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bsk b(cou $$0, bsj $$1) {
      cwm $$2 = $$0.b($$1);
      if ($$2.a(cwq.qb)) {
         if (this.b(bts.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.a($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bsk.b;
         } else {
            return bsk.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean go() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gw() && this.cj == 0;
   }

   public boolean gw() {
      return this.au().a(b);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.au().a(b, true);
      this.e(bts.r);
      this.a(new btq(bts.e, $$1, Math.min(this.dV().ak().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awn.DQ, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arp $$0) {
      this.a(bus.bz, bug.a(this, false, false), $$1 -> {
         for (but $$2 : this.a($$0, $$0xx -> !dcf.a($$0xx, dce.E))) {
            bvz $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gx());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.t(this.cj);
         $$1.a($$0, $$0.d_($$1.dv()), bur.i, null);
         $$1.g($$0);
         if (this.cg != null) {
            cou $$4 = $$0.b(this.cg);
            if ($$4 instanceof arq) {
               ao.s.a((arq)$$4, this, $$1);
               $$0.a(cgi.a, $$4, $$1);
            }
         }

         $$1.a(new btq(bts.i, 200, 0));
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

   private int gz() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         jh.a $$2 = new jh.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dvv $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dis.eW) || $$6.b() instanceof dij) {
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
   public float ff() {
      return this.e_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public awm t() {
      return awn.DO;
   }

   @Override
   public awm e(btb $$0) {
      return awn.DS;
   }

   @Override
   public awm n_() {
      return awn.DR;
   }

   @Override
   public awm v() {
      return awn.DT;
   }

   @Override
   protected cwm gn() {
      return cwm.k;
   }

   public void a(dek $$0) {
      this.ci = $$0;
   }

   public void a(vi $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bwa a(dgd $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.a(this.gx().a(cok.a($$0.t(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cog $$0) {
      cog $$1 = this.gx();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cog gx() {
      return this.al.a(c);
   }

   public int gy() {
      return this.cj;
   }

   public void s(int $$0) {
      this.cj = $$0;
   }
}
