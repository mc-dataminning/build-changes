import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cgu extends cgt implements cij {
   private static final Logger b = LogUtils.getLogger();
   private static final aim<Boolean> c = aiq.a(cgu.class, aio.k);
   private static final aim<cii> d = aiq.a(cgu.class, aio.t);
   private static final int ca = 3600;
   private static final int cb = 6000;
   private static final int cc = 14;
   private static final int cd = 4;
   private int ce;
   @Nullable
   private UUID cf;
   @Nullable
   private tx cg;
   @Nullable
   private cwa ch;
   private int ci;

   public cgu(bpd<? extends cgu> $$0, cxb $$1) {
      super($$0, $$1);
      ki.z.a(this.ag).ifPresent($$0x -> this.a(this.gy().a((cik)$$0x.a())));
   }

   @Override
   protected void a(aiq.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cii(cim.c, cik.b, 1));
   }

   @Override
   public void b(ta $$0) {
      super.b($$0);
      cii.c.encodeStart(to.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ch != null) {
         $$0.a("Offers", ac.a(cwa.a.encodeStart(to.a, this.ch), IllegalStateException::new));
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
   public void a(ta $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cii> $$1 = cii.c.parse(new Dynamic(to.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         cwa.a.parse(to.a, $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ch = $$0x);
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
            this.c((apf)this.dM());
         }
      }

      super.l();
   }

   @Override
   public bnd b(ciu $$0, bnc $$1) {
      cqm $$2 = $$0.b($$1);
      if ($$2.a(cqp.pZ)) {
         if (this.a(bom.r)) {
            $$2.a(1, $$0);
            if (!this.dM().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bnd.a;
         } else {
            return bnd.b;
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
      this.e(bom.r);
      this.b(new bok(bom.e, $$1, Math.min(this.dM().aj().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), aty.Dh, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(apf $$0) {
      cih $$1 = this.a(bpd.bj, false);

      for (bpe $$2 : bpe.values()) {
         cqm $$3 = this.d($$2);
         if (!$$3.b()) {
            if (cux.d($$3)) {
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
      $$1.a($$0, $$0.d_($$1.dm()), bpt.i, null);
      $$1.c($$0);
      if (this.cf != null) {
         ciu $$5 = $$0.b(this.cf);
         if ($$5 instanceof apg) {
            am.s.a((apg)$$5, this, $$1);
            $$0.a(cap.a, $$5, $$1);
         }
      }

      $$1.b(new bok(bom.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         ib.a $$2 = new ib.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  dnb $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dae.eW) || $$6.b() instanceof czv) {
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
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public atx v() {
      return aty.Df;
   }

   @Override
   public atx d(bnw $$0) {
      return aty.Dj;
   }

   @Override
   public atx n_() {
      return aty.Di;
   }

   @Override
   public atx gn() {
      return aty.Dk;
   }

   @Override
   protected cqm go() {
      return cqm.h;
   }

   public void a(cwa $$0) {
      this.ch = $$0;
   }

   public void a(tx $$0) {
      this.cg = $$0;
   }

   @Nullable
   @Override
   public bqh a(cxq $$0, bnb $$1, bpt $$2, @Nullable bqh $$3) {
      this.a(this.gy().a(cim.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cii $$0) {
      cii $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.ch = null;
      }

      this.an.a(d, $$0);
   }

   @Override
   public cii gy() {
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
