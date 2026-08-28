import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class esf {
   protected static final ebe e = dne.nI.m();
   protected ert f;
   @Nullable
   private jb a;
   private dsf b;
   private dtw c;
   protected int g;
   private final ess d;
   private static final Set<dnc> h = ImmutableSet.builder()
      .add(dne.fN)
      .add(dne.cz)
      .add(dne.cA)
      .add(dne.el)
      .add(dne.kH)
      .add(dne.kM)
      .add(dne.kN)
      .add(dne.kK)
      .add(dne.kI)
      .add(dne.kJ)
      .add(dne.da)
      .add(dne.fo)
      .build();

   protected esf(ess $$0, int $$1, ert $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public esf(ess $$0, tz $$1) {
      this($$0, $$1.b("GD", 0), $$1.<ert>a("BB", ert.a).orElseThrow());
      int $$2 = $$1.b("O", 0);
      this.a($$2 == -1 ? null : jb.b($$2));
   }

   protected static ert a(int $$0, int $$1, int $$2, jb $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jb.a.c
         ? new ert($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new ert($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jb a(azx $$0) {
      return jb.c.a.a($$0);
   }

   public final tz a(esr $$0) {
      tz $$1 = new tz();
      $$1.a("id", mg.Q.b(this.k()).toString());
      $$1.a("BB", ert.a, this.f);
      jb $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(esr var1, tz var2);

   public void a(esf $$0, esg $$1, azx $$2) {
   }

   public abstract void a(dkw var1, dkt var2, edc var3, azx var4, ert var5, djc var6, iv var7);

   public ert f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(djc $$0, int $$1) {
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

   protected void a(dkw $$0, ebe $$1, int $$2, int $$3, int $$4, ert $$5) {
      iv $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dka)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != dsf.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dtw.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            exo $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dka $$0, int $$1, int $$2, int $$3, ert $$4) {
      return true;
   }

   protected ebe a(djb $$0, int $$1, int $$2, int $$3, ert $$4) {
      iv $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dne.a.m() : $$0.a_($$5);
   }

   protected boolean b(dka $$0, int $$1, int $$2, int $$3, ert $$4) {
      iv $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(ehd.a.c, $$5.u(), $$5.w());
   }

   protected void a(dkw $$0, ert $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dne.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dkw $$0, ert $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, ebe $$8, ebe $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((djb)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dkw $$0, ert $$1, ert $$2, ebe $$3, ebe $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkw $$0, ert $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azx $$9, esf.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((djb)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dkw $$0, ert $$1, ert $$2, boolean $$3, azx $$4, esf.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dkw $$0, ert $$1, azx $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, ebe $$10, ebe $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((djb)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dkw $$0, ert $$1, azx $$2, float $$3, int $$4, int $$5, int $$6, ebe $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dkw $$0, ert $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, ebe $$8, boolean $$9) {
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
               if (!$$9 || !this.a((djb)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dkw $$0, ebe $$1, int $$2, int $$3, int $$4, ert $$5) {
      iv.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.K_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jb.a);
         }
      }
   }

   protected boolean a(ebe $$0) {
      return $$0.l() || $$0.n() || $$0.a(dne.fy) || $$0.a(dne.bG) || $$0.a(dne.bH);
   }

   protected boolean a(dkw $$0, ert $$1, azx $$2, int $$3, int $$4, int $$5, alh<fam> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static ebe a(djb $$0, iv $$1, ebe $$2) {
      jb $$3 = null;

      for (jb $$4 : jb.c.a) {
         iv $$5 = $$1.a($$4);
         ebe $$6 = $$0.a_($$5);
         if ($$6.a(dne.cG)) {
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
         return $$2.b(drd.e, $$3.g());
      } else {
         jb $$7 = $$2.c(drd.e);
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

         return $$2.b(drd.e, $$7);
      }
   }

   protected boolean a(dko $$0, ert $$1, azx $$2, iv $$3, alh<fam> $$4, @Nullable ebe $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dne.cG)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dne.cG.m());
         }

         $$0.a($$3, $$5, 2);
         dyc $$6 = $$0.c_($$3);
         if ($$6 instanceof dyk) {
            ((dyk)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dkw $$0, ert $$1, azx $$2, int $$3, int $$4, int $$5, jb $$6, alh<fam> $$7) {
      iv $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dne.bb)) {
         this.a($$0, dne.bb.m().b(dpi.b, $$6), $$3, $$4, $$5, $$1);
         dyc $$9 = $$0.c_($$8);
         if ($$9 instanceof dyx) {
            ((dyx)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static ert a(Stream<esf> $$0) {
      return ert.b($$0.map(esf::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static esf a(List<esf> $$0, ert $$1) {
      for (esf $$2 : $$0) {
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
         this.c = dtw.a;
         this.b = dsf.a;
      } else {
         switch ($$0) {
            case d:
               this.b = dsf.b;
               this.c = dtw.a;
               break;
            case e:
               this.b = dsf.b;
               this.c = dtw.b;
               break;
            case f:
               this.b = dsf.a;
               this.c = dtw.b;
               break;
            default:
               this.b = dsf.a;
               this.c = dtw.a;
         }
      }
   }

   public dtw a() {
      return this.c;
   }

   public dsf j() {
      return this.b;
   }

   public ess k() {
      return this.d;
   }

   public abstract static class a {
      protected ebe a = dne.a.m();

      public abstract void a(azx var1, int var2, int var3, int var4, boolean var5);

      public ebe a() {
         return this.a;
      }
   }
}
