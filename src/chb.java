import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;
import javax.annotation.Nullable;

public class chb extends bqf implements cgr {
   public static final float b = 7.448451F;
   public static final int c = axk.f(24.166098F);
   private static final aiy<Integer> d = ajc.a(chb.class, aja.b);
   esa e = esa.b;
   ib bW = ib.c;
   chb.a bX = chb.a.a;

   public chb(bqb<? extends chb> $$0, cyx $$1) {
      super($$0, $$1);
      this.bM = 5;
      this.bO = new chb.g(this);
      this.bN = new chb.f(this);
   }

   @Override
   public boolean aT() {
      return (this.u() + this.ah) % c == 0;
   }

   @Override
   protected bwj E() {
      return new chb.d(this);
   }

   @Override
   protected void z() {
      this.bR.a(1, new chb.c());
      this.bR.a(2, new chb.i());
      this.bR.a(3, new chb.e());
      this.bS.a(1, new chb.b());
   }

   @Override
   protected void a(ajc.a $$0) {
      super.a($$0);
      $$0.a(d, 0);
   }

   public void b(int $$0) {
      this.an.a(d, axk.a($$0, 0, 64));
   }

   private void y() {
      this.j_();
      this.f(brv.c).a((double)(6 + this.r()));
   }

   public int r() {
      return this.an.a(d);
   }

   @Override
   public void a(aiy<?> $$0) {
      if (d.equals($$0)) {
         this.y();
      }

      super.a($$0);
   }

   public int u() {
      return this.aj() * 3;
   }

   @Override
   protected boolean W() {
      return true;
   }

