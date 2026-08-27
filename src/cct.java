import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cct extends ccs implements ceg {
   private static final Logger b = LogUtils.getLogger();
   private static final afz<Boolean> c = agc.a(cct.class, agb.k);
   private static final afz<cef> d = agc.a(cct.class, agb.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private tg cd;
   @Nullable
   private sj ce;
   private int cf;

   public cct(blj<? extends cct> $$0, csy $$1) {
      super($$0, $$1);
      kb.z.a(this.ag).ifPresent($$0x -> this.a(this.gp().a((ceh)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
      this.an.a(d, new cef(cej.c, ceh.b, 1));
   }

   @Override
   public void b(sj $$0) {
      super.b($$0);
      cef.c.encodeStart(sx.a, this.gp()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
   public void a(sj $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cef> $$1 = cef.c.parse(new Dynamic(sx.a, $$0.c("VillagerData")));
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
      if (!this.dM().B && this.bx() && this.go()) {
         int $$0 = this.gr();
         this.cb -= $$0;
         if (this.cb <= 0) {
            this.c((amp)this.dM());
         }
      }

      super.l();
   }

   @Override
   public bjl b(cer $$0, bjk $$1) {
      cmh $$2 = $$0.b($$1);
      if ($$2.a(cmk.pX)) {
         if (this.a(bku.r)) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            if (!this.dM().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bjl.a;
         } else {
            return bjl.b;
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
      return this.an().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cc = $$0;
      this.cb = $$1;
      this.an().b(c, true);
      this.d(bku.r);
      this.b(new bks(bku.e, $$1, Math.min(this.dM().aj().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), arc.Cv, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(amp $$0) {
      cee $$1 = this.a(blj.bg, false);

      for (blk $$2 : blk.values()) {
         cmh $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cqu.d($$3)) {
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
         $$1.b(new crx(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dm()), blz.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cer $$5 = $$0.b(this.cc);
         if ($$5 instanceof amq) {
            am.s.a((amq)$$5, this, $$1);
            $$0.a(bwt.a, $$5, $$1);
         }
      }

      $$1.b(new bks(bku.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gr() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         hv.a $$2 = new hv.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  dip $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cwb.eW) || $$6.b() instanceof cvs) {
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
   public float eX() {
      return this.o_() ? (this.ag.i() - this.ag.i()) * 0.2F + 2.0F : (this.ag.i() - this.ag.i()) * 0.2F + 1.0F;
   }

   @Override
   public arb y() {
      return arc.Ct;
   }

   @Override
   public arb d(bkd $$0) {
      return arc.Cx;
   }

   @Override
   public arb n_() {
      return arc.Cw;
   }

   @Override
   public arb A() {
      return arc.Cy;
   }

   @Override
   protected cmh ge() {
      return cmh.f;
   }

   public void c(sj $$0) {
      this.ce = $$0;
   }

   public void a(tg $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bmo a(ctn $$0, bjj $$1, blz $$2, @Nullable bmo $$3, @Nullable sj $$4) {
      this.a(this.gp().a(cej.a($$0.s(this.dm()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cef $$0) {
      cef $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cef gp() {
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
   protected Vector3f a(blf $$0, blg $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
