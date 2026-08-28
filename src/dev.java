import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dev implements ddy {
   private static final ddz a = new ddz();
   private static final int b = 16;
   private static final float c = 2.0F;
   private final boolean d;
   private final ddy.a e;
   private final arh f;
   private final eys g;
   @Nullable
   private final bto h;
   private final float i;
   private final bsg j;
   private final ddz k;
   private final Map<cnu, eys> l = new HashMap<>();

   public dev(arh $$0, @Nullable bto $$1, @Nullable bsg $$2, @Nullable ddz $$3, eys $$4, float $$5, boolean $$6, ddy.a $$7) {
      this.f = $$0;
      this.h = $$1;
      this.i = $$5;
      this.g = $$4;
      this.d = $$6;
      this.e = $$7;
      this.j = $$2 == null ? $$0.ak().a(this) : $$2;
      this.k = $$3 == null ? this.b($$1) : $$3;
   }

   private ddz b(@Nullable bto $$0) {
      return (ddz)($$0 == null ? a : new ddw($$0));
   }

   public static float a(eys $$0, bto $$1) {
      eyn $$2 = $$1.cO();
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
                  double $$13 = azd.d($$10, $$2.a, $$2.d);
                  double $$14 = azd.d($$11, $$2.b, $$2.e);
                  double $$15 = azd.d($$12, $$2.c, $$2.f);
                  eys $$16 = new eys($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dS().a(new ddo($$16, $$0, ddo.a.a, ddo.b.a, $$1)).d() == eyq.a.a) {
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
   public float d() {
      return this.i;
   }

   @Override
   public eys e() {
      return this.g;
   }

   private List<je> k() {
      Set<je> $$0 = new HashSet<>();
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
                  float $$9 = this.i * (0.7F + this.f.z.i() * 0.6F);
                  double $$10 = this.g.d;
                  double $$11 = this.g.e;
                  double $$12 = this.g.f;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     je $$14 = je.a($$10, $$11, $$12);
                     duo $$15 = this.f.a_($$14);
                     eqp $$16 = this.f.b_($$14);
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

   private void l() {
      float $$0 = this.i * 2.0F;
      int $$1 = azd.a(this.g.d - (double)$$0 - 1.0);
      int $$2 = azd.a(this.g.d + (double)$$0 + 1.0);
      int $$3 = azd.a(this.g.e - (double)$$0 - 1.0);
      int $$4 = azd.a(this.g.e + (double)$$0 + 1.0);
      int $$5 = azd.a(this.g.f - (double)$$0 - 1.0);
      int $$6 = azd.a(this.g.f + (double)$$0 + 1.0);

      for (bto $$8 : this.f.a_(this.h, new eyn((double)$$1, (double)$$3, (double)$$5, (double)$$2, (double)$$4, (double)$$6))) {
         if (!$$8.a(this)) {
            double $$9 = Math.sqrt($$8.f(this.g)) / (double)$$0;
            if ($$9 <= 1.0) {
               double $$10 = $$8.dx() - this.g.d;
               double $$11 = ($$8 instanceof ckf ? $$8.dz() : $$8.dB()) - this.g.e;
               double $$12 = $$8.dD() - this.g.f;
               double $$13 = Math.sqrt($$10 * $$10 + $$11 * $$11 + $$12 * $$12);
               if ($$13 != 0.0) {
                  $$10 /= $$13;
                  $$11 /= $$13;
                  $$12 /= $$13;
                  boolean $$14 = this.k.a(this, $$8);
                  float $$15 = this.k.a($$8);
                  float $$16 = !$$14 && $$15 == 0.0F ? 0.0F : a(this.g, $$8);
                  if ($$14) {
                     $$8.a(this.j, this.k.a(this, $$8, $$16));
                  }

                  double $$17 = (1.0 - $$9) * (double)$$16 * (double)$$15;
                  double $$19;
                  if ($$8 instanceof buk $$18) {
                     $$19 = $$17 * (1.0 - $$18.h(bvr.i));
                  } else {
                     $$19 = $$17;
                  }

                  $$10 *= $$19;
                  $$11 *= $$19;
                  $$12 *= $$19;
                  eys $$21 = new eys($$10, $$11, $$12);
                  $$8.h($$8.dv().e($$21));
                  if ($$8 instanceof cnu) {
                     cnu $$22 = (cnu)$$8;
                     if (!$$22.P_() && (!$$22.f() || !$$22.gd().b)) {
                        this.l.put($$22, $$21);
                     }
                  }

                  $$8.a(this.h);
               }
            }
         }
      }
   }

   private void a(List<je> $$0) {
      List<dev.a> $$1 = new ArrayList<>();
      ad.c($$0, this.f.z);

      for (je $$2 : $$0) {
         this.f.a_($$2).a(this.f, $$2, this, ($$1x, $$2x) -> a($$1, $$1x, $$2x));
      }

      for (dev.a $$3 : $$1) {
         dhj.a(this.f, $$3.a, $$3.b);
      }
   }

   private void b(List<je> $$0) {
      for (je $$1 : $$0) {
         if (this.f.z.a(3) == 0 && this.f.a_($$1).l() && this.f.a_($$1.e()).s()) {
            this.f.b($$1, dgw.a(this.f, $$1));
         }
      }
   }

   public void h() {
      this.f.a(this.h, dzl.w, this.g);
      List<je> $$0 = this.k();
      this.l();
      if (this.m()) {
         this.f.ah().a("explosion_blocks");
         this.a($$0);
         this.f.ah().c();
      }

      if (this.d) {
         this.b($$0);
      }
   }

   private static void a(List<dev.a> $$0, cvp $$1, je $$2) {
      for (dev.a $$3 : $$0) {
         $$3.a($$1);
         if ($$1.f()) {
            return;
         }
      }

      $$0.add(new dev.a($$2, $$1));
   }

   private boolean m() {
      return this.e != ddy.a.a;
   }

   public Map<cnu, eys> i() {
      return this.l;
   }

   @Nullable
   @Override
   public buk b() {
      return ddy.a(this.h);
   }

   @Nullable
   @Override
   public bto c() {
      return this.h;
   }

   @Override
   public ddy.a a() {
      return this.e;
   }

   @Override
   public boolean f() {
      if (this.e != ddy.a.d) {
         return false;
      } else {
         return this.h != null && this.h.ao() == btv.n ? this.f.ac().b(dec.c) : true;
      }
   }

   @Override
   public boolean g() {
      boolean $$0 = this.f.ac().b(dec.c);
      boolean $$1 = this.h == null || !this.h.bi();
      boolean $$2 = this.h == null || this.h.ao() != btv.n && this.h.ao() != btv.bn;
      return $$0 ? $$1 && $$2 : this.e.a() && $$1 && $$2;
   }

   public boolean j() {
      return this.i < 2.0F || !this.m();
   }

   static class a {
      final je a;
      cvp b;

      a(je $$0, cvp $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(cvp $$0) {
         if (cke.a(this.b, $$0)) {
            this.b = cke.a(this.b, $$0, 16);
         }
      }
   }
}
