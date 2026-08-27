import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class cdj extends cdi implements cex {
   private static final Logger b = LogUtils.getLogger();
   private static final agm<Boolean> c = agp.a(cdj.class, ago.k);
   private static final agm<cew> d = agp.a(cdj.class, ago.t);
   private static final int bX = 3600;
   private static final int bY = 6000;
   private static final int bZ = 14;
   private static final int ca = 4;
   private int cb;
   @Nullable
   private UUID cc;
   @Nullable
   private tk cd;
   @Nullable
   private sn ce;
   private int cf;

   public cdj(blz<? extends cdj> $$0, ctp $$1) {
      super($$0, $$1);
      kd.z.a(this.ag).ifPresent($$0x -> this.a(this.gp().a((cey)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(c, false);
      this.an.a(d, new cew(cfa.c, cey.b, 1));
   }

   @Override
   public void b(sn $$0) {
      super.b($$0);
      cew.c.encodeStart(tb.a, this.gp()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
   public void a(sn $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cew> $$1 = cew.c.parse(new Dynamic(tb.a, $$0.c("VillagerData")));
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
            this.c((and)this.dM());
         }
      }

      super.l();
   }

   @Override
   public bkb b(cfi $$0, bka $$1) {
      cmy $$2 = $$0.b($$1);
      if ($$2.a(cnb.pX)) {
         if (this.a(blk.r)) {
            if (!$$0.fT().d) {
               $$2.h(1);
            }

            if (!this.dM().B) {
               this.a($$0.cw(), this.ag.a(2401) + 3600);
            }

            return bkb.a;
         } else {
            return bkb.b;
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
      this.d(blk.r);
      this.b(new bli(blk.e, $$1, Math.min(this.dM().ak().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), ars.Cv, this.db(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(and $$0) {
      cev $$1 = this.a(blz.bg, false);

      for (bma $$2 : bma.values()) {
         cmy $$3 = this.c($$2);
         if (!$$3.b()) {
            if (crl.d($$3)) {
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
         $$1.b(new cso(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dm()), bmp.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cfi $$5 = $$0.b(this.cc);
         if ($$5 instanceof ane) {
            am.s.a((ane)$$5, this, $$1);
            $$0.a(bxj.a, $$5, $$1);
         }
      }

      $$1.b(new bli(blk.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gr() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         hx.a $$2 = new hx.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  djh $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cws.eW) || $$6.b() instanceof cwj) {
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
   public arr y() {
      return ars.Ct;
   }

   @Override
   public arr d(bkt $$0) {
      return ars.Cx;
   }

   @Override
   public arr n_() {
      return ars.Cw;
   }

   @Override
   public arr A() {
      return ars.Cy;
   }

   @Override
   protected cmy ge() {
      return cmy.f;
   }

   public void c(sn $$0) {
      this.ce = $$0;
   }

   public void a(tk $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bne a(cue $$0, bjz $$1, bmp $$2, @Nullable bne $$3, @Nullable sn $$4) {
      this.a(this.gp().a(cfa.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cew $$0) {
      cew $$1 = this.gp();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cew gp() {
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
   protected Vector3f a(blv $$0, blw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
