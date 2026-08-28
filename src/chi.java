import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chi extends cgm implements bvm {
   private static final int bY = 40;
   private static final akk<Byte> bZ = ako.a(chi.class, akm.a);
   private static final Map<cuu, Integer> ca = Maps.newEnumMap(Arrays.stream(cuu.values()).collect(Collectors.toMap($$0 -> (cuu)$$0, chi::c)));
   private int cc;
   private cbl cd;

   private static int c(cuu $$0) {
      if ($$0 == cuu.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axu.a(255, azj.d((float)axu.b($$1) * 0.75F), azj.d((float)axu.c($$1) * 0.75F), azj.d((float)axu.d($$1) * 0.75F));
      }
   }

   public static int a(cuu $$0) {
      return ca.get($$0);
   }

   public chi(bug<? extends chi> $$0, dev $$1) {
      super($$0, $$1);
   }

   @Override
   protected void D() {
      this.cd = new cbl(this);
      this.bS.a(0, new cbn(this));
      this.bS.a(1, new ccm(this, 1.25));
      this.bS.a(2, new cbf(this, 1.0));
      this.bS.a(3, new cdb(this, 1.1, $$0 -> $$0.a(axi.ad), false));
      this.bS.a(4, new cbs(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cdg(this, 1.0));
      this.bS.a(7, new ccb(this, coh.class, 6.0F));
      this.bS.a(8, new cco(this));
   }

   @Override
   public boolean l(cvx $$0) {
      return $$0.a(axi.ad);
   }

   @Override
   protected void ac() {
      this.cc = this.cd.h();
      super.ac();
   }

   @Override
   public void n_() {
      if (this.dX().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.n_();
   }

   public static bwc.a q() {
      return cgm.gA().a(bwd.s, 8.0).a(bwd.v, 0.23F);
   }

   @Override
   protected void a(ako.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * azj.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dP() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bry b(coh $$0, brx $$1) {
      cvx $$2 = $$0.b($$1);
      if ($$2.a(cwb.rW)) {
         if (!this.dX().C && this.a()) {
            this.a(awl.h);
            this.a(eaa.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bry.b;
         } else {
            return bry.c;
         }
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(awl $$0) {
      this.dX().a(null, this, awk.wA, $$0, 1.0F, 1.0F);
      this.a(ets.aR, $$0x -> {
         for (int $$1 = 0; $$1 < $$0x.L(); $$1++) {
            ckq $$2 = this.a($$0x.c(1), 1.0F);
            if ($$2 != null) {
               $$2.h($$2.dA().b((double)((this.af.i() - this.af.i()) * 0.1F), (double)(this.af.i() * 0.05F), (double)((this.af.i() - this.af.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bM() && !this.y() && !this.p_();
   }

   @Override
   public void b(uj $$0) {
      super.b($$0);
      $$0.a("Sheared", this.y());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(uj $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cuu.a($$0.f("Color")));
   }

   @Override
   protected awj w() {
      return awk.wx;
   }

   @Override
   protected awj d(bsp $$0) {
      return awk.wz;
   }

   @Override
   protected awj o_() {
      return awk.wy;
   }

   @Override
   protected void b(jg $$0, dvd $$1) {
      this.a(awk.wB, 0.15F, 1.0F);
   }

   public cuu t() {
      return cuu.a(this.am.a(bZ) & 15);
   }

   public void b(cuu $$0) {
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

   public static cuu a(azr $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cuu.p;
      } else if ($$1 < 10) {
         return cuu.h;
      } else if ($$1 < 15) {
         return cuu.i;
      } else if ($$1 < 18) {
         return cuu.m;
      } else {
         return $$0.a(500) == 0 ? cuu.g : cuu.a;
      }
   }

   @Nullable
   public chi b(arm $$0, btq $$1) {
      chi $$2 = bug.aJ.a($$0, buf.e);
      if ($$2 != null) {
         $$2.b(this.a(this, (chi)$$1));
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
   public bvo a(dfl $$0, brw $$1, buf $$2, @Nullable bvo $$3) {
      this.b(a($$0.E_()));
      return super.a($$0, $$1, $$2, $$3);
   }

   private cuu a(cgm $$0, cgm $$1) {
      cuu $$2 = ((chi)$$0).t();
      cuu $$3 = ((chi)$$1).t();
      czy $$4 = a($$2, $$3);
      return this.dX()
         .r()
         .a(dap.a, $$4, this.dX())
         .map($$1x -> ((czz)$$1x.b()).a($$4, this.dX().H_()))
         .map(cvx::h)
         .filter(cuv.class::isInstance)
         .map(cuv.class::cast)
         .map(cuv::c)
         .orElseGet(() -> this.dX().A.h() ? $$2 : $$3);
   }

   private static czy a(cuu $$0, cuu $$1) {
      return czy.a(2, 1, List.of(new cvx(cuv.a($$0)), new cvx(cuv.a($$1))));
   }
}
