import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class bww extends bwv implements byd {
   private static final Logger b = LogUtils.getLogger();
   private static final aby<Boolean> c = acb.a(bww.class, aca.k);
   private static final aby<byc> d = acb.a(bww.class, aca.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private rk cd;
   @Nullable
   private qr ce;
   private int cf;

   public bww(bfn<? extends bww> $$0, cmm $$1) {
      super($$0, $$1);
      jb.A.a(this.af).ifPresent($$0x -> this.a(this.gj().a((bye)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.am.a(c, false);
      this.am.a(d, new byc(byg.c, bye.b, 1));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      byc.c.encodeStart(rc.a, this.gj()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ce != null) {
         $$0.a("Offers", this.ce);
      }

      if (this.cd != null) {
         $$0.a("Gossips", this.cd);
      }

      $$0.a("ConversionTime", this.gi() ? this.cb : -1);
      if (this.cc != null) {
         $$0.a("ConversionPlayer", this.cc);
      }

      $$0.a("Xp", this.cf);
   }

   @Override
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<byc> $$1 = byc.c.parse(new Dynamic(rc.a, $$0.c("VillagerData")));
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
      if (!this.dI().B && this.bs() && this.gi()) {
         int $$0 = this.gl();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((aif)this.dI());
         }
      }

      super.l();
   }

   @Override
   public bdx b(byo $$0, bdw $$1) {
      cfz $$2 = $$0.b($$1);
      if ($$2.a(cgc.pm)) {
         if (this.a(bfc.r)) {
            if (!$$0.fO().d) {
               $$2.h(1);
            }

            if (!this.dI().B) {
               this.a($$0.ct(), this.af.a(2401) + 3600);
            }

            return bdx.a;
         } else {
            return bdx.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean fZ() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gi() && this.cf == 0;
   }

   public boolean gi() {
      return this.aj().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.aj().b(c, true);
      this.d(bfc.r);
      this.b(new bfa(bfc.e, $$1, Math.min(this.dI().ai().a() - 1, 0)));
      this.dI().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aQ()) {
            this.dI().a(this.dn(), this.dr(), this.dt(), amh.Bi, this.cY(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aif $$0) {
      byb $$1 = this.a(bfn.bf, false);

      for (bfo $$2 : bfo.values()) {
         cfz $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cki.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gj());
      if (this.cd != null) {
         $$1.a(this.cd);
      }

      if (this.ce != null) {
         $$1.b(new cll(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.di()), bgd.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         byo $$5 = $$0.b(this.cc);
         if ($$5 instanceof aig) {
            ai.r.a((aig)$$5, this, $$1);
            $$0.a(bqw.a, $$5, $$1);
         }
      }

      $$1.b(new bfa(bfc.i, 200, 0));
      if (!this.aQ()) {
         $$0.a(null, 1027, this.di(), 0);
      }
   }

   private int gl() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         gu.a $$2 = new gu.a();

         for (int $$3 = (int)this.dn() - 4; $$3 < (int)this.dn() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dp() - 4; $$4 < (int)this.dp() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dt() - 4; $$5 < (int)this.dt() + 4 && $$1 < 14; $$5++) {
                  dcb $$6 = this.dI().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cpo.eX) || $$6.b() instanceof cpg) {
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
   public float eS() {
      return this.h_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public amg s() {
      return amh.Bg;
   }

   @Override
   public amg d(ben $$0) {
      return amh.Bk;
   }

   @Override
   public amg g_() {
      return amh.Bj;
   }

   @Override
   public amg w() {
      return amh.Bl;
   }

   @Override
   protected cfz fY() {
      return cfz.b;
   }

   public void c(qr $$0) {
      this.ce = $$0;
   }

   public void a(rk $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bgt a(cnb $$0, bdv $$1, bgd $$2, @Nullable bgt $$3, @Nullable qr $$4) {
      this.a(this.gj().a(byg.a($$0.s(this.di()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(byc $$0) {
      byc $$1 = this.gj();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.am.b(d, $$0);
   }

   @Override
   public byc gj() {
      return this.am.b(d);
   }

   public int gk() {
      return this.cf;
   }

   @Override
   public void b(int $$0) {
      this.cf = $$0;
   }
}
