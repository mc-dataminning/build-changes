import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ejb {
   private static final Logger a = LogUtils.getLogger();
   protected static final dsl e = dfk.nc.o();
   protected eip f;
   @Nullable
   private jf b;
   private dkf c;
   private dlv d;
   protected int g;
   private final ejo h;
   private static final Set<dfi> i = ImmutableSet.builder()
      .add(dfk.fo)
      .add(dfk.cp)
      .add(dfk.cq)
      .add(dfk.dU)
      .add(dfk.kd)
      .add(dfk.ki)
      .add(dfk.kg)
      .add(dfk.ke)
      .add(dfk.kf)
      .add(dfk.cO)
      .add(dfk.eW)
      .build();

   protected ejb(ejo $$0, int $$1, eip $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ejb(ejo $$0, tx $$1) {
      this($$0, $$1.h("GD"), (eip)eip.a.parse(ul.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jf.b($$2));
   }

   protected static eip a(int $$0, int $$1, int $$2, jf $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jf.a.c
         ? new eip($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eip($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jf a(ayo $$0) {
      return jf.c.a.a($$0);
   }

   public final tx a(ejn $$0) {
      tx $$1 = new tx();
      $$1.a("id", lq.Q.b(this.k()).toString());
      eip.a.encodeStart(ul.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jf $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ejn var1, tx var2);

   public void a(ejb $$0, ejc $$1, ayo $$2) {
   }

   public abstract void a(ddc var1, dda var2, dui var3, ayo var4, eip var5, dbn var6, ja var7);

   public eip f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dbn $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ja h() {
      return new ja(this.f.g());
   }

   protected ja.a b(int $$0, int $$1, int $$2) {
      return new ja.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jf $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch ($$2) {
            case c:
            case d:
               return this.f.h() + $$0;
            case e:
               return this.f.k() - $$1;
            case f:
               return this.f.h() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.i();
   }

   protected int b(int $$0, int $$1) {
      jf $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch ($$2) {
            case c:
               return this.f.m() - $$1;
            case d:
               return this.f.j() + $$1;
            case e:
            case f:
               return this.f.j() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(ddc $$0, dsl $$1, int $$2, int $$3, int $$4, eip $$5) {
      ja $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcj)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dkf.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dlv.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eoj $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcj $$0, int $$1, int $$2, int $$3, eip $$4) {
      return true;
   }

   protected dsl a(dbm $$0, int $$1, int $$2, int $$3, eip $$4) {
      ja $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dfk.a.o() : $$0.a_($$5);
   }

   protected boolean b(dcj $$0, int $$1, int $$2, int $$3, eip $$4) {
      ja $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dyg.a.c, $$5.u(), $$5.w());
   }

   protected void a(ddc $$0, eip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dfk.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(ddc $$0, eip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dsl $$8, dsl $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dbm)$$0, $$12, $$11, $$13, $$1).i()) {
                  if ($$11 != $$3 && $$11 != $$6 && $$12 != $$2 && $$12 != $$5 && $$13 != $$4 && $$13 != $$7) {
                     this.a($$0, $$9, $$12, $$11, $$13, $$1);
                  } else {
                     this.a($$0, $$8, $$12, $$11, $$13, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(ddc $$0, eip $$1, eip $$2, dsl $$3, dsl $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ddc $$0, eip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayo $$9, ejb.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dbm)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(ddc $$0, eip $$1, eip $$2, boolean $$3, ayo $$4, ejb.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ddc $$0, eip $$1, ayo $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dsl $$10, dsl $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dbm)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
                  if ($$14 != $$5 && $$14 != $$8 && $$15 != $$4 && $$15 != $$7 && $$16 != $$6 && $$16 != $$9) {
                     this.a($$0, $$11, $$15, $$14, $$16, $$1);
                  } else {
                     this.a($$0, $$10, $$15, $$14, $$16, $$1);
                  }
               }
            }
         }
      }
   }

   protected void a(ddc $$0, eip $$1, ayo $$2, float $$3, int $$4, int $$5, int $$6, dsl $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(ddc $$0, eip $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dsl $$8, boolean $$9) {
      float $$10 = (float)($$5 - $$2 + 1);
      float $$11 = (float)($$6 - $$3 + 1);
      float $$12 = (float)($$7 - $$4 + 1);
      float $$13 = (float)$$2 + $$10 / 2.0F;
      float $$14 = (float)$$4 + $$12 / 2.0F;

      for (int $$15 = $$3; $$15 <= $$6; $$15++) {
         float $$16 = (float)($$15 - $$3) / $$11;

         for (int $$17 = $$2; $$17 <= $$5; $$17++) {
            float $$18 = ((float)$$17 - $$13) / ($$10 * 0.5F);

            for (int $$19 = $$4; $$19 <= $$7; $$19++) {
               float $$20 = ((float)$$19 - $$14) / ($$12 * 0.5F);
               if (!$$9 || !this.a((dbm)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(ddc $$0, dsl $$1, int $$2, int $$3, int $$4, eip $$5) {
      ja.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jf.a);
         }
      }
   }

   protected boolean a(dsl $$0) {
      return $$0.i() || $$0.k() || $$0.a(dfk.fg) || $$0.a(dfk.bw) || $$0.a(dfk.bx);
   }

   protected boolean a(ddc $$0, eip $$1, ayo $$2, int $$3, int $$4, int $$5, akj<erb> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dsl a(dbm $$0, ja $$1, dsl $$2) {
      jf $$3 = null;

      for (jf $$4 : jf.c.a) {
         ja $$5 = $$1.a($$4);
         dsl $$6 = $$0.a_($$5);
         if ($$6.a(dfk.cv)) {
            return $$2;
         }

         if ($$6.i($$0, $$5)) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.a(dje.aE, $$3.g());
      } else {
         jf $$7 = $$2.c(dje.aE);
         ja $$8 = $$1.a($$7);
         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).i($$0, $$8)) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.a(dje.aE, $$7);
      }
   }

   protected boolean a(dcv $$0, eip $$1, ayo $$2, ja $$3, akj<erb> $$4, @Nullable dsl $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dfk.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dfk.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dpq $$6 = $$0.c_($$3);
         if ($$6 instanceof dpx) {
            ((dpx)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(ddc $$0, eip $$1, ayo $$2, int $$3, int $$4, int $$5, jf $$6, akj<erb> $$7) {
      ja $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dfk.aU)) {
         this.a($$0, dfk.aU.o().a(dhn.b, $$6), $$3, $$4, $$5, $$1);
         dpq $$9 = $$0.c_($$8);
         if ($$9 instanceof dqj) {
            ((dqj)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eip a(Stream<ejb> $$0) {
      return eip.b($$0.map(ejb::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ejb a(List<ejb> $$0, eip $$1) {
      for (ejb $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jf i() {
      return this.b;
   }

   public void a(@Nullable jf $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dlv.a;
         this.c = dkf.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dkf.b;
               this.d = dlv.a;
               break;
            case e:
               this.c = dkf.b;
               this.d = dlv.b;
               break;
            case f:
               this.c = dkf.a;
               this.d = dlv.b;
               break;
            default:
               this.c = dkf.a;
               this.d = dlv.a;
         }
      }
   }

   public dlv a() {
      return this.d;
   }

   public dkf j() {
      return this.c;
   }

   public ejo k() {
      return this.h;
   }

   public abstract static class a {
      protected dsl a = dfk.a.o();

      public abstract void a(ayo var1, int var2, int var3, int var4, boolean var5);

      public dsl a() {
         return this.a;
      }
   }
}
