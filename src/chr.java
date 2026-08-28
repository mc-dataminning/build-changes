import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chr extends cgv implements bvv {
   private static final int bY = 40;
   private static final ako<Byte> bZ = aks.a(chr.class, akq.a);
   private static final Map<cvc, Integer> ca = Maps.newEnumMap(Arrays.stream(cvc.values()).collect(Collectors.toMap($$0 -> (cvc)$$0, chr::c)));
   private int cc;
   private cbu cd;

   private static int c(cvc $$0) {
      if ($$0 == cvc.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axy.a(255, azn.d((float)axy.b($$1) * 0.75F), azn.d((float)axy.c($$1) * 0.75F), azn.d((float)axy.d($$1) * 0.75F));
      }
   }

   public static int a(cvc $$0) {
      return ca.get($$0);
   }

   public chr(bup<? extends chr> $$0, dff $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.cd = new cbu(this);
      this.bS.a(0, new cbw(this));
      this.bS.a(1, new ccv(this, 1.25));
      this.bS.a(2, new cbo(this, 1.0));
      this.bS.a(3, new cdk(this, 1.1, $$0 -> $$0.a(axm.ag), false));
      this.bS.a(4, new ccb(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cdp(this, 1.0));
      this.bS.a(7, new cck(this, cor.class, 6.0F));
      this.bS.a(8, new ccx(this));
   }

   @Override
   public boolean l(cwf $$0) {
      return $$0.a(axm.ag);
   }

   @Override
   protected void ac() {
      this.cc = this.cd.h();
      super.ac();
   }

   @Override
   public void n_() {
      if (this.dY().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.n_();
   }

   public static bwl.a q() {
      return cgv.gA().a(bwm.s, 8.0).a(bwm.v, 0.23F);
   }

   @Override
   protected void a(aks.a $$0) {
      super.a($$0);
      $$0.a(bZ, (byte)0);
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 10) {
         this.cc = 40;
      } else {
         super.b($$0);
      }
   }

   public float J(float $$0) {
      if (this.cc <= 0) {
         return 0.0F;
      } else if (this.cc >= 4 && this.cc <= 36) {
         return 1.0F;
      } else {
         return this.cc < 4 ? ((float)this.cc - $$0) / 4.0F : -((float)(this.cc - 40) - $$0) / 4.0F;
      }
   }

   public float K(float $$0) {
      if (this.cc > 4 && this.cc <= 36) {
         float $$1 = ((float)(this.cc - 4) - $$0) / 32.0F;
         return (float) (Math.PI / 5) + 0.21991149F * azn.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dQ() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsh b(cor $$0, bsg $$1) {
      cwf $$2 = $$0.b($$1);
      if ($$2.a(cwj.sm)) {
         if (!this.dY().C && this.a()) {
            this.a(awp.h, $$2);
            this.a(eak.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsh.b;
         } else {
            return bsh.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awp $$0, cwf $$1) {
      this.dY().a(null, this, awo.wA, $$0, 1.0F, 1.0F);
      this.a(euc.aV, $$1, $$0x -> {
         for (int $$1x = 0; $$1x < $$0x.L(); $$1x++) {
            ckz $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dB().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bN() && !this.y() && !this.p_();
   }

   @Override
   public void b(un $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(un $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cvc.a($$0.f("Color")));
   }

   @Override
   protected awn w() {
      return awo.wx;
   }

   @Override
   protected awn d(bsy $$0) {
      return awo.wz;
   }

   @Override
   protected awn o_() {
      return awo.wy;
   }

   @Override
   protected void b(jh $$0, dvo $$1) {
      this.a(awo.wB, 0.15F, 1.0F);
   }

   public cvc t() {
      return cvc.a(this.am.a(bZ) & 15);
   }

   public void b(cvc $$0) {
      byte $$1 = this.am.a(bZ);
      this.am.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean y() {
      return (this.am.a(bZ) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.am.a(bZ);
      if ($$0) {
         this.am.a(bZ, (byte)($$1 | 16));
      } else {
         this.am.a(bZ, (byte)($$1 & -17));
      }
   }

   public static cvc a(azv $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cvc.p;
      } else if ($$1 < 10) {
         return cvc.h;
      } else if ($$1 < 15) {
         return cvc.i;
      } else if ($$1 < 18) {
         return cvc.m;
      } else {
         return $$0.a(500) == 0 ? cvc.g : cvc.a;
      }
   }

   @Nullable
   public chr b(arq $$0, btz $$1) {
      chr $$2 = bup.aJ.a($$0, buo.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (chr)$$1));
      }

      return $$2;
   }

   @Override
   public void S() {
      super.S();
      this.x(false);
      if (this.p_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bvx a(dfw $$0, bsf $$1, buo $$2, @Nullable bvx $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cvc a(cgv $$0, cgv $$1) {
      cvc $$2 = ((chr)$$0).t();
      cvc $$3 = ((chr)$$1).t();
      dai $$4 = a($$2, $$3);
      return this.dY()
         .r()
         .a(daz.a, $$4, this.dY())
         .map($$1x -> ((daj)$$1x.b()).a($$4, this.dY().H_()))
         .map(cwf::h)
         .filter(cvd.class::isInstance)
         .map(cvd.class::cast)
         .map(cvd::b)
         .orElseGet(() -> this.dY().A.h() ? $$2 : $$3);
   }

   private static dai a(cvc $$0, cvc $$1) {
      return dai.a(2, 1, List.of(new cwf(cvd.a($$0)), new cwf(cvd.a($$1))));
   }
}
