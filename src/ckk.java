import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ckk extends ckj implements clz {
   private static final Logger b = LogUtils.getLogger();
   private static final ajp<Boolean> c = ajt.a(ckk.class, ajr.k);
   private static final ajp<cly> d = ajt.a(ckk.class, ajr.u);
   private static final int cd = 3600;
   private static final int ce = 6000;
   private static final int cf = 14;
   private static final int cg = 4;
   private int ch;
   @Nullable
   private UUID ci;
   @Nullable
   private uu cj;
   @Nullable
   private dbe ck;
   private int cl;

   public ckk(bsm<? extends ckk> $$0, dcf $$1) {
      super($$0, $$1);
      lq.x.a(this.ah).ifPresent($$0x -> this.a(this.gz().a((cma)$$0x.a())));
   }

   @Override
   protected void a(ajt.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cly(cmc.c, cma.b, 1));
   }

   @Override
   public void b(tx $$0) {
      super.b($$0);
      cly.c.encodeStart(ul.a, this.gz()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ck != null) {
         $$0.a("Offers", (uu)dbe.a.encodeStart(this.dS().a(ul.a), this.ck).getOrThrow());
      }

      if (this.cj != null) {
         $$0.a("Gossips", this.cj);
      }

      $$0.a("ConversionTime", this.gy() ? this.ch : -1);
      if (this.ci != null) {
         $$0.a("ConversionPlayer", this.ci);
      }

      $$0.a("Xp", this.cl);
   }

   @Override
   public void a(tx $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cly> $$1 = cly.c.parse(new Dynamic(ul.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         dbe.a.parse(this.dS().a(ul.a), $$0.c("Offers")).resultOrPartial(ac.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ck = $$0x);
      }

      if ($$0.b("Gossips", 9)) {
         this.cj = $$0.c("Gossips", 10);
      }

      if ($$0.b("ConversionTime", 99) && $$0.h("ConversionTime") > -1) {
         this.a($$0.b("ConversionPlayer") ? $$0.a("ConversionPlayer") : null, $$0.h("ConversionTime"));
      }

      if ($$0.b("Xp", 3)) {
         this.cl = $$0.h("Xp");
      }
   }

   @Override
   public void l() {
      if (!this.dQ().B && this.bE() && this.gy()) {
         int $$0 = this.gB();
         this.ch -= $$0;
         if (this.ch <= 0) {
            this.c((aqm)this.dQ());
         }
      }

      super.l();
   }

   @Override
   public bqg b(cmk $$0, bqf $$1) {
      cuc $$2 = $$0.b($$1);
      if ($$2.a(cuf.qa)) {
         if (this.b(brq.r)) {
            $$2.a(1, $$0);
            if (!this.dQ().B) {
               this.a($$0.cA(), this.ah.a(2401) + 3600);
            }

            return bqg.a;
         } else {
            return bqg.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gq() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gy() && this.cl == 0;
   }

   public boolean gy() {
      return this.aq().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.ci = $$0;
      this.ch = $$1;
      this.aq().a(c, true);
      this.e(brq.r);
      this.b(new bro(brq.e, $$1, Math.min(this.dQ().al().a() - 1, 0)));
      this.dQ().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.aX()) {
            this.dQ().a(this.dv(), this.dz(), this.dB(), avh.DL, this.df(), 1.0F + this.ah.i(), this.ah.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void c(aqm $$0) {
      clx $$1 = this.a(bsm.bj, false);

      for (bsn $$2 : bsn.values()) {
         cuc $$3 = this.a($$2);
         if (!$$3.e()) {
            if (czn.a($$3, czm.E)) {
               $$1.a_($$2.b() + 300).a($$3);
            } else {
               double $$4 = (double)this.g($$2);
               if ($$4 > 1.0) {
                  this.b($$3);
               }
            }
         }
      }

      $$1.a(this.gz());
      if (this.cj != null) {
         $$1.a(this.cj);
      }

      if (this.ck != null) {
         $$1.b(this.ck.a());
      }

      $$1.u(this.cl);
      $$1.a($$0, $$0.d_($$1.dq()), btf.i, null);
      $$1.c($$0);
      if (this.ci != null) {
         cmk $$5 = $$0.b(this.ci);
         if ($$5 instanceof aqn) {
            am.s.a((aqn)$$5, this, $$1);
            $$0.a(cec.a, $$5, $$1);
         }
      }

      $$1.b(new bro(brq.i, 200, 0));
      if (!this.aX()) {
         $$0.a(null, 1027, this.dq(), 0);
      }
   }

   private int gB() {
      int $$0 = 1;
      if (this.ah.i() < 0.01F) {
         int $$1 = 0;
         ja.a $$2 = new ja.a();

         for (int $$3 = (int)this.dv() - 4; $$3 < (int)this.dv() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dx() - 4; $$4 < (int)this.dx() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dB() - 4; $$5 < (int)this.dB() + 4 && $$1 < 14; $$5++) {
                  dsk $$6 = this.dQ().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dfj.eW) || $$6.b() instanceof dfa) {
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
   public float fc() {
      return this.p_() ? (this.ah.i() - this.ah.i()) * 0.2F + 2.0F : (this.ah.i() - this.ah.i()) * 0.2F + 1.0F;
   }

   @Override
   public avg v() {
      return avh.DJ;
   }

   @Override
   public avg d(bqz $$0) {
      return avh.DN;
   }

   @Override
   public avg o_() {
      return avh.DM;
   }

   @Override
   public avg go() {
      return avh.DO;
   }

   @Override
   protected cuc gp() {
      return cuc.l;
   }

   public void a(dbe $$0) {
      this.ck = $$0;
   }

   public void a(uu $$0) {
      this.cj = $$0;
   }

   @Nullable
   @Override
   public btu a(dcu $$0, bqe $$1, btf $$2, @Nullable btu $$3) {
      this.a(this.gz().a(cmc.a($$0.t(this.dq()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cly $$0) {
      cly $$1 = this.gz();
      if ($$1.b() != $$0.b()) {
         this.ck = null;
      }

      this.ao.a(d, $$0);
   }

   @Override
   public cly gz() {
      return this.ao.a(d);
   }

   public int gA() {
      return this.cl;
   }

   @Override
   public void b(int $$0) {
      this.cl = $$0;
   }
}
