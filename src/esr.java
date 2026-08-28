import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class esr {
   protected static final ebq e = dnq.nI.m();
   protected esf f;
   @Nullable
   private jc a;
   private dsr b;
   private dui c;
   protected int g;
   private final ete d;
   private static final Set<dno> h = ImmutableSet.builder()
      .add(dnq.fN)
      .add(dnq.cz)
      .add(dnq.cA)
      .add(dnq.el)
      .add(dnq.kH)
      .add(dnq.kM)
      .add(dnq.kN)
      .add(dnq.kK)
      .add(dnq.kI)
      .add(dnq.kJ)
      .add(dnq.da)
      .add(dnq.fo)
      .build();

   protected esr(ete $$0, int $$1, esf $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public esr(ete $$0, ua $$1) {
      this($$0, $$1.b("GD", 0), $$1.<esf>a("BB", esf.a).orElseThrow());
      int $$2 = $$1.b("O", 0);
      this.a($$2 == -1 ? null : jc.b($$2));
   }

   protected static esf a(int $$0, int $$1, int $$2, jc $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jc.a.c
         ? new esf($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new esf($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jc a(bai $$0) {
      return jc.c.a.a($$0);
   }

   public final ua a(etd $$0) {
      ua $$1 = new ua();
      $$1.a("id", mh.Q.b(this.k()).toString());
      $$1.a("BB", esf.a, this.f);
      jc $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(etd var1, ua var2);

   public void a(esr $$0, ess $$1, bai $$2) {
   }

   public abstract void a(dli var1, dlf var2, edo var3, bai var4, esf var5, djo var6, iw var7);

   public esf f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(djo $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public iw h() {
      return new iw(this.f.g());
   }

   protected iw.a b(int $$0, int $$1, int $$2) {
      return new iw.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jc $$2 = this.i();
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
      jc $$2 = this.i();
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

   protected void a(dli $$0, ebq $$1, int $$2, int $$3, int $$4, esf $$5) {
      iw $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dkm)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != dsr.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dui.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            eya $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dkm $$0, int $$1, int $$2, int $$3, esf $$4) {
      return true;
   }

   protected ebq a(djn $$0, int $$1, int $$2, int $$3, esf $$4) {
      iw $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dnq.a.m() : $$0.a_($$5);
   }

   protected boolean b(dkm $$0, int $$1, int $$2, int $$3, esf $$4) {
      iw $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(ehp.a.c, $$5.u(), $$5.w());
   }

   protected void a(dli $$0, esf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dnq.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dli $$0, esf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, ebq $$8, ebq $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((djn)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dli $$0, esf $$1, esf $$2, ebq $$3, ebq $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dli $$0, esf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, bai $$9, esr.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((djn)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dli $$0, esf $$1, esf $$2, boolean $$3, bai $$4, esr.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dli $$0, esf $$1, bai $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, ebq $$10, ebq $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((djn)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dli $$0, esf $$1, bai $$2, float $$3, int $$4, int $$5, int $$6, ebq $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dli $$0, esf $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, ebq $$8, boolean $$9) {
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
               if (!$$9 || !this.a((djn)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dli $$0, ebq $$1, int $$2, int $$3, int $$4, esf $$5) {
      iw.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.K_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jc.a);
         }
      }
   }

   protected boolean a(ebq $$0) {
      return $$0.l() || $$0.n() || $$0.a(dnq.fy) || $$0.a(dnq.bG) || $$0.a(dnq.bH);
   }

   protected boolean a(dli $$0, esf $$1, bai $$2, int $$3, int $$4, int $$5, alq<fay> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static ebq a(djn $$0, iw $$1, ebq $$2) {
      jc $$3 = null;

      for (jc $$4 : jc.c.a) {
         iw $$5 = $$1.a($$4);
         ebq $$6 = $$0.a_($$5);
         if ($$6.a(dnq.cG)) {
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
         return $$2.b(drp.e, $$3.g());
      } else {
         jc $$7 = $$2.c(drp.e);
         iw $$8 = $$1.a($$7);
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

         return $$2.b(drp.e, $$7);
      }
   }

   protected boolean a(dla $$0, esf $$1, bai $$2, iw $$3, alq<fay> $$4, @Nullable ebq $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dnq.cG)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dnq.cG.m());
         }

         $$0.a($$3, $$5, 2);
         dyo $$6 = $$0.c_($$3);
         if ($$6 instanceof dyw) {
            ((dyw)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dli $$0, esf $$1, bai $$2, int $$3, int $$4, int $$5, jc $$6, alq<fay> $$7) {
      iw $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dnq.bb)) {
         this.a($$0, dnq.bb.m().b(dpu.b, $$6), $$3, $$4, $$5, $$1);
         dyo $$9 = $$0.c_($$8);
         if ($$9 instanceof dzj) {
            ((dzj)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static esf a(Stream<esr> $$0) {
      return esf.b($$0.map(esr::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static esr a(List<esr> $$0, esf $$1) {
      for (esr $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jc i() {
      return this.a;
   }

   public void a(@Nullable jc $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.c = dui.a;
         this.b = dsr.a;
      } else {
         switch ($$0) {
            case d:
               this.b = dsr.b;
               this.c = dui.a;
               break;
            case e:
               this.b = dsr.b;
               this.c = dui.b;
               break;
            case f:
               this.b = dsr.a;
               this.c = dui.b;
               break;
            default:
               this.b = dsr.a;
               this.c = dui.a;
         }
      }
   }

   public dui a() {
      return this.c;
   }

   public dsr j() {
      return this.b;
   }

   public ete k() {
      return this.d;
   }

   public abstract static class a {
      protected ebq a = dnq.a.m();

      public abstract void a(bai var1, int var2, int var3, int var4, boolean var5);

      public ebq a() {
         return this.a;
      }
   }
}
