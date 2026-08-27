import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cfl extends cfk implements cha {
   private static final Logger b = LogUtils.getLogger();
   private static final aie<Boolean> c = aih.a(cfl.class, aig.k);
   private static final aie<cgz> d = aih.a(cfl.class, aig.t);
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

   public cfl(bnw<? extends cfl> $$0, cvr $$1) {
      super($$0, $$1);
      kf.z.a(this.af).ifPresent($$0x -> this.a(this.gr().a((chb)$$0x.a())));
   }

   @Override
   protected void c_() {
      super.c_();
      this.am.a(c, false);
      this.am.a(d, new cgz(chd.c, chb.b, 1));
   }

   @Override
   public void b(sw $$0) {
      super.b($$0);
      cgz.c.encodeStart(tk.a, this.gr()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
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
         DataResult<cgz> $$1 = cgz.c.parse(new Dynamic(tk.a, $$0.c("VillagerData")));
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
            this.c((aow)this.dM());
         }
      }

      super.l();
   }

   @Override
   public blw b(chl $$0, blv $$1) {
      cpd $$2 = $$0.b($$1);
      if ($$2.a(cpg.pZ)) {
         if (this.a(bnf.r)) {
            if (!$$0.fU().d) {
               $$2.h(1);
            }

            if (!this.dM().B) {
               this.a($$0.cw(), this.af.a(2401) + 3600);
            }

            return blw.a;
         } else {
            return blw.b;
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
      this.e(bnf.r);
      this.b(new bnd(bnf.e, $$1, Math.min(this.dM().aj().a() - 1, 0)));
      this.dM().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aU()) {
            this.dM().a(this.dr(), this.dv(), this.dx(), atl.CL, this.db(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aow $$0) {
      cgy $$1 = this.a(bnw.bh, false);

      for (bnx $$2 : bnx.values()) {
         cpd $$3 = this.c($$2);
         if (!$$3.b()) {
            if (ctn.d($$3)) {
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
         $$1.b(new cuq(this.cd));
      }

      $$1.v(this.ce);
      $$1.a($$0, $$0.d_($$1.dm()), bom.i, null, null);
      $$1.c($$0);
      if (this.cb != null) {
         chl $$5 = $$0.b(this.cb);
         if ($$5 instanceof aox) {
            am.s.a((aox)$$5, this, $$1);
            $$0.a(bzi.a, $$5, $$1);
         }
      }

      $$1.b(new bnd(bnf.i, 200, 0));
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
                  dlj $$6 = this.dM().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(cyu.eW) || $$6.b() instanceof cyl) {
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
   public atk y() {
      return atl.CJ;
   }

   @Override
   public atk d(bmp $$0) {
      return atl.CN;
   }

   @Override
   public atk n_() {
      return atl.CM;
   }

   @Override
   public atk gg() {
      return atl.CO;
   }

   @Override
   protected cpd gh() {
      return cpd.h;
   }

   public void c(sw $$0) {
      this.cd = $$0;
   }

   public void a(tt $$0) {
      this.cc = $$0;
   }

   @Nullable
   @Override
   public bpa a(cwg $$0, blu $$1, bom $$2, @Nullable bpa $$3, @Nullable sw $$4) {
      this.a(this.gr().a(chd.a($$0.t(this.dm()))));
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(cgz $$0) {
      cgz $$1 = this.gr();
      if ($$1.b() != $$0.b()) {
         this.cd = null;
      }

      this.am.b(d, $$0);
   }

   @Override
   public cgz gr() {
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
