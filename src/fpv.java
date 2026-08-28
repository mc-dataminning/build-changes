import java.util.List;
import javax.annotation.Nullable;

public class fpv extends foq<cra> {
   private static final akr E = akr.b("container/loom/banner_slot");
   private static final akr F = akr.b("container/loom/dye_slot");
   private static final akr G = akr.b("container/loom/pattern_slot");
   private static final akr H = akr.b("container/loom/scroller");
   private static final akr I = akr.b("container/loom/scroller_disabled");
   private static final akr J = akr.b("container/loom/pattern_selected");
   private static final akr K = akr.b("container/loom/pattern_highlighted");
   private static final akr L = akr.b("container/loom/pattern");
   private static final akr M = akr.b("container/loom/error");
   private static final akr N = akr.b("textures/gui/container/loom.png");
   private static final int O = 4;
   private static final int P = 4;
   private static final int Q = 12;
   private static final int R = 15;
   private static final int S = 14;
   private static final int T = 56;
   private static final int U = 60;
   private static final int V = 13;
   private fyi W;
   @Nullable
   private dpy X;
   private cuq Y = cuq.l;
   private cuq Z = cuq.l;
   private cuq aa = cuq.l;
   private boolean ab;
   private boolean ac;
   private float ad;
   private boolean ae;
   private int af;

   public fpv(cra $$0, cmw $$1, wz $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::F);
      this.u -= 2;
   }

   @Override
   protected void aT_() {
      super.aT_();
      this.W = this.l.aP().a(fyh.g).b("flag");
   }

   @Override
   public void a(fhx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int E() {
      return ayo.e(this.x.l().size(), 4);
   }

   @Override
   protected void a(fhx $$0, float $$1, int $$2, int $$3) {
      int $$4 = this.A;
      int $$5 = this.B;
      $$0.a(N, $$4, $$5, 0, 0, this.c, this.r);
      crq $$6 = this.x.n();
      crq $$7 = this.x.o();
      crq $$8 = this.x.p();
      crq $$9 = this.x.q();
      if (!$$6.h()) {
         $$0.a(E, $$4 + $$6.e, $$5 + $$6.f, 16, 16);
      }

      if (!$$7.h()) {
         $$0.a(F, $$4 + $$7.e, $$5 + $$7.f, 16, 16);
      }

      if (!$$8.h()) {
         $$0.a(G, $$4 + $$8.e, $$5 + $$8.f, 16, 16);
      }

      int $$10 = (int)(41.0F * this.ad);
      akr $$11 = this.ab ? H : I;
      $$0.a($$11, $$4 + 119, $$5 + 13 + $$10, 12, 15);
      fad.c();
      if (this.X != null && !this.ac) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, 24.0F, 1.0F);
         $$0.c().a(0.5F, -0.5F, 0.5F);
         float $$12 = 0.6666667F;
         $$0.c().b(0.6666667F, 0.6666667F, -0.6666667F);
         this.W.e = 0.0F;
         this.W.c = -32.0F;
         cti $$13 = ((csl)$$9.g().g()).b();
         ggs.a($$0.c(), $$0.d(), 15728880, gqa.d, this.W, gsq.f, true, $$13, this.X);
         $$0.c().b();
         $$0.e();
      } else if (this.ac) {
         $$0.a(M, $$4 + $$9.e - 5, $$5 + $$9.f - 5, 26, 26);
      }

      if (this.ab) {
         int $$14 = $$4 + 60;
         int $$15 = $$5 + 13;
         List<jm<dpx>> $$16 = this.x.l();

         label64:
         for (int $$17 = 0; $$17 < 4; $$17++) {
            for (int $$18 = 0; $$18 < 4; $$18++) {
               int $$19 = $$17 + this.af;
               int $$20 = $$19 * 4 + $$18;
               if ($$20 >= $$16.size()) {
                  break label64;
               }

               int $$21 = $$14 + $$18 * 14;
               int $$22 = $$15 + $$17 * 14;
               boolean $$23 = $$2 >= $$21 && $$3 >= $$22 && $$2 < $$21 + 14 && $$3 < $$22 + 14;
               akr $$24;
               if ($$20 == this.x.m()) {
                  $$24 = J;
               } else if ($$23) {
                  $$24 = K;
               } else {
                  $$24 = L;
               }

               $$0.a($$24, $$21, $$22, 14, 14);
               this.a($$0, $$16.get($$20), $$21, $$22);
            }
         }
      }

      fad.d();
   }

   private void a(fhx $$0, jm<dpx> $$1, int $$2, int $$3) {
      fbg $$4 = new fbg();
      $$4.a();
      $$4.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$4.b(6.0F, -6.0F, 1.0F);
      $$4.a(0.5F, 0.5F, 0.0F);
      $$4.a(0.5F, 0.5F, 0.5F);
      float $$5 = 0.6666667F;
      $$4.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.W.e = 0.0F;
      this.W.c = -32.0F;
      dpy $$6 = new dpy.a().a($$1, cti.a).a();
      ggs.a($$4, $$0.d(), 15728880, gqa.d, this.W, gsq.f, true, cti.h, $$6);
      $$4.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.ae = false;
      if (this.ab) {
         int $$3 = this.A + 60;
         int $$4 = this.B + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.af;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.x.a(this.l.s, $$10)) {
                  fgm.Q().aj().a(gtt.a(avp.As, 1.0F));
                  this.l.q.a(this.x.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.A + 119;
         $$4 = this.B + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.ae = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.E() - 4;
      if (this.ae && this.ab && $$5 > 0) {
         int $$6 = this.B + 13;
         int $$7 = $$6 + 56;
         this.ad = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.ad = ayo.a(this.ad, 0.0F, 1.0F);
         this.af = Math.max((int)((double)(this.ad * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2, double $$3) {
      int $$4 = this.E() - 4;
      if (this.ab && $$4 > 0) {
         float $$5 = (float)$$3 / (float)$$4;
         this.ad = ayo.a(this.ad - $$5, 0.0F, 1.0F);
         this.af = Math.max((int)(this.ad * (float)$$4 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.r);
   }

   private void F() {
      cuq $$0 = this.x.q().g();
      if ($$0.e()) {
         this.X = null;
      } else {
         this.X = $$0.a(kq.Y, dpy.a);
      }

      cuq $$1 = this.x.n().g();
      cuq $$2 = this.x.o().g();
      cuq $$3 = this.x.p().g();
      dpy $$4 = $$1.a(kq.Y, dpy.a);
      this.ac = $$4.b().size() >= 6;
      if (this.ac) {
         this.X = null;
      }

      if (!cuq.a($$1, this.Y) || !cuq.a($$2, this.Z) || !cuq.a($$3, this.aa)) {
         this.ab = !$$1.e() && !$$2.e() && !this.ac && !this.x.l().isEmpty();
      }

      if (this.af >= this.E()) {
         this.af = 0;
         this.ad = 0.0F;
      }

      this.Y = $$1.s();
      this.Z = $$2.s();
      this.aa = $$3.s();
   }
}
