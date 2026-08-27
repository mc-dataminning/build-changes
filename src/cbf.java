import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cbf extends cbe implements ccm {
   private static final Logger b = LogUtils.getLogger();
   private static final afc<Boolean> c = aff.a(cbf.class, afe.k);
   private static final afc<ccl> d = aff.a(cbf.class, afe.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private sn cd;
   @Nullable
   private rt ce;
   private int cf;

   public cbf(bjx<? extends cbf> $$0, cqz $$1) {
      super($$0, $$1);
      jy.A.a(this.ag).ifPresent($$0x -> this.a(this.gp().a((ccn)$$0x.a())));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(c, false);
      this.an.a(d, new ccl(ccp.c, ccn.b, 1));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      ccl.c.encodeStart(sf.a, this.gp()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.go() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<ccl> $$1 = ccl.c.parse(new Dynamic(sf.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.ce = $$0.p("Offers");
      }

      if ($$0.b("Gossips", 9)) {
         this.cd = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cf = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dL().B && this.bv() && this.go()) {
         int $$0 = this.gr();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((alq)this.dL());
         }
      }

      super.l();
   }

   @Override
   public bib b(ccx $$0, bia $$1) {
      ckj $$2 = $$0.b($$1);
      if ($$2.a(ckm.pm)) {
         if (this.a(bji.r)) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            if (!this.dL().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return bib.a;
         } else {
            return bib.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gf() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.go() && this.cf == 0;
   }

   public boolean go() {
      return this.al().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.al().b(c, true);
      this.d(bji.r);
      this.b(new bjg(bji.e, $$1, Math.min(this.dL().ai().a() - 1, 0)));
      this.dL().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.du(), this.dw(), aqd.Bw, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(alq $$0) {
      cck $$1 = this.a(bjx.bf, false);

      for (bjy $$2 : bjy.values()) {
         ckj $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cov.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gp());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new cpy(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dl()), bkn.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         ccx $$5 = $$0.b(this.cc);
         if ($$5 instanceof alr) {
            al.r.a((alr)$$5, this, $$1);
            $$0.a(bvf.a, $$5, $$1);
         }
      }

      $$1.b(new bjg(bji.i, 200, 0));
      if (!this.aS()) {
         $$0.a(null, 1027, this.dl(), 0);
      }
   }

   private int gr() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         ht.a $$2 = new ht.a();

         for (int $$3 = (int)this.dq() - 4; $$3 < (int)this.dq() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.ds() - 4; $$4 < (int)this.ds() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dw() - 4; $$5 < (int)this.dw() + 4 && $$1 < 14; $$5++) {
                  dgb $$6 = this.dL().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cuc.eW) || $$6.b() instanceof ctt) {
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
   public float eW() {
      return this.n_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqc w() {
      return aqd.Bu;
   }

   @Override
   public aqc d(bir $$0) {
      return aqd.By;
   }

   @Override
   public aqc m_() {
      return aqd.Bx;
   }

   @Override
   public aqc y() {
      return aqd.Bz;
   }

   @Override
   protected ckj ge() {
      return ckj.b;
   }

   public void c(rt $$0) {
      this.ce = $$0;
   }

   public void a(sn $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.a(this.gp().a(ccp.a($$0.s(this.dl()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(ccl $$0) {
      ccl $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public ccl gp() {
      return this.an.b(d);
   }

   public int gq() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
