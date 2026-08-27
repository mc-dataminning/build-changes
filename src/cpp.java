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

public class cpp {
   private static final cpq a = new cpq();
   private static final int b = 16;
   private final boolean c;
   private final cpp.a d;
   private final ase e = ase.a();
   private final cpx f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bis j;
   private final float k;
   private final bhq l;
   private final cpq m;
   private final ObjectArrayList<gw> n = new ObjectArrayList();
   private final Map<cbw, ehp> o = Maps.newHashMap();

   public cpp(cpx $$0, @Nullable bis $$1, double $$2, double $$3, double $$4, float $$5, List<gw> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cpp.a.c, $$6);
   }

   public cpp(cpx $$0, @Nullable bis $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpp.a $$7, List<gw> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cpp(cpx $$0, @Nullable bis $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cpp.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cpp(cpx $$0, @Nullable bis $$1, @Nullable bhq $$2, @Nullable cpq $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cpp.a $$9) {
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

   private cpq a(@Nullable bis $$0) {
      return (cpq)($$0 == null ? a : new cpn($$0));
   }

   public static float a(ehp $$0, bis $$1) {
      ehk $$2 = $$1.cG();
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
                  double $$13 = ary.d($$10, $$2.a, $$2.d);
                  double $$14 = ary.d($$11, $$2.b, $$2.e);
                  double $$15 = ary.d($$12, $$2.c, $$2.f);
                  ehp $$16 = new ehp($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dL().a(new cpg($$16, $$0, cpg.a.a, cpg.b.a, $$1)).c() == ehn.a.a) {
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
      this.f.a(this.j, djv.w, new ehp(this.g, this.h, this.i));
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
                     dfl $$15 = this.f.a_($$14);
                     eao $$16 = this.f.b_($$14);
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
      int $$19 = ary.a(this.g - (double)$$18 - 1.0);
      int $$20 = ary.a(this.g + (double)$$18 + 1.0);
      int $$21 = ary.a(this.h - (double)$$18 - 1.0);
      int $$22 = ary.a(this.h + (double)$$18 + 1.0);
      int $$23 = ary.a(this.i - (double)$$18 - 1.0);
      int $$24 = ary.a(this.i + (double)$$18 + 1.0);
      List<bis> $$25 = this.f.a_(this.j, new ehk((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      ehp $$26 = new ehp(this.g, this.h, this.i);

      for (bis $$27 : $$25) {
         if (!$$27.cL()) {
            double $$28 = Math.sqrt($$27.e($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dq() - this.g;
               double $$30 = ($$27 instanceof byq ? $$27.ds() : $$27.du()) - this.h;
               double $$31 = $$27.dw() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  double $$33 = (double)a($$26, $$27);
                  double $$34 = (1.0 - $$28) * $$33;
                  $$27.a(this.c(), (float)((int)(($$34 * $$34 + $$34) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$36;
                  if ($$27 instanceof bji $$35) {
                     $$36 = cod.a($$35, $$34);
                  } else {
                     $$36 = $$34;
                  }

                  $$29 *= $$36;
                  $$30 *= $$36;
                  $$31 *= $$36;
                  ehp $$38 = new ehp($$29, $$30, $$31);
                  $$27.f($$27.do().e($$38));
                  if ($$27 instanceof cbw) {
                     cbw $$39 = (cbw)$$27;
                     if (!$$39.M_() && (!$$39.f() || !$$39.fS().b)) {
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
         this.f.a(this.g, this.h, this.i, apf.iX, apg.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
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
         ObjectArrayList<Pair<cjh, gw>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cbw;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            gw $$4 = (gw)var5.next();
            dfl $$5 = this.f.a_($$4);
            csx $$6 = $$5.b();
            if (!$$5.i()) {
               gw $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  cpx $$9 = this.f;
                  if ($$9 instanceof aks) {
                     aks $$8 = (aks)$$9;
                     dcx $$9x = $$5.t() ? this.f.c_($$4) : null;
                     ecy.a $$10 = new ecy.a($$8).a(efd.f, ehp.b($$4)).a(efd.i, cjh.b).b(efd.h, $$9x).b(efd.a, this.j);
                     if (this.d == cpp.a.c) {
                        $$10.a(efd.j, this.k);
                     }

                     $$5.a($$8, $$4, cjh.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, csy.a.n(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<cjh, gw> $$11 = (Pair<cjh, gw>)var5.next();
            csx.a(this.f, (gw)$$11.getSecond(), (cjh)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            gw $$12 = (gw)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, csl.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != cpp.a.a;
   }

   private static void a(ObjectArrayList<Pair<cjh, gw>> $$0, cjh $$1, gw $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<cjh, gw> $$5 = (Pair<cjh, gw>)$$0.get($$4);
         cjh $$6 = (cjh)$$5.getFirst();
         if (byp.a($$6, $$1)) {
            cjh $$7 = byp.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gw)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bhq c() {
      return this.l;
   }

   public Map<cbw, ehp> d() {
      return this.o;
   }

   @Nullable
   public bji e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof byq $$0) {
         return $$0.q();
      } else {
         bis $$3 = this.j;
         if ($$3 instanceof bji) {
            return (bji)$$3;
         } else {
            if (this.j instanceof cco $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof bji) {
                  return (bji)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public bis f() {
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
