import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class deh implements ddk {
   private static final ddl a = new ddl();
   private static final int b = 16;
   private static final float c = 2.0F;
   private final boolean d;
   private final ddk.a e;
   private final arg f;
   private final eye g;
   @Nullable
   private final btj h;
   private final float i;
   private final bsb j;
   private final ddl k;
   private final Map<cnp, eye> l = new HashMap<>();

   public deh(arg $$0, @Nullable btj $$1, @Nullable bsb $$2, @Nullable ddl $$3, eye $$4, float $$5, boolean $$6, ddk.a $$7) {
      this.f = $$0;
      this.h = $$1;
      this.i = $$5;
      this.g = $$4;
      this.d = $$6;
      this.e = $$7;
      this.j = $$2 == null ? $$0.ak().a(this) : $$2;
      this.k = $$3 == null ? this.b($$1) : $$3;
   }

   private ddl b(@Nullable btj $$0) {
      return (ddl)($$0 == null ? a : new ddi($$0));
   }

   public static float a(eye $$0, btj $$1) {
      exz $$2 = $$1.cO();
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
                  double $$13 = azc.d($$10, $$2.a, $$2.d);
                  double $$14 = azc.d($$11, $$2.b, $$2.e);
                  double $$15 = azc.d($$12, $$2.c, $$2.f);
                  eye $$16 = new eye($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dS().a(new dda($$16, $$0, dda.a.a, dda.b.a, $$1)).c() == eyc.a.a) {
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
   public eye e() {
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
                     dua $$15 = this.f.a_($$14);
                     eqb $$16 = this.f.b_($$14);
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
      int $$1 = azc.a(this.g.d - (double)$$0 - 1.0);
      int $$2 = azc.a(this.g.d + (double)$$0 + 1.0);
      int $$3 = azc.a(this.g.e - (double)$$0 - 1.0);
      int $$4 = azc.a(this.g.e + (double)$$0 + 1.0);
      int $$5 = azc.a(this.g.f - (double)$$0 - 1.0);
      int $$6 = azc.a(this.g.f + (double)$$0 + 1.0);

      for (btj $$8 : this.f.a_(this.h, new exz((double)$$1, (double)$$3, (double)$$5, (double)$$2, (double)$$4, (double)$$6))) {
         if (!$$8.a(this)) {
            double $$9 = Math.sqrt($$8.f(this.g)) / (double)$$0;
            if ($$9 <= 1.0) {
               double $$10 = $$8.dx() - this.g.d;
               double $$11 = ($$8 instanceof cka ? $$8.dz() : $$8.dB()) - this.g.e;
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
                  if ($$8 instanceof buf $$18) {
                     $$19 = $$17 * (1.0 - $$18.h(bvm.i));
                  } else {
                     $$19 = $$17;
                  }

                  $$10 *= $$19;
                  $$11 *= $$19;
                  $$12 *= $$19;
                  eye $$21 = new eye($$10, $$11, $$12);
                  $$8.h($$8.dv().e($$21));
                  if ($$8 instanceof cnp) {
                     cnp $$22 = (cnp)$$8;
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
      List<deh.a> $$1 = new ArrayList<>();
      ad.c($$0, this.f.z);

      for (je $$2 : $$0) {
         this.f.a_($$2).a(this.f, $$2, this, ($$1x, $$2x) -> a($$1, $$1x, $$2x));
      }

      for (deh.a $$3 : $$1) {
         dgv.a(this.f, $$3.a, $$3.b);
      }
   }

   private void b(List<je> $$0) {
      for (je $$1 : $$0) {
         if (this.f.z.a(3) == 0 && this.f.a_($$1).l() && this.f.a_($$1.e()).s()) {
            this.f.b($$1, dgi.a(this.f, $$1));
         }
      }
   }

   public void h() {
      this.f.a(this.h, dyx.w, this.g);
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

   private static void a(List<deh.a> $$0, cvl $$1, je $$2) {
      for (deh.a $$3 : $$0) {
         $$3.a($$1);
         if ($$1.f()) {
            return;
         }
      }

      $$0.add(new deh.a($$2, $$1));
   }

   private boolean m() {
      return this.e != ddk.a.a;
   }

   public Map<cnp, eye> i() {
      return this.l;
   }

   @Nullable
   @Override
   public buf b() {
      return ddk.a(this.h);
   }

   @Nullable
   @Override
   public btj c() {
      return this.h;
   }

   @Override
   public ddk.a a() {
      return this.e;
   }

   @Override
   public boolean f() {
      if (this.e != ddk.a.d) {
         return false;
      } else {
         return this.h != null && this.h.ao() == btq.n ? this.f.ac().b(ddo.c) : true;
      }
   }

   @Override
   public boolean g() {
      boolean $$0 = this.f.ac().b(ddo.c);
      boolean $$1 = this.h == null || !this.h.bi();
      boolean $$2 = this.h == null || this.h.ao() != btq.n && this.h.ao() != btq.bn;
      return $$0 ? $$1 && $$2 : this.e.a() && $$1 && $$2;
   }

   public boolean j() {
      return this.i < 2.0F || !this.m();
   }

   static class a {
      final je a;
      cvl b;

      a(je $$0, cvl $$1) {
         this.a = $$0;
         this.b = $$1;
      }

      public void a(cvl $$0) {
         if (cjz.a(this.b, $$0)) {
            this.b = cjz.a(this.b, $$0, 16);
         }
      }
   }
}
