import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bzt extends bzs implements cba {
   private static final Logger b = LogUtils.getLogger();
   private static final adx<Boolean> c = aea.a(bzt.class, adz.k);
   private static final adx<caz> d = aea.a(bzt.class, adz.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private rl cd;
   @Nullable
   private qs ce;
   private int cf;

   public bzt(bik<? extends bzt> $$0, cpk $$1) {
      super($$0, $$1);
      jc.A.a(this.ag).ifPresent($$0x -> this.a(this.gk().a((cbb)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
      this.an.a(d, new caz(cbd.c, cbb.b, 1));
   }

   @Override
   public void b(qs $$0) {
      super.b($$0);
      caz.c.encodeStart(rd.a, this.gk()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gj() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(qs $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<caz> $$1 = caz.c.parse(new Dynamic(rd.a, $$0.c("VillagerData")));
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
      if (!this.dK().B && this.bv() && this.gj()) {
         int $$0 = this.gm();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((aki)this.dK());
         }
      }

      super.l();
   }

   @Override
   public bgo b(cbl $$0, bgn $$1) {
      ciw $$2 = $$0.b($$1);
      if ($$2.a(ciz.pm)) {
         if (this.a(bhv.r)) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            if (!this.dK().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return bgo.a;
         } else {
            return bgo.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean ga() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gj() && this.cf == 0;
   }

   public boolean gj() {
      return this.al().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.al().b(c, true);
      this.d(bhv.r);
      this.b(new bht(bhv.e, $$1, Math.min(this.dK().ai().a() - 1, 0)));
      this.dK().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dt(), this.dv(), aou.Bj, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aki $$0) {
      cay $$1 = this.a(bik.bf, false);

      for (bil $$2 : bil.values()) {
         ciw $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cnf.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gk());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new coi(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dk()), bja.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cbl $$5 = $$0.b(this.cc);
         if ($$5 instanceof akj) {
            ai.r.a((akj)$$5, this, $$1);
            $$0.a(btt.a, $$5, $$1);
         }
      }

      $$1.b(new bht(bhv.i, 200, 0));
      if (!this.aS()) {
         $$0.a(null, 1027, this.dk(), 0);
      }
   }

   private int gm() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         gv.a $$2 = new gv.a();

         for (int $$3 = (int)this.dp() - 4; $$3 < (int)this.dp() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dr() - 4; $$4 < (int)this.dr() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dv() - 4; $$5 < (int)this.dv() + 4 && $$1 < 14; $$5++) {
                  dey $$6 = this.dK().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(csl.eX) || $$6.b() instanceof csd) {
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
   public aot r() {
      return aou.Bh;
   }

   @Override
   public aot d(bhe $$0) {
      return aou.Bl;
   }

   @Override
   public aot h_() {
      return aou.Bk;
   }

   @Override
   public aot t() {
      return aou.Bm;
   }

   @Override
   protected ciw fZ() {
      return ciw.b;
   }

   public void c(qs $$0) {
      this.ce = $$0;
   }

   public void a(rl $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bjq a(cpz $$0, bgm $$1, bja $$2, @Nullable bjq $$3, @Nullable qs $$4) {
      this.a(this.gk().a(cbd.a($$0.s(this.dk()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(caz $$0) {
      caz $$1 = this.gk();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public caz gk() {
      return this.an.b(d);
   }

   public int gl() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }

   @Override
   protected Vector3f a(big $$0, bih $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
