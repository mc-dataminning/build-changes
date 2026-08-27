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

public class crk {
   private static final crl a = new crl();
   private static final int b = 16;
   private final boolean c;
   private final crk.a d;
   private final ato e = ato.a();
   private final crs f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bki j;
   private final float k;
   private final bjg l;
   private final crl m;
   private final ObjectArrayList<ht> n = new ObjectArrayList();
   private final Map<cdm, eji> o = Maps.newHashMap();

   public crk(crs $$0, @Nullable bki $$1, double $$2, double $$3, double $$4, float $$5, List<ht> $$6) {
      this($$0, $$1, $$2, $$3, $$4, $$5, false, crk.a.c, $$6);
   }

   public crk(crs $$0, @Nullable bki $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, crk.a $$7, List<ht> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.n.addAll($$8);
   }

   public crk(crs $$0, @Nullable bki $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, crk.a $$7) {
      this($$0, $$1, null, null, $$2, $$3, $$4, $$5, $$6, $$7);
   }

   public crk(crs $$0, @Nullable bki $$1, @Nullable bjg $$2, @Nullable crl $$3, double $$4, double $$5, double $$6, float $$7, boolean $$8, crk.a $$9) {
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

   private crl a(@Nullable bki $$0) {
      return (crl)($$0 == null ? a : new cri($$0));
   }

   public static float a(eji $$0, bki $$1) {
      ejd $$2 = $$1.cG();
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
                  double $$13 = ati.d($$10, $$2.a, $$2.d);
                  double $$14 = ati.d($$11, $$2.b, $$2.e);
                  double $$15 = ati.d($$12, $$2.c, $$2.f);
                  eji $$16 = new eji($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dL().a(new crb($$16, $$0, crb.a.a, crb.b.a, $$1)).c() == ejg.a.a) {
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
      this.f.a(this.j, dlg.w, new eji(this.g, this.h, this.i));
      Set<ht> $$0 = Sets.newHashSet();
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
                     ht $$14 = ht.a($$10, $$11, $$12);
                     dgw $$15 = this.f.a_($$14);
                     ecg $$16 = this.f.b_($$14);
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
      int $$19 = ati.a(this.g - (double)$$18 - 1.0);
      int $$20 = ati.a(this.g + (double)$$18 + 1.0);
      int $$21 = ati.a(this.h - (double)$$18 - 1.0);
      int $$22 = ati.a(this.h + (double)$$18 + 1.0);
      int $$23 = ati.a(this.i - (double)$$18 - 1.0);
      int $$24 = ati.a(this.i + (double)$$18 + 1.0);
      List<bki> $$25 = this.f.a_(this.j, new ejd((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      eji $$26 = new eji(this.g, this.h, this.i);

      for (bki $$27 : $$25) {
         if (!$$27.cL()) {
            double $$28 = Math.sqrt($$27.e($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dq() - this.g;
               double $$30 = ($$27 instanceof cag ? $$27.ds() : $$27.du()) - this.h;
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
                  if ($$27 instanceof bky $$35) {
                     $$36 = cpz.a($$35, $$34);
                  } else {
                     $$36 = $$34;
                  }

                  $$29 *= $$36;
                  $$30 *= $$36;
                  $$31 *= $$36;
                  eji $$38 = new eji($$29, $$30, $$31);
                  $$27.f($$27.do().e($$38));
                  if ($$27 instanceof cdm) {
                     cdm $$39 = (cdm)$$27;
                     if (!$$39.N_() && (!$$39.f() || !$$39.fT().b)) {
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
         this.f.a(this.g, this.h, this.i, aqn.jb, aqo.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.b();
      if ($$0) {
         if (!(this.k < 2.0F) && $$1) {
            this.f.a(js.w, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         } else {
            this.f.a(js.x, this.g, this.h, this.i, 1.0, 0.0, 0.0);
         }
      }

      if ($$1) {
         ObjectArrayList<Pair<clb, ht>> $$2 = new ObjectArrayList();
         boolean $$3 = this.e() instanceof cdm;
         ac.b(this.n, this.f.z);
         ObjectListIterator var5 = this.n.iterator();

         while (var5.hasNext()) {
            ht $$4 = (ht)var5.next();
            dgw $$5 = this.f.a_($$4);
            cut $$6 = $$5.b();
            if (!$$5.i()) {
               ht $$7 = $$4.i();
               this.f.ad().a("explosion_blocks");
               if ($$6.a(this)) {
                  crs $$9 = this.f;
                  if ($$9 instanceof ama) {
                     ama $$8 = (ama)$$9;
                     der $$9x = $$5.t() ? this.f.c_($$4) : null;
                     eer.a $$10 = new eer.a($$8).a(egw.f, eji.b($$4)).a(egw.i, clb.b).b(egw.h, $$9x).b(egw.a, this.j);
                     if (this.d == crk.a.c) {
                        $$10.a(egw.j, this.k);
                     }

                     $$5.a($$8, $$4, clb.b, $$3);
                     $$5.a($$10).forEach($$2x -> a($$2, $$2x, $$7));
                  }
               }

               this.f.a($$4, cuv.a.o(), 3);
               $$6.a(this.f, $$4, this);
               this.f.ad().c();
            }
         }

         var5 = $$2.iterator();

         while (var5.hasNext()) {
            Pair<clb, ht> $$11 = (Pair<clb, ht>)var5.next();
            cut.a(this.f, (ht)$$11.getSecond(), (clb)$$11.getFirst());
         }
      }

      if (this.c) {
         ObjectListIterator var13 = this.n.iterator();

         while (var13.hasNext()) {
            ht $$12 = (ht)var13.next();
            if (this.e.a(3) == 0 && this.f.a_($$12).i() && this.f.a_($$12.d()).i(this.f, $$12.d())) {
               this.f.b($$12, cug.a(this.f, $$12));
            }
         }
      }
   }

   public boolean b() {
      return this.d != crk.a.a;
   }

   private static void a(ObjectArrayList<Pair<clb, ht>> $$0, clb $$1, ht $$2) {
      int $$3 = $$0.size();

      for (int $$4 = 0; $$4 < $$3; $$4++) {
         Pair<clb, ht> $$5 = (Pair<clb, ht>)$$0.get($$4);
         clb $$6 = (clb)$$5.getFirst();
         if (caf.a($$6, $$1)) {
            clb $$7 = caf.a($$6, $$1, 16);
            $$0.set($$4, Pair.of($$7, (ht)$$5.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public bjg c() {
      return this.l;
   }

   public Map<cdm, eji> d() {
      return this.o;
   }

   @Nullable
   public bky e() {
      if (this.j == null) {
         return null;
      } else if (this.j instanceof cag $$0) {
         return $$0.q();
      } else {
         bki $$3 = this.j;
         if ($$3 instanceof bky) {
            return (bky)$$3;
         } else {
            if (this.j instanceof cee $$2) {
               $$3 = $$2.v();
               if ($$3 instanceof bky) {
                  return (bky)$$3;
               }
            }

            return null;
         }
      }
   }

   @Nullable
   public bki f() {
      return this.j;
   }

   public void g() {
      this.n.clear();
   }

   public List<ht> h() {
      return this.n;
   }

   public static enum a {
      a,
      b,
      c;
   }
}
