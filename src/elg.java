import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class elg {
   private static final Logger a = LogUtils.getLogger();
   protected static final duo e = dhl.nc.o();
   protected eku f;
   @Nullable
   private jj b;
   private dmg c;
   private dnx d;
   protected int g;
   private final elt h;
   private static final Set<dhj> i = ImmutableSet.builder()
      .add(dhl.fo)
      .add(dhl.cp)
      .add(dhl.cq)
      .add(dhl.dU)
      .add(dhl.kd)
      .add(dhl.ki)
      .add(dhl.kg)
      .add(dhl.ke)
      .add(dhl.kf)
      .add(dhl.cO)
      .add(dhl.eW)
      .build();

   protected elg(elt $$0, int $$1, eku $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public elg(elt $$0, uf $$1) {
      this($$0, $$1.h("GD"), (eku)eku.a.parse(ut.a, $$1.c("BB")).getOrThrow($$0x -> new IllegalArgumentException("Invalid boundingbox: " + $$0x)));
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : jj.b($$2));
   }

   protected static eku a(int $$0, int $$1, int $$2, jj $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == jj.a.c
         ? new eku($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eku($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static jj a(azl $$0) {
      return jj.c.a.a($$0);
   }

   public final uf a(els $$0) {
      uf $$1 = new uf();
      $$1.a("id", lu.Q.b(this.k()).toString());
      eku.a.encodeStart(ut.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      jj $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(els var1, uf var2);

   public void a(elg $$0, elh $$1, azl $$2) {
   }

   public abstract void a(dfd var1, dfb var2, dwl var3, azl var4, eku var5, ddm var6, je var7);

   public eku f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(ddm $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public je h() {
      return new je(this.f.g());
   }

   protected je.a b(int $$0, int $$1, int $$2) {
      return new je.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      jj $$2 = this.i();
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
      jj $$2 = this.i();
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

   protected void a(dfd $$0, duo $$1, int $$2, int $$3, int $$4, eku $$5) {
      je $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dej)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dmg.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dnx.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eqp $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dej $$0, int $$1, int $$2, int $$3, eku $$4) {
      return true;
   }

   protected duo a(ddl $$0, int $$1, int $$2, int $$3, eku $$4) {
      je $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dhl.a.o() : $$0.a_($$5);
   }

   protected boolean b(dej $$0, int $$1, int $$2, int $$3, eku $$4) {
      je $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(eak.a.c, $$5.u(), $$5.w());
   }

   protected void a(dfd $$0, eku $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dhl.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dfd $$0, eku $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, duo $$8, duo $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((ddl)$$0, $$12, $$11, $$13, $$1).l()) {
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

   protected void a(dfd $$0, eku $$1, eku $$2, duo $$3, duo $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfd $$0, eku $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azl $$9, elg.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((ddl)$$0, $$12, $$11, $$13, $$1).l()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dfd $$0, eku $$1, eku $$2, boolean $$3, azl $$4, elg.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dfd $$0, eku $$1, azl $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, duo $$10, duo $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((ddl)$$0, $$15, $$14, $$16, $$1).l()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dfd $$0, eku $$1, azl $$2, float $$3, int $$4, int $$5, int $$6, duo $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dfd $$0, eku $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, duo $$8, boolean $$9) {
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
               if (!$$9 || !this.a((ddl)$$0, $$17, $$15, $$19, $$1).l()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dfd $$0, duo $$1, int $$2, int $$3, int $$4, eku $$5) {
      je.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.G_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(jj.a);
         }
      }
   }

   protected boolean a(duo $$0) {
      return $$0.l() || $$0.n() || $$0.a(dhl.fg) || $$0.a(dhl.bw) || $$0.a(dhl.bx);
   }

   protected boolean a(dfd $$0, eku $$1, azl $$2, int $$3, int $$4, int $$5, alb<etm> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static duo a(ddl $$0, je $$1, duo $$2) {
      jj $$3 = null;

      for (jj $$4 : jj.c.a) {
         je $$5 = $$1.a($$4);
         duo $$6 = $$0.a_($$5);
         if ($$6.a(dhl.cv)) {
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
         return $$2.b(dlf.aF, $$3.g());
      } else {
         jj $$7 = $$2.c(dlf.aF);
         je $$8 = $$1.a($$7);
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

         return $$2.b(dlf.aF, $$7);
      }
   }

   protected boolean a(dew $$0, eku $$1, azl $$2, je $$3, alb<etm> $$4, @Nullable duo $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dhl.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dhl.cv.o());
         }

         $$0.a($$3, $$5, 2);
         drs $$6 = $$0.c_($$3);
         if ($$6 instanceof drz) {
            ((drz)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dfd $$0, eku $$1, azl $$2, int $$3, int $$4, int $$5, jj $$6, alb<etm> $$7) {
      je $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dhl.aU)) {
         this.a($$0, dhl.aU.o().b(djo.b, $$6), $$3, $$4, $$5, $$1);
         drs $$9 = $$0.c_($$8);
         if ($$9 instanceof dsl) {
            ((dsl)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eku a(Stream<elg> $$0) {
      return eku.b($$0.map(elg::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static elg a(List<elg> $$0, eku $$1) {
      for (elg $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public jj i() {
      return this.b;
   }

   public void a(@Nullable jj $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dnx.a;
         this.c = dmg.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dmg.b;
               this.d = dnx.a;
               break;
            case e:
               this.c = dmg.b;
               this.d = dnx.b;
               break;
            case f:
               this.c = dmg.a;
               this.d = dnx.b;
               break;
            default:
               this.c = dmg.a;
               this.d = dnx.a;
         }
      }
   }

   public dnx a() {
      return this.d;
   }

   public dmg j() {
      return this.c;
   }

   public elt k() {
      return this.h;
   }

   public abstract static class a {
      protected duo a = dhl.a.o();

      public abstract void a(azl var1, int var2, int var3, int var4, boolean var5);

      public duo a() {
         return this.a;
      }
   }
}
