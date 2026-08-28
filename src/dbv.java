import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import com.mojang.datafixers.util.Pair;
import it.unimi.dsi.fastutil.objects.ObjectArrayList;
import it.unimi.dsi.fastutil.objects.ObjectListIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import javax.annotation.Nullable;

public class dbv {
   private static final dbw a = new dbw();
   private static final int b = 16;
   private final boolean c;
   private final dbv.a d;
   private final aym e = aym.a();
   private final dcd f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bsd j;
   private final float k;
   private final bqw l;
   private final dbw m;
   private final lh n;
   private final lh o;
   private final jj<ave> p;
   private final ObjectArrayList<ja> q = new ObjectArrayList();
   private final Map<cmh, evz> r = Maps.newHashMap();

   public static bqw a(dcd $$0, @Nullable bsd $$1) {
      return $$0.aj().d($$1, b($$1));
   }

   public dbv(dcd $$0, @Nullable bsd $$1, double $$2, double $$3, double $$4, float $$5, List<ja> $$6, dbv.a $$7, lh $$8, lh $$9, jj<ave> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public dbv(dcd $$0, @Nullable bsd $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbv.a $$7, List<ja> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public dbv(dcd $$0, @Nullable bsd $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dbv.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, lj.w, lj.v, avf.ke);
   }

   public dbv(
      dcd $$0,
      @Nullable bsd $$1,
      @Nullable bqw $$2,
      @Nullable dbw $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      dbv.a $$9,
      lh $$10,
      lh $$11,
      jj<ave> $$12
   ) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.aj().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }

   private dbw a(@Nullable bsd $$0) {
      return (dbw)($$0 == null ? a : new dbt($$0));
   }

   public static float a(evz $$0, bsd $$1) {
      evu $$2 = $$1.cK();
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
                  double $$13 = aye.d($$10, $$2.a, $$2.d);
                  double $$14 = aye.d($$11, $$2.b, $$2.e);
                  double $$15 = aye.d($$12, $$2.c, $$2.f);
                  evz $$16 = new evz($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dP().a(new dbm($$16, $$0, dbm.a.a, dbm.b.a, $$1)).c() == evx.a.a) {
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

   public float a() {
      return this.k;
   }

   public evz b() {
      return new evz(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dxa.w, new evz(this.g, this.h, this.i));
      Set<ja> $$0 = Sets.newHashSet();
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
                     ja $$14 = ja.a($$10, $$11, $$12);
                     dsh $$15 = this.f.a_($$14);
                     eob $$16 = this.f.b_($$14);
                     if (!this.f.k($$14)) {
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

      this.q.addAll($$0);
      float $$18 = this.k * 2.0F;
      int $$19 = aye.a(this.g - (double)$$18 - 1.0);
      int $$20 = aye.a(this.g + (double)$$18 + 1.0);
      int $$21 = aye.a(this.h - (double)$$18 - 1.0);
      int $$22 = aye.a(this.h + (double)$$18 + 1.0);
      int $$23 = aye.a(this.i - (double)$$18 - 1.0);
      int $$24 = aye.a(this.i + (double)$$18 + 1.0);
      List<bsd> $$25 = this.f.a_(this.j, new evu((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      evz $$26 = new evz(this.g, this.h, this.i);

      for (bsd $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.du() - this.g;
               double $$30 = ($$27 instanceof cis ? $$27.dw() : $$27.dy()) - this.h;
               double $$31 = $$27.dA() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.m.a(this, $$27)) {
                     $$27.a(this.l, this.m.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27) * (double)this.m.a($$27);
                  double $$35;
                  if ($$27 instanceof bsy $$34) {
                     $$35 = $$33 * (1.0 - $$34.g(bug.i));
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  evz $$37 = new evz($$29, $$30, $$31);
                  $$27.h($$27.ds().e($$37));
                  if ($$27 instanceof cmh) {
                     cmh $$38 = (cmh)$$27;
                     if (!$$38.N_() && (!$$38.f() || !$$38.fZ().b)) {
                        this.r.put($$38, $$37);
                     }
                  }

                  $$27.a(this.j);
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, this.p.a(), avg.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         lh $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.ag().a("explosion_blocks");
         List<Pair<cua, ja>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            ja $$5 = (ja)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cua, ja> $$6 : $$4) {
            dff.a(this.f, (ja)$$6.getSecond(), (cua)$$6.getFirst());
         }

         this.f.ag().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            ja $$7 = (ja)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, des.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cua, ja>> $$0, cua $$1, ja $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cua, ja> $$4 = $$0.get($$3);
         cua $$5 = (cua)$$4.getFirst();
         if (cir.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cir.a($$5, $$1, 16), (ja)$$4.getSecond()));
            if ($$1.e()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != dbv.a.a;
   }

   public Map<cmh, evz> e() {
      return this.r;
   }

   @Nullable
   private static bsy b(@Nullable bsd $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cis $$1) {
         return $$1.p();
      } else if ($$0 instanceof bsy) {
         return (bsy)$$0;
      } else {
         if ($$0 instanceof cmz $$3) {
            bsd $$4 = $$3.s();
            if ($$4 instanceof bsy) {
               return (bsy)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bsy f() {
      return b(this.j);
   }

   @Nullable
   public bsd g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<ja> i() {
      return this.q;
   }

   public dbv.a j() {
      return this.d;
   }

   public lh k() {
      return this.n;
   }

   public lh l() {
      return this.o;
   }

   public jj<ave> m() {
      return this.p;
   }

   public boolean n() {
      if (this.d == dbv.a.d && !this.f.x_()) {
         return this.j != null && this.j.ak() == bsj.n ? this.f.ab().b(dbz.c) : true;
      } else {
         return false;
      }
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
