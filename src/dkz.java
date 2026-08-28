import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dkz implements dkc {
   private static final dkd a = new dkd();
   private static final int b = 16;
   private static final float c = 2.0F;
   private final boolean d;
   private final dkc.a e;
   private final asb f;
   private final fgc g;
   @Nullable
   private final bxe h;
   private final float i;
   private final bvt j;
   private final dkd k;
   private final Map<csi, fgc> l = new HashMap<>();

   public dkz(asb $$0, @Nullable bxe $$1, @Nullable bvt $$2, @Nullable dkd $$3, fgc $$4, float $$5, boolean $$6, dkc.a $$7) {
      this.f = $$0;
      this.h = $$1;
      this.i = $$5;
      this.g = $$4;
      this.d = $$6;
      this.e = $$7;
      this.j = $$2 == null ? $$0.al().a(this) : $$2;
      this.k = $$3 == null ? this.b($$1) : $$3;
   }

   private dkd b(@Nullable bxe $$0) {
      return (dkd)($$0 == null ? a : new dka($$0));
   }

   public static float a(fgc $$0, bxe $$1) {
      ffx $$2 = $$1.cR();
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
                  double $$13 = azz.d($$10, $$2.a, $$2.d);
                  double $$14 = azz.d($$11, $$2.b, $$2.e);
                  double $$15 = azz.d($$12, $$2.c, $$2.f);
                  fgc $$16 = new fgc($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dV().a(new djq($$16, $$0, djq.a.a, djq.b.a, $$1)).d() == fga.a.a) {
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
   public fgc f() {
      return this.g;
   }

   private List<iw> m() {
      Set<iw> $$0 = new HashSet<>();
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
                     iw $$14 = iw.a($$10, $$11, $$12);
                     ebq $$15 = this.f.a_($$14);
                     eya $$16 = this.f.b_($$14);
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

   private void n() {
      float $$0 = this.i * 2.0F;
      int $$1 = azz.a(this.g.d - (double)$$0 - 1.0);
      int $$2 = azz.a(this.g.d + (double)$$0 + 1.0);
      int $$3 = azz.a(this.g.e - (double)$$0 - 1.0);
      int $$4 = azz.a(this.g.e + (double)$$0 + 1.0);
      int $$5 = azz.a(this.g.f - (double)$$0 - 1.0);
      int $$6 = azz.a(this.g.f + (double)$$0 + 1.0);

      for (bxe $$8 : this.f.a_(this.h, new ffx((double)$$1, (double)$$3, (double)$$5, (double)$$2, (double)$$4, (double)$$6))) {
         if (!$$8.a(this)) {
            double $$9 = Math.sqrt($$8.g(this.g)) / (double)$$0;
            if ($$9 <= 1.0) {
               double $$10 = $$8.dA() - this.g.d;
               double $$11 = ($$8 instanceof cop ? $$8.dC() : $$8.dE()) - this.g.e;
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
                  if ($$8 instanceof byf $$18) {
                     $$19 = $$17 * (1.0 - $$18.h(bzl.i));
                  } else {
                     $$19 = $$17;
                  }

                  $$10 *= $$19;
                  $$11 *= $$19;
                  $$12 *= $$19;
                  fgc $$21 = new fgc($$10, $$11, $$12);
                  $$8.h($$21);
                  if ($$8 instanceof csi) {
                     csi $$22 = (csi)$$8;
                     if (!$$22.aa_() && (!$$22.b() || !$$22.gk().b)) {
                        this.l.put($$22, $$21);
                     }
                  }

                  $$8.b_(this.h);
               }
            }
         }
      }
   }

   private void a(List<iw> $$0) {
      List<dkz.a> $$1 = new ArrayList<>();
      ag.c($$0, this.f.A);

      for (iw $$2 : $$0) {
         this.f.a_($$2).a(this.f, $$2, this, ($$1x, $$2x) -> a($$1, $$1x, $$2x));
      }

      for (dkz.a $$3 : $$1) {
         dno.a(this.f, $$3.a, $$3.b);
      }
   }

   private void b(List<iw> $$0) {
      for (iw $$1 : $$0) {
         if (this.f.A.a(3) == 0 && this.f.a_($$1).l() && this.f.a_($$1.e()).s()) {
            this.f.b($$1, dnb.a(this.f, $$1));
         }
      }
   }

   public void i() {
      this.f.a(this.h, egq.w, this.g);
      List<iw> $$0 = this.m();
      this.n();
      if (this.o()) {
         brm $$1 = brl.a();
         $$1.a("explosion_blocks");
         this.a($$0);
         $$1.c();
      }

      if (this.d) {
         this.b($$0);
      }
   }

   private static void a(List<dkz.a> $$0, dak $$1, iw $$2) {
      for (dkz.a $$3 : $$0) {
         $$3.a($$1);
         if ($$1.f()) {
            return;
         }
      }

      $$0.add(new dkz.a($$2, $$1));
   }

   private boolean o() {
      return this.e != dkc.a.a;
   }

   public Map<csi, fgc> j() {
      return this.l;
   }

   @Override
   public asb a() {
      return this.f;
   }

   @Nullable
   @Override
   public byf c() {
      return dkc.a(this.h);
   }

   @Nullable
   @Override
   public bxe d() {
      return this.h;
   }

   public bvt k() {
      return this.j;
   }

   @Override
   public dkc.a b() {
      return this.e;
   }

   @Override
   public boolean g() {
      if (this.e != dkc.a.d) {
         return false;
      } else {
         return this.h != null && this.h.an() == bxn.t ? this.f.O().c(dkf.d) : true;
      }
   }

   @Override
   public boolean h() {
      boolean $$0 = this.f.O().c(dkf.d);
      boolean $$1 = this.h == null || !this.h.bi();
      boolean $$2 = this.h == null || this.h.an() != bxn.t && this.h.an() != bxn.bI;
      return $$0 ? $$1 && $$2 : this.e.a() && $$1 && $$2;
   }

   public boolean l() {
      return this.i < 2.0F || !this.o();
   }

   static class a {
      final iw a;
      dak b;

      a(iw $$0, dak $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(dak $$0) {
         if (coo.a(this.b, $$0)) {
            this.b = coo.a(this.b, $$0, 16);
         }
      }
   }
}
