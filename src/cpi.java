import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class cpi {
   private static final cpj a = new cpj();
   private static final int b = 16;
   private final boolean c;
   private final cpi.a d;
   private final arx e = arx.a();
   private final cpq f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bil j;
   private final float k;
   private final bhj l;
   private final cpj m;
   private final ObjectArrayList<gw> n = new ObjectArrayList();
   private final Map<cbp, ehi> o = Maps.newHashMap();

   public cpi(cpq $$0, @Nullable bil $$1, double $$2, double $$3, double $$4, float $$5, List<gw> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cpi.a.c, $$6);
   }

   public cpi(cpq $$0, @Nullable bil $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpi.a $$7, List<gw> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cpi(cpq $$0, @Nullable bil $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpi.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cpi(cpq $$0, @Nullable bil $$1, @Nullable bhj $$2, @Nullable cpj $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cpi.a $$9) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.ag().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
   }

   private cpj a(@Nullable bil $$0) {
      return (cpj)($$0 == null ? a : new cpg($$0));
   }

   public static float a(ehi $$0, bil $$1) {
      ehd $$2 = $$1.cG();
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
                  double $$13 = ars.d($$10, $$2.a, $$2.d);
                  double $$14 = ars.d($$11, $$2.b, $$2.e);
                  double $$15 = ars.d($$12, $$2.c, $$2.f);
                  ehi $$16 = new ehi($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dK().a(new coz($$16, $$0, coz.a.a, coz.b.a, $$1)).c() == ehg.a.a) {
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

   public void a() {
      this.f.a(this.j, djo.w, new ehi(this.g, this.h, this.i));
      Set<gw> $$0 = Sets.newHashSet();
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
                  float $$9 = this.k * (0.7F + this.f.z.i() * 0.6F);
                  double $$10 = this.g;
                  double $$11 = this.h;
                  double $$12 = this.i;

                  for (float $$13 = 0.3F; $$9 > 0.0F; $$9 -= 0.22500001F) {
                     gw $$14 = gw.a($$10, $$11, $$12);
                     dfe $$15 = this.f.a_($$14);
                     eah $$16 = this.f.b_($$14);
                     if (!this.f.j($$14)) {
                        break;
                     }

                     Optional<Float> $$17 = this.m.a(this, this.f, $$14, $$15, $$16);
                     if ($$17.isPresent()) {
                        $$9 -= ($$17.get() + 0.3F) * 0.3F;
                     }

                     if ($$9 > 0.0F && this.m.a(this, this.f, $$14, $$15, $$9)) {
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

      this.n.addAll($$0);
      float $$18 = this.k * 2.0F;
      int $$19 = ars.a(this.g - (double)$$18 - 1.0);
      int $$20 = ars.a(this.g + (double)$$18 + 1.0);
      int $$21 = ars.a(this.h - (double)$$18 - 1.0);
      int $$22 = ars.a(this.h + (double)$$18 + 1.0);
      int $$23 = ars.a(this.i - (double)$$18 - 1.0);
      int $$24 = ars.a(this.i + (double)$$18 + 1.0);
      List<bil> $$25 = this.f.a_(this.j, new ehd((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ehi $$26 = new ehi(this.g, this.h, this.i);

      for (bil $$27 : $$25) {
         if (!$$27.cL()) {
            double $$28 = Math.sqrt($$27.e($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dp() - this.g;
               double $$30 = ($$27 instanceof byj ? $$27.dr() : $$27.dt()) - this.h;
               double $$31 = $$27.dv() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  double $$33 = (double)a($$26, $$27);
                  double $$34 = (1.0 - $$28) * $$33;
                  $$27.a(this.c(), (float)((int)(($$34 * $$34 + $$34) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$36;
                  if ($$27 instanceof bjb $$35) {
                     $$36 = cnw.a($$35, $$34);
                  } else {
                     $$36 = $$34;
                  }

                  $$29 *= $$36;
                  $$30 *= $$36;
                  $$31 *= $$36;
                  ehi $$38 = new ehi($$29, $$30, $$31);
                  $$27.f($$27.dn().e($$38));
                  if ($$27 instanceof cbp) {
                     cbp $$39 = (cbp)$$27;
                     if (!$$39.G_() && (!$$39.f() || !$$39.fR().b)) {
                        this.o.put($$39, $$38);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, aoz.iX, apa.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(ix.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(ix.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<cja, gw>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cbp;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            gw $$4 = (gw)var5.next();
            dfe $$5 = this.f.a_($$4);
            csq $$6 = $$5.b();
            if (!$$5.i()) {
               gw $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  cpq $$9 = this.f;
                  if ($$9 instanceof akn) {
                     akn $$8 = (akn)$$9;
                     dcq $$9x = $$5.t() ? this.f.c_($$4) : null;
                     ecr.a $$10 = new ecr.a($$8).a(eew.f, ehi.b($$4)).a(eew.i, cja.b).b(eew.h, $$9x).b(eew.a, this.j);
                     if (this.d == cpi.a.c) {
                        $$10.a(eew.j, this.k);
                     }

                     $$5.a($$8, $$4, cja.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, csr.a.n(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<cja, gw> $$11 = (Pair<cja, gw>)var5.next();
            csq.a(this.f, (gw)$$11.getSecond(), (cja)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            gw $$12 = (gw)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, cse.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != cpi.a.a;
   }

   private static void a(ObjectArrayList<Pair<cja, gw>> $$0, cja $$1, gw $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<cja, gw> $$5 = (Pair<cja, gw>)$$0.get($$4);
         cja $$6 = (cja)$$5.getFirst();
         if (byi.a($$6, $$1)) {
            cja $$7 = byi.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gw)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bhj c() {
      return this.l;
   }

   public Map<cbp, ehi> d() {
      return this.o;
   }

   @Nullable
   public bjb e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof byj $$0) {
         return $$0.j();
      } else {
         bil $$3 = this.j;
         if ($$3 instanceof bjb) {
            return (bjb)$$3;
         } else {
            if (this.j instanceof cch $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof bjb) {
                  return (bjb)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public bil f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<gw> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
