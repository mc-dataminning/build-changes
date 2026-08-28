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

public class dcm {
   private static final dcn a = new dcn();
   private static final int b = 16;
   private final boolean c;
   private final dcm.a d;
   private final ayv e = ayv.a();
   private final dcu f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final bsq j;
   private final float k;
   private final brj l;
   private final dcn m;
   private final lk n;
   private final lk o;
   private final jm<avn> p;
   private final ObjectArrayList<jd> q = new ObjectArrayList();
   private final Map<cmv, eww> r = Maps.newHashMap();

   public static brj a(dcu $$0, @Nullable bsq $$1) {
      return $$0.aj().d($$1, b($$1));
   }

   public dcm(dcu $$0, @Nullable bsq $$1, double $$2, double $$3, double $$4, float $$5, List<jd> $$6, dcm.a $$7, lk $$8, lk $$9, jm<avn> $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public dcm(dcu $$0, @Nullable bsq $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dcm.a $$7, List<jd> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public dcm(dcu $$0, @Nullable bsq $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, dcm.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, lm.w, lm.v, avo.ke);
   }

   public dcm(
      dcu $$0,
      @Nullable bsq $$1,
      @Nullable brj $$2,
      @Nullable dcn $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      dcm.a $$9,
      lk $$10,
      lk $$11,
      jm<avn> $$12
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

   private dcn a(@Nullable bsq $$0) {
      return (dcn)($$0 == null ? a : new dck($$0));
   }

   public static float a(eww $$0, bsq $$1) {
      ewr $$2 = $$1.cL();
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
                  double $$13 = ayn.d($$10, $$2.a, $$2.d);
                  double $$14 = ayn.d($$11, $$2.b, $$2.e);
                  double $$15 = ayn.d($$12, $$2.c, $$2.f);
                  eww $$16 = new eww($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dQ().a(new dcd($$16, $$0, dcd.a.a, dcd.b.a, $$1)).c() == ewu.a.a) {
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

   public eww b() {
      return new eww(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dxw.w, new eww(this.g, this.h, this.i));
      Set<jd> $$0 = Sets.newHashSet();
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
                     jd $$14 = jd.a($$10, $$11, $$12);
                     dta $$15 = this.f.a_($$14);
                     eoy $$16 = this.f.b_($$14);
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
      int $$19 = ayn.a(this.g - (double)$$18 - 1.0);
      int $$20 = ayn.a(this.g + (double)$$18 + 1.0);
      int $$21 = ayn.a(this.h - (double)$$18 - 1.0);
      int $$22 = ayn.a(this.h + (double)$$18 + 1.0);
      int $$23 = ayn.a(this.i - (double)$$18 - 1.0);
      int $$24 = ayn.a(this.i + (double)$$18 + 1.0);
      List<bsq> $$25 = this.f.a_(this.j, new ewr((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      eww $$26 = new eww(this.g, this.h, this.i);

      for (bsq $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.g($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dv() - this.g;
               double $$30 = ($$27 instanceof cjg ? $$27.dx() : $$27.dz()) - this.h;
               double $$31 = $$27.dB() - this.i;
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
                  if ($$27 instanceof btl $$34) {
                     $$35 = $$33 * (1.0 - $$34.g(buu.i));
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  eww $$37 = new eww($$29, $$30, $$31);
                  $$27.i($$27.dt().e($$37));
                  if ($$27 instanceof cmv) {
                     cmv $$38 = (cmv)$$27;
                     if (!$$38.N_() && (!$$38.f() || !$$38.ga().b)) {
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
         this.f.a(this.g, this.h, this.i, this.p.a(), avp.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         lk $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.ag().a("explosion_blocks");
         List<Pair<cuo, jd>> $$4 = new ArrayList<>();
         ad.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            jd $$5 = (jd)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cuo, jd> $$6 : $$4) {
            dfw.a(this.f, (jd)$$6.getSecond(), (cuo)$$6.getFirst());
         }

         this.f.ag().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            jd $$7 = (jd)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, dfj.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cuo, jd>> $$0, cuo $$1, jd $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cuo, jd> $$4 = $$0.get($$3);
         cuo $$5 = (cuo)$$4.getFirst();
         if (cjf.a($$5, $$1)) {
            $$0.set($$3, Pair.of(cjf.a($$5, $$1, 16), (jd)$$4.getSecond()));
            if ($$1.e()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != dcm.a.a;
   }

   public Map<cmv, eww> e() {
      return this.r;
   }

   @Nullable
   private static btl b(@Nullable bsq $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof cjg $$1) {
         return $$1.p();
      } else if ($$0 instanceof btl) {
         return (btl)$$0;
      } else {
         if ($$0 instanceof cnn $$3) {
            bsq $$4 = $$3.s();
            if ($$4 instanceof btl) {
               return (btl)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public btl f() {
      return b(this.j);
   }

   @Nullable
   public bsq g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<jd> i() {
      return this.q;
   }

   public dcm.a j() {
      return this.d;
   }

   public lk k() {
      return this.n;
   }

   public lk l() {
      return this.o;
   }

   public jm<avn> m() {
      return this.p;
   }

   public boolean n() {
      if (this.d == dcm.a.d && !this.f.x_()) {
         return this.j != null && this.j.am() == bsw.n ? this.f.ab().b(dcq.c) : true;
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
