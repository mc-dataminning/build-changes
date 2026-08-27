import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfh extends cfg implements cgw {
   private static final Logger b = LogUtils.getLogger();
   private static final aie<Boolean> c = aih.a(cfh.class, aig.k);
   private static final aie<cgv> d = aih.a(cfh.class, aig.t);
   private static final int bW = 3600;
   private static final int bX = 6000;
   private static final int bY = 14;
   private static final int bZ = 4;
   private int ca;
   @Nullable
   private UUID cb;
   @Nullable
   private tt cc;
   @Nullable
   private sw cd;
   private int ce;

   public cfh(bnu<? extends cfh> $$0, cvn $$1) {
      super($$0, $$1);
      kf.z.a(this.af).ifPresent($$0x -> this.a(this.gr().a((cgx)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, false);
      this.am.a(d, new cgv(cgz.c, cgx.b, 1));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgv.c.encodeStart(tk.a, this.gr()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cd != null) {
         $$0.a("Offers", this.cd);
      }

      if (this.cc != null) {
         $$0.a("Gossips", this.cc);
      }

      $$0.a("ConversionTime", this.gq() ? this.ca : -1);
      if (this.cb != null) {
         $$0.a("ConversionPlayer", this.cb);
      }

      $$0.a("Xp", this.ce);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cgv> $$1 = cgv.c.parse(new Dynamic(tk.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.b("Offers", 10)) {
         this.cd = $$0.p("Offers");
      }

      if ($$0.b("Gossips", 9)) {
         this.cc = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.ce = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dM().B && this.bx() && this.gq()) {
         int $$0 = this.gt();
         this.ca -= $$0;
         if (this.ca <= 0) {
            this.c((aov)this.dM());
         }
      }

      super.l();
   }

   @Override
   public blu b(chh $$0, blt $$1) {
      coz $$2 = $$0.b($$1);
      if ($$2.a(cpc.pZ)) {
         if (this.a(bnd.r)) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            if (!this.dM().B) {
               this.a($$0.cw(), this.af.a(2401) + 3600);
            }

            return blu.a;
         } else {
            return blu.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gi() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gq() && this.ce == 0;
   }

   public boolean gq() {
      return this.an().b(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cb = $$0;
      this.ca = $$1;
      this.an().b(c, true);
      this.e(bnd.r);
      this.b(new bnb(bnd.e, $$1, Math.min(this.dM().ak().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), atk.CK, this.db(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aov $$0) {
      cgu $$1 = this.a(bnu.bh, false);

      for (bnv $$2 : bnv.values()) {
         coz $$3 = this.c($$2);
         if (!$$3.b()) {
            if (ctj.d($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.f($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gr());
      if (this.cc != null) {
         $$1.a(this.cc);
      }

      if (this.cd != null) {
         $$1.b(new cum(this.cd));
      }

      $$1.v(this.ce);
      $$1.a($$0, $$0.d_($$1.dm()), bok.i, null, null);
      $$1.c($$0);
      if (this.cb != null) {
         chh $$5 = $$0.b(this.cb);
         if ($$5 instanceof aow) {
            am.s.a((aow)$$5, this, $$1);
            $$0.a(bze.a, $$5, $$1);
         }
      }

      $$1.b(new bnb(bnd.i, 200, 0));
      if (!this.aU()) {
         $$0.a(null, 1027, this.dm(), 0);
      }
   }

   private int gt() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         hz.a $$2 = new hz.a();

         for (int $$3 = (int)this.dr() - 4; $$3 < (int)this.dr() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dt() - 4; $$4 < (int)this.dt() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dx() - 4; $$5 < (int)this.dx() + 4 && $$1 < 14; $$5++) {
                  dlf $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cyq.eW) || $$6.b() instanceof cyh) {
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
   public float eX() {
      return this.o_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public atj y() {
      return atk.CI;
   }

   @Override
   public atj d(bmn $$0) {
      return atk.CM;
   }

   @Override
   public atj n_() {
      return atk.CL;
   }

   @Override
   public atj gg() {
      return atk.CN;
   }

   @Override
   protected coz gh() {
      return coz.h;
   }

   public void c(sw $$0) {
      this.cd = $$0;
   }

   public void a(tt $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public boy a(cwc $$0, bls $$1, bok $$2, @Nullable boy $$3, @Nullable sw $$4) {
      this.a(this.gr().a(cgz.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cgv $$0) {
      cgv $$1 = this.gr();
      if ($$1.b() != $$0.b()) {
         this.cd = null;
      }

      this.am.b(d, $$0);
   }

   @Override
   public cgv gr() {
      return this.am.b(d);
   }

   public int gs() {
      return this.ce;
   }

   @Override
   public void b(int $$0) {
      this.ce = $$0;
   }
}
