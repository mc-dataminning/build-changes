import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bzx extends bzw implements cbe {
   private static final Logger b = LogUtils.getLogger();
   private static final aec<Boolean> c = aef.a(bzx.class, aee.k);
   private static final aec<cbd> d = aef.a(bzx.class, aee.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private rn cd;
   @Nullable
   private qu ce;
   private int cf;

   public bzx(bip<? extends bzx> $$0, cpq $$1) {
      super($$0, $$1);
      jd.A.a(this.ag).ifPresent($$0x -> this.a(this.gl().a((cbf)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
      this.an.a(d, new cbd(cbh.c, cbf.b, 1));
   }

   @Override
   public void b(qu $$0) {
      super.b($$0);
      cbd.c.encodeStart(rf.a, this.gl()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gk() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(qu $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbd> $$1 = cbd.c.parse(new Dynamic(rf.a, $$0.c("VillagerData")));
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
      if (!this.dK().B && this.bv() && this.gk()) {
         int $$0 = this.gn();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((akn)this.dK());
         }
      }

      super.l();
   }

   @Override
   public bgt b(cbp $$0, bgs $$1) {
      cja $$2 = $$0.b($$1);
      if ($$2.a(cjd.pm)) {
         if (this.a(bia.r)) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            if (!this.dK().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return bgt.a;
         } else {
            return bgt.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gb() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gk() && this.cf == 0;
   }

   public boolean gk() {
      return this.al().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.al().b(c, true);
      this.d(bia.r);
      this.b(new bhy(bia.e, $$1, Math.min(this.dK().ai().a() - 1, 0)));
      this.dK().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dt(), this.dv(), aoz.Bt, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(akn $$0) {
      cbc $$1 = this.a(bip.bf, false);

      for (biq $$2 : biq.values()) {
         cja $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cnl.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gl());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new cop(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dk()), bjf.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cbp $$5 = $$0.b(this.cc);
         if ($$5 instanceof ako) {
            al.r.a((ako)$$5, this, $$1);
            $$0.a(btx.a, $$5, $$1);
         }
      }

      $$1.b(new bhy(bia.i, 200, 0));
      if (!this.aS()) {
         $$0.a(null, 1027, this.dk(), 0);
      }
   }

   private int gn() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         gw.a $$2 = new gw.a();

         for (int $$3 = (int)this.dp() - 4; $$3 < (int)this.dp() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dr() - 4; $$4 < (int)this.dr() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dv() - 4; $$5 < (int)this.dv() + 4 && $$1 < 14; $$5++) {
                  dfe $$6 = this.dK().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(csr.eX) || $$6.b() instanceof csj) {
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
   public float eV() {
      return this.i_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public aoy r() {
      return aoz.Br;
   }

   @Override
   public aoy d(bhj $$0) {
      return aoz.Bv;
   }

   @Override
   public aoy h_() {
      return aoz.Bu;
   }

   @Override
   public aoy t() {
      return aoz.Bw;
   }

   @Override
   protected cja ga() {
      return cja.b;
   }

   public void c(qu $$0) {
      this.ce = $$0;
   }

   public void a(rn $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bju a(cqf $$0, bgr $$1, bjf $$2, @Nullable bju $$3, @Nullable qu $$4) {
      this.a(this.gl().a(cbh.a($$0.s(this.dk()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cbd $$0) {
      cbd $$1 = this.gl();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cbd gl() {
      return this.an.b(d);
   }

   public int gm() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }

   @Override
   protected Vector3f a(bil $$0, bim $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
