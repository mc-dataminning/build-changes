import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dvg {
   private static final Logger a = LogUtils.getLogger();
   protected static final dfd e = cte.nc.o();
   protected duu f;
   @Nullable
   private ha b;
   private cxx c;
   private czn d;
   protected int g;
   private final dvt h;
   private static final Set<ctc> i = ImmutableSet.builder()
      .add(cte.fo)
      .add(cte.cp)
      .add(cte.cq)
      .add(cte.dU)
      .add(cte.kd)
      .add(cte.ki)
      .add(cte.kg)
      .add(cte.ke)
      .add(cte.kf)
      .add(cte.cO)
      .add(cte.eW)
      .build();

   protected dvg(dvt $$0, int $$1, duu $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dvg(dvt $$0, qw $$1) {
      this(
         $$0, $$1.h("GD"), (duu)duu.a.parse(ri.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ha.b($$2));
   }

   protected static duu a(int $$0, int $$1, int $$2, ha $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ha.a.c
         ? new duu($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new duu($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ha a(ash $$0) {
      return ha.c.a.a($$0);
   }

   public final qw a(dvs $$0) {
      qw $$1 = new qw();
      $$1.a("id", jb.T.b(this.k()).toString());
      duu.a.encodeStart(ri.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ha $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dvs var1, qw var2);

   public void a(dvg $$0, dvh $$1, ash $$2) {
   }

   public abstract void a(cqv var1, cqt var2, dha var3, ash var4, duu var5, cpi var6, gw var7);

   public duu f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cpi $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public gw h() {
      return new gw(this.f.f());
   }

   protected gw.a b(int $$0, int $$1, int $$2) {
      return new gw.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ha $$2 = this.i();
      if ($$2 == null) {
         return $$0;
      } else {
         switch ($$2) {
            case c:
            case d:
               return this.f.g() + $$0;
            case e:
               return this.f.j() - $$1;
            case f:
               return this.f.g() + $$1;
            default:
               return $$0;
         }
      }
   }

   protected int b(int $$0) {
      return this.i() == null ? $$0 : $$0 + this.f.h();
   }

   protected int b(int $$0, int $$1) {
      ha $$2 = this.i();
      if ($$2 == null) {
         return $$1;
      } else {
         switch ($$2) {
            case c:
               return this.f.l() - $$1;
            case d:
               return this.f.i() + $$1;
            case e:
            case f:
               return this.f.i() + $$0;
            default:
               return $$1;
         }
      }
   }

   protected void a(cqv $$0, dfd $$1, int $$2, int $$3, int $$4, duu $$5) {
      gw $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cqe)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cxx.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != czn.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eag $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cqe $$0, int $$1, int $$2, int $$3, duu $$4) {
      return true;
   }

   protected dfd a(cph $$0, int $$1, int $$2, int $$3, duu $$4) {
      gw $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cte.a.o() : $$0.a_($$5);
   }

   protected boolean b(cqe $$0, int $$1, int $$2, int $$3, duu $$4) {
      gw $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dkm.a.c, $$5.u(), $$5.w());
   }

   protected void a(cqv $$0, duu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cte.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cqv $$0, duu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfd $$8, dfd $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cph)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cqv $$0, duu $$1, duu $$2, dfd $$3, dfd $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqv $$0, duu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ash $$9, dvg.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cph)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cqv $$0, duu $$1, duu $$2, boolean $$3, ash $$4, dvg.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqv $$0, duu $$1, ash $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dfd $$10, dfd $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cph)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cqv $$0, duu $$1, ash $$2, float $$3, int $$4, int $$5, int $$6, dfd $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cqv $$0, duu $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfd $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cph)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cqv $$0, dfd $$1, int $$2, int $$3, int $$4, duu $$5) {
      gw.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.H_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ha.a);
         }
      }
   }

   protected boolean a(dfd $$0) {
      return $$0.i() || $$0.k() || $$0.a(cte.fg) || $$0.a(cte.bw) || $$0.a(cte.bx);
   }

   protected boolean a(cqv $$0, duu $$1, ash $$2, int $$3, int $$4, int $$5, aez $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dfd a(cph $$0, gw $$1, dfd $$2) {
      ha $$3 = null;

      for (ha $$4 : ha.c.a) {
         gw $$5 = $$1.a($$4);
         dfd $$6 = $$0.a_($$5);
         if ($$6.a(cte.cv)) {
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
         return $$2.a(cww.aE, $$3.g());
      } else {
         ha $$7 = $$2.c(cww.aE);
         gw $$8 = $$1.a($$7);
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

         return $$2.a(cww.aE, $$7);
      }
   }

   protected boolean a(cqq $$0, duu $$1, ash $$2, gw $$3, aez $$4, @Nullable dfd $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cte.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cte.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dcz $$6 = $$0.c_($$3);
         if ($$6 instanceof ddg) {
            ((ddg)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cqv $$0, duu $$1, ash $$2, int $$3, int $$4, int $$5, ha $$6, aez $$7) {
      gw $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cte.aU)) {
         this.a($$0, cte.aU.o().a(cvf.b, $$6), $$3, $$4, $$5, $$1);
         dcz $$9 = $$0.c_($$8);
         if ($$9 instanceof ddq) {
            ((ddq)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static duu a(Stream<dvg> $$0) {
      return duu.b($$0.map(dvg::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dvg a(List<dvg> $$0, duu $$1) {
      for (dvg $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ha i() {
      return this.b;
   }

   public void a(@Nullable ha $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = czn.a;
         this.c = cxx.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cxx.b;
               this.d = czn.a;
               break;
            case e:
               this.c = cxx.b;
               this.d = czn.b;
               break;
            case f:
               this.c = cxx.a;
               this.d = czn.b;
               break;
            default:
               this.c = cxx.a;
               this.d = czn.a;
         }
      }
   }

   public czn a() {
      return this.d;
   }

   public cxx j() {
      return this.c;
   }

   public dvt k() {
      return this.h;
   }

   public abstract static class a {
      protected dfd a = cte.a.o();

      public abstract void a(ash var1, int var2, int var3, int var4, boolean var5);

      public dfd a() {
         return this.a;
      }
   }
}
