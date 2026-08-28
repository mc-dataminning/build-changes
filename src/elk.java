import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class elk {
   private static final Logger a = LogUtils.getLogger();
   protected static final dus e = dho.nc.n();
   protected eky f;
   @Nullable
   private jk b;
   private dmj c;
   private doa d;
   protected int g;
   private final elx h;
   private static final Set<dhm> i = ImmutableSet.builder()
      .add(dho.fo)
      .add(dho.cp)
      .add(dho.cq)
      .add(dho.dU)
      .add(dho.kd)
      .add(dho.ki)
      .add(dho.kg)
      .add(dho.ke)
      .add(dho.kf)
      .add(dho.cO)
      .add(dho.eW)
      .build();

   protected elk(elx $$0, int $$1, eky $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public elk(elx $$0, ug $$1) {
      this($$0, $$1.h("GD"), (eky)eky.a.parse(uu.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jk.b($$2));
   }

   protected static eky a(int $$0, int $$1, int $$2, jk $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jk.a.c
         ? new eky($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eky($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jk a(azn $$0) {
      return jk.c.a.a($$0);
   }

   public final ug a(elw $$0) {
      ug $$1 = new ug();
      $$1.a("id", lv.Q.b(this.k()).toString());
      eky.a.encodeStart(uu.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jk $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(elw var1, ug var2);

   public void a(elk $$0, ell $$1, azn $$2) {
   }

   public abstract void a(dfg var1, dfe var2, dwp var3, azn var4, eky var5, ddp var6, jf var7);

   public eky f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(ddp $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jf h() {
      return new jf(this.f.g());
   }

   protected jf.a b(int $$0, int $$1, int $$2) {
      return new jf.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jk $$2 = this.i();
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
      jk $$2 = this.i();
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

   protected void a(dfg $$0, dus $$1, int $$2, int $$3, int $$4, eky $$5) {
      jf $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dem)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dmj.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != doa.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eqt $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dem $$0, int $$1, int $$2, int $$3, eky $$4) {
      return true;
   }

   protected dus a(ddo $$0, int $$1, int $$2, int $$3, eky $$4) {
      jf $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dho.a.n() : $$0.a_($$5);
   }

   protected boolean b(dem $$0, int $$1, int $$2, int $$3, eky $$4) {
      jf $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(eao.a.c, $$5.u(), $$5.w());
   }

   protected void a(dfg $$0, eky $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dho.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dfg $$0, eky $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dus $$8, dus $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((ddo)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dfg $$0, eky $$1, eky $$2, dus $$3, dus $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfg $$0, eky $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azn $$9, elk.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((ddo)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dfg $$0, eky $$1, eky $$2, boolean $$3, azn $$4, elk.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfg $$0, eky $$1, azn $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dus $$10, dus $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((ddo)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dfg $$0, eky $$1, azn $$2, float $$3, int $$4, int $$5, int $$6, dus $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dfg $$0, eky $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dus $$8, boolean $$9) {
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
               if (!$$9 || !this.a((ddo)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dfg $$0, dus $$1, int $$2, int $$3, int $$4, eky $$5) {
      jf.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.H_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jk.a);
         }
      }
   }

   protected boolean a(dus $$0) {
      return $$0.l() || $$0.n() || $$0.a(dho.fg) || $$0.a(dho.bw) || $$0.a(dho.bx);
   }

   protected boolean a(dfg $$0, eky $$1, azn $$2, int $$3, int $$4, int $$5, ald<etq> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dus a(ddo $$0, jf $$1, dus $$2) {
      jk $$3 = null;

      for (jk $$4 : jk.c.a) {
         jf $$5 = $$1.a($$4);
         dus $$6 = $$0.a_($$5);
         if ($$6.a(dho.cv)) {
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
         return $$2.b(dli.aF, $$3.g());
      } else {
         jk $$7 = $$2.c(dli.aF);
         jf $$8 = $$1.a($$7);
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

         return $$2.b(dli.aF, $$7);
      }
   }

   protected boolean a(dez $$0, eky $$1, azn $$2, jf $$3, ald<etq> $$4, @Nullable dus $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dho.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dho.cv.n());
         }

         $$0.a($$3, $$5, 2);
         drv $$6 = $$0.c_($$3);
         if ($$6 instanceof dsc) {
            ((dsc)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dfg $$0, eky $$1, azn $$2, int $$3, int $$4, int $$5, jk $$6, ald<etq> $$7) {
      jf $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dho.aU)) {
         this.a($$0, dho.aU.n().b(djr.b, $$6), $$3, $$4, $$5, $$1);
         drv $$9 = $$0.c_($$8);
         if ($$9 instanceof dso) {
            ((dso)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eky a(Stream<elk> $$0) {
      return eky.b($$0.map(elk::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static elk a(List<elk> $$0, eky $$1) {
      for (elk $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jk i() {
      return this.b;
   }

   public void a(@Nullable jk $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = doa.a;
         this.c = dmj.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dmj.b;
               this.d = doa.a;
               break;
            case e:
               this.c = dmj.b;
               this.d = doa.b;
               break;
            case f:
               this.c = dmj.a;
               this.d = doa.b;
               break;
            default:
               this.c = dmj.a;
               this.d = doa.a;
         }
      }
   }

   public doa a() {
      return this.d;
   }

   public dmj j() {
      return this.c;
   }

   public elx k() {
      return this.h;
   }

   public abstract static class a {
      protected dus a = dho.a.n();

      public abstract void a(azn var1, int var2, int var3, int var4, boolean var5);

      public dus a() {
         return this.a;
      }
   }
}
