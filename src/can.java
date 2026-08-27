import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;
import org.joml.Vector3f;

public class can extends bka implements cad {
   public static final float b = 7.448451F;
   public static final int c = asy.f(24.166098F);
   private static final afc<Integer> d = aff.a(can.class, afe.b);
   eif e = eif.b;
   ht bS = ht.b;
   can.a bT = can.a.a;

   public can(bjx<? extends can> $$0, cqz $$1) {
      super($$0, $$1);
      this.bJ = 5;
      this.bL = new can.g(this);
      this.bK = new can.f(this);
   }

   @Override
   public boolean aR() {
      return (this.t() + this.ah) % c == 0;
   }

   @Override
   protected bqc F() {
      return new can.d(this);
   }

   @Override
   protected void z() {
      this.bO.a(1, new can.c());
      this.bO.a(2, new can.i());
      this.bO.a(3, new can.e());
      this.bP.a(1, new can.b());
   }

   @Override
   protected void b_() {
      super.b_();
      this.an.a(d, 0);
   }

   public void b(int $$0) {
      this.an.b(d, asy.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.a(blp.c).a((double)(6 + this.s()));
   }

   public int s() {
      return this.an.b(d);
   }

   @Override
   protected float b(bkv $$0, bju $$1) {
      return $$1.b * 0.35F;
   }

   @Override
   public void a(afc<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int t() {
      return this.ah() * 3;
   }

   @Override
   protected boolean V() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dL().B) {
         float $$0 = asy.b((float)(this.t() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = asy.b((float)(this.t() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dL().a(this.dq(), this.ds(), this.dw(), aqd.rN, this.da(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         int $$2 = this.s();
         float $$3 = asy.b(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$4 = asy.a(this.dB() * (float) (Math.PI / 180.0)) * (1.3F + 0.21F * (float)$$2);
         float $$5 = (0.3F + $$0 * 0.45F) * ((float)$$2 * 0.2F + 1.0F);
         this.dL().a(js.U, this.dq() + (double)$$3, this.ds() + (double)$$5, this.dw() + (double)$$4, 0.0, 0.0, 0.0);
         this.dL().a(js.U, this.dq() - (double)$$3, this.ds() + (double)$$5, this.dw() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void c_() {
      if (this.bv() && this.fY()) {
         this.g(8);
      }

      super.c_();
   }

   @Override
   protected void X() {
      super.X();
   }

   @Override
   public blc a(cro $$0, bhz $$1, bkn $$2, @Nullable blc $$3, @Nullable rt $$4) {
      this.bS = this.dl().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3, $$4);
   }

   @Override
   public void a(rt $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bS = new ht($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(rt $$0) {
      super.b($$0);
      $$0.a("AX", this.bS.u());
      $$0.a("AY", this.bS.v());
      $$0.a("AZ", this.bS.w());
      $$0.a("Size", this.s());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aqe da() {
      return aqe.f;
   }

   @Override
   protected aqc w() {
      return aqd.rK;
   }

   @Override
   protected aqc d(bir $$0) {
      return aqd.rO;
   }

   @Override
   protected aqc m_() {
      return aqd.rM;
   }

   @Override
   public bko eR() {
      return bko.b;
   }

   @Override
   protected float eV() {
      return 1.0F;
   }

   @Override
   public boolean a(bjx<?> $$0) {
      return true;
   }

   @Override
   public bju a(bkv $$0) {
      int $$1 = this.s();
      bju $$2 = super.a($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   @Override
   protected Vector3f a(bjt $$0, bju $$1, float $$2) {
      return new Vector3f(0.0F, $$1.b * 0.675F, 0.0F);
   }

   @Override
   protected float l(bjt $$0) {
      return -0.125F;
   }

   static enum a {
      a,
      b;
   }

   class b extends bre {
      private final buv b = buv.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<ccx> $$0 = can.this.dL().a(this.b, can.this, can.this.cG().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bjt::ds).reversed());

               for (ccx $$1 : $$0) {
                  if (can.this.a($$1, buv.a)) {
                     can.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bkj $$0 = can.this.q();
         return $$0 != null ? can.this.a($$0, buv.a) : false;
      }
   }

   class c extends bre {
      private int b;

      @Override
      public boolean a() {
         bkj $$0 = can.this.q();
         return $$0 != null ? can.this.a($$0, buv.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         can.this.bT = can.a.a;
         this.h();
      }

      @Override
      public void d() {
         can.this.bS = can.this.dL().a(dlk.a.e, can.this.bS).b(10 + can.this.ag.a(20));
      }

      @Override
      public void e() {
         if (can.this.bT == can.a.a) {
            this.b--;
            if (this.b <= 0) {
               can.this.bT = can.a.b;
               this.h();
               this.b = this.a((8 + can.this.ag.a(4)) * 20);
               can.this.a(aqd.rP, 10.0F, 0.95F + can.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         can.this.bS = can.this.q().dl().b(20 + can.this.ag.a(20));
         if (can.this.bS.v() < can.this.dL().z_()) {
            can.this.bS = new ht(can.this.bS.u(), can.this.dL().z_() + 1, can.this.bS.w());
         }
      }
   }

   class d extends bqc {
      public d(bkl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         can.this.aW = can.this.aU;
         can.this.aU = can.this.dB();
      }
   }

   class e extends can.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return can.this.q() == null || can.this.bT == can.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + can.this.ag.i() * 10.0F;
         this.e = -4.0F + can.this.ag.i() * 9.0F;
         this.f = can.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (can.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + can.this.ag.i() * 9.0F;
         }

         if (can.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (can.this.ag.a(this.a(450)) == 0) {
            this.c = can.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (can.this.e.d < can.this.ds() && !can.this.dL().t(can.this.dl().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (can.this.e.d > can.this.ds() && !can.this.dL().t(can.this.dl().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ht.b.equals(can.this.bS)) {
            can.this.bS = can.this.dl();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         can.this.e = eif.a(can.this.bS).b((double)(this.d * asy.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * asy.a(this.c)));
      }
   }

   class f extends bqg {
      public f(bkl $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bqh {
      private float m = 0.1F;

      public g(bkl $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (can.this.P) {
            can.this.r(can.this.dB() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = can.this.e.c - can.this.dq();
         double $$1 = can.this.e.d - can.this.ds();
         double $$2 = can.this.e.e - can.this.dw();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = can.this.dB();
            float $$7 = (float)asy.d($$2, $$0);
            float $$8 = asy.g(can.this.dB() + 90.0F);
            float $$9 = asy.g($$7 * (180.0F / (float)Math.PI));
            can.this.r(asy.e($$8, $$9, 4.0F) - 90.0F);
            can.this.aU = can.this.dB();
            if (asy.d($$6, can.this.dB()) < 3.0F) {
               this.m = asy.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = asy.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(asy.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            can.this.s($$10);
            float $$11 = can.this.dB() + 90.0F;
            double $$12 = (double)(this.m * asy.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * asy.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * asy.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            eif $$15 = can.this.do();
            can.this.f($$15.e(new eif($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bre {
      public h() {
         this.a(EnumSet.of(bre.a.a));
      }

      protected boolean h() {
         return can.this.e.c(can.this.dq(), can.this.ds(), can.this.dw()) < 4.0;
      }
   }

   class i extends can.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return can.this.q() != null && can.this.bT == can.a.b;
      }

      @Override
      public boolean b() {
         bkj $$0 = can.this.q();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bv()) {
            return false;
         } else {
            if ($$0 instanceof ccx $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (can.this.ah > this.e) {
                  this.e = can.this.ah + 20;
                  List<bvx> $$2 = can.this.dL().a(bvx.class, can.this.cG().g(16.0), bjw.a);

                  for (bvx $$3 : $$2) {
                     $$3.gp();
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
         can.this.h(null);
         can.this.bT = can.a.a;
      }

      @Override
      public void e() {
         bkj $$0 = can.this.q();
         if ($$0 != null) {
            can.this.e = new eif($$0.dq(), $$0.e(0.5), $$0.dw());
            if (can.this.cG().g(0.2F).c($$0.cG())) {
               can.this.C($$0);
               can.this.bT = can.a.a;
               if (!can.this.aS()) {
                  can.this.dL().c(1039, can.this.dl(), 0);
               }
            } else if (can.this.P || can.this.aK > 0) {
               can.this.bT = can.a.a;
            }
         }
      }
   }
}
