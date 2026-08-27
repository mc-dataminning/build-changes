import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cac extends cab implements cbj {
   private static final Logger b = LogUtils.getLogger();
   private static final aee<Boolean> c = aeh.a(cac.class, aeg.k);
   private static final aee<cbi> d = aeh.a(cac.class, aeg.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private rq cd;
   @Nullable
   private qw ce;
   private int cf;

   public cac(biu<? extends cac> $$0, cpv $$1) {
      super($$0, $$1);
      jb.A.a(this.ag).ifPresent($$0x -> this.a(this.go().a((cbk)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
      this.an.a(d, new cbi(cbm.c, cbk.b, 1));
   }

   @Override
   public void b(qw $$0) {
      super.b($$0);
      cbi.c.encodeStart(ri.a, this.go()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gn() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(qw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbi> $$1 = cbi.c.parse(new Dynamic(ri.a, $$0.c("VillagerData")));
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
      if (!this.dL().B && this.bv() && this.gn()) {
         int $$0 = this.gq();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((akq)this.dL());
         }
      }

      super.l();
   }

   @Override
   public bgy b(cbu $$0, bgx $$1) {
      cjf $$2 = $$0.b($$1);
      if ($$2.a(cji.pm)) {
         if (this.a(bif.r)) {
            if (!$$0.fS().d) {
               $$2.h(1);
            }

            if (!this.dL().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return bgy.a;
         } else {
            return bgy.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ge() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gn() && this.cf == 0;
   }

   public boolean gn() {
      return this.al().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.al().b(c, true);
      this.d(bif.r);
      this.b(new bid(bif.e, $$1, Math.min(this.dL().ai().a() - 1, 0)));
      this.dL().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dL().a(this.dq(), this.du(), this.dw(), apd.Bt, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(akq $$0) {
      cbh $$1 = this.a(biu.bf, false);

      for (biv $$2 : biv.values()) {
         cjf $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cnq.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.go());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new cou(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dl()), bjk.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cbu $$5 = $$0.b(this.cc);
         if ($$5 instanceof akr) {
            al.r.a((akr)$$5, this, $$1);
            $$0.a(buc.a, $$5, $$1);
         }
      }

      $$1.b(new bid(bif.i, 200, 0));
      if (!this.aS()) {
         $$0.a(null, 1027, this.dl(), 0);
      }
   }

   private int gq() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         gw.a $$2 = new gw.a();

         for (int $$3 = (int)this.dq() - 4; $$3 < (int)this.dq() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.ds() - 4; $$4 < (int)this.ds() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dw() - 4; $$5 < (int)this.dw() + 4 && $$1 < 14; $$5++) {
                  dfj $$6 = this.dL().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(csw.eX) || $$6.b() instanceof cso) {
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
      return this.m_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public apc w() {
      return apd.Br;
   }

   @Override
   public apc d(bho $$0) {
      return apd.Bv;
   }

   @Override
   public apc l_() {
      return apd.Bu;
   }

   @Override
   public apc y() {
      return apd.Bw;
   }

   @Override
   protected cjf gd() {
      return cjf.b;
   }

   public void c(qw $$0) {
      this.ce = $$0;
   }

   public void a(rq $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bjz a(cqk $$0, bgw $$1, bjk $$2, @Nullable bjz $$3, @Nullable qw $$4) {
      this.a(this.go().a(cbm.a($$0.s(this.dl()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cbi $$0) {
      cbi $$1 = this.go();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cbi go() {
      return this.an.b(d);
   }

   public int gp() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }

   @Override
   protected Vector3f a(biq $$0, bir $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
