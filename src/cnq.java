import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnq extends cnp implements cpk {
   private static final Logger a = LogUtils.getLogger();
   private static final alc<Boolean> b = alg.a(cnq.class, ale.k);
   private static final alc<cpj> c = alg.a(cnq.class, ale.u);
   private static final int cc = 3600;
   private static final int cd = 6000;
   private static final int ce = 14;
   private static final int cf = 4;
   private int cg;
   @Nullable
   private UUID ch;
   @Nullable
   private vu ci;
   @Nullable
   private dgf cj;
   private int ck;

   public cnq(bvq<? extends cnq> $$0, dhh $$1) {
      super($$0, $$1);
      ma.x.a(this.ae).ifPresent($$0x -> this.a(this.gy().a((cpl)$$0x.a())));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cpj(cpn.c, cpl.b, 1));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpj.c.encodeStart(vl.a, this.gy()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cj != null) {
         $$0.a("Offers", (vu)dgf.a.encodeStart(this.dY().a(vl.a), this.cj).getOrThrow());
      }

      if (this.ci != null) {
         $$0.a("Gossips", this.ci);
      }

      $$0.a("ConversionTime", this.gx() ? this.cg : -1);
      if (this.ch != null) {
         $$0.a("ConversionPlayer", this.ch);
      }

      $$0.a("Xp", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cpj> $$1 = cpj.c.parse(new Dynamic(vl.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dgf.a.parse(this.dY().a(vl.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.cj = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.ci = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.ck = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dW().C && this.bL() && this.gx()) {
         int $$0 = this.gA();
         this.cg -= $$0;
         if (this.cg <= 0) {
            this.g((ash)this.dW());
         }
      }

      super.h();
   }

   @Override
   public bti b(cpw $$0, bth $$1) {
      cxo $$2 = $$0.b($$1);
      if ($$2.a(cxs.qw)) {
         if (this.b(buq.r)) {
            $$2.a(1, $$0);
            if (!this.dW().C) {
               this.a($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bti.b;
         } else {
            return bti.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gp() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gx() && this.ck == 0;
   }

   public boolean gx() {
      return this.au().a(b);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ch = $$0;
      this.cg = $$1;
      this.au().a(b, true);
      this.e(buq.r);
      this.a(new buo(buq.e, $$1, Math.min(this.dW().al().a() - 1, 0)));
      this.dW().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dW().a(this.dB(), this.dF(), this.dH(), axf.El, this.dn(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(ash $$0) {
      this.a(bvq.bD, bve.a(this, false, false), $$1 -> {
         for (bvr $$2 : this.a($$0, $$0xx -> !dea.a($$0xx, ddz.E))) {
            bwx $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.ci != null) {
            $$1.a(this.ci);
         }

         if (this.cj != null) {
            $$1.b(this.cj.a());
         }

         $$1.t(this.ck);
         $$1.a($$0, $$0.d_($$1.dw()), bvp.i, null);
         $$1.g($$0);
         if (this.ch != null) {
            cpw $$4 = $$0.b(this.ch);
            if ($$4 instanceof asi) {
               ao.s.a((asi)$$4, this, $$1);
               $$0.a(chg.a, $$4, $$1);
            }
         }

         $$1.a(new buo(buq.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dw(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.cg = $$0;
   }

   private int gA() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         jh.a $$2 = new jh.a();

         for (int $$3 = (int)this.dB() - 4; $$3 < (int)this.dB() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dD() - 4; $$4 < (int)this.dD() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dH() - 4; $$5 < (int)this.dH() + 4 && $$1 < 14; $$5++) {
                  dxu $$6 = this.dW().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dkn.fk) || $$6.b() instanceof dke) {
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
   public axe u() {
      return axf.Ej;
   }

   @Override
   public axe e(btz $$0) {
      return axf.En;
   }

   @Override
   public axe o_() {
      return axf.Em;
   }

   @Override
   public axe t() {
      return axf.Eo;
   }

   @Override
   protected cxo go() {
      return cxo.j;
   }

   public void a(dgf $$0) {
      this.cj = $$0;
   }

   public void a(vu $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public bwy a(dhy $$0, btg $$1, bvp $$2, @Nullable bwy $$3) {
      this.a(this.gy().a(cpn.a($$0.t(this.dw()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpj $$0) {
      cpj $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.cj = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cpj gy() {
      return this.al.a(c);
   }

   public int gz() {
      return this.ck;
   }

   public void s(int $$0) {
      this.ck = $$0;
   }
}
