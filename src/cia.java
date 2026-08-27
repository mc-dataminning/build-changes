import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cia extends chz implements cjp {
   private static final Logger b = LogUtils.getLogger();
   private static final aja<Boolean> c = aje.a(cia.class, ajc.k);
   private static final aja<cjo> d = aje.a(cia.class, ajc.t);
   private static final int ca = 3600;
   private static final int cb = 6000;
   private static final int cc = 14;
   private static final int cd = 4;
   private int ce;
   @Nullable
   private UUID cf;
   @Nullable
   private ul cg;
   @Nullable
   private cyf ch;
   private int ci;

   public cia(bqg<? extends cia> $$0, czg $$1) {
      super($$0, $$1);
      kt.z.a(this.ag).ifPresent($$0x -> this.a(this.gy().a((cjq)$$0x.a())));
   }

   @Override
   protected void a(aje.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cjo(cjs.c, cjq.b, 1));
   }

   @Override
   public void b(to $$0) {
      super.b($$0);
      cjo.c.encodeStart(uc.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ch != null) {
         $$0.a("Offers", ac.a(cyf.a.encodeStart(this.dO().a(uc.a), this.ch), IllegalStateException::new));
      }

      if (this.cg != null) {
         $$0.a("Gossips", this.cg);
      }

      $$0.a("ConversionTime", this.gx() ? this.ce : -1);
      if (this.cf != null) {
         $$0.a("ConversionPlayer", this.cf);
      }

      $$0.a("Xp", this.ci);
   }

   @Override
   public void a(to $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cjo> $$1 = cjo.c.parse(new Dynamic(uc.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         cyf.a.parse(this.dO().a(uc.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ch = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cg = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.ci = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bA() && this.gx()) {
         int $$0 = this.gA();
         this.ce -= $$0;
         if (this.ce <= 0) {
            this.c((apu)this.dM());
         }
      }

      super.l();
   }

   @Override
   public bof b(cka $$0, boe $$1) {
      crs $$2 = $$0.b($$1);
      if ($$2.a(crv.pZ)) {
         if (this.b(bpo.r)) {
            $$2.a(1, $$0);
            if (!this.dM().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bof.a;
         } else {
            return bof.b;
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
      return !this.gx() && this.ci == 0;
   }

   public boolean gx() {
      return this.an().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cf = $$0;
      this.ce = $$1;
      this.an().a(c, true);
      this.e(bpo.r);
      this.b(new bpm(bpo.e, $$1, Math.min(this.dM().ak().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), auo.Dp, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(apu $$0) {
      cjn $$1 = this.a(bqg.bi, false);

      for (bqh $$2 : bqh.values()) {
         crs $$3 = this.d($$2);
         if (!$$3.d()) {
            if (cxa.f($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gy());
      if (this.cg != null) {
         $$1.a(this.cg);
      }

      if (this.ch != null) {
         $$1.b(this.ch.a());
      }

      $$1.v(this.ci);
      $$1.a($$0, $$0.d_($$1.dm()), bqx.i, null);
      $$1.c($$0);
      if (this.cf != null) {
         cka $$5 = $$0.b(this.cf);
         if ($$5 instanceof apv) {
            am.s.a((apv)$$5, this, $$1);
            $$0.a(cbt.a, $$5, $$1);
         }
      }

      $$1.b(new bpm(bpo.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         id.a $$2 = new id.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  dpi $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dcj.eW) || $$6.b() instanceof dca) {
                     if (this.ag.i() < 0.3F) {
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
   public float fc() {
      return this.p_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public aun v() {
      return auo.Dn;
   }

   @Override
   public aun d(boy $$0) {
      return auo.Dr;
   }

   @Override
   public aun o_() {
      return auo.Dq;
   }

   @Override
   public aun gn() {
      return auo.Ds;
   }

   @Override
   protected crs go() {
      return crs.i;
   }

   public void a(cyf $$0) {
      this.ch = $$0;
   }

   public void a(ul $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public brl a(czv $$0, bod $$1, bqx $$2, @Nullable brl $$3) {
      this.a(this.gy().a(cjs.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cjo $$0) {
      cjo $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ch = null;
      }

      this.an.a(d, $$0);
   }

   @Override
   public cjo gy() {
      return this.an.a(d);
   }

   public int gz() {
      return this.ci;
   }

   @Override
   public void b(int $$0) {
      this.ci = $$0;
   }
}
