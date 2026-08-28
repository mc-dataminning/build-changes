import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dhq implements dgs {
   private static final dgt a = new dgt();
   private static final int b = 16;
   private static final float c = 2.0F;
   private final boolean d;
   private final dgs.a e;
   private final ash f;
   private final fbs g;
   @Nullable
   private final bvf h;
   private final float i;
   private final btv j;
   private final dgt k;
   private final Map<cps, fbs> l = new HashMap<>();

   public dhq(ash $$0, @Nullable bvf $$1, @Nullable btv $$2, @Nullable dgt $$3, fbs $$4, float $$5, boolean $$6, dgs.a $$7) {
      this.f = $$0;
      this.h = $$1;
      this.i = $$5;
      this.g = $$4;
      this.d = $$6;
      this.e = $$7;
      this.j = $$2 == null ? $$0.aj().a(this) : $$2;
      this.k = $$3 == null ? this.b($$1) : $$3;
   }

   private dgt b(@Nullable bvf $$0) {
      return (dgt)($$0 == null ? a : new dgq($$0));
   }

   public static float a(fbs $$0, bvf $$1) {
      fbn $$2 = $$1.cR();
      double $$3 = 1.0 / (($$2.d - $$2.a) * 2.0 + 1.0);
      double $$4 = 1.0 / (($$2.e - $$2.b) * 2.0 + 1.0);
      double $$5 = 1.0 / (($$2.f - $$2.c) * 2.0 + 1.0);
      double $$6 = (1.0 - Math.floor(1.0 / $$3) * $$3) / 2.0;
      double $$7 = (1.0 - Math.floor(1.0 / $$5) * $$5) / 2.0;
      if (!($$3 < 0.0) && !($$4 < 0.0) && !($$5 < 0.0)) {
         int $$8 = 0;
         int $$9 = 0;

         for (double $$10 = 0.0; $$10 <= 1.0; $$10 += $$3) {
            for (double $$11 = 0.0; $$11 <= 1.0; $$11 += $$4) {
               for (double $$12 = 0.0; $$12 <= 1.0; $$12 += $$5) {
                  double $$13 = bae.d($$10, $$2.a, $$2.d);
                  double $$14 = bae.d($$11, $$2.b, $$2.e);
                  double $$15 = bae.d($$12, $$2.c, $$2.f);
                  fbs $$16 = new fbs($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dV().a(new dgi($$16, $$0, dgi.a.a, dgi.b.a, $$1)).d() == fbq.a.a) {
                     $$8++;
                  }

                  $$9++;
               }
            }
         }

         return (float)$$8 / (float)$$9;
      } else {
         return 0.0F;
      }
   }

   @Override
   public float e() {
      return this.i;
   }

   @Override
   public fbs f() {
      return this.g;
   }

   private List<jh> l() {
      Set<jh> $$0 = new HashSet<>();
      int $$1 = 16;

      for (int $$2 = 0; $$2 < 16; $$2++) {
         for (int $$3 = 0; $$3 < 16; $$3++) {
            for (int $$4 = 0; $$4 < 16; $$4++) {
               if ($$2 == 0 || $$2 == 15 || $$3 == 0 || $$3 == 15 || $$4 == 0 || $$4 == 15) {
                  double $$5 = (double)((float)$$2 / 15.0F * 2.0F - 1.0F);
                  double $$6 = (double)((float)$$3 / 15.0F * 2.0F - 1.0F);
                  double $$7 = (double)((float)$$4 / 15.0F * 2.0F - 1.0F);
                  double $$8 = Math.sqrt($$5 * $$5 + $$6 * $$6 + $$7 * $$7);
                  $$5 /= $$8;
                  $$6 /= $$8;
                  $$7 /= $$8;
                  float $$9 = this.i * (0.7F + this.f.A.i() * 0.6F);
                  double $$10 = this.g.d;
                  double $$11 = this.g.e;
                  double $$12 = this.g.f;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     jh $$14 = jh.a($$10, $$11, $$12);
                     dxn $$15 = this.f.a_($$14);
                     etp $$16 = this.f.b_($$14);
                     if (!this.f.k($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.k.a(this, this.f, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.k.a(this, this.f, $$14, $$15, $$9)) {
                        $$0.add($$14);
                     }

                     $$10 += $$5 * 0.3F;
                     $$11 += $$6 * 0.3F;
                     $$12 += $$7 * 0.3F;
                  }
               }
            }
         }
      }

      return new ObjectArrayList($$0);
   }

   private void m() {
      float $$0 = this.i * 2.0F;
      int $$1 = bae.a(this.g.d - (double)$$0 - 1.0);
      int $$2 = bae.a(this.g.d + (double)$$0 + 1.0);
      int $$3 = bae.a(this.g.e - (double)$$0 - 1.0);
      int $$4 = bae.a(this.g.e + (double)$$0 + 1.0);
      int $$5 = bae.a(this.g.f - (double)$$0 - 1.0);
      int $$6 = bae.a(this.g.f + (double)$$0 + 1.0);

      for (bvf $$8 : this.f.a_(this.h, new fbn((double)$$1, (double)$$3, (double)$$5, (double)$$2, (double)$$4, (double)$$6))) {
         if (!$$8.a(this)) {
            double $$9 = Math.sqrt($$8.f(this.g)) / (double)$$0;
            if ($$9 <= 1.0) {
               double $$10 = $$8.dA() - this.g.d;
               double $$11 = ($$8 instanceof clx ? $$8.dC() : $$8.dE()) - this.g.e;
               double $$12 = $$8.dG() - this.g.f;
               double $$13 = Math.sqrt($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
               if ($$13 != 0.0) {
                  $$10 /= $$13;
                  $$11 /= $$13;
                  $$12 /= $$13;
                  boolean $$14 = this.k.a(this, $$8);
                  float $$15 = this.k.a($$8);
                  float $$16 = !$$14 && $$15 == 0.0F ? 0.0F : a(this.g, $$8);
                  if ($$14) {
                     $$8.a(this.f, this.j, this.k.a(this, $$8, $$16));
                  }

                  double $$17 = (1.0 - $$9) * (double)$$16 * (double)$$15;
                  double $$19;
                  if ($$8 instanceof bwb $$18) {
                     $$19 = $$17 * (1.0 - $$18.h(bxj.i));
                  } else {
                     $$19 = $$17;
                  }

                  $$10 *= $$19;
                  $$11 *= $$19;
                  $$12 *= $$19;
                  fbs $$21 = new fbs($$10, $$11, $$12);
                  $$8.h($$8.dy().e($$21));
                  if ($$8 instanceof cps) {
                     cps $$22 = (cps)$$8;
                     if (!$$22.aa_() && (!$$22.b() || !$$22.gh().b)) {
                        this.l.put($$22, $$21);
                     }
                  }

                  $$8.b_(this.h);
               }
            }
         }
      }
   }

   private void a(List<jh> $$0) {
      List<dhq.a> $$1 = new ArrayList<>();
      ae.c($$0, this.f.A);

      for (jh $$2 : $$0) {
         this.f.a_($$2).a(this.f, $$2, this, ($$1x, $$2x) -> a($$1, $$1x, $$2x));
      }

      for (dhq.a $$3 : $$1) {
         dke.a(this.f, $$3.a, $$3.b);
      }
   }

   private void b(List<jh> $$0) {
      for (jh $$1 : $$0) {
         if (this.f.A.a(3) == 0 && this.f.a_($$1).l() && this.f.a_($$1.e()).s()) {
            this.f.b($$1, djr.a(this.f, $$1));
         }
      }
   }

   public void i() {
      this.f.a(this.h, ecj.w, this.g);
      List<jh> $$0 = this.l();
      this.m();
      if (this.n()) {
         bpo $$1 = bpn.a();
         $$1.a("explosion_blocks");
         this.a($$0);
         $$1.c();
      }

      if (this.d) {
         this.b($$0);
      }
   }

   private static void a(List<dhq.a> $$0, cxk $$1, jh $$2) {
      for (dhq.a $$3 : $$0) {
         $$3.a($$1);
         if ($$1.f()) {
            return;
         }
      }

      $$0.add(new dhq.a($$2, $$1));
   }

   private boolean n() {
      return this.e != dgs.a.a;
   }

   public Map<cps, fbs> j() {
      return this.l;
   }

   @Override
   public ash a() {
      return this.f;
   }

   @Nullable
   @Override
   public bwb c() {
      return dgs.a(this.h);
   }

   @Nullable
   @Override
   public bvf d() {
      return this.h;
   }

   @Override
   public dgs.a b() {
      return this.e;
   }

   @Override
   public boolean g() {
      if (this.e != dgs.a.d) {
         return false;
      } else {
         return this.h != null && this.h.aq() == bvm.s ? this.f.N().b(dgw.c) : true;
      }
   }

   @Override
   public boolean h() {
      boolean $$0 = this.f.N().b(dgw.c);
      boolean $$1 = this.h == null || !this.h.bj();
      boolean $$2 = this.h == null || this.h.aq() != bvm.s && this.h.aq() != bvm.bH;
      return $$0 ? $$1 && $$2 : this.e.a() && $$1 && $$2;
   }

   public boolean k() {
      return this.i < 2.0F || !this.n();
   }

   static class a {
      final jh a;
      cxk b;

      a(jh $$0, cxk $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(cxk $$0) {
         if (clw.a(this.b, $$0)) {
            this.b = clw.a(this.b, $$0, 16);
         }
      }
   }
}
