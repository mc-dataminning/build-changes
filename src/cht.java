import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class cht extends cgx implements bvx {
   private static final int bY = 40;
   private static final ajy<Byte> bZ = akc.a(cht.class, aka.a);
   private static final Map<cvl, Integer> ca = Maps.newEnumMap(Arrays.stream(cvl.values()).collect(Collectors.toMap($$0 -> (cvl)$$0, cht::c)));
   private int cc;
   private cbw cd;

   private static int c(cvl $$0) {
      if ($$0 == cvl.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axk.a(255, ayz.d((float)axk.b($$1) * 0.75F), ayz.d((float)axk.c($$1) * 0.75F), ayz.d((float)axk.d($$1) * 0.75F));
      }
   }

   public static int a(cvl $$0) {
      return ca.get($$0);
   }

   public cht(bur<? extends cht> $$0, dgh $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.cd = new cbw(this);
      this.bS.a(0, new cby(this));
      this.bS.a(1, new ccx(this, 1.25));
      this.bS.a(2, new cbq(this, 1.0));
      this.bS.a(3, new cdm(this, 1.1, $$0 -> $$0.a(awy.af), false));
      this.bS.a(4, new ccd(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cdr(this, 1.0));
      this.bS.a(7, new ccm(this, cow.class, 6.0F));
      this.bS.a(8, new ccz(this));
   }

   @Override
   public boolean j(cwo $$0) {
      return $$0.a(awy.af);
   }

   @Override
   protected void a(ard $$0) {
      this.cc = this.cd.h();
      super.a($$0);
   }

   @Override
   public void d_() {
      if (this.dV().C) {
         this.cc = Math.max(0, this.cc - 1);
      }

      super.d_();
   }

   public static bwn.a p() {
      return cgx.gx().a(bwo.s, 8.0).a(bwo.v, 0.23F);
   }

   @Override
   protected void a(akc.a $$0) {
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
         return (float) (Math.PI / 5) + 0.21991149F * ayz.a($$1 * 28.7F);
      } else {
         return this.cc > 0 ? (float) (Math.PI / 5) : this.dN() * (float) (Math.PI / 180.0);
      }
   }

   @Override
   public bsj b(cow $$0, bsi $$1) {
      cwo $$2 = $$0.b($$1);
      if ($$2.a(cws.sS)) {
         if (this.dV() instanceof ard $$3 && this.a()) {
            this.a($$3, awb.h, $$2);
            this.a(ebs.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsj.b;
         }

         return bsj.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwo $$2) {
      $$0.a(null, this, awa.xb, $$1, 1.0F, 1.0F);
      this.a($$0, evm.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            clb $$3 = this.a($$0x, $$1x.c(1), 1.0F);
            if ($$3 != null) {
               $$3.i($$3.dy().b((double)((this.ae.i() - this.ae.i()) * 0.1F), (double)(this.ae.i() * 0.05F), (double)((this.ae.i() - this.ae.i()) * 0.1F)));
            }
         }
      });
      this.x(true);
   }

   @Override
   public boolean a() {
      return this.bL() && !this.x() && !this.e_();
   }

   @Override
   public void b(tq $$0) {
      super.b($$0);
      $$0.a("Sheared", this.x());
      $$0.a("Color", (byte)this.t().a());
   }

   @Override
   public void a(tq $$0) {
      super.a($$0);
      this.x($$0.q("Sheared"));
      this.b(cvl.a($$0.f("Color")));
   }

   @Override
   protected avz u() {
      return awa.wY;
   }

   @Override
   protected avz e(bta $$0) {
      return awa.xa;
   }

   @Override
   protected avz o_() {
      return awa.wZ;
   }

   @Override
   protected void b(ji $$0, dww $$1) {
      this.a(awa.xc, 0.15F, 1.0F);
   }

   public cvl t() {
      return cvl.a(this.al.a(bZ) & 15);
   }

   public void b(cvl $$0) {
      byte $$1 = this.al.a(bZ);
      this.al.a(bZ, (byte)($$1 & 240 | $$0.a() & 15));
   }

   public boolean x() {
      return (this.al.a(bZ) & 16) != 0;
   }

   public void x(boolean $$0) {
      byte $$1 = this.al.a(bZ);
      if ($$0) {
         this.al.a(bZ, (byte)($$1 | 16));
      } else {
         this.al.a(bZ, (byte)($$1 & -17));
      }
   }

   public static cvl a(azh $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cvl.p;
      } else if ($$1 < 10) {
         return cvl.h;
      } else if ($$1 < 15) {
         return cvl.i;
      } else if ($$1 < 18) {
         return cvl.m;
      } else {
         return $$0.a(500) == 0 ? cvl.g : cvl.a;
      }
   }

   @Nullable
   public cht b(ard $$0, bub $$1) {
      cht $$2 = bur.ba.a($$0, buq.e);
      if ($$2 != null) {
         cvl $$3 = this.t();
         cvl $$4 = ((cht)$$1).t();
         $$2.b(cvl.a($$0, $$3, $$4));
      }

      return $$2;
   }

   @Override
   public void S() {
      super.S();
      this.x(false);
      if (this.e_()) {
         this.b_(60);
      }
   }

   @Nullable
   @Override
   public bvz a(dgy $$0, bsh $$1, buq $$2, @Nullable bvz $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
