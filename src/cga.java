import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cga extends cfz implements chp {
   private static final Logger b = LogUtils.getLogger();
   private static final aii<Boolean> c = ail.a(cga.class, aik.k);
   private static final aii<cho> d = ail.a(cga.class, aik.t);
   private static final int bY = 3600;
   private static final int bZ = 6000;
   private static final int ca = 14;
   private static final int cb = 4;
   private int cc;
   @Nullable
   private UUID cd;
   @Nullable
   private tv ce;
   @Nullable
   private cvd cf;
   private int cg;

   public cga(bol<? extends cga> $$0, cwe $$1) {
      super($$0, $$1);
      kh.z.a(this.af).ifPresent($$0x -> this.a(this.gw().a((chq)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, false);
      this.am.a(d, new cho(chs.c, chq.b, 1));
   }

   @Override
   public void b(sy $$0) {
      super.b($$0);
      cho.c.encodeStart(tm.a, this.gw()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cf != null) {
         $$0.a("Offers", ac.a(cvd.a.encodeStart(tm.a, this.cf), IllegalStateException::new));
      }

      if (this.ce != null) {
         $$0.a("Gossips", this.ce);
      }

      $$0.a("ConversionTime", this.gv() ? this.cc : -1);
      if (this.cd != null) {
         $$0.a("ConversionPlayer", this.cd);
      }

      $$0.a("Xp", this.cg);
   }

   @Override
   public void a(sy $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cho> $$1 = cho.c.parse(new Dynamic(tm.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         cvd.a.parse(tm.a, $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.cf = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.ce = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cg = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dJ().B && this.bx() && this.gv()) {
         int $$0 = this.gy();
         this.cc -= $$0;
         if (this.cc <= 0) {
            this.c((apa)this.dJ());
         }
      }

      super.l();
   }

   @Override
   public bml b(cia $$0, bmk $$1) {
      cpq $$2 = $$0.b($$1);
      if ($$2.a(cpt.pZ)) {
         if (this.a(bnu.r)) {
            if (!$$0.fW().d) {
               $$2.h(1);
            }

            if (!this.dJ().B) {
               this.a($$0.ct(), this.af.a(2401) + 3600);
            }

            return bml.a;
         } else {
            return bml.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gn() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gv() && this.cg == 0;
   }

   public boolean gv() {
      return this.an().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cd = $$0;
      this.cc = $$1;
      this.an().b(c, true);
      this.e(bnu.r);
      this.b(new bns(bnu.e, $$1, Math.min(this.dJ().aj().a() - 1, 0)));
      this.dJ().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dJ().a(this.do(), this.ds(), this.du(), atp.CY, this.cY(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(apa $$0) {
      chn $$1 = this.a(bol.bh, false);

      for (bom $$2 : bom.values()) {
         cpq $$3 = this.c($$2);
         if (!$$3.b()) {
            if (cua.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gw());
      if (this.ce != null) {
         $$1.a(this.ce);
      }

      if (this.cf != null) {
         $$1.b(this.cf.a());
      }

      $$1.v(this.cg);
      $$1.a($$0, $$0.d_($$1.dj()), bpb.i, null);
      $$1.c($$0);
      if (this.cd != null) {
         cia $$5 = $$0.b(this.cd);
         if ($$5 instanceof apb) {
            am.s.a((apb)$$5, this, $$1);
            $$0.a(bzx.a, $$5, $$1);
         }
      }

      $$1.b(new bns(bnu.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dj(), 0);
      }
   }

   private int gy() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         ib.a $$2 = new ib.a();

         for (int $$3 = (int)this.do() - 4; $$3 < (int)this.do() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dq() - 4; $$4 < (int)this.dq() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.du() - 4; $$5 < (int)this.du() + 4 && $$1 < 14; $$5++) {
                  dme $$6 = this.dJ().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(czh.eW) || $$6.b() instanceof cyy) {
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
   public float eZ() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public ato y() {
      return atp.CW;
   }

   @Override
   public ato d(bne $$0) {
      return atp.Da;
   }

   @Override
   public ato n_() {
      return atp.CZ;
   }

   @Override
   public ato gl() {
      return atp.Db;
   }

   @Override
   protected cpq gm() {
      return cpq.h;
   }

   public void a(cvd $$0) {
      this.cf = $$0;
   }

   public void a(tv $$0) {
      this.ce = $$0;
   }

   @Nullable
   @Override
   public bpp a(cwt $$0, bmj $$1, bpb $$2, @Nullable bpp $$3) {
      this.a(this.gw().a(chs.a($$0.t(this.dj()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cho $$0) {
      cho $$1 = this.gw();
      if ($$1.b() != $$0.b()) {
         this.cf = null;
      }

      this.am.b(d, $$0);
   }

   @Override
   public cho gw() {
      return this.am.b(d);
   }

   public int gx() {
      return this.cg;
   }

   @Override
   public void b(int $$0) {
      this.cg = $$0;
   }
}
