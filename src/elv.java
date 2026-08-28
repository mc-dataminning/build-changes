import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class elv {
   private static final Logger a = LogUtils.getLogger();
   protected static final dvd e = dia.nc.m();
   protected elj f;
   @Nullable
   private jl b;
   private dmu c;
   private dol d;
   protected int g;
   private final emi h;
   private static final Set<dhy> i = ImmutableSet.builder()
      .add(dia.fo)
      .add(dia.cp)
      .add(dia.cq)
      .add(dia.dU)
      .add(dia.kd)
      .add(dia.ki)
      .add(dia.kg)
      .add(dia.ke)
      .add(dia.kf)
      .add(dia.cO)
      .add(dia.eW)
      .build();

   protected elv(emi $$0, int $$1, elj $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public elv(emi $$0, uj $$1) {
      this($$0, $$1.h("GD"), (elj)elj.a.parse(ux.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jl.b($$2));
   }

   protected static elj a(int $$0, int $$1, int $$2, jl $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jl.a.c
         ? new elj($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new elj($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jl a(azr $$0) {
      return jl.c.a.a($$0);
   }

   public final uj a(emh $$0) {
      uj $$1 = new uj();
      $$1.a("id", lx.Q.b(this.k()).toString());
      elj.a.encodeStart(ux.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jl $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(emh var1, uj var2);

   public void a(elv $$0, elw $$1, azr $$2) {
   }

   public abstract void a(dfs var1, dfq var2, dxa var3, azr var4, elj var5, deb var6, jg var7);

   public elj f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(deb $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public jg h() {
      return new jg(this.f.g());
   }

   protected jg.a b(int $$0, int $$1, int $$2) {
      return new jg.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jl $$2 = this.i();
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
      jl $$2 = this.i();
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

   protected void a(dfs $$0, dvd $$1, int $$2, int $$3, int $$4, elj $$5) {
      jg $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dey)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dmu.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dol.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ere $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dey $$0, int $$1, int $$2, int $$3, elj $$4) {
      return true;
   }

   protected dvd a(dea $$0, int $$1, int $$2, int $$3, elj $$4) {
      jg $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dia.a.m() : $$0.a_($$5);
   }

   protected boolean b(dey $$0, int $$1, int $$2, int $$3, elj $$4) {
      jg $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(eaz.a.c, $$5.u(), $$5.w());
   }

   protected void a(dfs $$0, elj $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dia.a.m(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dfs $$0, elj $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dvd $$8, dvd $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dea)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dfs $$0, elj $$1, elj $$2, dvd $$3, dvd $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfs $$0, elj $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azr $$9, elv.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dea)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dfs $$0, elj $$1, elj $$2, boolean $$3, azr $$4, elv.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfs $$0, elj $$1, azr $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dvd $$10, dvd $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dea)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dfs $$0, elj $$1, azr $$2, float $$3, int $$4, int $$5, int $$6, dvd $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dfs $$0, elj $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dvd $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dea)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dfs $$0, dvd $$1, int $$2, int $$3, int $$4, elj $$5) {
      jg.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jl.a);
         }
      }
   }

   protected boolean a(dvd $$0) {
      return $$0.l() || $$0.n() || $$0.a(dia.fg) || $$0.a(dia.bw) || $$0.a(dia.bx);
   }

   protected boolean a(dfs $$0, elj $$1, azr $$2, int $$3, int $$4, int $$5, alg<eub> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dvd a(dea $$0, jg $$1, dvd $$2) {
      jl $$3 = null;

      for (jl $$4 : jl.c.a) {
         jg $$5 = $$1.a($$4);
         dvd $$6 = $$0.a_($$5);
         if ($$6.a(dia.cv)) {
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
         return $$2.b(dlt.aF, $$3.g());
      } else {
         jl $$7 = $$2.c(dlt.aF);
         jg $$8 = $$1.a($$7);
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

         return $$2.b(dlt.aF, $$7);
      }
   }

   protected boolean a(dfl $$0, elj $$1, azr $$2, jg $$3, alg<eub> $$4, @Nullable dvd $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dia.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dia.cv.m());
         }

         $$0.a($$3, $$5, 2);
         dsg $$6 = $$0.c_($$3);
         if ($$6 instanceof dsn) {
            ((dsn)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dfs $$0, elj $$1, azr $$2, int $$3, int $$4, int $$5, jl $$6, alg<eub> $$7) {
      jg $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dia.aU)) {
         this.a($$0, dia.aU.m().b(dkd.b, $$6), $$3, $$4, $$5, $$1);
         dsg $$9 = $$0.c_($$8);
         if ($$9 instanceof dsz) {
            ((dsz)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static elj a(Stream<elv> $$0) {
      return elj.b($$0.map(elv::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static elv a(List<elv> $$0, elj $$1) {
      for (elv $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jl i() {
      return this.b;
   }

   public void a(@Nullable jl $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dol.a;
         this.c = dmu.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dmu.b;
               this.d = dol.a;
               break;
            case e:
               this.c = dmu.b;
               this.d = dol.b;
               break;
            case f:
               this.c = dmu.a;
               this.d = dol.b;
               break;
            default:
               this.c = dmu.a;
               this.d = dol.a;
         }
      }
   }

   public dol a() {
      return this.d;
   }

   public dmu j() {
      return this.c;
   }

   public emi k() {
      return this.h;
   }

   public abstract static class a {
      protected dvd a = dia.a.m();

      public abstract void a(azr var1, int var2, int var3, int var4, boolean var5);

      public dvd a() {
         return this.a;
      }
   }
}
