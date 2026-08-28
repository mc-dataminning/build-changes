import java.util.Objects;
import org.jetbrains.annotations.Nullable;

public class cin extends chn {
   public float bZ;
   public float ca;
   public float cb;
   public float cc;
   public float cd;
   public float ce;
   public float cf;
   public float cg;
   private float ch;
   private float ci;
   private float cj;
   fbr ck = fbr.c;

   public cin(bvi<? extends cin> $$0, dgz $$1) {
      super($$0, $$1);
      this.ae.b((long)this.ar());
      this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
   }

   @Override
   protected void B() {
      this.bT.a(0, new cin.b(this));
      this.bT.a(1, new cin.a());
   }

   public static bxe.a go() {
      return bvz.C().a(bxf.s, 10.0);
   }

   @Override
   protected awu u() {
      return awv.zO;
   }

   @Override
   protected awu e(btr $$0) {
      return awv.zQ;
   }

   @Override
   protected awu o_() {
      return awv.zP;
   }

   protected awu t() {
      return awv.zR;
   }

   @Override
   public boolean y() {
      return true;
   }

   @Override
   protected float fg() {
      return 0.4F;
   }

   @Override
   protected bvb.c bg() {
      return bvb.c.c;
   }

   @Nullable
   @Override
   public bus a(arx $$0, bus $$1) {
      return bvi.br.a($$0, bvh.e);
   }

   @Override
   protected double bd() {
      return 0.08;
   }

   @Override
   public void d_() {
      super.d_();
      this.ca = this.bZ;
      this.cc = this.cb;
      this.ce = this.cd;
      this.cg = this.cf;
      this.cd = this.cd + this.ci;
      if ((double)this.cd > Math.PI * 2) {
         if (this.dW().C) {
            this.cd = (float) (Math.PI * 2);
         } else {
            this.cd -= (float) (Math.PI * 2);
            if (this.ae.a(10) == 0) {
               this.ci = 1.0F / (this.ae.i() + 1.0F) * 0.2F;
            }

            this.dW().a(this, (byte)19);
         }
      }

      if (this.bm()) {
         if (this.cd < (float) Math.PI) {
            float $$0 = this.cd / (float) Math.PI;
            this.cf = azu.a($$0 * $$0 * (float) Math.PI) * (float) Math.PI * 0.25F;
            if ((double)$$0 > 0.75) {
               if (this.di()) {
                  this.h(this.ck);
               }

               this.cj = 1.0F;
            } else {
               this.cj *= 0.8F;
            }
         } else {
            this.cf = 0.0F;
            if (this.di()) {
               this.h(this.dz().c(0.9));
            }

            this.cj *= 0.99F;
         }

         fbr $$1 = this.dz();
         double $$2 = $$1.i();
         this.aX = this.aX + (-((float)azu.d($$1.d, $$1.f)) * (180.0F / (float)Math.PI) - this.aX) * 0.1F;
         this.v(this.aX);
         this.cb = this.cb + (float) Math.PI * this.cj * 1.5F;
         this.bZ = this.bZ + (-((float)azu.d($$2, $$1.e)) * (180.0F / (float)Math.PI) - this.bZ) * 0.1F;
      } else {
         this.cf = azu.e(azu.a(this.cd)) * (float) Math.PI * 0.25F;
         if (!this.dW().C) {
            double $$3 = this.dz().e;
            if (this.b(bui.y)) {
               $$3 = 0.05 * (double)(this.c(bui.y).e() + 1);
            } else {
               $$3 -= this.be();
            }

            this.n(0.0, $$3 * 0.98F, 0.0);
         }

         this.bZ = this.bZ + (-90.0F - this.bZ) * 0.02F;
      }
   }

   @Override
   public boolean a(arx $$0, btr $$1, float $$2) {
      if (super.a($$0, $$1, $$2) && this.eq() != null) {
         this.x();
         return true;
      } else {
         return false;
      }
   }

   private fbr k(fbr $$0) {
      fbr $$1 = $$0.a(this.ca * (float) (Math.PI / 180.0));
      return $$1.b(-this.aY * (float) (Math.PI / 180.0));
   }

