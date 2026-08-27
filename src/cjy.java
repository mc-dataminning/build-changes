import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cjy extends cjx implements cln {
   private static final Logger b = LogUtils.getLogger();
   private static final ajs<Boolean> c = ajw.a(cjy.class, aju.k);
   private static final ajs<clm> d = ajw.a(cjy.class, aju.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private va ch;
   @Nullable
   private czy ci;
   private int cj;

   public cjy(bsc<? extends cjy> $$0, daz $$1) {
      super($$0, $$1);
      le.z.a(this.ah).ifPresent($$0x -> this.a(this.gA().a((clo)$$0x.a())));
   }

   @Override
   protected void a(ajw.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new clm(clq.c, clo.b, 1));
   }

   @Override
   public void b(ud $$0) {
      super.b($$0);
      clm.c.encodeStart(ur.a, this.gA()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (va)czy.a.encodeStart(this.dR().a(ur.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gz() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(ud $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<clm> $$1 = clm.c.parse(new Dynamic(ur.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         czy.a.parse(this.dR().a(ur.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.ch = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cj = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dP().B && this.bD() && this.gz()) {
         int $$0 = this.gC();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.c((aqn)this.dP());
         }
      }

      super.l();
   }

   @Override
   public bpw b(cly $$0, bpv $$1) {
      ctq $$2 = $$0.b($$1);
      if ($$2.a(ctt.qa)) {
         if (this.b(brg.r)) {
            $$2.a(1, $$0);
            if (!this.dP().B) {
               this.a($$0.cz(), this.ah.a(2401) + 3600);
            }

            return bpw.a;
         } else {
            return bpw.b;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gr() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gz() && this.cj == 0;
   }

   public boolean gz() {
      return this.ap().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.ap().a(c, true);
      this.e(brg.r);
      this.b(new bre(brg.e, $$1, Math.min(this.dP().ak().a() - 1, 0)));
      this.dP().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aW()) {
            this.dP().a(this.du(), this.dy(), this.dA(), avi.DI, this.de(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aqn $$0) {
      cll $$1 = this.a(bsc.bj, false);

      for (bsd $$2 : bsd.values()) {
         ctq $$3 = this.a($$2);
         if (!$$3.e()) {
            if (czc.f($$3)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gA());
      if (this.ch != null) {
         $$1.a(this.ch);
      }

      if (this.ci != null) {
         $$1.b(this.ci.a());
      }

      $$1.v(this.cj);
      $$1.a($$0, $$0.d_($$1.dp()), bsu.i, null);
      $$1.c($$0);
      if (this.cg != null) {
         cly $$5 = $$0.b(this.cg);
         if ($$5 instanceof aqo) {
            am.s.a((aqo)$$5, this, $$1);
            $$0.a(cdr.a, $$5, $$1);
         }
      }

      $$1.b(new bre(brg.i, 200, 0));
      if (!this.aW()) {
         $$0.a(null, 1027, this.dp(), 0);
      }
   }

   private int gC() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         io.a $$2 = new io.a();

         for (int $$3 = (int)this.du() - 4; $$3 < (int)this.du() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dw() - 4; $$4 < (int)this.dw() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dA() - 4; $$5 < (int)this.dA() + 4 && $$1 < 14; $$5++) {
                  drd $$6 = this.dP().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dec.eW) || $$6.b() instanceof ddt) {
                     if (this.ah.i() < 0.3F) {
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
   public float ff() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avh v() {
      return avi.DG;
   }

   @Override
   public avh d(bqp $$0) {
      return avi.DK;
   }

   @Override
   public avh o_() {
      return avi.DJ;
   }

   @Override
   public avh gp() {
      return avi.DL;
   }

   @Override
   protected ctq gq() {
      return ctq.i;
   }

   public void a(czy $$0) {
      this.ci = $$0;
   }

   public void a(va $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public btj a(dbo $$0, bpu $$1, bsu $$2, @Nullable btj $$3) {
      this.a(this.gA().a(clq.a($$0.t(this.dp()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(clm $$0) {
      clm $$1 = this.gA();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public clm gA() {
      return this.ao.a(d);
   }

   public int gB() {
      return this.cj;
   }

   @Override
   public void b(int $$0) {
      this.cj = $$0;
   }
}
