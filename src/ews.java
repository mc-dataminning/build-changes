import com.mojang.datafixers.util.Pair;
import java.util.List;
import javax.annotation.Nullable;

public class ews extends evp<cci> {
   private static final acq w = new acq("textures/gui/container/loom.png");
   private static final int x = 4;
   private static final int y = 4;
   private static final int z = 12;
   private static final int A = 15;
   private static final int C = 14;
   private static final int D = 56;
   private static final int E = 60;
   private static final int F = 13;
   private fee G;
   @Nullable
   private List<Pair<he<cze>, cen>> H;
   private cfz I = cfz.b;
   private cfz J = cfz.b;
   private cfz K = cfz.b;
   private boolean L;
   private boolean M;
   private float N;
   private boolean O;
   private int P;

   public ews(cci $$0, byn $$1, sw $$2) {
      super($$0, $$1, $$2);
      $$0.a(this::E);
      this.m -= 2;
   }

   @Override
   protected void b() {
      super.b();
      this.G = this.f.aO().a(fed.f).b("flag");
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.a($$0, $$1, $$2);
   }

   private int D() {
      return apa.e(this.p.l().size(), 4);
   }

   @Override
   protected void a(eox $$0, float $$1, int $$2, int $$3) {
      this.a($$0);
      int $$4 = this.s;
      int $$5 = this.t;
      $$0.a(w, $$4, $$5, 0, 0, this.c, this.k);
      ccx $$6 = this.p.n();
      ccx $$7 = this.p.o();
      ccx $$8 = this.p.p();
      ccx $$9 = this.p.q();
      if (!$$6.f()) {
         $$0.a(w, $$4 + $$6.f, $$5 + $$6.g, this.c, 0, 16, 16);
      }

      if (!$$7.f()) {
         $$0.a(w, $$4 + $$7.f, $$5 + $$7.g, this.c + 16, 0, 16, 16);
      }

      if (!$$8.f()) {
         $$0.a(w, $$4 + $$8.f, $$5 + $$8.g, this.c + 32, 0, 16, 16);
      }

      int $$10 = (int)(41.0F * this.N);
      $$0.a(w, $$4 + 119, $$5 + 13 + $$10, 232 + (this.L ? 0 : 12), 0, 12, 15);
      ehf.a();
      if (this.H != null && !this.M) {
         $$0.c().a();
         $$0.c().a((float)($$4 + 139), (float)($$5 + 52), 0.0F);
         $$0.c().b(24.0F, -24.0F, 1.0F);
         $$0.c().a(0.5F, 0.5F, 0.5F);
         float $$11 = 0.6666667F;
         $$0.c().b(0.6666667F, -0.6666667F, -0.6666667F);
         this.G.e = 0.0F;
         this.G.c = -32.0F;
         flp.a($$0.c(), $$0.d(), 15728880, fum.d, this.G, fww.f, true, this.H);
         $$0.c().b();
         $$0.e();
      } else if (this.M) {
         $$0.a(w, $$4 + $$9.f - 2, $$5 + $$9.g - 2, this.c, 17, 17, 16);
      }

      if (this.L) {
         int $$12 = $$4 + 60;
         int $$13 = $$5 + 13;
         List<he<cze>> $$14 = this.p.l();

         label64:
         for (int $$15 = 0; $$15 < 4; $$15++) {
            for (int $$16 = 0; $$16 < 4; $$16++) {
               int $$17 = $$15 + this.P;
               int $$18 = $$17 * 4 + $$16;
               if ($$18 >= $$14.size()) {
                  break label64;
               }

               int $$19 = $$12 + $$16 * 14;
               int $$20 = $$13 + $$15 * 14;
               boolean $$21 = $$2 >= $$19 && $$3 >= $$20 && $$2 < $$19 + 14 && $$3 < $$20 + 14;
               int $$22;
               if ($$18 == this.p.m()) {
                  $$22 = this.k + 14;
               } else if ($$21) {
                  $$22 = this.k + 28;
               } else {
                  $$22 = this.k;
               }

               $$0.a(w, $$19, $$20, 0, $$22, 14, 14);
               this.a($$0, $$14.get($$18), $$19, $$20);
            }
         }
      }

      ehf.b();
   }

