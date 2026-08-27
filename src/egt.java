import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class egt {
   private static final Logger a = LogUtils.getLogger();
   protected static final dqh e = ddg.nc.n();
   protected egh f;
   @Nullable
   private is b;
   private dib c;
   private djr d;
   protected int g;
   private final ehg h;
   private static final Set<dde> i = ImmutableSet.builder()
      .add(ddg.fo)
      .add(ddg.cp)
      .add(ddg.cq)
      .add(ddg.dU)
      .add(ddg.kd)
      .add(ddg.ki)
      .add(ddg.kg)
      .add(ddg.ke)
      .add(ddg.kf)
      .add(ddg.cO)
      .add(ddg.eW)
      .build();

   protected egt(ehg $$0, int $$1, egh $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public egt(ehg $$0, ua $$1) {
      this(
         $$0, $$1.h("GD"), (egh)egh.a.parse(uo.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : is.b($$2));
   }

   protected static egh a(int $$0, int $$1, int $$2, is $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == is.a.c
         ? new egh($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new egh($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static is a(ayg $$0) {
      return is.c.a.a($$0);
   }

   public final ua a(ehf $$0) {
      ua $$1 = new ua();
      $$1.a("id", ld.S.b(this.k()).toString());
      egh.a.encodeStart(uo.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      is $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ehf var1, ua var2);

   public void a(egt $$0, egu $$1, ayg $$2) {
   }

   public abstract void a(day var1, daw var2, dse var3, ayg var4, egh var5, czk var6, in var7);

   public egh f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(czk $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public in h() {
      return new in(this.f.g());
   }

   protected in.a b(int $$0, int $$1, int $$2) {
      return new in.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      is $$2 = this.i();
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
      is $$2 = this.i();
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

   protected void a(day $$0, dqh $$1, int $$2, int $$3, int $$4, egh $$5) {
      in $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dag)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dib.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != djr.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ema $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dag $$0, int $$1, int $$2, int $$3, egh $$4) {
      return true;
   }

   protected dqh a(czj $$0, int $$1, int $$2, int $$3, egh $$4) {
      in $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? ddg.a.n() : $$0.a_($$5);
   }

   protected boolean b(dag $$0, int $$1, int $$2, int $$3, egh $$4) {
      in $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dvz.a.c, $$5.u(), $$5.w());
   }

   protected void a(day $$0, egh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, ddg.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(day $$0, egh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dqh $$8, dqh $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((czj)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(day $$0, egh $$1, egh $$2, dqh $$3, dqh $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(day $$0, egh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayg $$9, egt.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((czj)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(day $$0, egh $$1, egh $$2, boolean $$3, ayg $$4, egt.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(day $$0, egh $$1, ayg $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dqh $$10, dqh $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((czj)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(day $$0, egh $$1, ayg $$2, float $$3, int $$4, int $$5, int $$6, dqh $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(day $$0, egh $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dqh $$8, boolean $$9) {
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
               if (!$$9 || !this.a((czj)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(day $$0, dqh $$1, int $$2, int $$3, int $$4, egh $$5) {
      in.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(is.a);
         }
      }
   }

   protected boolean a(dqh $$0) {
      return $$0.i() || $$0.k() || $$0.a(ddg.fg) || $$0.a(ddg.bw) || $$0.a(ddg.bx);
   }

   protected boolean a(day $$0, egh $$1, ayg $$2, int $$3, int $$4, int $$5, akg<eoq> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dqh a(czj $$0, in $$1, dqh $$2) {
      is $$3 = null;

      for (is $$4 : is.c.a) {
         in $$5 = $$1.a($$4);
         dqh $$6 = $$0.a_($$5);
         if ($$6.a(ddg.cv)) {
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
         return $$2.a(dha.aE, $$3.g());
      } else {
         is $$7 = $$2.c(dha.aE);
         in $$8 = $$1.a($$7);
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

         return $$2.a(dha.aE, $$7);
      }
   }

   protected boolean a(das $$0, egh $$1, ayg $$2, in $$3, akg<eoq> $$4, @Nullable dqh $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(ddg.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, ddg.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dnm $$6 = $$0.c_($$3);
         if ($$6 instanceof dnt) {
            ((dnt)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(day $$0, egh $$1, ayg $$2, int $$3, int $$4, int $$5, is $$6, akg<eoq> $$7) {
      in $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(ddg.aU)) {
         this.a($$0, ddg.aU.n().a(dfj.b, $$6), $$3, $$4, $$5, $$1);
         dnm $$9 = $$0.c_($$8);
         if ($$9 instanceof doe) {
            ((doe)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static egh a(Stream<egt> $$0) {
      return egh.b($$0.map(egt::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static egt a(List<egt> $$0, egh $$1) {
      for (egt $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public is i() {
      return this.b;
   }

   public void a(@Nullable is $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = djr.a;
         this.c = dib.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dib.b;
               this.d = djr.a;
               break;
            case e:
               this.c = dib.b;
               this.d = djr.b;
               break;
            case f:
               this.c = dib.a;
               this.d = djr.b;
               break;
            default:
               this.c = dib.a;
               this.d = djr.a;
         }
      }
   }

   public djr a() {
      return this.d;
   }

   public dib j() {
      return this.c;
   }

   public ehg k() {
      return this.h;
   }

   public abstract static class a {
      protected dqh a = ddg.a.n();

      public abstract void a(ayg var1, int var2, int var3, int var4, boolean var5);

      public dqh a() {
         return this.a;
      }
   }
}
