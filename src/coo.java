import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class coo extends com implements cqg {
   private static final Logger a = LogUtils.getLogger();
   private static final akh<Boolean> b = akl.a(coo.class, akj.k);
   private static final akh<cqf> c = akl.a(coo.class, akj.u);
   private static final int bI = 3600;
   private static final int bJ = 6000;
   private static final int bK = 14;
   private static final int bL = 4;
   private int bM;
   @Nullable
   private UUID bN;
   @Nullable
   private uu bO;
   @Nullable
   private dho bP;
   private int bQ;

   public coo(bwj<? extends coo> $$0, dip $$1) {
      super($$0, $$1);
      mf.x.a(this.ae).ifPresent($$0x -> this.a(this.gy().b($$0x)));
   }

   @Override
   protected void a(akl.a $$0) {
      super.a($$0);
      $$0.a(b, false);
      $$0.a(c, new cqf(mf.w.b(cqj.c), mf.x.b(cqh.b), 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cqf.c.encodeStart(ul.a, this.gy()).resultOrPartial(a::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.bP != null) {
         $$0.a("Offers", (uu)dho.a.encodeStart(this.dX().a(ul.a), this.bP).getOrThrow());
      }

      if (this.bO != null) {
         $$0.a("Gossips", this.bO);
      }

      $$0.a("ConversionTime", this.gx() ? this.bM : -1);
      if (this.bN != null) {
         $$0.a("ConversionPlayer", this.bN);
      }

      $$0.a("Xp", this.bQ);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cqf> $$1 = cqf.c.parse(new Dynamic(ul.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(a::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dho.a.parse(this.dX().a(ul.a), $$0.c("Offers")).resultOrPartial(af.a("Failed to load offers: ", a::warn)).ifPresent($$0x -> this.bP = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.bO = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.b($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.bQ = $$0.h("Xp");
      }
   }

   @Override
   public void h() {
      if (!this.dV().C && this.bK() && this.gx()) {
         int $$0 = this.gA();
         this.bM -= $$0;
         if (this.bM <= 0) {
            this.g((aro)this.dV());
         }
      }

      super.h();
   }

   @Override
   public bty b(cqs $$0, btx $$1) {
      cys $$2 = $$0.b($$1);
      if ($$2.a(cyw.qJ)) {
         if (this.b(bvg.r)) {
            $$2.a(1, $$0);
            if (!this.dV().C) {
               this.b($$0.cG(), this.ae.a(2401) + 3600);
            }

            return bty.b;
         } else {
            return bty.c;
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
      return !this.gx() && this.bQ == 0;
   }

   public boolean gx() {
      return this.au().a(b);
   }

   private void b(@Nullable UUID $$0, int $$1) {
      this.bN = $$0;
      this.bM = $$1;
      this.au().a(b, true);
      this.e(bvg.r);
      this.a(new bve(bvg.e, $$1, Math.min(this.dV().an().a() - 1, 0)));
      this.dV().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bb()) {
            this.dV().a(this.dA(), this.dE(), this.dG(), awl.EK, this.dm(), 1.0F + this.ae.i(), this.ae.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void g(aro $$0) {
      this.a(bwj.bD, bvu.a(this, false, false), $$1 -> {
         for (bwk $$2 : this.a($$0, $$0xx -> !dfh.a($$0xx, dfg.E))) {
            bxq $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gy());
         if (this.bO != null) {
            $$1.a(this.bO);
         }

         if (this.bP != null) {
            $$1.b(this.bP.a());
         }

         $$1.t(this.bQ);
         $$1.a($$0, $$0.d_($$1.dv()), bwi.i, null);
         $$1.g($$0);
         if (this.bN != null) {
            cqs $$4 = $$0.a(this.bN);
            if ($$4 instanceof arp) {
               ap.s.a((arp)$$4, this, $$1);
               $$0.a(chy.a, $$4, $$1);
            }
         }

         $$1.a(new bve(bvg.i, 200, 0));
         if (!this.bb()) {
            $$0.a(null, 1027, this.dv(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void r(int $$0) {
      this.bM = $$0;
   }

   private int gA() {
      int $$0 = 1;
      if (this.ae.i() < 0.01F) {
         int $$1 = 0;
         iu.a $$2 = new iu.a();

         for (int $$3 = (int)this.dA() - 4; $$3 < (int)this.dA() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dC() - 4; $$4 < (int)this.dC() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dG() - 4; $$5 < (int)this.dG() + 4 && $$1 < 14; $$5++) {
                  dzo $$6 = this.dV().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dlw.fk) || $$6.b() instanceof dln) {
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
   public awk u() {
      return awl.EI;
   }

   @Override
   public awk e(bup $$0) {
      return awl.EM;
   }

   @Override
   public awk l_() {
      return awl.EL;
   }

   @Override
   public awk n() {
      return awl.EN;
   }

   @Override
   protected cys t() {
      return cys.k;
   }

   public void a(dho $$0) {
      this.bP = $$0;
   }

   public void a(uu $$0) {
      this.bO = $$0;
   }

   @Nullable
   @Override
   public bxr a(djg $$0, btw $$1, bwi $$2, @Nullable bxr $$3) {
      this.a(this.gy().a($$0.F_(), cqj.a($$0.u(this.dv()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cqf $$0) {
      cqf $$1 = this.gy();
      if (!$$1.b().equals($$0.b())) {
         this.bP = null;
      }

      this.al.a(c, $$0);
   }

   @Override
   public cqf gy() {
      return this.al.a(c);
   }

   public int gz() {
      return this.bQ;
   }

   public void s(int $$0) {
      this.bQ = $$0;
   }

   @Nullable
   @Override
   public <T> T a(ki<? extends T> $$0) {
      return $$0 == kj.av ? c((ki<T>)$$0, this.gy().a()) : super.a($$0);
   }

   @Override
   protected void a(ke $$0) {
      this.a($$0, kj.av);
      super.a($$0);
   }

   @Override
   protected <T> boolean b(ki<T> $$0, T $$1) {
      if ($$0 == kj.av) {
         je<cqj> $$2 = c(kj.av, $$1);
         this.a(this.gy().a($$2));
         return true;
      } else {
         return super.b($$0, $$1);
      }
   }
}
