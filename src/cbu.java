import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cbu extends cbt implements cdb {
   private static final Logger b = LogUtils.getLogger();
   private static final afm<Boolean> c = afp.a(cbu.class, afo.k);
   private static final afm<cda> d = afp.a(cbu.class, afo.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private sw cd;
   @Nullable
   private rz ce;
   private int cf;

   public cbu(bkm<? extends cbu> $$0, crs $$1) {
      super($$0, $$1);
      jy.A.a(this.ag).ifPresent($$0x -> this.a(this.gp().a((cdc)$$0x.a())));
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(c, false);
      this.an.a(d, new cda(cde.c, cdc.b, 1));
   }

   @Override
   public void b(rz $$0) {
      super.b($$0);
      cda.c.encodeStart(sn.a, this.gp()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
   public void a(rz $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cda> $$1 = cda.c.parse(new Dynamic(sn.a, $$0.c("VillagerData")));
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
            this.c((ama)this.dL());
         }
      }

      super.l();
   }

   @Override
   public biq b(cdm $$0, bip $$1) {
      clb $$2 = $$0.b($$1);
      if ($$2.a(cle.pm)) {
         if (this.a(bjx.r)) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            if (!this.dL().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return biq.a;
         } else {
            return biq.b;
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
      this.d(bjx.r);
      this.b(new bjv(bjx.e, $$1, Math.min(this.dL().ai().a() - 1, 0)));
      this.dL().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.du(), this.dw(), aqn.By, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(ama $$0) {
      ccz $$1 = this.a(bkm.bf, false);

      for (bkn $$2 : bkn.values()) {
         clb $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cpo.d($$3)) {
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
         $$1.b(new cqr(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dl()), blc.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cdm $$5 = $$0.b(this.cc);
         if ($$5 instanceof amb) {
            al.r.a((amb)$$5, this, $$1);
            $$0.a(bvu.a, $$5, $$1);
         }
      }

      $$1.b(new bjv(bjx.i, 200, 0));
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
                  dgw $$6 = this.dL().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cuv.eW) || $$6.b() instanceof cum) {
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
   public aqm w() {
      return aqn.Bw;
   }

   @Override
   public aqm d(bjg $$0) {
      return aqn.BA;
   }

   @Override
   public aqm m_() {
      return aqn.Bz;
   }

   @Override
   public aqm y() {
      return aqn.BB;
   }

   @Override
   protected clb ge() {
      return clb.b;
   }

   public void c(rz $$0) {
      this.ce = $$0;
   }

   public void a(sw $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public blr a(csh $$0, bio $$1, blc $$2, @Nullable blr $$3, @Nullable rz $$4) {
      this.a(this.gp().a(cde.a($$0.s(this.dl()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cda $$0) {
      cda $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cda gp() {
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
   protected Vector3f a(bki $$0, bkj $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
