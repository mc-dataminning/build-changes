import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;
import javax.annotation.Nullable;

public class chu extends cgy implements bvy {
   private static final int bY = 40;
   private static final ajy<Byte> bZ = akc.a(chu.class, aka.a);
   private static final Map<cvm, Integer> ca = Maps.newEnumMap(Arrays.stream(cvm.values()).collect(Collectors.toMap($$0 -> (cvm)$$0, chu::c)));
   private int cc;
   private cbx cd;

   private static int c(cvm $$0) {
      if ($$0 == cvm.a) {
         return -1644826;
      } else {
         int $$1 = $$0.d();
         float $$2 = 0.75F;
         return axk.a(255, ayz.d((float)axk.b($$1) * 0.75F), ayz.d((float)axk.c($$1) * 0.75F), ayz.d((float)axk.d($$1) * 0.75F));
      }
   }

   public static int a(cvm $$0) {
      return ca.get($$0);
   }

   public chu(bus<? extends chu> $$0, dgi $$1) {
      super($$0, $$1);
   }

   @Override
   protected void E() {
      this.cd = new cbx(this);
      this.bS.a(0, new cbz(this));
      this.bS.a(1, new ccy(this, 1.25));
      this.bS.a(2, new cbr(this, 1.0));
      this.bS.a(3, new cdn(this, 1.1, $$0 -> $$0.a(awy.af), false));
      this.bS.a(4, new cce(this, 1.1));
      this.bS.a(5, this.cd);
      this.bS.a(6, new cds(this, 1.0));
      this.bS.a(7, new ccn(this, cox.class, 6.0F));
      this.bS.a(8, new cda(this));
   }

   @Override
   public boolean j(cwp $$0) {
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

   public static bwo.a p() {
      return cgy.gx().a(bwp.s, 8.0).a(bwp.v, 0.23F);
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
   public bsk b(cox $$0, bsj $$1) {
      cwp $$2 = $$0.b($$1);
      if ($$2.a(cwt.sS)) {
         if (this.dV() instanceof ard $$3 && this.a()) {
            this.a($$3, awb.h, $$2);
            this.a(ebt.M, $$0);
            $$2.a(1, $$0, d($$1));
            return bsk.b;
         }

         return bsk.c;
      } else {
         return super.b($$0, $$1);
      }
   }

   @Override
   public void a(ard $$0, awb $$1, cwp $$2) {
      $$0.a(null, this, awa.xb, $$1, 1.0F, 1.0F);
      this.a($$0, evn.aV, $$2, ($$0x, $$1x) -> {
         for (int $$2x = 0; $$2x < $$1x.M(); $$2x++) {
            clc $$3 = this.a($$0x, $$1x.c(1), 1.0F);
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
      this.b(cvm.a($$0.f("Color")));
   }

   @Override
   protected avz u() {
      return awa.wY;
   }

   @Override
   protected avz e(btb $$0) {
      return awa.xa;
   }

   @Override
   protected avz o_() {
      return awa.wZ;
   }

   @Override
   protected void b(ji $$0, dwx $$1) {
      this.a(awa.xc, 0.15F, 1.0F);
   }

   public cvm t() {
      return cvm.a(this.al.a(bZ) & 15);
   }

   public void b(cvm $$0) {
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

   public static cvm a(azh $$0) {
      int $$1 = $$0.a(100);
      if ($$1 < 5) {
         return cvm.p;
      } else if ($$1 < 10) {
         return cvm.h;
      } else if ($$1 < 15) {
         return cvm.i;
      } else if ($$1 < 18) {
         return cvm.m;
      } else {
         return $$0.a(500) == 0 ? cvm.g : cvm.a;
      }
   }

   @Nullable
   public chu b(ard $$0, buc $$1) {
      chu $$2 = bus.ba.a($$0, bur.e);
      if ($$2 != null) {
         cvm $$3 = this.t();
         cvm $$4 = ((chu)$$1).t();
         $$2.b(cvm.a($$0, $$3, $$4));
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
   public bwa a(dgz $$0, bsi $$1, bur $$2, @Nullable bwa $$3) {
      this.b(a($$0.H_()));
      return super.a($$0, $$1, $$2, $$3);
   }
}
