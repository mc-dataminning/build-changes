import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cnm extends cnl implements cpg {
   private static final Logger a = LogUtils.getLogger();
   private static final alc<Boolean> b = alg.a(cnm.class, ale.k);
   private static final alc<cpf> c = alg.a(cnm.class, ale.u);
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
   private dfy cj;
   private int ck;

   public cnm(bvm<? extends cnm> $$0, dha $$1) {
      super($$0, $$1);
      ma.x.a(this.ae).ifPresent($$0x -> this.a(this.gw().a((cph)$$0x.a())));
   }

   @Override
   protected void a(alg.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cpf(cpj.c, cph.b, 1));
   }

   @Override
   public void b(ux $$0) {
      super.b($$0);
      cpf.c.encodeStart(vl.a, this.gw()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cj != null) {
         $$0.a("Offers", (vu)dfy.a.encodeStart(this.dX().a(vl.a), this.cj).getOrThrow());
      }

      if (this.ci != null) {
         $$0.a("Gossips", this.ci);
      }

      $$0.a("ConversionTime", this.gv() ? this.cg : -1);
      if (this.ch != null) {
         $$0.a("ConversionPlayer", this.ch);
      }

      $$0.a("Xp", this.ck);
   }

   @Override
   public void a(ux $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cpf> $$1 = cpf.c.parse(new Dynamic(vl.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dfy.a.parse(this.dX().a(vl.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.cj = $$0x);
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
      if (!this.dV().C && this.bL() && this.gv()) {
         int $$0 = this.gy();
         this.cg -= $$0;
         if (this.cg <= 0) {
            this.g((ash)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bte b(cps $$0, btd $$1) {
      cxk $$2 = $$0.b($$1);
      if ($$2.a(cxo.qw)) {
         if (this.b(bum.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.a($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bte.b;
         } else {
            return bte.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gv() && this.ck == 0;
   }

   public boolean gv() {
      return this.au().a(b);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ch = $$0;
      this.cg = $$1;
      this.au().a(b, true);
      this.e(bum.r);
      this.a(new buk(bum.e, $$1, Math.min(this.dV().al().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), axf.Ek, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(ash $$0) {
      this.a(bvm.bD, bva.a(this, false, false), $$1 -> {
         for (bvn $$2 : this.a($$0, $$0xx -> !ddt.a($$0xx, dds.E))) {
            bwt $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gw());
         if (this.ci != null) {
            $$1.a(this.ci);
         }

         if (this.cj != null) {
            $$1.b(this.cj.a());
         }

         $$1.t(this.ck);
         $$1.a($$0, $$0.d_($$1.dv()), bvl.i, null);
         $$1.g($$0);
         if (this.ch != null) {
            cps $$4 = $$0.b(this.ch);
            if ($$4 instanceof asi) {
               ao.s.a((asi)$$4, this, $$1);
               $$0.a(chc.a, $$4, $$1);
            }
         }

         $$1.a(new buk(bum.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.cg = $$0;
   }

   private int gy() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         jh.a $$2 = new jh.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dxn $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dkg.fk) || $$6.b() instanceof djx) {
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
   public axe u() {
      return axf.Ei;
   }

   @Override
   public axe e(btv $$0) {
      return axf.Em;
   }

   @Override
   public axe o_() {
      return axf.El;
   }

   @Override
   public axe t() {
      return axf.En;
   }

   @Override
   protected cxk gm() {
      return cxk.k;
   }

   public void a(dfy $$0) {
      this.cj = $$0;
   }

   public void a(vu $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public bwu a(dhr $$0, btc $$1, bvl $$2, @Nullable bwu $$3) {
      this.a(this.gw().a(cpj.a($$0.t(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpf $$0) {
      cpf $$1 = this.gw();
      if ($$1.b() != $$0.b()) {
         this.cj = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cpf gw() {
      return this.al.a(c);
   }

   public int gx() {
      return this.ck;
   }

   public void s(int $$0) {
      this.ck = $$0;
   }
}
