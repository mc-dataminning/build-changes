import com.google.common.annotations.VisibleForTesting;
import com.mojang.logging.LogUtils;
import com.mojang.serialization.DataResult;
import com.mojang.serialization.Dynamic;
import java.util.UUID;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class cmp extends cmo implements coe {
   private static final Logger b = LogUtils.getLogger();
   private static final ako<Boolean> c = aks.a(cmp.class, akq.k);
   private static final ako<cod> d = aks.a(cmp.class, akq.u);
   private static final int cb = 3600;
   private static final int cc = 6000;
   private static final int cd = 14;
   private static final int ce = 4;
   private int cf;
   @Nullable
   private UUID cg;
   @Nullable
   private vk ch;
   @Nullable
   private ded ci;
   private int cj;

   public cmp(bup<? extends cmp> $$0, dff $$1) {
      super($$0, $$1);
      lz.x.a(this.af).ifPresent($$0x -> this.a(this.gF().a((cof)$$0x.a())));
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(c, false);
      $$0.a(d, new cod(coh.c, cof.b, 1));
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      cod.c.encodeStart(vb.a, this.gF()).resultOrPartial(b::error).ifPresent($$1 -> $$0.a("VillagerData", $$1));
      if (this.ci != null) {
         $$0.a("Offers", (vk)ded.a.encodeStart(this.ea().a(vb.a), this.ci).getOrThrow());
      }

      if (this.ch != null) {
         $$0.a("Gossips", this.ch);
      }

      $$0.a("ConversionTime", this.gE() ? this.cf : -1);
      if (this.cg != null) {
         $$0.a("ConversionPlayer", this.cg);
      }

      $$0.a("Xp", this.cj);
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      if ($$0.b("VillagerData", 10)) {
         DataResult<cod> $$1 = cod.c.parse(new Dynamic(vb.a, $$0.c("VillagerData")));
         $$1.resultOrPartial(b::error).ifPresent(this::a);
      }

      if ($$0.e("Offers")) {
         ded.a.parse(this.ea().a(vb.a), $$0.c("Offers")).resultOrPartial(ae.a("Failed to load offers: ", b::warn)).ifPresent($$0x -> this.ci = $$0x);
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
      if (!this.dY().C && this.bN() && this.gE()) {
         int $$0 = this.gH();
         this.cf -= $$0;
         if (this.cf <= 0) {
            this.a((arq)this.dY());
         }
      }

      super.l();
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.qb)) {
         if (this.b(btp.r)) {
            $$2.a(1, $$0);
            if (!this.dY().C) {
               this.a($$0.cI(), this.af.a(2401) + 3600);
            }

            return bsh.b;
         } else {
            return bsh.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   protected boolean gw() {
      return false;
   }

   @Override
   public boolean h(double $$0) {
      return !this.gE() && this.cj == 0;
   }

   public boolean gE() {
      return this.aw().a(c);
   }

   private void a(@Nullable UUID $$0, int $$1) {
      this.cg = $$0;
      this.cf = $$1;
      this.aw().a(c, true);
      this.e(btp.r);
      this.a(new btn(btp.e, $$1, Math.min(this.dY().ak().a() - 1, 0)));
      this.dY().a(this, (byte)16);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 16) {
         if (!this.bd()) {
            this.dY().a(this.dD(), this.dH(), this.dJ(), awo.DQ, this.do(), 1.0F + this.af.i(), this.af.i() * 0.7F + 0.3F, false);
         }
      } else {
         super.b($$0);
      }
   }

   private void a(arq $$0) {
      this.a(bup.bj, bud.a(this, false, true), $$1 -> {
         for (buq $$2 : this.c($$0xx -> !dby.a($$0xx, dbx.E))) {
            bvw $$3 = $$1.a_($$2.b() + 300);
            $$3.a(this.a($$2));
         }

         $$1.a(this.gF());
         if (this.ch != null) {
            $$1.a(this.ch);
         }

         if (this.ci != null) {
            $$1.b(this.ci.a());
         }

         $$1.u(this.cj);
         $$1.a($$0, $$0.d_($$1.dy()), buo.i, null);
         $$1.a($$0);
         if (this.cg != null) {
            cor $$4 = $$0.b(this.cg);
            if ($$4 instanceof arr) {
               ao.s.a((arr)$$4, this, $$1);
               $$0.a(cgf.a, $$4, $$1);
            }
         }

         $$1.a(new btn(btp.i, 200, 0));
         if (!this.bd()) {
            $$0.a(null, 1027, this.dy(), 0);
         }
      });
   }

   @VisibleForTesting
   @Override
   public void s(int $$0) {
      this.cf = $$0;
   }

   private int gH() {
      int $$0 = 1;
      if (this.af.i() < 0.01F) {
         int $$1 = 0;
         jh.a $$2 = new jh.a();

         for (int $$3 = (int)this.dD() - 4; $$3 < (int)this.dD() + 4 && $$1 < 14; $$3++) {
            for (int $$4 = (int)this.dF() - 4; $$4 < (int)this.dF() + 4 && $$1 < 14; $$4++) {
               for (int $$5 = (int)this.dJ() - 4; $$5 < (int)this.dJ() + 4 && $$1 < 14; $$5++) {
                  dvo $$6 = this.dY().a_($$2.d($$3, $$4, $$5));
                  if ($$6.a(dil.eW) || $$6.b() instanceof dic) {
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
   public float fk() {
      return this.p_() ? (this.af.i() - this.af.i()) * 0.2F + 2.0F : (this.af.i() - this.af.i()) * 0.2F + 1.0F;
   }

   @Override
   public awn w() {
      return awo.DO;
   }

   @Override
   public awn d(bsy $$0) {
      return awo.DS;
   }

   @Override
   public awn o_() {
      return awo.DR;
   }

   @Override
   public awn y() {
      return awo.DT;
   }

   @Override
   protected cwf gv() {
      return cwf.k;
   }

   public void a(ded $$0) {
      this.ci = $$0;
   }

   public void a(vk $$0) {
      this.ch = $$0;
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.a(this.gF().a(coh.a($$0.t(this.dy()))));
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(cod $$0) {
      cod $$1 = this.gF();
      if ($$1.b() != $$0.b()) {
         this.ci = null;
      }

      this.am.a(d, $$0);
   }

   @Override
   public cod gF() {
      return this.am.a(d);
   }

   public int gG() {
      return this.cj;
   }

   public void t(int $$0) {
      this.cj = $$0;
   }
}