   private void a(eox $$0, he<cze> $$1, int $$2, int $$3) {
      qr $$4 = new qr();
      qx $$5 = new cze.a().a(czf.a, cen.h).a($$1, cen.a).a();
      $$4.a("Patterns", $$5);
      cfz $$6 = new cfz(cgc.uc);
      cds.a($$6, czp.t, $$4);
      eij $$7 = new eij();
      $$7.a();
      $$7.a((float)$$2 + 0.5F, (float)($$3 + 16), 0.0F);
      $$7.b(6.0F, -6.0F, 1.0F);
      $$7.a(0.5F, 0.5F, 0.0F);
      $$7.a(0.5F, 0.5F, 0.5F);
      float $$8 = 0.6666667F;
      $$7.b(0.6666667F, -0.6666667F, -0.6666667F);
      this.G.e = 0.0F;
      this.G.c = -32.0F;
      List<Pair<he<cze>, cen>> $$9 = czd.a(cen.h, czd.a($$6));
      flp.a($$7, $$0.d(), 15728880, fum.d, this.G, fww.f, true, $$9);
      $$7.b();
      $$0.e();
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2) {
      this.O = false;
      if (this.L) {
         int $$3 = this.s + 60;
         int $$4 = this.t + 13;

         for (int $$5 = 0; $$5 < 4; $$5++) {
            for (int $$6 = 0; $$6 < 4; $$6++) {
               double $$7 = $$0 - (double)($$3 + $$6 * 14);
               double $$8 = $$1 - (double)($$4 + $$5 * 14);
               int $$9 = $$5 + this.P;
               int $$10 = $$9 * 4 + $$6;
               if ($$7 >= 0.0 && $$8 >= 0.0 && $$7 < 14.0 && $$8 < 14.0 && this.p.b(this.f.t, $$10)) {
                  enn.N().ah().a(fxt.a(amh.yp, 1.0F));
                  this.f.r.a(this.p.j, $$10);
                  return true;
               }
            }
         }

         $$3 = this.s + 119;
         $$4 = this.t + 9;
         if ($$0 >= (double)$$3 && $$0 < (double)($$3 + 12) && $$1 >= (double)$$4 && $$1 < (double)($$4 + 56)) {
            this.O = true;
         }
      }

      return super.a($$0, $$1, $$2);
   }

   @Override
   public boolean a(double $$0, double $$1, int $$2, double $$3, double $$4) {
      int $$5 = this.D() - 4;
      if (this.O && this.L && $$5 > 0) {
         int $$6 = this.t + 13;
         int $$7 = $$6 + 56;
         this.N = ((float)$$1 - (float)$$6 - 7.5F) / ((float)($$7 - $$6) - 15.0F);
         this.N = apa.a(this.N, 0.0F, 1.0F);
         this.P = Math.max((int)((double)(this.N * (float)$$5) + 0.5), 0);
         return true;
      } else {
         return super.a($$0, $$1, $$2, $$3, $$4);
      }
   }

   @Override
   public boolean a(double $$0, double $$1, double $$2) {
      int $$3 = this.D() - 4;
      if (this.L && $$3 > 0) {
         float $$4 = (float)$$2 / (float)$$3;
         this.N = apa.a(this.N - $$4, 0.0F, 1.0F);
         this.P = Math.max((int)(this.N * (float)$$3 + 0.5F), 0);
      }

      return true;
   }

   @Override
   protected boolean a(double $$0, double $$1, int $$2, int $$3, int $$4) {
      return $$0 < (double)$$2 || $$1 < (double)$$3 || $$0 >= (double)($$2 + this.c) || $$1 >= (double)($$3 + this.k);
   }

   private void E() {
      cfz $$0 = this.p.q().e();
      if ($$0.b()) {
         this.H = null;
      } else {
         this.H = czd.a(((cdp)$$0.d()).b(), czd.a($$0));
      }

      cfz $$1 = this.p.n().e();
      cfz $$2 = this.p.o().e();
      cfz $$3 = this.p.p().e();
      qr $$4 = cds.a($$1);
      this.M = $$4 != null && $$4.b("Patterns", 9) && !$$1.b() && $$4.c("Patterns", 10).size() >= 6;
      if (this.M) {
         this.H = null;
      }

      if (!cfz.a($$1, this.I) || !cfz.a($$2, this.J) || !cfz.a($$3, this.K)) {
         this.L = !$$1.b() && !$$2.b() && !this.M && !this.p.l().isEmpty();
      }

      if (this.P >= this.D()) {
         this.P = 0;
         this.N = 0.0F;
      }

      this.I = $$1.p();
      this.J = $$2.p();
      this.K = $$3.p();
   }
}
