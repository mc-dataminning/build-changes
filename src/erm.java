import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class erm {
   protected static final eao e = dmo.nI.m();
   protected era f;
   @Nullable
   private jb a;
   private drp b;
   private dtg c;
   protected int g;
   private final erz d;
   private static final Set<dmm> h = ImmutableSet.builder()
      .add(dmo.fN)
      .add(dmo.cz)
      .add(dmo.cA)
      .add(dmo.el)
      .add(dmo.kH)
      .add(dmo.kM)
      .add(dmo.kN)
      .add(dmo.kK)
      .add(dmo.kI)
      .add(dmo.kJ)
      .add(dmo.da)
      .add(dmo.fo)
      .build();

   protected erm(erz $$0, int $$1, era $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public erm(erz $$0, tz $$1) {
      this($$0, $$1.f("GD"), $$1.<era>a("BB", era.a).orElseThrow());
      int $$2 = $$1.f("O");
      this.a($$2 == -1 ? null : jb.b($$2));
   }

   protected static era a(int $$0, int $$1, int $$2, jb $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jb.a.c
         ? new era($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new era($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jb a(azv $$0) {
      return jb.c.a.a($$0);
   }

   public final tz a(ery $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.Q.b(this.k()).toString());
      $$1.a("BB", era.a, this.f);
      jb $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ery var1, tz var2);

   public void a(erm $$0, ern $$1, azv $$2) {
   }

   public abstract void a(dkg var1, dkd var2, ecm var3, azv var4, era var5, dio var6, iv var7);

   public era f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dio $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public iv h() {
      return new iv(this.f.g());
   }

   protected iv.a b(int $$0, int $$1, int $$2) {
      return new iv.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jb $$2 = this.i();
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
      jb $$2 = this.i();
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

   protected void a(dkg $$0, eao $$1, int $$2, int $$3, int $$4, era $$5) {
      iv $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((djk)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != drp.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dtg.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            ewv $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(djk $$0, int $$1, int $$2, int $$3, era $$4) {
      return true;
   }

   protected eao a(din $$0, int $$1, int $$2, int $$3, era $$4) {
      iv $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dmo.a.m() : $$0.a_($$5);
   }

   protected boolean b(djk $$0, int $$1, int $$2, int $$3, era $$4) {
      iv $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(egn.a.c, $$5.u(), $$5.w());
   }

   protected void a(dkg $$0, era $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dmo.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dkg $$0, era $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eao $$8, eao $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((din)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dkg $$0, era $$1, era $$2, eao $$3, eao $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkg $$0, era $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azv $$9, erm.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((din)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dkg $$0, era $$1, era $$2, boolean $$3, azv $$4, erm.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkg $$0, era $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, eao $$10, eao $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((din)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dkg $$0, era $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, eao $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dkg $$0, era $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eao $$8, boolean $$9) {
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
               if (!$$9 || !this.a((din)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dkg $$0, eao $$1, int $$2, int $$3, int $$4, era $$5) {
      iv.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jb.a);
         }
      }
   }

   protected boolean a(eao $$0) {
      return $$0.l() || $$0.n() || $$0.a(dmo.fy) || $$0.a(dmo.bG) || $$0.a(dmo.bH);
   }

   protected boolean a(dkg $$0, era $$1, azv $$2, int $$3, int $$4, int $$5, alf<ezt> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static eao a(din $$0, iv $$1, eao $$2) {
      jb $$3 = null;

      for (jb $$4 : jb.c.a) {
         iv $$5 = $$1.a($$4);
         eao $$6 = $$0.a_($$5);
         if ($$6.a(dmo.cG)) {
            return $$2;
         }

         if ($$6.s()) {
            if ($$3 != null) {
               $$3 = null;
               break;
            }

            $$3 = $$4;
         }
      }

      if ($$3 != null) {
         return $$2.b(dqn.e, $$3.g());
      } else {
         jb $$7 = $$2.c(dqn.e);
         iv $$8 = $$1.a($$7);
         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.h();
            $$8 = $$1.a($$7);
         }

         if ($$0.a_($$8).s()) {
            $$7 = $$7.g();
            $$8 = $$1.a($$7);
         }

         return $$2.b(dqn.e, $$7);
      }
   }

   protected boolean a(djy $$0, era $$1, azv $$2, iv $$3, alf<ezt> $$4, @Nullable eao $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dmo.cG)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dmo.cG.m());
         }

         $$0.a($$3, $$5, 2);
         dxm $$6 = $$0.c_($$3);
         if ($$6 instanceof dxu) {
            ((dxu)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dkg $$0, era $$1, azv $$2, int $$3, int $$4, int $$5, jb $$6, alf<ezt> $$7) {
      iv $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dmo.bb)) {
         this.a($$0, dmo.bb.m().b(dos.b, $$6), $$3, $$4, $$5, $$1);
         dxm $$9 = $$0.c_($$8);
         if ($$9 instanceof dyh) {
            ((dyh)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static era a(Stream<erm> $$0) {
      return era.b($$0.map(erm::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static erm a(List<erm> $$0, era $$1) {
      for (erm $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jb i() {
      return this.a;
   }

   public void a(@Nullable jb $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.c = dtg.a;
         this.b = drp.a;
      } else {
         switch ($$0) {
            case d:
               this.b = drp.b;
               this.c = dtg.a;
               break;
            case e:
               this.b = drp.b;
               this.c = dtg.b;
               break;
            case f:
               this.b = drp.a;
               this.c = dtg.b;
               break;
            default:
               this.b = drp.a;
               this.c = dtg.a;
         }
      }
   }

   public dtg a() {
      return this.c;
   }

   public drp j() {
      return this.b;
   }

   public erz k() {
      return this.d;
   }

   public abstract static class a {
      protected eao a = dmo.a.m();

      public abstract void a(azv var1, int var2, int var3, int var4, boolean var5);

      public eao a() {
         return this.a;
      }
   }
}
