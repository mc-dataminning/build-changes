import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjy extends cjx implements cln {
   private static final Logger b = LogUtils.getLogger();
   private static final ajy<Boolean> c = akc.a(cjy.class, aka.k);
   private static final ajy<clm> d = akc.a(cjy.class, aka.u);
   private static final int ck = 3600;
   private static final int cl = 6000;
   private static final int cm = 14;
   private static final int cn = 4;
   private int co;
   @Nullable
   private UUID cp;
   @Nullable
   private vh cq;
   @Nullable
   private daz cr;
   private int cs;

   public cjy(bsb<? extends cjy> $$0, dca $$1) {
      super($$0, $$1);
      lh.z.a(this.al).ifPresent($$0x -> this.a(this.gL().a((clo)$$0x.a())));
   }

   @Override
   protected void a(akc.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new clm(clq.c, clo.b, 1));
   }

   @Override
   public void b(uk $$0) {
      super.b($$0);
      clm.c.encodeStart(uy.a, this.gL()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.cr != null) {
         $$0.a("Offers", ad.a(daz.a.encodeStart(this.dY().a(uy.a), this.cr), IllegalStateException::new));
      }

      if (this.cq != null) {
         $$0.a("Gossips", this.cq);
      }

      $$0.a("ConversionTime", this.gC() ? this.co : -1);
      if (this.cp != null) {
         $$0.a("ConversionPlayer", this.cp);
      }

      $$0.a("Xp", this.cs);
   }

   @Override
   public void a(uk $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<clm> $$1 = clm.c.parse(new Dynamic(uy.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         daz.a.parse(this.dY().a(uy.a), $$0.c("Offers")).resultOrPartial(ad.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.cr = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cq = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cs = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dU().C && this.bI() && this.gC()) {
         int $$0 = this.gN();
         this.co -= $$0;
         if (this.co <= 0) {
            this.a((aqt)this.dU());
         }
      }

      super.l();
   }

   @Override
   public bqa b(cly $$0, bpz $$1) {
      cuh $$2 = $$0.b($$1);
      if ($$2.a(cuk.rv)) {
         if (this.b(brj.r)) {
            $$2.a(1, $$0);
            if (!this.dU().C) {
               this.a($$0.cE(), this.al.a(2401) + 3600);
            }

            return bqa.a;
         } else {
            return bqa.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gA() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gC() && this.cs == 0;
   }

   public boolean gC() {
      return this.ap().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cp = $$0;
      this.co = $$1;
      this.ap().a(c, true);
      this.e(brj.r);
      this.b(new brh(brj.e, $$1, Math.min(this.dU().al().a() - 1, 0)));
      this.dU().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.ba()) {
            this.dU().a(this.dz(), this.dD(), this.dF(), avo.Em, this.dj(), 1.0F + this.al.i(), this.al.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(aqt $$0) {
      cll $$1 = this.a(bsb.bn, false);

      for (bsc $$2 : bsc.values()) {
         cuh $$3 = this.d($$2);
         if (!$$3.d()) {
            if (dae.f($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gL());
      if (this.cq != null) {
         $$1.a(this.cq);
      }

      if (this.cr != null) {
         $$1.b(this.cr.a());
      }

      $$1.w(this.cs);
      $$1.a($$0, $$0.d_($$1.du()), bss.i, null);
      $$1.a($$0);
      if (this.cp != null) {
         cly $$5 = $$0.c(this.cp);
         if ($$5 instanceof aqu) {
            an.s.a((aqu)$$5, this, $$1);
            $$0.a(cdo.a, $$5, $$1);
         }
      }

      $$1.b(new brh(brj.i, 200, 0));
      if (!this.ba()) {
         $$0.a(null, 1027, this.du(), 0);
      }
   }

   private int gN() {
      int $$0 = 1;
      if (this.al.i() < 0.01F) {
         int $$1 = 0;
         ir.a $$2 = new ir.a();

         for (int $$3 = (int)this.dz() - 4; $$3 < (int)this.dz() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dB() - 4; $$4 < (int)this.dB() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dF() - 4; $$5 < (int)this.dF() + 4 && $$1 < 14; $$5++) {
                  dtc $$6 = this.dU().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dfe.fO) || $$6.b() instanceof deu) {
                     if (this.al.i() < 0.3F) {
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
   public float fo() {
      return this.o_() ? (this.al.i() - this.al.i()) * 0.2F + 2.0F : (this.al.i() - this.al.i()) * 0.2F + 1.0F;
   }

   @Override
   public avn u() {
      return avo.Ek;
   }

   @Override
   public avn d(bqt $$0) {
      return avo.Eo;
   }

   @Override
   public avn n_() {
      return avo.En;
   }

   @Override
   public avn gy() {
      return avo.Ep;
   }

   @Override
   protected cuh gz() {
      return cuh.i;
   }

   public void a(daz $$0) {
      this.cr = $$0;
   }

   public void a(vh $$0) {
      this.cq = $$0;
   }

   @Nullable
   @Override
   public btg a(dcp $$0, bpy $$1, bss $$2, @Nullable btg $$3) {
      this.a(this.gL().a(clq.a($$0.t(this.du()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(clm $$0) {
      clm $$1 = this.gL();
      if ($$1.b() != $$0.b()) {
         this.cr = null;
      }

      this.as.a(d, $$0);
   }

   @Override
   public clm gL() {
      return this.as.a(d);
   }

   public int gM() {
      return this.cs;
   }

   @Override
   public void b(int $$0) {
      this.cs = $$0;
   }
}
