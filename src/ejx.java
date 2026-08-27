import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class ejx {
   private static final Logger a = LogUtils.getLogger();
   protected static final dtc e = dfe.oa.n();
   protected ejl f;
   @Nullable
   private iw b;
   private dke c;
   private dmd d;
   protected int g;
   private final ekk h;
   private static final Set<dfc> i = ImmutableSet.builder()
      .add(dfe.gg)
      .add(dfe.da)
      .add(dfe.db)
      .add(dfe.eI)
      .add(dfe.kX)
      .add(dfe.lc)
      .add(dfe.la)
      .add(dfe.kY)
      .add(dfe.kZ)
      .add(dfe.dA)
      .add(dfe.fO)
      .build();

   protected ejx(ekk $$0, int $$1, ejl $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public ejx(ekk $$0, uk $$1) {
      this(
         $$0, $$1.h("GD"), (ejl)ejl.a.parse(uy.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : iw.b($$2));
   }

   protected static ejl a(int $$0, int $$1, int $$2, iw $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == iw.a.c
         ? new ejl($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ejl($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static iw a(ayt $$0) {
      return iw.c.a.a($$0);
   }

   public final uk a(ekj $$0) {
      uk $$1 = new uk();
      $$1.a("id", lh.S.b(this.k()).toString());
      ejl.a.encodeStart(uy.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      iw $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ekj var1, uk var2);

   public void a(ejx $$0, ejy $$1, ayt $$2) {
   }

   public abstract void a(dcv var1, dct var2, duz var3, ayt var4, ejl var5, dbh var6, ir var7);

   public ejl f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dbh $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ir h() {
      return new ir(this.f.g());
   }

   protected ir.a b(int $$0, int $$1, int $$2) {
      return new ir.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      iw $$2 = this.i();
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
      iw $$2 = this.i();
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

   protected void a(dcv $$0, dtc $$1, int $$2, int $$3, int $$4, ejl $$5) {
      ir $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcd)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dke.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dmd.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            epe $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcd $$0, int $$1, int $$2, int $$3, ejl $$4) {
      return true;
   }

   protected dtc a(dbg $$0, int $$1, int $$2, int $$3, ejl $$4) {
      ir $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dfe.a.n() : $$0.a_($$5);
   }

   protected boolean b(dcd $$0, int $$1, int $$2, int $$3, ejl $$4) {
      ir $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dyu.a.c, $$5.u(), $$5.w());
   }

   protected void a(dcv $$0, ejl $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dfe.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dcv $$0, ejl $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dtc $$8, dtc $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dbg)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dcv $$0, ejl $$1, ejl $$2, dtc $$3, dtc $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcv $$0, ejl $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayt $$9, ejx.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dbg)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dcv $$0, ejl $$1, ejl $$2, boolean $$3, ayt $$4, ejx.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcv $$0, ejl $$1, ayt $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dtc $$10, dtc $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dbg)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dcv $$0, ejl $$1, ayt $$2, float $$3, int $$4, int $$5, int $$6, dtc $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dcv $$0, ejl $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dtc $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dbg)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dcv $$0, dtc $$1, int $$2, int $$3, int $$4, ejl $$5) {
      ir.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.d(iw.a);
         }
      }
   }

   protected boolean a(dtc $$0) {
      return $$0.i() || $$0.k() || $$0.a(dfe.fY) || $$0.a(dfe.cg) || $$0.a(dfe.ch);
   }

   protected boolean a(dcv $$0, ejl $$1, ayt $$2, int $$3, int $$4, int $$5, aks<eru> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dtc a(dbg $$0, ir $$1, dtc $$2) {
      iw $$3 = null;

      for (iw $$4 : iw.c.a) {
         ir $$5 = $$1.a($$4);
         dtc $$6 = $$0.a_($$5);
         if ($$6.a(dfe.dg)) {
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
         return $$2.a(djc.aE, $$3.g());
      } else {
         iw $$7 = $$2.c(djc.aE);
         ir $$8 = $$1.a($$7);
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

         return $$2.a(djc.aE, $$7);
      }
   }

   protected boolean a(dcp $$0, ejl $$1, ayt $$2, ir $$3, aks<eru> $$4, @Nullable dtc $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dfe.dg)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dfe.dg.n());
         }

         $$0.a($$3, $$5, 2);
         dqc $$6 = $$0.c_($$3);
         if ($$6 instanceof dqj) {
            ((dqj)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dcv $$0, ejl $$1, ayt $$2, int $$3, int $$4, int $$5, iw $$6, aks<eru> $$7) {
      ir $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dfe.bD)) {
         this.a($$0, dfe.bD.n().a(dhi.b, $$6), $$3, $$4, $$5, $$1);
         dqc $$9 = $$0.c_($$8);
         if ($$9 instanceof dqu) {
            ((dqu)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ejl a(Stream<ejx> $$0) {
      return ejl.b($$0.map(ejx::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static ejx a(List<ejx> $$0, ejl $$1) {
      for (ejx $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public iw i() {
      return this.b;
   }

   public void a(@Nullable iw $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dmd.a;
         this.c = dke.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dke.b;
               this.d = dmd.a;
               break;
            case e:
               this.c = dke.b;
               this.d = dmd.b;
               break;
            case f:
               this.c = dke.a;
               this.d = dmd.b;
               break;
            default:
               this.c = dke.a;
               this.d = dmd.a;
         }
      }
   }

   public dmd a() {
      return this.d;
   }

   public dke j() {
      return this.c;
   }

   public ekk k() {
      return this.h;
   }

   public abstract static class a {
      protected dtc a = dfe.a.n();

      public abstract void a(ayt var1, int var2, int var3, int var4, boolean var5);

      public dtc a() {
         return this.a;
      }
   }
}
