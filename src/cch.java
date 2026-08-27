import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cch extends ccg implements cdo {
   private static final Logger b = LogUtils.getLogger();
   private static final afs<Boolean> c = afv.a(cch.class, afu.k);
   private static final afs<cdn> d = afv.a(cch.class, afu.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private ta cd;
   @Nullable
   private sd ce;
   private int cf;

   public cch(bkz<? extends cch> $$0, csf $$1) {
      super($$0, $$1);
      kc.A.a(this.ag).ifPresent($$0x -> this.a(this.gq().a((cdp)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
      this.an.a(d, new cdn(cdr.c, cdp.b, 1));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      cdn.c.encodeStart(sr.a, this.gq()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gp() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cdn> $$1 = cdn.c.parse(new Dynamic(sr.a, $$0.c("VillagerData")));
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
      if (!this.dN().B && this.bx() && this.gp()) {
         int $$0 = this.gs();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((ami)this.dN());
         }
      }

      super.l();
   }

   @Override
   public bjb b(cdz $$0, bja $$1) {
      clo $$2 = $$0.b($$1);
      if ($$2.a(clr.pX)) {
         if (this.a(bkk.r)) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            if (!this.dN().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bjb.a;
         } else {
            return bjb.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gg() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gp() && this.cf == 0;
   }

   public boolean gp() {
      return this.an().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.an().b(c, true);
      this.d(bkk.r);
      this.b(new bki(bkk.e, $$1, Math.min(this.dN().aj().a() - 1, 0)));
      this.dN().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dN().a(this.ds(), this.dw(), this.dy(), aqv.BZ, this.dc(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(ami $$0) {
      cdm $$1 = this.a(bkz.bf, false);

      for (bla $$2 : bla.values()) {
         clo $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cqb.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gq());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new cre(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dn()), blp.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cdz $$5 = $$0.b(this.cc);
         if ($$5 instanceof amj) {
            al.r.a((amj)$$5, this, $$1);
            $$0.a(bwh.a, $$5, $$1);
         }
      }

      $$1.b(new bki(bkk.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dn(), 0);
      }
   }

   private int gs() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         hx.a $$2 = new hx.a();

         for (int $$3 = (int)this.ds() - 4; $$3 < (int)this.ds() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.du() - 4; $$4 < (int)this.du() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dy() - 4; $$5 < (int)this.dy() + 4 && $$1 < 14; $$5++) {
                  dhn $$6 = this.dN().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cvh.eW) || $$6.b() instanceof cuy) {
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
   public float eY() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public aqu y() {
      return aqv.BX;
   }

   @Override
   public aqu d(bjt $$0) {
      return aqv.Cb;
   }

   @Override
   public aqu n_() {
      return aqv.Ca;
   }

   @Override
   public aqu A() {
      return aqv.Cc;
   }

   @Override
   protected clo gf() {
      return clo.b;
   }

   public void c(sd $$0) {
      this.ce = $$0;
   }

   public void a(ta $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.a(this.gq().a(cdr.a($$0.s(this.dn()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cdn $$0) {
      cdn $$1 = this.gq();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cdn gq() {
      return this.an.b(d);
   }

   public int gr() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
