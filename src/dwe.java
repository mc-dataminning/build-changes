import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dwe {
   private static final Logger a = LogUtils.getLogger();
   protected static final dgb e = cuc.nc.o();
   protected dvs f;
   @Nullable
   private hx b;
   private cyv c;
   private dal d;
   protected int g;
   private final dwr h;
   private static final Set<cua> i = ImmutableSet.builder()
      .add(cuc.fo)
      .add(cuc.cp)
      .add(cuc.cq)
      .add(cuc.dU)
      .add(cuc.kd)
      .add(cuc.ki)
      .add(cuc.kg)
      .add(cuc.ke)
      .add(cuc.kf)
      .add(cuc.cO)
      .add(cuc.eW)
      .build();

   protected dwe(dwr $$0, int $$1, dvs $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dwe(dwr $$0, rt $$1) {
      this(
         $$0, $$1.h("GD"), (dvs)dvs.a.parse(sf.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hx.b($$2));
   }

   protected static dvs a(int $$0, int $$1, int $$2, hx $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hx.a.c
         ? new dvs($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dvs($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hx a(ate $$0) {
      return hx.c.a.a($$0);
   }

   public final rt a(dwq $$0) {
      rt $$1 = new rt();
      $$1.a("id", jy.T.b(this.k()).toString());
      dvs.a.encodeStart(sf.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hx $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dwq var1, rt var2);

   public void a(dwe $$0, dwf $$1, ate $$2) {
   }

   public abstract void a(crt var1, crr var2, dhy var3, ate var4, dvs var5, cqg var6, ht var7);

   public dvs f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cqg $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ht h() {
      return new ht(this.f.f());
   }

   protected ht.a b(int $$0, int $$1, int $$2) {
      return new ht.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      hx $$2 = this.i();
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
      hx $$2 = this.i();
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

   protected void a(crt $$0, dgb $$1, int $$2, int $$3, int $$4, dvs $$5) {
      ht $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((crc)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cyv.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dal.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ebe $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(crc $$0, int $$1, int $$2, int $$3, dvs $$4) {
      return true;
   }

   protected dgb a(cqf $$0, int $$1, int $$2, int $$3, dvs $$4) {
      ht $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cuc.a.o() : $$0.a_($$5);
   }

   protected boolean b(crc $$0, int $$1, int $$2, int $$3, dvs $$4) {
      ht $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dlk.a.c, $$5.u(), $$5.w());
   }

   protected void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cuc.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dgb $$8, dgb $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cqf)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(crt $$0, dvs $$1, dvs $$2, dgb $$3, dgb $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ate $$9, dwe.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cqf)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(crt $$0, dvs $$1, dvs $$2, boolean $$3, ate $$4, dwe.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(crt $$0, dvs $$1, ate $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dgb $$10, dgb $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cqf)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(crt $$0, dvs $$1, ate $$2, float $$3, int $$4, int $$5, int $$6, dgb $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(crt $$0, dvs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dgb $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cqf)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(crt $$0, dgb $$1, int $$2, int $$3, int $$4, dvs $$5) {
      ht.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hx.a);
         }
      }
   }

   protected boolean a(dgb $$0) {
      return $$0.i() || $$0.k() || $$0.a(cuc.fg) || $$0.a(cuc.bw) || $$0.a(cuc.bx);
   }

   protected boolean a(crt $$0, dvs $$1, ate $$2, int $$3, int $$4, int $$5, afw $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dgb a(cqf $$0, ht $$1, dgb $$2) {
      hx $$3 = null;

      for (hx $$4 : hx.c.a) {
         ht $$5 = $$1.a($$4);
         dgb $$6 = $$0.a_($$5);
         if ($$6.a(cuc.cv)) {
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
         return $$2.a(cxu.aE, $$3.g());
      } else {
         hx $$7 = $$2.c(cxu.aE);
         ht $$8 = $$1.a($$7);
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

         return $$2.a(cxu.aE, $$7);
      }
   }

   protected boolean a(cro $$0, dvs $$1, ate $$2, ht $$3, afw $$4, @Nullable dgb $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cuc.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cuc.cv.o());
         }

         $$0.a($$3, $$5, 2);
         ddx $$6 = $$0.c_($$3);
         if ($$6 instanceof dee) {
            ((dee)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(crt $$0, dvs $$1, ate $$2, int $$3, int $$4, int $$5, hx $$6, afw $$7) {
      ht $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cuc.aU)) {
         this.a($$0, cuc.aU.o().a(cwd.b, $$6), $$3, $$4, $$5, $$1);
         ddx $$9 = $$0.c_($$8);
         if ($$9 instanceof deo) {
            ((deo)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dvs a(Stream<dwe> $$0) {
      return dvs.b($$0.map(dwe::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dwe a(List<dwe> $$0, dvs $$1) {
      for (dwe $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public hx i() {
      return this.b;
   }

   public void a(@Nullable hx $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dal.a;
         this.c = cyv.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cyv.b;
               this.d = dal.a;
               break;
            case e:
               this.c = cyv.b;
               this.d = dal.b;
               break;
            case f:
               this.c = cyv.a;
               this.d = dal.b;
               break;
            default:
               this.c = cyv.a;
               this.d = dal.a;
         }
      }
   }

   public dal a() {
      return this.d;
   }

   public cyv j() {
      return this.c;
   }

   public dwr k() {
      return this.h;
   }

   public abstract static class a {
      protected dgb a = cuc.a.o();

      public abstract void a(ate var1, int var2, int var3, int var4, boolean var5);

      public dgb a() {
         return this.a;
      }
   }
}