   private void x() {
      this.b(this.t());
      fbr $$0 = this.k(new fbr(0.0, -1.0, 0.0)).b(this.dB(), this.dD(), this.dH());

      for (int $$1 = 0; $$1 < 30; $$1++) {
         fbr $$2 = this.k(new fbr((double)this.ae.i() * 0.6 - 0.3, -1.0, (double)this.ae.i() * 0.6 - 0.3));
         float $$3 = this.e_() ? 0.1F : 0.3F;
         fbr $$4 = $$2.c((double)($$3 + this.ae.i() * 2.0F));
         ((arx)this.dW()).a(this.p(), $$0.d, $$0.e + 0.5, $$0.f, 0, $$4.d, $$4.e, $$4.f, 0.1F);
      }
   }

   protected lq p() {
      return ls.ak;
   }

   @Override
   public void a_(fbr $$0) {
      if (this.di()) {
         this.a(bwb.a, this.dz());
      }
   }

   @Override
   public void b(byte $$0) {
      if ($$0 == 19) {
         this.cd = 0.0F;
      } else {
         super.b($$0);
      }
   }

   public boolean gp() {
      return this.ck.h() > 1.0E-5F;
   }

   @Nullable
   @Override
   public bwq a(dhq $$0, bsy $$1, bvh $$2, @Nullable bwq $$3) {
      bwq $$4 = Objects.requireNonNullElseGet($$3, () -> new bus.a(0.05F));
      return super.a($$0, $$1, $$2, $$4);
   }

   class a extends ccv {
      private static final float b = 3.0F;
      private static final float c = 5.0F;
      private static final float d = 10.0F;
      private int e;

      @Override
      public boolean b() {
         bvx $$0 = cin.this.eq();
         return cin.this.bj() && $$0 != null ? cin.this.g((bvb)$$0) < 100.0 : false;
      }

      @Override
      public void d() {
         this.e = 0;
      }

      @Override
      public boolean V_() {
         return true;
      }

      @Override
      public void a() {
         this.e++;
         bvx $$0 = cin.this.eq();
         if ($$0 != null) {
            fbr $$1 = new fbr(cin.this.dB() - $$0.dB(), cin.this.dD() - $$0.dD(), cin.this.dH() - $$0.dH());
            dxo $$2 = cin.this.dW().a_(jh.a(cin.this.dB() + $$1.d, cin.this.dD() + $$1.e, cin.this.dH() + $$1.f));
            etq $$3 = cin.this.dW().b_(jh.a(cin.this.dB() + $$1.d, cin.this.dD() + $$1.e, cin.this.dH() + $$1.f));
            if ($$3.a(axq.a) || $$2.l()) {
               double $$4 = $$1.g();
               if ($$4 > 0.0) {
                  $$1.d();
                  double $$5 = 3.0;
                  if ($$4 > 5.0) {
                     $$5 -= ($$4 - 5.0) / 5.0;
                  }

                  if ($$5 > 0.0) {
                     $$1 = $$1.c($$5);
                  }
               }

               if ($$2.l()) {
                  $$1 = $$1.a(0.0, $$1.e, 0.0);
               }

               cin.this.ck = new fbr($$1.d / 20.0, $$1.e / 20.0, $$1.f / 20.0);
            }

            if (this.e % 10 == 5) {
               cin.this.dW().a(ls.d, cin.this.dB(), cin.this.dD(), cin.this.dH(), 0.0, 0.0, 0.0);
            }
         }
      }
   }

   class b extends ccv {
      private final cin a;

      public b(final cin $$0) {
         this.a = $$0;
      }

      @Override
      public boolean b() {
         return true;
      }

      @Override
      public void a() {
         int $$0 = this.a.eu();
         if ($$0 > 100) {
            this.a.ck = fbr.c;
         } else if (this.a.dZ().a(b(50)) == 0 || !this.a.ag || !this.a.gp()) {
            float $$1 = this.a.dZ().i() * (float) (Math.PI * 2);
            this.a.ck = new fbr((double)(azu.b($$1) * 0.2F), (double)(-0.1F + this.a.dZ().i() * 0.2F), (double)(azu.a($$1) * 0.2F));
         }
      }
   }
}
