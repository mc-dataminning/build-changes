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

public class ctp {
   private static final ctq a = new ctq();
   private static final int b = 16;
   private final boolean c;
   private final ctp.a d;
   private final auw e = auw.a();
   private final ctx f;
   private final double g;
   private final double h;
   private final double i;
   @Nullable
   private final blw j;
   private final float k;
   private final bkv l;
   private final ctq m;
   private final jv n;
   private final jv o;
   private final ars p;
   private final ObjectArrayList<hx> q = new ObjectArrayList();
   private final Map<cfq, emc> r = Maps.newHashMap();

   public static bkv a(ctx $$0, @Nullable blw $$1) {
      return $$0.ai().d($$1, b($$1));
   }

   public ctp(ctx $$0, @Nullable blw $$1, double $$2, double $$3, double $$4, float $$5, List<hx> $$6, ctp.a $$7, jv $$8, jv $$9, ars $$10) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, false, $$7, $$8, $$9, $$10);
      this.q.addAll($$6);
   }

   public ctp(ctx $$0, @Nullable blw $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, ctp.a $$7, List<hx> $$8) {
      this($$0, $$1, $$2, $$3, $$4, $$5, $$6, $$7);
      this.q.addAll($$8);
   }

   public ctp(ctx $$0, @Nullable blw $$1, double $$2, double $$3, double $$4, float $$5, boolean $$6, ctp.a $$7) {
      this($$0, $$1, a($$0, $$1), null, $$2, $$3, $$4, $$5, $$6, $$7, jx.x, jx.w, art.jP);
   }

   public ctp(
      ctx $$0,
      @Nullable blw $$1,
      @Nullable bkv $$2,
      @Nullable ctq $$3,
      double $$4,
      double $$5,
      double $$6,
      float $$7,
      boolean $$8,
      ctp.a $$9,
      jv $$10,
      jv $$11,
      ars $$12
   ) {
      this.f = $$0;
      this.j = $$1;
      this.k = $$7;
      this.g = $$4;
      this.h = $$5;
      this.i = $$6;
      this.c = $$8;
      this.d = $$9;
      this.l = $$2 == null ? $$0.ai().a(this) : $$2;
      this.m = $$3 == null ? this.a($$1) : $$3;
      this.n = $$10;
      this.o = $$11;
      this.p = $$12;
   }

   private ctq a(@Nullable blw $$0) {
      return (ctq)($$0 == null ? a : new ctn($$0));
   }

   public static float a(emc $$0, blw $$1) {
      elx $$2 = $$1.cH();
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
                  double $$13 = aup.d($$10, $$2.a, $$2.d);
                  double $$14 = aup.d($$11, $$2.b, $$2.e);
                  double $$15 = aup.d($$12, $$2.c, $$2.f);
                  emc $$16 = new emc($$13 + $$6, $$14, $$15 + $$7);
                  if ($$1.dL().a(new ctg($$16, $$0, ctg.a.a, ctg.b.a, $$1)).c() == ema.a.a) {
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

   public emc b() {
      return new emc(this.g, this.h, this.i);
   }

   public void c() {
      this.f.a(this.j, dnz.w, new emc(this.g, this.h, this.i));
      Set<hx> $$0 = Sets.newHashSet();
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
                     hx $$14 = hx.a($$10, $$11, $$12);
                     djp $$15 = this.f.a_($$14);
                     eez $$16 = this.f.b_($$14);
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
      int $$19 = aup.a(this.g - (double)$$18 - 1.0);
      int $$20 = aup.a(this.g + (double)$$18 + 1.0);
      int $$21 = aup.a(this.h - (double)$$18 - 1.0);
      int $$22 = aup.a(this.h + (double)$$18 + 1.0);
      int $$23 = aup.a(this.i - (double)$$18 - 1.0);
      int $$24 = aup.a(this.i + (double)$$18 + 1.0);
      List<blw> $$25 = this.f.a_(this.j, new elx((double)$$19, (double)$$21, (double)$$23, (double)$$20, (double)$$22, (double)$$24));
      emc $$26 = new emc(this.g, this.h, this.i);

      for (blw $$27 : $$25) {
         if (!$$27.a(this)) {
            double $$28 = Math.sqrt($$27.f($$26)) / (double)$$18;
            if ($$28 <= 1.0) {
               double $$29 = $$27.dq() - this.g;
               double $$30 = ($$27 instanceof ccc ? $$27.ds() : $$27.du()) - this.h;
               double $$31 = $$27.dw() - this.i;
               double $$32 = Math.sqrt($$29 * $$29 + $$30 * $$30 + $$31 * $$31);
               if ($$32 != 0.0) {
                  $$29 /= $$32;
                  $$30 /= $$32;
                  $$31 /= $$32;
                  if (this.m.a(this, $$27)) {
                     $$27.a(this.l, this.m.b(this, $$27));
                  }

                  double $$33 = (1.0 - $$28) * (double)a($$26, $$27);
                  double $$35;
                  if ($$27 instanceof bmo $$34) {
                     $$35 = cse.a($$34, $$33);
                  } else {
                     $$35 = $$33;
                  }

                  $$29 *= $$35;
                  $$30 *= $$35;
                  $$31 *= $$35;
                  emc $$37 = new emc($$29, $$30, $$31);
                  $$27.g($$27.do().e($$37));
                  if ($$27 instanceof cfq) {
                     cfq $$38 = (cfq)$$27;
                     if (!$$38.P_() && (!$$38.f() || !$$38.fT().b)) {
                        this.r.put($$38, $$37);
                     }
                  }
               }
            }
         }
      }
   }

   public void a(boolean $$0) {
      if (this.f.B) {
         this.f.a(this.g, this.h, this.i, this.p, aru.e, 4.0F, (1.0F + (this.f.z.i() - this.f.z.i()) * 0.2F) * 0.7F, false);
      }

      boolean $$1 = this.d();
      if ($$0) {
         jv $$3;
         if (!(this.k < 2.0F) && $$1) {
            $$3 = this.o;
         } else {
            $$3 = this.n;
         }

         this.f.a($$3, this.g, this.h, this.i, 1.0, 0.0, 0.0);
      }

      if ($$1) {
         this.f.af().a("explosion_blocks");
         List<Pair<cng, hx>> $$4 = new ArrayList<>();
         ac.c(this.q, this.f.z);
         ObjectListIterator $$7 = this.q.iterator();

         while ($$7.hasNext()) {
            hx $$5 = (hx)$$7.next();
            this.f.a_($$5).a(this.f, $$5, this, ($$1x, $$2) -> a($$4, $$1x, $$2));
         }

         for (Pair<cng, hx> $$6 : $$4) {
            cwy.a(this.f, (hx)$$6.getSecond(), (cng)$$6.getFirst());
         }

         this.f.af().c();
      }

      if (this.c) {
         ObjectListIterator var7 = this.q.iterator();

         while (var7.hasNext()) {
            hx $$7 = (hx)var7.next();
            if (this.e.a(3) == 0 && this.f.a_($$7).i() && this.f.a_($$7.d()).i(this.f, $$7.d())) {
               this.f.b($$7, cwl.a(this.f, $$7));
            }
         }
      }
   }

   private static void a(List<Pair<cng, hx>> $$0, cng $$1, hx $$2) {
      for (int $$3 = 0; $$3 < $$0.size(); $$3++) {
         Pair<cng, hx> $$4 = $$0.get($$3);
         cng $$5 = (cng)$$4.getFirst();
         if (ccb.a($$5, $$1)) {
            $$0.set($$3, Pair.of(ccb.a($$5, $$1, 16), (hx)$$4.getSecond()));
            if ($$1.b()) {
               return;
            }
         }
      }

      $$0.add(Pair.of($$1, $$2));
   }

   public boolean d() {
      return this.d != ctp.a.a;
   }

   public Map<cfq, emc> e() {
      return this.r;
   }

   @Nullable
   private static bmo b(@Nullable blw $$0) {
      if ($$0 == null) {
         return null;
      } else if ($$0 instanceof ccc $$1) {
         return $$1.q();
      } else if ($$0 instanceof bmo) {
         return (bmo)$$0;
      } else {
         if ($$0 instanceof cgi $$3) {
            blw $$4 = $$3.w();
            if ($$4 instanceof bmo) {
               return (bmo)$$4;
            }
         }

         return null;
      }
   }

   @Nullable
   public bmo f() {
      return b(this.j);
   }

   @Nullable
   public blw g() {
      return this.j;
   }

   public void h() {
      this.q.clear();
   }

   public List<hx> i() {
      return this.q;
   }

   public ctp.a j() {
      return this.d;
   }

   public jv k() {
      return this.n;
   }

   public jv l() {
      return this.o;
   }

   public ars m() {
      return this.p;
   }

   public static enum a {
      a,
      b,
      c,
      d;
   }
}
