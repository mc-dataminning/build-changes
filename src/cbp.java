import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class cbp extends blc implements cbf {
   public static final float b = 7.448451F;
   public static final int c = atq.f(24.166098F);
   private static final afs<Integer> d = afv.a(cbp.class, afu.b);
   ejz e = ejz.b;
   hx bS = hx.b;
   cbp.a bT = cbp.a.a;

   public cbp(bkz<? extends cbp> $$0, csf $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new cbp.g(this);
      this.bK = new cbp.f(this);
   }

   @Override
   public boolean aT() {
      return (this.w() + this.ah) % c == 0;
   }

   @Override
   protected bre H() {
      return new cbp.d(this);
   }

   @Override
   protected void B() {
      this.bO.a(1, new cbp.c());
      this.bO.a(2, new cbp.i());
      this.bO.a(3, new cbp.e());
      this.bP.a(1, new cbp.b());
   }

   @Override
   protected void c_() {
      super.c_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, atq.a($$0, 0, 64));
   }

   private void A() {
      this.k_();
      this.a(bmr.c).a((double)(6 + this.u()));
   }

   public int u() {
      return this.an.b(d);
   }

   @Override
   protected float b(blx $$0, bkw $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(afs<?> $$0) {
      if (d.equals($$0)) {
         this.A();
      }

      super.a($$0);
   }

   public int w() {
      return this.aj() * 3;
   }

   @Override
   protected boolean X() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dN().B) {
         float $$0 = atq.b((float)(this.w() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = atq.b((float)(this.w() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dN().a(this.ds(), this.du(), this.dy(), aqv.sf, this.dc(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.u();
         float $$3 = atq.b(this.dD() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = atq.a(this.dD() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dN().a(jw.U, this.ds() + (double)$$3, this.du() + (double)$$5, this.dy() + (double)$$4, 0.0, 0.0, 0.0);
         this.dN().a(jw.U, this.ds() - (double)$$3, this.du() + (double)$$5, this.dy() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void d_() {
      if (this.bx() && this.fZ()) {
         this.g(8);
      }

      super.d_();
   }

   @Override
   protected void Z() {
      super.Z();
   }

   @Override
   public bme a(csu $$0, biz $$1, blp $$2, @Nullable bme $$3, @Nullable sd $$4) {
      this.bS = this.dn().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(sd $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new hx($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(sd $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.u());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aqw dc() {
      return aqw.f;
   }

   @Override
   protected aqu y() {
      return aqv.sc;
   }

   @Override
   protected aqu d(bjt $$0) {
      return aqv.sg;
   }

   @Override
   protected aqu n_() {
      return aqv.se;
   }

   @Override
   public blq eT() {
      return blq.b;
   }

   @Override
   protected float eX() {
      return 1.0F;
   }

   @Override
   public boolean a(bkz<?> $$0) {
      return true;
   }

   @Override
   public bkw a(blx $$0) {
      int $$1 = this.u();
      bkw $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bkv $$0, bkw $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bkv $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bsg {
      private final bvx b = bvx.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cdz> $$0 = cbp.this.dN().a(this.b, cbp.this, cbp.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bkv::du).reversed());

               for (cdz $$1 : $$0) {
                  if (cbp.this.a($$1, bvx.a)) {
                     cbp.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bll $$0 = cbp.this.q();
         return $$0 != null ? cbp.this.a($$0, bvx.a) : false;
      }
   }

   class c extends bsg {
      private int b;

      @Override
      public boolean a() {
         bll $$0 = cbp.this.q();
         return $$0 != null ? cbp.this.a($$0, bvx.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         cbp.this.bT = cbp.a.a;
         this.h();
      }

      @Override
      public void d() {
         cbp.this.bS = cbp.this.dN().a(dmw.a.e, cbp.this.bS).b(10 + cbp.this.ag.a(20));
      }

      @Override
      public void e() {
         if (cbp.this.bT == cbp.a.a) {
            this.b--;
            if (this.b <= 0) {
               cbp.this.bT = cbp.a.b;
               this.h();
               this.b = this.a((8 + cbp.this.ag.a(4)) * 20);
               cbp.this.a(aqv.sh, 10.0F, 0.95F + cbp.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         cbp.this.bS = cbp.this.q().dn().b(20 + cbp.this.ag.a(20));
         if (cbp.this.bS.v() < cbp.this.dN().A_()) {
            cbp.this.bS = new hx(cbp.this.bS.u(), cbp.this.dN().A_() + 1, cbp.this.bS.w());
         }
      }
   }

   class d extends bre {
      public d(bln $$0) {
         super($$0);
      }

      @Override
      public void a() {
         cbp.this.aW = cbp.this.aU;
         cbp.this.aU = cbp.this.dD();
      }
   }

   class e extends cbp.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return cbp.this.q() == null || cbp.this.bT == cbp.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + cbp.this.ag.i() * 10.0F;
         this.e = -4.0F + cbp.this.ag.i() * 9.0F;
         this.f = cbp.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (cbp.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + cbp.this.ag.i() * 9.0F;
         }

         if (cbp.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (cbp.this.ag.a(this.a(450)) == 0) {
            this.c = cbp.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (cbp.this.e.d < cbp.this.du() && !cbp.this.dN().t(cbp.this.dn().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (cbp.this.e.d > cbp.this.du() && !cbp.this.dN().t(cbp.this.dn().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (hx.b.equals(cbp.this.bS)) {
            cbp.this.bS = cbp.this.dn();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         cbp.this.e = ejz.a(cbp.this.bS).b((double)(this.d * atq.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * atq.a(this.c)));
      }
   }

   class f extends bri {
      public f(bln $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends brj {
      private float m = 0.1F;

      public g(bln $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (cbp.this.P) {
            cbp.this.r(cbp.this.dD() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = cbp.this.e.c - cbp.this.ds();
         double $$1 = cbp.this.e.d - cbp.this.du();
         double $$2 = cbp.this.e.e - cbp.this.dy();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = cbp.this.dD();
            float $$7 = (float)atq.d($$2, $$0);
            float $$8 = atq.g(cbp.this.dD() + 90.0F);
            float $$9 = atq.g($$7 * (180.0F / (float)Math.PI));
            cbp.this.r(atq.e($$8, $$9, 4.0F) - 90.0F);
            cbp.this.aU = cbp.this.dD();
            if (atq.d($$6, cbp.this.dD()) < 3.0F) {
               this.m = atq.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = atq.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(atq.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            cbp.this.s($$10);
            float $$11 = cbp.this.dD() + 90.0F;
            double $$12 = (double)(this.m * atq.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * atq.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * atq.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            ejz $$15 = cbp.this.dq();
            cbp.this.g($$15.e(new ejz($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bsg {
      public h() {
         this.a(EnumSet.of(bsg.a.a));
      }

      protected boolean h() {
         return cbp.this.e.c(cbp.this.ds(), cbp.this.du(), cbp.this.dy()) < 4.0;
      }
   }

   class i extends cbp.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return cbp.this.q() != null && cbp.this.bT == cbp.a.b;
      }

      @Override
      public boolean b() {
         bll $$0 = cbp.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bx()) {
            return false;
         } else {
            if ($$0 instanceof cdz $$1 && ($$0.P_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (cbp.this.ah > this.e) {
                  this.e = cbp.this.ah + 20;
                  List<bwz> $$2 = cbp.this.dN().a(bwz.class, cbp.this.cH().g(16.0), bky.a);

                  for (bwz $$3 : $$2) {
                     $$3.gq();
                  }

                  this.d = !$$2.isEmpty();
               }

               return !this.d;
            }
         }
      }

      @Override
      public void c() {
      }

      @Override
      public void d() {
         cbp.this.h(null);
         cbp.this.bT = cbp.a.a;
      }

      @Override
      public void e() {
         bll $$0 = cbp.this.q();
         if ($$0 != null) {
            cbp.this.e = new ejz($$0.ds(), $$0.e(0.5), $$0.dy());
            if (cbp.this.cH().g(0.2F).c($$0.cH())) {
               cbp.this.C($$0);
               cbp.this.bT = cbp.a.a;
               if (!cbp.this.aU()) {
                  cbp.this.dN().c(1039, cbp.this.dn(), 0);
               }
            } else if (cbp.this.P || cbp.this.aK > 0) {
               cbp.this.bT = cbp.a.a;
            }
         }
      }
   }
}