   @Override
   public void l() {
      super.l();
      if (this.dM().B) {
         float $$0 = axk.b((float)(this.u() + this.ah) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         float $$1 = axk.b((float)(this.u() + this.ah + 1) * 7.448451F * (float) (Math.PI / 180.0) + (float) Math.PI);
         if ($$0 > 0.0F && $$1 <= 0.0F) {
            this.dM().a(this.dr(), this.dt(), this.dx(), aum.tb, this.db(), 0.95F + this.ag.i() * 0.05F, 0.95F + this.ag.i() * 0.05F, false);
         }

         float $$2 = this.dg() * 1.48F;
         float $$3 = axk.b(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$4 = axk.a(this.dC() * (float) (Math.PI / 180.0)) * $$2;
         float $$5 = (0.3F + $$0 * 0.45F) * this.dh() * 2.5F;
         this.dM().a(kl.X, this.dr() + (double)$$3, this.dt() + (double)$$5, this.dx() + (double)$$4, 0.0, 0.0, 0.0);
         this.dM().a(kl.X, this.dr() - (double)$$3, this.dt() + (double)$$5, this.dx() - (double)$$4, 0.0, 0.0, 0.0);
      }
   }

   @Override
   public void n_() {
      if (this.bA() && this.gh()) {
         this.g(8);
      }

      super.n_();
   }

   @Override
   protected void Y() {
      super.Y();
   }

   @Override
   public brg a(czm $$0, bny $$1, bqs $$2, @Nullable brg $$3) {
      this.bW = this.dm().b(5);
      this.b(0);
      return super.a($$0, $$1, $$2, $$3);
   }

   @Override
   public void a(tm $$0) {
      super.a($$0);
      if ($$0.e("AX")) {
         this.bW = new ib($$0.h("AX"), $$0.h("AY"), $$0.h("AZ"));
      }

      this.b($$0.h("Size"));
   }

   @Override
   public void b(tm $$0) {
      super.b($$0);
      $$0.a("AX", this.bW.u());
      $$0.a("AY", this.bW.v());
      $$0.a("AZ", this.bW.w());
      $$0.a("Size", this.r());
   }

   @Override
   public boolean a(double $$0) {
      return true;
   }

   @Override
   public aun db() {
      return aun.f;
   }

   @Override
   protected aul v() {
      return aum.sY;
   }

   @Override
   protected aul d(bot $$0) {
      return aum.tc;
   }

   @Override
   protected aul o_() {
      return aum.ta;
   }

   @Override
   protected float fb() {
      return 1.0F;
   }

   @Override
   public boolean a(bqb<?> $$0) {
      return true;
   }

   @Override
   public bpy e(bqz $$0) {
      int $$1 = this.r();
      bpy $$2 = super.e($$0);
      return $$2.a(1.0F + 0.15F * (float)$$1);
   }

   static enum a {
      a,
      b;
   }

   class b extends bxl {
      private final cbe b = cbe.a().a(64.0);
      private int c = b(20);

      @Override
      public boolean a() {
         if (this.c > 0) {
            this.c--;
            return false;
         } else {
            this.c = b(60);
            List<cjt> $$0 = chb.this.dM().a(this.b, chb.this, chb.this.cH().c(16.0, 64.0, 16.0));
            if (!$$0.isEmpty()) {
               $$0.sort(Comparator.comparing(bpv::dt).reversed());

               for (cjt $$1 : $$0) {
                  if (chb.this.a($$1, cbe.a)) {
                     chb.this.h($$1);
                     return true;
                  }
               }
            }

            return false;
         }
      }

      @Override
      public boolean b() {
         bqo $$0 = chb.this.p();
         return $$0 != null ? chb.this.a($$0, cbe.a) : false;
      }
   }

   class c extends bxl {
      private int b;

      @Override
      public boolean a() {
         bqo $$0 = chb.this.p();
         return $$0 != null ? chb.this.a($$0, cbe.a) : false;
      }

      @Override
      public void c() {
         this.b = this.a(10);
         chb.this.bX = chb.a.a;
         this.h();
      }

      @Override
      public void d() {
         chb.this.bW = chb.this.dM().a(dur.a.e, chb.this.bW).b(10 + chb.this.ag.a(20));
      }

      @Override
      public void e() {
         if (chb.this.bX == chb.a.a) {
            this.b--;
            if (this.b <= 0) {
               chb.this.bX = chb.a.b;
               this.h();
               this.b = this.a((8 + chb.this.ag.a(4)) * 20);
               chb.this.a(aum.td, 10.0F, 0.95F + chb.this.ag.i() * 0.1F);
            }
         }
      }

      private void h() {
         chb.this.bW = chb.this.p().dm().b(20 + chb.this.ag.a(20));
         if (chb.this.bW.v() < chb.this.dM().z_()) {
            chb.this.bW = new ib(chb.this.bW.u(), chb.this.dM().z_() + 1, chb.this.bW.w());
         }
      }
   }

   class d extends bwj {
      public d(bqq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         chb.this.aZ = chb.this.aX;
         chb.this.aX = chb.this.dC();
      }
   }

   class e extends chb.h {
      private float c;
      private float d;
      private float e;
      private float f;

      @Override
      public boolean a() {
         return chb.this.p() == null || chb.this.bX == chb.a.a;
      }

      @Override
      public void c() {
         this.d = 5.0F + chb.this.ag.i() * 10.0F;
         this.e = -4.0F + chb.this.ag.i() * 9.0F;
         this.f = chb.this.ag.h() ? 1.0F : -1.0F;
         this.i();
      }

      @Override
      public void e() {
         if (chb.this.ag.a(this.a(350)) == 0) {
            this.e = -4.0F + chb.this.ag.i() * 9.0F;
         }

         if (chb.this.ag.a(this.a(250)) == 0) {
            this.d++;
            if (this.d > 15.0F) {
               this.d = 5.0F;
               this.f = -this.f;
            }
         }

         if (chb.this.ag.a(this.a(450)) == 0) {
            this.c = chb.this.ag.i() * 2.0F * (float) Math.PI;
            this.i();
         }

         if (this.h()) {
            this.i();
         }

         if (chb.this.e.d < chb.this.dt() && !chb.this.dM().u(chb.this.dm().c(1))) {
            this.e = Math.max(1.0F, this.e);
            this.i();
         }

         if (chb.this.e.d > chb.this.dt() && !chb.this.dM().u(chb.this.dm().b(1))) {
            this.e = Math.min(-1.0F, this.e);
            this.i();
         }
      }

      private void i() {
         if (ib.c.equals(chb.this.bW)) {
            chb.this.bW = chb.this.dm();
         }

         this.c = this.c + this.f * 15.0F * (float) (Math.PI / 180.0);
         chb.this.e = esa.a(chb.this.bW).b((double)(this.d * axk.b(this.c)), (double)(-4.0F + this.e), (double)(this.d * axk.a(this.c)));
      }
   }

   class f extends bwn {
      public f(bqq $$0) {
         super($$0);
      }

      @Override
      public void a() {
      }
   }

   class g extends bwo {
      private float m = 0.1F;

      public g(bqq $$0) {
         super($$0);
      }

      @Override
      public void a() {
         if (chb.this.P) {
            chb.this.r(chb.this.dC() + 180.0F);
            this.m = 0.1F;
         }

         double $$0 = chb.this.e.c - chb.this.dr();
         double $$1 = chb.this.e.d - chb.this.dt();
         double $$2 = chb.this.e.e - chb.this.dx();
         double $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
         if (Math.abs($$3) > 1.0E-5F) {
            double $$4 = 1.0 - Math.abs($$1 * 0.7F) / $$3;
            $$0 *= $$4;
            $$2 *= $$4;
            $$3 = Math.sqrt($$0 * $$0 + $$2 * $$2);
            double $$5 = Math.sqrt($$0 * $$0 + $$2 * $$2 + $$1 * $$1);
            float $$6 = chb.this.dC();
            float $$7 = (float)axk.d($$2, $$0);
            float $$8 = axk.g(chb.this.dC() + 90.0F);
            float $$9 = axk.g($$7 * (180.0F / (float)Math.PI));
            chb.this.r(axk.e($$8, $$9, 4.0F) - 90.0F);
            chb.this.aX = chb.this.dC();
            if (axk.d($$6, chb.this.dC()) < 3.0F) {
               this.m = axk.d(this.m, 1.8F, 0.005F * (1.8F / this.m));
            } else {
               this.m = axk.d(this.m, 0.2F, 0.025F);
            }

            float $$10 = (float)(-(axk.d(-$$1, $$3) * 180.0F / (float)Math.PI));
            chb.this.s($$10);
            float $$11 = chb.this.dC() + 90.0F;
            double $$12 = (double)(this.m * axk.b($$11 * (float) (Math.PI / 180.0))) * Math.abs($$0 / $$5);
            double $$13 = (double)(this.m * axk.a($$11 * (float) (Math.PI / 180.0))) * Math.abs($$2 / $$5);
            double $$14 = (double)(this.m * axk.a($$10 * (float) (Math.PI / 180.0))) * Math.abs($$1 / $$5);
            esa $$15 = chb.this.dp();
            chb.this.g($$15.e(new esa($$12, $$14, $$13).d($$15).a(0.2)));
         }
      }
   }

   abstract class h extends bxl {
      public h() {
         this.a(EnumSet.of(bxl.a.a));
      }

      protected boolean h() {
         return chb.this.e.c(chb.this.dr(), chb.this.dt(), chb.this.dx()) < 4.0;
      }
   }

   class i extends chb.h {
      private static final int c = 20;
      private boolean d;
      private int e;

      @Override
      public boolean a() {
         return chb.this.p() != null && chb.this.bX == chb.a.b;
      }

      @Override
      public boolean b() {
         bqo $$0 = chb.this.p();
         if ($$0 == null) {
            return false;
         } else if (!$$0.bA()) {
            return false;
         } else {
            if ($$0 instanceof cjt $$1 && ($$0.N_() || $$1.f())) {
               return false;
            }

            if (!this.a()) {
               return false;
            } else {
               if (chb.this.ah > this.e) {
                  this.e = chb.this.ah + 20;
                  List<ccg> $$2 = chb.this.dM().a(ccg.class, chb.this.cH().g(16.0), bqa.a);

                  for (ccg $$3 : $$2) {
                     $$3.gy();
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
         chb.this.h(null);
         chb.this.bX = chb.a.a;
      }

      @Override
      public void e() {
         bqo $$0 = chb.this.p();
         if ($$0 != null) {
            chb.this.e = new esa($$0.dr(), $$0.e(0.5), $$0.dx());
            if (chb.this.cH().g(0.2F).c($$0.cH())) {
               chb.this.C($$0);
               chb.this.bX = chb.a.a;
               if (!chb.this.aU()) {
                  chb.this.dM().c(1039, chb.this.dm(), 0);
               }
            } else if (chb.this.P || chb.this.aN > 0) {
               chb.this.bX = chb.a.a;
            }
         }
      }
   }
}
