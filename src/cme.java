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

public class cme {
   private static final cmf a = new cmf();
   private static final int b = 16;
   private final boolean c;
   private final cme.a d;
   private final apf e = apf.a();
   private final cmm f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bfj j;
   private final float k;
   private final ben l;
   private final cmf m;
   private final ObjectArrayList<gu> n = new ObjectArrayList();
   private final Map<byo, eei> o = Maps.newHashMap();

   public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, List<gu> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, cme.a.c, $$6);
   }

   public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cme.a $$7, List<gu> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public cme(cmm $$0, @Nullable bfj $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, cme.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public cme(cmm $$0, @Nullable bfj $$1, @Nullable ben $$2, @Nullable cmf $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, cme.a $$9) {
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

   private cmf a(@Nullable bfj $$0) {
      return (cmf)($$0 == null ? a : new cmc($$0));
   }

   public static float a(eei $$0, bfj $$1) {
      eed $$2 = $$1.cE();
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
                  double $$13 = apa.d($$10, $$2.a, $$2.d);
                  double $$14 = apa.d($$11, $$2.b, $$2.e);
                  double $$15 = apa.d($$12, $$2.c, $$2.f);
                  eei $$16 = new eei($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dI().a(new clv($$16, $$0, clv.a.a, clv.b.a, $$1)).c() == eeg.a.a) {
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
      this.f.a(this.j, dgl.x, new eei(this.g, this.h, this.i));
      Set<gu> $$0 = Sets.newHashSet();
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
                     gu $$14 = gu.a($$10, $$11, $$12);
                     dcb $$15 = this.f.a_($$14);
                     dxe $$16 = this.f.b_($$14);
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
      int $$19 = apa.a(this.g - (double)$$18 - 1.0);
      int $$20 = apa.a(this.g + (double)$$18 + 1.0);
      int $$21 = apa.a(this.h - (double)$$18 - 1.0);
      int $$22 = apa.a(this.h + (double)$$18 + 1.0);
      int $$23 = apa.a(this.i - (double)$$18 - 1.0);
      int $$24 = apa.a(this.i + (double)$$18 + 1.0);
      List<bfj> $$25 = this.f.a_(this.j, new eed((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      eei $$26 = new eei(this.g, this.h, this.i);

      for (int $$27 = 0; $$27 < $$25.size(); $$27++) {
         bfj $$28 = $$25.get($$27);
         if (!$$28.cJ()) {
            double $$29 = Math.sqrt($$28.e($$26)) / (double)$$18;
            if ($$29 <= 1.0) {
               double $$30 = $$28.dn() - this.g;
               double $$31 = ($$28 instanceof bvi ? $$28.dp() : $$28.dr()) - this.h;
               double $$32 = $$28.dt() - this.i;
               double $$33 = Math.sqrt($$30 * $$30 + $$31 * $$31 + $$32 * $$32);
               if ($$33 != 0.0) {
                  $$30 /= $$33;
                  $$31 /= $$33;
                  $$32 /= $$33;
                  double $$34 = (double)a($$26, $$28);
                  double $$35 = (1.0 - $$29) * $$34;
                  $$28.a(this.c(), (float)((int)(($$35 * $$35 + $$35) / 2.0 * 7.0 * (double)$$18 + 1.0)));
                  double $$37;
                  if ($$28 instanceof bfz $$36) {
                     $$37 = ckt.a($$36, $$35);
                  } else {
                     $$37 = $$35;
                  }

                  $$30 *= $$37;
                  $$31 *= $$37;
                  $$32 *= $$37;
                  eei $$39 = new eei($$30, $$31, $$32);
                  $$28.f($$28.dl().e($$39));
                  if ($$28 instanceof byo) {
                     byo $$40 = (byo)$$28;
                     if (!$$40.G_() && (!$$40.f() || !$$40.fO().b)) {
                        this.o.put($$40, $$39);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, amh.iX, ami.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(iv.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(iv.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<cfz, gu>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof byo;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            gu $$4 = (gu)var5.next();
            dcb $$5 = this.f.a_($$4);
            cpn $$6 = $$5.b();
            if (!$$5.i()) {
               gu $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  cmm $$9 = this.f;
                  if ($$9 instanceof aif) {
                     aif $$8 = (aif)$$9;
                     czn $$9x = $$5.t() ? this.f.c_($$4) : null;
                     dzq.a $$10 = new dzq.a($$8).a(ebw.f, eei.b($$4)).a(ebw.i, cfz.b).b(ebw.h, $$9x).b(ebw.a, this.j);
                     if (this.d == cme.a.c) {
                        $$10.a(ebw.j, this.k);
                     }

                     $$5.a($$8, $$4, cfz.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, cpo.a.n(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<cfz, gu> $$11 = (Pair<cfz, gu>)var5.next();
            cpn.a(this.f, (gu)$$11.getSecond(), (cfz)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            gu $$12 = (gu)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, cpb.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != cme.a.a;
   }

   private static void a(ObjectArrayList<Pair<cfz, gu>> $$0, cfz $$1, gu $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<cfz, gu> $$5 = (Pair<cfz, gu>)$$0.get($$4);
         cfz $$6 = (cfz)$$5.getFirst();
         if (bvh.a($$6, $$1)) {
            cfz $$7 = bvh.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (gu)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public ben c() {
      return this.l;
   }

   public Map<byo, eei> d() {
      return this.o;
   }

   @Nullable
   public bfz e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof bvi $$0) {
         return $$0.j();
      } else {
         bfj $$3 = this.j;
         if ($$3 instanceof bfz) {
            return (bfz)$$3;
         } else {
            if (this.j instanceof bzg $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof bfz) {
                  return (bfz)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public bfj f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<gu> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
