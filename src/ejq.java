import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ejq {
   private static final Logger a = LogUtils.getLogger();
   protected static final dta e = dfy.nc.o();
   protected eje f;
   @Nullable
   private ji b;
   private dkt c;
   private dmk d;
   protected int g;
   private final ekd h;
   private static final Set<dfw> i = ImmutableSet.builder()
      .add(dfy.fo)
      .add(dfy.cp)
      .add(dfy.cq)
      .add(dfy.dU)
      .add(dfy.kd)
      .add(dfy.ki)
      .add(dfy.kg)
      .add(dfy.ke)
      .add(dfy.kf)
      .add(dfy.cO)
      .add(dfy.eW)
      .build();

   protected ejq(ekd $$0, int $$1, eje $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ejq(ekd $$0, ua $$1) {
      this($$0, $$1.h("GD"), (eje)eje.a.parse(uo.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ji.b($$2));
   }

   protected static eje a(int $$0, int $$1, int $$2, ji $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ji.a.c
         ? new eje($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eje($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ji a(ayv $$0) {
      return ji.c.a.a($$0);
   }

   public final ua a(ekc $$0) {
      ua $$1 = new ua();
      $$1.a("id", lt.Q.b(this.k()).toString());
      eje.a.encodeStart(uo.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ji $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ekc var1, ua var2);

   public void a(ejq $$0, ejr $$1, ayv $$2) {
   }

   public abstract void a(ddq var1, ddo var2, dux var3, ayv var4, eje var5, dcb var6, jd var7);

   public eje f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dcb $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jd h() {
      return new jd(this.f.g());
   }

   protected jd.a b(int $$0, int $$1, int $$2) {
      return new jd.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ji $$2 = this.i();
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
      ji $$2 = this.i();
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

   protected void a(ddq $$0, dta $$1, int $$2, int $$3, int $$4, eje $$5) {
      jd $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcx)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dkt.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dmk.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eoy $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcx $$0, int $$1, int $$2, int $$3, eje $$4) {
      return true;
   }

   protected dta a(dca $$0, int $$1, int $$2, int $$3, eje $$4) {
      jd $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dfy.a.o() : $$0.a_($$5);
   }

   protected boolean b(dcx $$0, int $$1, int $$2, int $$3, eje $$4) {
      jd $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dyv.a.c, $$5.u(), $$5.w());
   }

   protected void a(ddq $$0, eje $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dfy.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(ddq $$0, eje $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dta $$8, dta $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dca)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(ddq $$0, eje $$1, eje $$2, dta $$3, dta $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ddq $$0, eje $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayv $$9, ejq.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dca)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(ddq $$0, eje $$1, eje $$2, boolean $$3, ayv $$4, ejq.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ddq $$0, eje $$1, ayv $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dta $$10, dta $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dca)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(ddq $$0, eje $$1, ayv $$2, float $$3, int $$4, int $$5, int $$6, dta $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(ddq $$0, eje $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dta $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dca)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(ddq $$0, dta $$1, int $$2, int $$3, int $$4, eje $$5) {
      jd.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ji.a);
         }
      }
   }

   protected boolean a(dta $$0) {
      return $$0.i() || $$0.k() || $$0.a(dfy.fg) || $$0.a(dfy.bw) || $$0.a(dfy.bx);
   }

   protected boolean a(ddq $$0, eje $$1, ayv $$2, int $$3, int $$4, int $$5, akp<erq> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dta a(dca $$0, jd $$1, dta $$2) {
      ji $$3 = null;

      for (ji $$4 : ji.c.a) {
         jd $$5 = $$1.a($$4);
         dta $$6 = $$0.a_($$5);
         if ($$6.a(dfy.cv)) {
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
         return $$2.a(djs.aE, $$3.g());
      } else {
         ji $$7 = $$2.c(djs.aE);
         jd $$8 = $$1.a($$7);
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

         return $$2.a(djs.aE, $$7);
      }
   }

   protected boolean a(ddj $$0, eje $$1, ayv $$2, jd $$3, akp<erq> $$4, @Nullable dta $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dfy.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dfy.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dqf $$6 = $$0.c_($$3);
         if ($$6 instanceof dqm) {
            ((dqm)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(ddq $$0, eje $$1, ayv $$2, int $$3, int $$4, int $$5, ji $$6, akp<erq> $$7) {
      jd $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dfy.aU)) {
         this.a($$0, dfy.aU.o().a(dib.b, $$6), $$3, $$4, $$5, $$1);
         dqf $$9 = $$0.c_($$8);
         if ($$9 instanceof dqy) {
            ((dqy)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eje a(Stream<ejq> $$0) {
      return eje.b($$0.map(ejq::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ejq a(List<ejq> $$0, eje $$1) {
      for (ejq $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ji i() {
      return this.b;
   }

   public void a(@Nullable ji $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dmk.a;
         this.c = dkt.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dkt.b;
               this.d = dmk.a;
               break;
            case e:
               this.c = dkt.b;
               this.d = dmk.b;
               break;
            case f:
               this.c = dkt.a;
               this.d = dmk.b;
               break;
            default:
               this.c = dkt.a;
               this.d = dmk.a;
         }
      }
   }

   public dmk a() {
      return this.d;
   }

   public dkt j() {
      return this.c;
   }

   public ekd k() {
      return this.h;
   }

   public abstract static class a {
      protected dta a = dfy.a.o();

      public abstract void a(ayv var1, int var2, int var3, int var4, boolean var5);

      public dta a() {
         return this.a;
      }
   }
}
