import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class err {
   protected static final eat e = dmt.nI.m();
   protected erf f;
   @Nullable
   private jb a;
   private dru b;
   private dtl c;
   protected int g;
   private final ese d;
   private static final Set<dmr> h = ImmutableSet.builder()
      .add(dmt.fN)
      .add(dmt.cz)
      .add(dmt.cA)
      .add(dmt.el)
      .add(dmt.kH)
      .add(dmt.kM)
      .add(dmt.kN)
      .add(dmt.kK)
      .add(dmt.kI)
      .add(dmt.kJ)
      .add(dmt.da)
      .add(dmt.fo)
      .build();

   protected err(ese $$0, int $$1, erf $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public err(ese $$0, tz $$1) {
      this($$0, $$1.f("GD"), $$1.<erf>a("BB", erf.a).orElseThrow());
      int $$2 = $$1.f("O");
      this.a($$2 == -1 ? null : jb.b($$2));
   }

   protected static erf a(int $$0, int $$1, int $$2, jb $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jb.a.c
         ? new erf($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new erf($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jb a(azv $$0) {
      return jb.c.a.a($$0);
   }

   public final tz a(esd $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.Q.b(this.k()).toString());
      $$1.a("BB", erf.a, this.f);
      jb $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(esd var1, tz var2);

   public void a(err $$0, ers $$1, azv $$2) {
   }

   public abstract void a(dkl var1, dki var2, ecr var3, azv var4, erf var5, dir var6, iv var7);

   public erf f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dir $$0, int $$1) {
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

   protected void a(dkl $$0, eat $$1, int $$2, int $$3, int $$4, erf $$5) {
      iv $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((djp)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != dru.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dtl.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            exa $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(djp $$0, int $$1, int $$2, int $$3, erf $$4) {
      return true;
   }

   protected eat a(diq $$0, int $$1, int $$2, int $$3, erf $$4) {
      iv $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dmt.a.m() : $$0.a_($$5);
   }

   protected boolean b(djp $$0, int $$1, int $$2, int $$3, erf $$4) {
      iv $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(egs.a.c, $$5.u(), $$5.w());
   }

   protected void a(dkl $$0, erf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dmt.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dkl $$0, erf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eat $$8, eat $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((diq)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dkl $$0, erf $$1, erf $$2, eat $$3, eat $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkl $$0, erf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azv $$9, err.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((diq)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dkl $$0, erf $$1, erf $$2, boolean $$3, azv $$4, err.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkl $$0, erf $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, eat $$10, eat $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((diq)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dkl $$0, erf $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, eat $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dkl $$0, erf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, eat $$8, boolean $$9) {
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
               if (!$$9 || !this.a((diq)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dkl $$0, eat $$1, int $$2, int $$3, int $$4, erf $$5) {
      iv.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jb.a);
         }
      }
   }

   protected boolean a(eat $$0) {
      return $$0.l() || $$0.n() || $$0.a(dmt.fy) || $$0.a(dmt.bG) || $$0.a(dmt.bH);
   }

   protected boolean a(dkl $$0, erf $$1, azv $$2, int $$3, int $$4, int $$5, alf<ezy> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static eat a(diq $$0, iv $$1, eat $$2) {
      jb $$3 = null;

      for (jb $$4 : jb.c.a) {
         iv $$5 = $$1.a($$4);
         eat $$6 = $$0.a_($$5);
         if ($$6.a(dmt.cG)) {
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
         return $$2.b(dqs.e, $$3.g());
      } else {
         jb $$7 = $$2.c(dqs.e);
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

         return $$2.b(dqs.e, $$7);
      }
   }

   protected boolean a(dkd $$0, erf $$1, azv $$2, iv $$3, alf<ezy> $$4, @Nullable eat $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dmt.cG)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dmt.cG.m());
         }

         $$0.a($$3, $$5, 2);
         dxr $$6 = $$0.c_($$3);
         if ($$6 instanceof dxz) {
            ((dxz)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dkl $$0, erf $$1, azv $$2, int $$3, int $$4, int $$5, jb $$6, alf<ezy> $$7) {
      iv $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dmt.bb)) {
         this.a($$0, dmt.bb.m().b(dox.b, $$6), $$3, $$4, $$5, $$1);
         dxr $$9 = $$0.c_($$8);
         if ($$9 instanceof dym) {
            ((dym)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static erf a(Stream<err> $$0) {
      return erf.b($$0.map(err::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static err a(List<err> $$0, erf $$1) {
      for (err $$2 : $$0) {
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
         this.c = dtl.a;
         this.b = dru.a;
      } else {
         switch ($$0) {
            case d:
               this.b = dru.b;
               this.c = dtl.a;
               break;
            case e:
               this.b = dru.b;
               this.c = dtl.b;
               break;
            case f:
               this.b = dru.a;
               this.c = dtl.b;
               break;
            default:
               this.b = dru.a;
               this.c = dtl.a;
         }
      }
   }

   public dtl a() {
      return this.c;
   }

   public dru j() {
      return this.b;
   }

   public ese k() {
      return this.d;
   }

   public abstract static class a {
      protected eat a = dmt.a.m();

      public abstract void a(azv var1, int var2, int var3, int var4, boolean var5);

      public eat a() {
         return this.a;
      }
   }
}
