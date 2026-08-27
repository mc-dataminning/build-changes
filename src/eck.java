import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eck {
   private static final Logger a = LogUtils.getLogger();
   protected static final dme e = czh.nc.o();
   protected eby f;
   @Nullable
   private ih b;
   private deb c;
   private dfr d;
   protected int g;
   private final ecx h;
   private static final Set<czf> i = ImmutableSet.builder()
      .add(czh.fo)
      .add(czh.cp)
      .add(czh.cq)
      .add(czh.dU)
      .add(czh.kd)
      .add(czh.ki)
      .add(czh.kg)
      .add(czh.ke)
      .add(czh.kf)
      .add(czh.cO)
      .add(czh.eW)
      .build();

   protected eck(ecx $$0, int $$1, eby $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eck(ecx $$0, sy $$1) {
      this(
         $$0, $$1.h("GD"), (eby)eby.a.parse(tm.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ih.b($$2));
   }

   protected static eby a(int $$0, int $$1, int $$2, ih $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ih.a.c
         ? new eby($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eby($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ih a(awt $$0) {
      return ih.c.a.a($$0);
   }

   public final sy a(ecw $$0) {
      sy $$1 = new sy();
      $$1.a("id", kh.S.b(this.k()).toString());
      eby.a.encodeStart(tm.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ih $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ecw var1, sy var2);

   public void a(eck $$0, ecl $$1, awt $$2) {
   }

   public abstract void a(cwz var1, cwx var2, dob var3, awt var4, eby var5, cvl var6, ib var7);

   public eby f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cvl $$0, int $$1) {
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

   protected void a(cwz $$0, dme $$1, int $$2, int $$3, int $$4, eby $$5) {
      ib $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cwh)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != deb.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dfr.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ehr $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cwh $$0, int $$1, int $$2, int $$3, eby $$4) {
      return true;
   }

   protected dme a(cvk $$0, int $$1, int $$2, int $$3, eby $$4) {
      ib $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? czh.a.o() : $$0.a_($$5);
   }

   protected boolean b(cwh $$0, int $$1, int $$2, int $$3, eby $$4) {
      ib $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(drq.a.c, $$5.u(), $$5.w());
   }

   protected void a(cwz $$0, eby $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, czh.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cwz $$0, eby $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dme $$8, dme $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cvk)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cwz $$0, eby $$1, eby $$2, dme $$3, dme $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwz $$0, eby $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, awt $$9, eck.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cvk)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cwz $$0, eby $$1, eby $$2, boolean $$3, awt $$4, eck.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cwz $$0, eby $$1, awt $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dme $$10, dme $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cvk)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cwz $$0, eby $$1, awt $$2, float $$3, int $$4, int $$5, int $$6, dme $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cwz $$0, eby $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dme $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cvk)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cwz $$0, dme $$1, int $$2, int $$3, int $$4, eby $$5) {
      ib.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ih.a);
         }
      }
   }

   protected boolean a(dme $$0) {
      return $$0.i() || $$0.k() || $$0.a(czh.fg) || $$0.a(czh.bw) || $$0.a(czh.bx);
   }

   protected boolean a(cwz $$0, eby $$1, awt $$2, int $$3, int $$4, int $$5, ajc $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dme a(cvk $$0, ib $$1, dme $$2) {
      ih $$3 = null;

      for (ih $$4 : ih.c.a) {
         ib $$5 = $$1.a($$4);
         dme $$6 = $$0.a_($$5);
         if ($$6.a(czh.cv)) {
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
         return $$2.a(dda.aE, $$3.g());
      } else {
         ih $$7 = $$2.c(dda.aE);
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

         return $$2.a(dda.aE, $$7);
      }
   }

   protected boolean a(cwt $$0, eby $$1, awt $$2, ib $$3, ajc $$4, @Nullable dme $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(czh.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, czh.cv.o());
         }

         $$0.a($$3, $$5, 2);
         djl $$6 = $$0.c_($$3);
         if ($$6 instanceof djs) {
            ((djs)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cwz $$0, eby $$1, awt $$2, int $$3, int $$4, int $$5, ih $$6, ajc $$7) {
      ib $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(czh.aU)) {
         this.a($$0, czh.aU.o().a(dbk.b, $$6), $$3, $$4, $$5, $$1);
         djl $$9 = $$0.c_($$8);
         if ($$9 instanceof dkd) {
            ((dkd)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eby a(Stream<eck> $$0) {
      return eby.b($$0.map(eck::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eck a(List<eck> $$0, eby $$1) {
      for (eck $$2 : $$0) {
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
         this.d = dfr.a;
         this.c = deb.a;
      } else {
         switch ($$0) {
            case d:
               this.c = deb.b;
               this.d = dfr.a;
               break;
            case e:
               this.c = deb.b;
               this.d = dfr.b;
               break;
            case f:
               this.c = deb.a;
               this.d = dfr.b;
               break;
            default:
               this.c = deb.a;
               this.d = dfr.a;
         }
      }
   }

   public dfr a() {
      return this.d;
   }

   public deb j() {
      return this.c;
   }

   public ecx k() {
      return this.h;
   }

   public abstract static class a {
      protected dme a = czh.a.o();

      public abstract void a(awt var1, int var2, int var3, int var4, boolean var5);

      public dme a() {
         return this.a;
      }
   }
}
