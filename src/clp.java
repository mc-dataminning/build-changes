import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class clp extends clo implements cne {
   private static final Logger b = LogUtils.getLogger();
   private static final akg<Boolean> c = akk.a(clp.class, aki.k);
   private static final akg<cnd> d = akk.a(clp.class, aki.u);
   private static final int cc = 3600;
   private static final int cd = 6000;
   private static final int ce = 14;
   private static final int cf = 4;
   private int cg;
   @Nullable
   private UUID ch;
   @Nullable
   private vc ci;
   @Nullable
   private dcq cj;
   private int ck;

   public clp(btq<? extends clp> $$0, dds $$1) {
      super($$0, $$1);
      lu.x.a(this.af).ifPresent($$0x -> this.a(this.gy().a((cnf)$$0x.a())));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cnd(cnh.c, cnf.b, 1));
   }

   @Override
   public void b(uf $$0) {
      super.b($$0);
      cnd.c.encodeStart(ut.a, this.gy()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cj != null) {
         $$0.a("Offers", (vc)dcq.a.encodeStart(this.dU().a(ut.a), this.cj).getOrThrow());
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
   public void a(uf $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cnd> $$1 = cnd.c.parse(new Dynamic(ut.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dcq.a.parse(this.dU().a(ut.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.cj = $$0x);
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
   public void l() {
      if (!this.dS().B && this.bI() && this.gx()) {
         int $$0 = this.gA();
         this.cg -= $$0;
         if (this.cg <= 0) {
            this.a((arg)this.dS());
         }
      }

      super.l();
   }

   @Override
   public brk b(cnp $$0, brj $$1) {
      cvl $$2 = $$0.b($$1);
      if ($$2.a(cvo.qb)) {
         if (this.b(bss.r)) {
            $$2.a(1, $$0);
            if (!this.dS().B) {
               this.a($$0.cD(), this.af.a(2401) + 3600);
            }

            return brk.b;
         } else {
            return brk.c;
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
      return this.at().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ch = $$0;
      this.cg = $$1;
      this.at().a(c, true);
      this.e(bss.r);
      this.b(new bsq(bss.e, $$1, Math.min(this.dS().am().a() - 1, 0)));
      this.dS().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dS().a(this.dx(), this.dB(), this.dD(), awd.DS, this.di(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arg $$0) {
      cnc $$1 = this.a(btq.bj, false);
      if ($$1 != null) {
         for (btr $$2 : this.c($$0x -> !day.a($$0x, dax.E))) {
            buw $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.ci != null) {
            $$1.a(this.ci);
         }

         if (this.cj != null) {
            $$1.b(this.cj.a());
         }

         $$1.u(this.ck);
         $$1.a($$0, $$0.d_($$1.ds()), btp.i, null);
         $$1.a($$0);
         if (this.ch != null) {
            cnp $$4 = $$0.b(this.ch);
            if ($$4 instanceof arh) {
               an.s.a((arh)$$4, this, $$1);
               $$0.a(cff.a, $$4, $$1);
            }
         }

         $$1.b(new bsq(bss.i, 200, 0));
         if (!this.ba()) {
            $$0.a(null, 1027, this.ds(), 0);
         }
      }
   }

   private int gA() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         je.a $$2 = new je.a();

         for (int $$3 = (int)this.dx() - 4; $$3 < (int)this.dx() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dz() - 4; $$4 < (int)this.dz() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dD() - 4; $$5 < (int)this.dD() + 4 && $$1 < 14; $$5++) {
                  dua $$6 = this.dS().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dgx.eW) || $$6.b() instanceof dgo) {
                     if (this.af.i() < 0.3F) {
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
   public float fe() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public awc w() {
      return awd.DQ;
   }

   @Override
   public awc d(bsb $$0) {
      return awd.DU;
   }

   @Override
   public awc n_() {
      return awd.DT;
   }

   @Override
   public awc y() {
      return awd.DV;
   }

   @Override
   protected cvl go() {
      return cvl.k;
   }

   public void a(dcq $$0) {
      this.cj = $$0;
   }

   public void a(vc $$0) {
      this.ci = $$0;
   }

   @Nullable
   @Override
   public bux a(dei $$0, bri $$1, btp $$2, @Nullable bux $$3) {
      this.a(this.gy().a(cnh.a($$0.t(this.ds()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cnd $$0) {
      cnd $$1 = this.gy();
      if ($$1.b() != $$0.b()) {
         this.cj = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cnd gy() {
      return this.am.a(d);
   }

   public int gz() {
      return this.ck;
   }

   @Override
   public void b(int $$0) {
      this.ck = $$0;
   }
}
