import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dse {
   private static final Logger a = LogUtils.getLogger();
   protected static final dcb e = cpo.nc.n();
   protected drs f;
   @Nullable
   private ha b;
   private cui c;
   private cvz d;
   protected int g;
   private final dsr h;
   private static final Set<cpn> i = ImmutableSet.builder()
      .add(cpo.fo)
      .add(cpo.cp)
      .add(cpo.cq)
      .add(cpo.dU)
      .add(cpo.kd)
      .add(cpo.ki)
      .add(cpo.kg)
      .add(cpo.ke)
      .add(cpo.kf)
      .add(cpo.cO)
      .add(cpo.eX)
      .build();

   protected dse(dsr $$0, int $$1, drs $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dse(dsr $$0, qr $$1) {
      this(
         $$0, $$1.h("GD"), (drs)drs.a.parse(rc.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ha.b($$2));
   }

   protected static drs a(int $$0, int $$1, int $$2, ha $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ha.a.c
         ? new drs($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new drs($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ha a(apf $$0) {
      return ha.c.a.a($$0);
   }

   public final qr a(dsq $$0) {
      qr $$1 = new qr();
      $$1.a("id", jb.T.b(this.k()).toString());
      drs.a.encodeStart(rc.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ha $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dsq var1, qr var2);

   public void a(dse $$0, dsf $$1, apf $$2) {
   }

   public abstract void a(cng var1, cne var2, ddy var3, apf var4, drs var5, clt var6, gu var7);

   public drs f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(clt $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public gu h() {
      return new gu(this.f.f());
   }

   protected gu.a b(int $$0, int $$1, int $$2) {
      return new gu.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
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

   protected void a(cng $$0, dcb $$1, int $$2, int $$3, int $$4, drs $$5) {
      gu $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cmp)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cui.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != cvz.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            dxe $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cmp $$0, int $$1, int $$2, int $$3, drs $$4) {
      return true;
   }

   protected dcb a(cls $$0, int $$1, int $$2, int $$3, drs $$4) {
      gu $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cpo.a.n() : $$0.a_($$5);
   }

   protected boolean b(cmp $$0, int $$1, int $$2, int $$3, drs $$4) {
      gu $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dhk.a.c, $$5.u(), $$5.w());
   }

   protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cpo.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dcb $$8, dcb $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cls)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cng $$0, drs $$1, drs $$2, dcb $$3, dcb $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, apf $$9, dse.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cls)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cng $$0, drs $$1, drs $$2, boolean $$3, apf $$4, dse.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cng $$0, drs $$1, apf $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dcb $$10, dcb $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cls)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cng $$0, drs $$1, apf $$2, float $$3, int $$4, int $$5, int $$6, dcb $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cng $$0, drs $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dcb $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cls)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cng $$0, dcb $$1, int $$2, int $$3, int $$4, drs $$5) {
      gu.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.C_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ha.a);
         }
      }
   }

   protected boolean a(dcb $$0) {
      return $$0.i() || $$0.k() || $$0.a(cpo.fg) || $$0.a(cpo.bw) || $$0.a(cpo.bx);
   }

   protected boolean a(cng $$0, drs $$1, apf $$2, int $$3, int $$4, int $$5, acq $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dcb a(cls $$0, gu $$1, dcb $$2) {
      ha $$3 = null;

      for (ha $$4 : ha.c.a) {
         gu $$5 = $$1.a($$4);
         dcb $$6 = $$0.a_($$5);
         if ($$6.a(cpo.cv)) {
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
         return $$2.a(ctg.aC, $$3.g());
      } else {
         ha $$7 = $$2.c(ctg.aC);
         gu $$8 = $$1.a($$7);
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

         return $$2.a(ctg.aC, $$7);
      }
   }

   protected boolean a(cnb $$0, drs $$1, apf $$2, gu $$3, acq $$4, @Nullable dcb $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cpo.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cpo.cv.n());
         }

         $$0.a($$3, $$5, 2);
         czn $$6 = $$0.c_($$3);
         if ($$6 instanceof czu) {
            ((czu)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cng $$0, drs $$1, apf $$2, int $$3, int $$4, int $$5, ha $$6, acq $$7) {
      gu $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cpo.aU)) {
         this.a($$0, cpo.aU.n().a(cro.a, $$6), $$3, $$4, $$5, $$1);
         czn $$9 = $$0.c_($$8);
         if ($$9 instanceof dae) {
            ((dae)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static drs a(Stream<dse> $$0) {
      return drs.b($$0.map(dse::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dse a(List<dse> $$0, drs $$1) {
      for (dse $$2 : $$0) {
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
         this.d = cvz.a;
         this.c = cui.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cui.b;
               this.d = cvz.a;
               break;
            case e:
               this.c = cui.b;
               this.d = cvz.b;
               break;
            case f:
               this.c = cui.a;
               this.d = cvz.b;
               break;
            default:
               this.c = cui.a;
               this.d = cvz.a;
         }
      }
   }

   public cvz a() {
      return this.d;
   }

   public cui j() {
      return this.c;
   }

   public dsr k() {
      return this.h;
   }

   public abstract static class a {
      protected dcb a = cpo.a.n();

      public abstract void a(apf var1, int var2, int var3, int var4, boolean var5);

      public dcb a() {
         return this.a;
      }
   }
}
