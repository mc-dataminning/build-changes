import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class efl {
   private static final Logger a = LogUtils.getLogger();
   protected static final doz e = dca.nc.n();
   protected eez f;
   @Nullable
   private ih b;
   private dgu c;
   private dik d;
   protected int g;
   private final efy h;
   private static final Set<dby> i = ImmutableSet.builder()
      .add(dca.fo)
      .add(dca.cp)
      .add(dca.cq)
      .add(dca.dU)
      .add(dca.kd)
      .add(dca.ki)
      .add(dca.kg)
      .add(dca.ke)
      .add(dca.kf)
      .add(dca.cO)
      .add(dca.eW)
      .build();

   protected efl(efy $$0, int $$1, eez $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public efl(efy $$0, tm $$1) {
      this(
         $$0, $$1.h("GD"), (eez)eez.a.parse(ua.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ih.b($$2));
   }

   protected static eez a(int $$0, int $$1, int $$2, ih $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ih.a.c
         ? new eez($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eez($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ih a(axr $$0) {
      return ih.c.a.a($$0);
   }

   public final tm a(efx $$0) {
      tm $$1 = new tm();
      $$1.a("id", kr.S.b(this.k()).toString());
      eez.a.encodeStart(ua.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ih $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(efx var1, tm var2);

   public void a(efl $$0, efm $$1, axr $$2) {
   }

   public abstract void a(czs var1, czq var2, dqw var3, axr var4, eez var5, cye var6, ib var7);

   public eez f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cye $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ib h() {
      return new ib(this.f.g());
   }

   protected ib.a b(int $$0, int $$1, int $$2) {
      return new ib.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ih $$2 = this.i();
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
      ih $$2 = this.i();
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

   protected void a(czs $$0, doz $$1, int $$2, int $$3, int $$4, eez $$5) {
      ib $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cza)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dgu.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dik.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eks $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cza $$0, int $$1, int $$2, int $$3, eez $$4) {
      return true;
   }

   protected doz a(cyd $$0, int $$1, int $$2, int $$3, eez $$4) {
      ib $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dca.a.n() : $$0.a_($$5);
   }

   protected boolean b(cza $$0, int $$1, int $$2, int $$3, eez $$4) {
      ib $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dur.a.c, $$5.u(), $$5.w());
   }

   protected void a(czs $$0, eez $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dca.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(czs $$0, eez $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, doz $$8, doz $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cyd)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(czs $$0, eez $$1, eez $$2, doz $$3, doz $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(czs $$0, eez $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, axr $$9, efl.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cyd)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(czs $$0, eez $$1, eez $$2, boolean $$3, axr $$4, efl.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(czs $$0, eez $$1, axr $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, doz $$10, doz $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cyd)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(czs $$0, eez $$1, axr $$2, float $$3, int $$4, int $$5, int $$6, doz $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(czs $$0, eez $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, doz $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cyd)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(czs $$0, doz $$1, int $$2, int $$3, int $$4, eez $$5) {
      ib.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ih.a);
         }
      }
   }

   protected boolean a(doz $$0) {
      return $$0.i() || $$0.k() || $$0.a(dca.fg) || $$0.a(dca.bw) || $$0.a(dca.bx);
   }

   protected boolean a(czs $$0, eez $$1, axr $$2, int $$3, int $$4, int $$5, ajt $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static doz a(cyd $$0, ib $$1, doz $$2) {
      ih $$3 = null;

      for (ih $$4 : ih.c.a) {
         ib $$5 = $$1.a($$4);
         doz $$6 = $$0.a_($$5);
         if ($$6.a(dca.cv)) {
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
         return $$2.a(dft.aE, $$3.g());
      } else {
         ih $$7 = $$2.c(dft.aE);
         ib $$8 = $$1.a($$7);
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

         return $$2.a(dft.aE, $$7);
      }
   }

   protected boolean a(czm $$0, eez $$1, axr $$2, ib $$3, ajt $$4, @Nullable doz $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dca.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dca.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dmf $$6 = $$0.c_($$3);
         if ($$6 instanceof dmm) {
            ((dmm)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(czs $$0, eez $$1, axr $$2, int $$3, int $$4, int $$5, ih $$6, ajt $$7) {
      ib $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dca.aU)) {
         this.a($$0, dca.aU.n().a(ded.b, $$6), $$3, $$4, $$5, $$1);
         dmf $$9 = $$0.c_($$8);
         if ($$9 instanceof dmx) {
            ((dmx)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eez a(Stream<efl> $$0) {
      return eez.b($$0.map(efl::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static efl a(List<efl> $$0, eez $$1) {
      for (efl $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ih i() {
      return this.b;
   }

   public void a(@Nullable ih $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dik.a;
         this.c = dgu.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dgu.b;
               this.d = dik.a;
               break;
            case e:
               this.c = dgu.b;
               this.d = dik.b;
               break;
            case f:
               this.c = dgu.a;
               this.d = dik.b;
               break;
            default:
               this.c = dgu.a;
               this.d = dik.a;
         }
      }
   }

   public dik a() {
      return this.d;
   }

   public dgu j() {
      return this.c;
   }

   public efy k() {
      return this.h;
   }

   public abstract static class a {
      protected doz a = dca.a.n();

      public abstract void a(axr var1, int var2, int var3, int var4, boolean var5);

      public doz a() {
         return this.a;
      }
   }
}
