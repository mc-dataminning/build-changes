import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.joml.Vector3f;
import org.slf4j.Logger;

public class bzv extends bzu implements cbc {
   private static final Logger b = LogUtils.getLogger();
   private static final adz<Boolean> c = aec.a(bzv.class, aeb.k);
   private static final adz<cbb> d = aec.a(bzv.class, aeb.t);
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

   public bzv(bim<? extends bzv> $$0, cpm $$1) {
      super($$0, $$1);
      jb.A.a(this.ag).ifPresent($$0x -> this.a(this.gk().a((cbd)$$0x.a())));
   }

   @Override
   protected void a_() {
      super.a_();
      this.an.a(c, false);
      this.an.a(d, new cbb(cbf.c, cbd.b, 1));
   }

   @Override
   public void b(qr $$0) {
      super.b($$0);
      cbb.c.encodeStart(rc.a, this.gk()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
   public void a(qr $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cbb> $$1 = cbb.c.parse(new Dynamic(rc.a, $$0.c("VillagerData")));
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
            this.c((akk)this.dK());
         }
      }

      super.l();
   }

   @Override
   public bgq b(cbn $$0, bgp $$1) {
      ciy $$2 = $$0.b($$1);
      if ($$2.a(cjb.pm)) {
         if (this.a(bhx.r)) {
            if (!$$0.fR().d) {
               $$2.h(1);
            }

            if (!this.dK().B) {
               this.a($$0.cv(), this.ag.a(2401) + 3600);
            }

            return bgq.a;
         } else {
            return bgq.b;
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
      this.d(bhx.r);
      this.b(new bhv(bhx.e, $$1, Math.min(this.dK().ai().a() - 1, 0)));
      this.dK().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aS()) {
            this.dK().a(this.dp(), this.dt(), this.dv(), aow.Bj, this.da(), 1.0F + this.ag.i(), this.ag.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(akk $$0) {
      cba $$1 = this.a(bim.bf, false);

      for (bin $$2 : bin.values()) {
         ciy $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cnh.d($$3)) {
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
         $$1.b(new cok(this.ce));
      }

      $$1.u(this.cf);
      $$1.a($$0, $$0.d_($$1.dk()), bjc.i, null, null);
      $$1.c($$0);
      if (this.cc != null) {
         cbn $$5 = $$0.b(this.cc);
         if ($$5 instanceof akl) {
            ai.r.a((akl)$$5, this, $$1);
            $$0.a(btv.a, $$5, $$1);
         }
      }

      $$1.b(new bhv(bhx.i, 200, 0));
      if (!this.aS()) {
         $$0.a(null, 1027, this.dk(), 0);
      }
   }

   private int gm() {
      int $$0 = 1;
      if (this.ag.i() < 0.01F) {
         int $$1 = 0;
         gu.a $$2 = new gu.a();

         for (int $$3 = (int)this.dp() - 4; $$3 < (int)this.dp() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dr() - 4; $$4 < (int)this.dr() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dv() - 4; $$5 < (int)this.dv() + 4 && $$1 < 14; $$5++) {
                  dfa $$6 = this.dK().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(csn.eX) || $$6.b() instanceof csf) {
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
   public aov r() {
      return aow.Bh;
   }

   @Override
   public aov d(bhg $$0) {
      return aow.Bl;
   }

   @Override
   public aov h_() {
      return aow.Bk;
   }

   @Override
   public aov t() {
      return aow.Bm;
   }

   @Override
   protected ciy fZ() {
      return ciy.b;
   }

   public void c(qr $$0) {
      this.ce = $$0;
   }

   public void a(rk $$0) {
      this.cd = $$0;
   }

   @Nullable
   @Override
   public bjs a(cqb $$0, bgo $$1, bjc $$2, @Nullable bjs $$3, @Nullable qr $$4) {
      this.a(this.gk().a(cbf.a($$0.s(this.dk()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cbb $$0) {
      cbb $$1 = this.gk();
      if ($$1.b() != $$0.b()) {
         this.ce = null;
      }

      this.an.b(d, $$0);
   }

   @Override
   public cbb gk() {
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
   protected Vector3f a(bii $$0, bij $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b + 0.175F * $$2, 0.0F);
   }
}
