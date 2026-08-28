import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cod extends coc implements cpw {
   private static final Logger a = LogUtils.getLogger();
   private static final akg<Boolean> b = akk.a(cod.class, aki.k);
   private static final akg<cpv> c = akk.a(cod.class, aki.u);
   private static final int bH = 3600;
   private static final int bI = 6000;
   private static final int bJ = 14;
   private static final int bK = 4;
   private int bL;
   @Nullable
   private UUID bM;
   @Nullable
   private ut bN;
   @Nullable
   private dgo bO;
   private int bP;

   public cod(bwb<? extends cod> $$0, dhp $$1) {
      super($$0, $$1);
      md.x.a(this.ae).ifPresent($$0x -> this.a(this.gy().b($$0x)));
   }

   @Override
   protected void a(akk.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cpv(md.w.b(cpz.c), md.x.b(cpx.b), 1));
   }

   @Override
   public void b(tw $$0) {
      super.b($$0);
      cpv.c.encodeStart(uk.a, this.gy()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.bO != null) {
         $$0.a("Offers", (ut)dgo.a.encodeStart(this.dX().a(uk.a), this.bO).getOrThrow());
      }

      if (this.bN != null) {
         $$0.a("Gossips", this.bN);
      }

      $$0.a("ConversionTime", this.gx() ? this.bL : -1);
      if (this.bM != null) {
         $$0.a("ConversionPlayer", this.bM);
      }

      $$0.a("Xp", this.bP);
   }

   @Override
   public void a(tw $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cpv> $$1 = cpv.c.parse(new Dynamic(uk.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dgo.a.parse(this.dX().a(uk.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.bO = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.bN = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.b($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.bP = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.gx()) {
         int $$0 = this.gA();
         this.bL -= $$0;
         if (this.bL <= 0) {
            this.g((arn)this.dV());
         }
      }

      super.h();
   }

   @Override
   public btq b(cqi $$0, btp $$1) {
      cxy $$2 = $$0.b($$1);
      if ($$2.a(cyc.qJ)) {
         if (this.b(buy.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return btq.b;
         } else {
            return btq.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean x() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gx() && this.bP == 0;
   }

   public boolean gx() {
      return this.au().a(b);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bM = $$0;
      this.bL = $$1;
      this.au().a(b, true);
      this.e(buy.r);
      this.a(new buw(buy.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awk.EK, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(arn $$0) {
      this.a(bwb.bC, bvm.a(this, false, false), $$1 -> {
         for (bwc $$2 : this.a($$0, $$0xx -> !dej.a($$0xx, dei.E))) {
            bxi $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.bN != null) {
            $$1.a(this.bN);
         }

         if (this.bO != null) {
            $$1.b(this.bO.a());
         }

         $$1.t(this.bP);
         $$1.a($$0, $$0.d_($$1.dv()), bwa.i, null);
         $$1.g($$0);
         if (this.bM != null) {
            cqi $$4 = $$0.a(this.bM);
            if ($$4 instanceof aro) {
               ap.s.a((aro)$$4, this, $$1);
               $$0.a(chq.a, $$4, $$1);
            }
         }

         $$1.a(new buw(buy.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bL = $$0;
   }

   private int gA() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         jj.a $$2 = new jj.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dym $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dkw.fk) || $$6.b() instanceof dkn) {
                     if (this.ae.i() < 0.3F) {
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
   public float fe() {
      return this.n_() ? (this.ae.i() - this.ae.i()) * 0.2F + 2.0F : (this.ae.i() - this.ae.i()) * 0.2F + 1.0F;
   }

   @Override
   public awj u() {
      return awk.EI;
   }

   @Override
   public awj e(buh $$0) {
      return awk.EM;
   }

   @Override
   public awj l_() {
      return awk.EL;
   }

   @Override
   public awj n() {
      return awk.EN;
   }

   @Override
   protected cxy t() {
      return cxy.k;
   }

   public void a(dgo $$0) {
      this.bO = $$0;
   }

   public void a(ut $$0) {
      this.bN = $$0;
   }

   @Nullable
   @Override
   public bxj a(dig $$0, bto $$1, bwa $$2, @Nullable bxj $$3) {
      this.a(this.gy().a($$0.F_(), cpz.a($$0.t(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cpv $$0) {
      cpv $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bO = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cpv gy() {
      return this.al.a(c);
   }

   public int gz() {
      return this.bP;
   }

   public void s(int $$0) {
      this.bP = $$0;
   }
}
