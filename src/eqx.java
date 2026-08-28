import com.google.common.collect.ImmutableSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;

public abstract class eqx {
   protected static final dzz e = dmc.nF.m();
   protected eql f;
   @Nullable
   private ja a;
   private drc b;
   private dst c;
   protected int g;
   private final erk d;
   private static final Set<dma> h = ImmutableSet.builder()
      .add(dmc.fK)
      .add(dmc.cx)
      .add(dmc.cy)
      .add(dmc.ei)
      .add(dmc.kE)
      .add(dmc.kJ)
      .add(dmc.kK)
      .add(dmc.kH)
      .add(dmc.kF)
      .add(dmc.kG)
      .add(dmc.cY)
      .add(dmc.fl)
      .build();

   protected eqx(erk $$0, int $$1, eql $$2) {
      this.d = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eqx(erk $$0, tz $$1) {
      this($$0, $$1.h("GD"), $$1.<eql>a("BB", eql.a).orElseThrow());
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ja.b($$2));
   }

   protected static eql a(int $$0, int $$1, int $$2, ja $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ja.a.c
         ? new eql($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eql($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ja a(azv $$0) {
      return ja.c.a.a($$0);
   }

   public final tz a(erj $$0) {
      tz $$1 = new tz();
      $$1.a("id", mf.Q.b(this.k()).toString());
      $$1.a("BB", eql.a, this.f);
      ja $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(erj var1, tz var2);

   public void a(eqx $$0, eqy $$1, azv $$2) {
   }

   public abstract void a(dju var1, djr var2, ebx var3, azv var4, eql var5, dic var6, iu var7);

   public eql f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dic $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public iu h() {
      return new iu(this.f.g());
   }

   protected iu.a b(int $$0, int $$1, int $$2) {
      return new iu.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ja $$2 = this.i();
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
      ja $$2 = this.i();
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

   protected void a(dju $$0, dzz $$1, int $$2, int $$3, int $$4, eql $$5) {
      iu $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((diy)$$0, $$2, $$3, $$4, $$5)) {
            if (this.b != drc.a) {
               $$1 = $$1.a(this.b);
            }

            if (this.c != dst.a) {
               $$1 = $$1.a(this.c);
            }

            $$0.a($$6, $$1, 2);
            ewg $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (h.contains($$1.b())) {
               $$0.z($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(diy $$0, int $$1, int $$2, int $$3, eql $$4) {
      return true;
   }

   protected dzz a(dib $$0, int $$1, int $$2, int $$3, eql $$4) {
      iu $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dmc.a.m() : $$0.a_($$5);
   }

   protected boolean b(diy $$0, int $$1, int $$2, int $$3, eql $$4) {
      iu $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(efy.a.c, $$5.u(), $$5.w());
   }

   protected void a(dju $$0, eql $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dmc.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dju $$0, eql $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dzz $$8, dzz $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dib)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dju $$0, eql $$1, eql $$2, dzz $$3, dzz $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dju $$0, eql $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azv $$9, eqx.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dib)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dju $$0, eql $$1, eql $$2, boolean $$3, azv $$4, eqx.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dju $$0, eql $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dzz $$10, dzz $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dib)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dju $$0, eql $$1, azv $$2, float $$3, int $$4, int $$5, int $$6, dzz $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dju $$0, eql $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dzz $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dib)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dju $$0, dzz $$1, int $$2, int $$3, int $$4, eql $$5) {
      iu.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ja.a);
         }
      }
   }

   protected boolean a(dzz $$0) {
      return $$0.l() || $$0.n() || $$0.a(dmc.fv) || $$0.a(dmc.bE) || $$0.a(dmc.bF);
   }

   protected boolean a(dju $$0, eql $$1, azv $$2, int $$3, int $$4, int $$5, alf<eze> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dzz a(dib $$0, iu $$1, dzz $$2) {
      ja $$3 = null;

      for (ja $$4 : ja.c.a) {
         iu $$5 = $$1.a($$4);
         dzz $$6 = $$0.a_($$5);
         if ($$6.a(dmc.cE)) {
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
         return $$2.b(dqa.e, $$3.g());
      } else {
         ja $$7 = $$2.c(dqa.e);
         iu $$8 = $$1.a($$7);
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

         return $$2.b(dqa.e, $$7);
      }
   }

   protected boolean a(djm $$0, eql $$1, azv $$2, iu $$3, alf<eze> $$4, @Nullable dzz $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dmc.cE)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dmc.cE.m());
         }

         $$0.a($$3, $$5, 2);
         dwx $$6 = $$0.c_($$3);
         if ($$6 instanceof dxf) {
            ((dxf)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dju $$0, eql $$1, azv $$2, int $$3, int $$4, int $$5, ja $$6, alf<eze> $$7) {
      iu $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dmc.bb)) {
         this.a($$0, dmc.bb.m().b(dog.b, $$6), $$3, $$4, $$5, $$1);
         dwx $$9 = $$0.c_($$8);
         if ($$9 instanceof dxs) {
            ((dxs)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eql a(Stream<eqx> $$0) {
      return eql.b($$0.map(eqx::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eqx a(List<eqx> $$0, eql $$1) {
      for (eqx $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ja i() {
      return this.a;
   }

   public void a(@Nullable ja $$0) {
      this.a = $$0;
      if ($$0 == null) {
         this.c = dst.a;
         this.b = drc.a;
      } else {
         switch ($$0) {
            case d:
               this.b = drc.b;
               this.c = dst.a;
               break;
            case e:
               this.b = drc.b;
               this.c = dst.b;
               break;
            case f:
               this.b = drc.a;
               this.c = dst.b;
               break;
            default:
               this.b = drc.a;
               this.c = dst.a;
         }
      }
   }

   public dst a() {
      return this.c;
   }

   public drc j() {
      return this.b;
   }

   public erk k() {
      return this.d;
   }

   public abstract static class a {
      protected dzz a = dmc.a.m();

      public abstract void a(azv var1, int var2, int var3, int var4, boolean var5);

      public dzz a() {
         return this.a;
      }
   }
}
