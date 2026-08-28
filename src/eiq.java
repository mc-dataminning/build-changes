import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class eiq {
   private static final Logger a = LogUtils.getLogger();
   protected static final dse e = dfd.nc.o();
   protected eie f;
   @Nullable
   private je b;
   private djy c;
   private dlo d;
   protected int g;
   private final ejd h;
   private static final Set<dfb> i = ImmutableSet.builder()
      .add(dfd.fo)
      .add(dfd.cp)
      .add(dfd.cq)
      .add(dfd.dU)
      .add(dfd.kd)
      .add(dfd.ki)
      .add(dfd.kg)
      .add(dfd.ke)
      .add(dfd.kf)
      .add(dfd.cO)
      .add(dfd.eW)
      .build();

   protected eiq(ejd $$0, int $$1, eie $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public eiq(ejd $$0, us $$1) {
      this(
         $$0, $$1.h("GD"), (eie)eie.a.parse(vg.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : je.b($$2));
   }

   protected static eie a(int $$0, int $$1, int $$2, je $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == je.a.c
         ? new eie($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new eie($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static je a(azh $$0) {
      return je.c.a.a($$0);
   }

   public final us a(ejc $$0) {
      us $$1 = new us();
      $$1.a("id", lp.S.b(this.k()).toString());
      eie.a.encodeStart(vg.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      je $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(ejc var1, us var2);

   public void a(eiq $$0, eir $$1, azh $$2) {
   }

   public abstract void a(dcv var1, dct var2, dub var3, azh var4, eie var5, dbh var6, iz var7);

   public eie f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(dbh $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public iz h() {
      return new iz(this.f.g());
   }

   protected iz.a b(int $$0, int $$1, int $$2) {
      return new iz.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      je $$2 = this.i();
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
      je $$2 = this.i();
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

   protected void a(dcv $$0, dse $$1, int $$2, int $$3, int $$4, eie $$5) {
      iz $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((dcd)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != djy.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dlo.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            enx $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(dcd $$0, int $$1, int $$2, int $$3, eie $$4) {
      return true;
   }

   protected dse a(dbg $$0, int $$1, int $$2, int $$3, eie $$4) {
      iz $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dfd.a.o() : $$0.a_($$5);
   }

   protected boolean b(dcd $$0, int $$1, int $$2, int $$3, eie $$4) {
      iz $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dxw.a.c, $$5.u(), $$5.w());
   }

   protected void a(dcv $$0, eie $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dfd.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dcv $$0, eie $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dse $$8, dse $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((dbg)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dcv $$0, eie $$1, eie $$2, dse $$3, dse $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcv $$0, eie $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, azh $$9, eiq.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((dbg)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dcv $$0, eie $$1, eie $$2, boolean $$3, azh $$4, eiq.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dcv $$0, eie $$1, azh $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dse $$10, dse $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((dbg)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dcv $$0, eie $$1, azh $$2, float $$3, int $$4, int $$5, int $$6, dse $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dcv $$0, eie $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dse $$8, boolean $$9) {
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
               if (!$$9 || !this.a((dbg)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dcv $$0, dse $$1, int $$2, int $$3, int $$4, eie $$5) {
      iz.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(je.a);
         }
      }
   }

   protected boolean a(dse $$0) {
      return $$0.i() || $$0.k() || $$0.a(dfd.fg) || $$0.a(dfd.bw) || $$0.a(dfd.bx);
   }

   protected boolean a(dcv $$0, eie $$1, azh $$2, int $$3, int $$4, int $$5, ale<eqp> $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dse a(dbg $$0, iz $$1, dse $$2) {
      je $$3 = null;

      for (je $$4 : je.c.a) {
         iz $$5 = $$1.a($$4);
         dse $$6 = $$0.a_($$5);
         if ($$6.a(dfd.cv)) {
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
         return $$2.a(dix.aE, $$3.g());
      } else {
         je $$7 = $$2.c(dix.aE);
         iz $$8 = $$1.a($$7);
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

         return $$2.a(dix.aE, $$7);
      }
   }

   protected boolean a(dcp $$0, eie $$1, azh $$2, iz $$3, ale<eqp> $$4, @Nullable dse $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dfd.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dfd.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dpj $$6 = $$0.c_($$3);
         if ($$6 instanceof dpq) {
            ((dpq)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dcv $$0, eie $$1, azh $$2, int $$3, int $$4, int $$5, je $$6, ale<eqp> $$7) {
      iz $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dfd.aU)) {
         this.a($$0, dfd.aU.o().a(dhg.b, $$6), $$3, $$4, $$5, $$1);
         dpj $$9 = $$0.c_($$8);
         if ($$9 instanceof dqb) {
            ((dqb)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static eie a(Stream<eiq> $$0) {
      return eie.b($$0.map(eiq::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static eiq a(List<eiq> $$0, eie $$1) {
      for (eiq $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public je i() {
      return this.b;
   }

   public void a(@Nullable je $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dlo.a;
         this.c = djy.a;
      } else {
         switch ($$0) {
            case d:
               this.c = djy.b;
               this.d = dlo.a;
               break;
            case e:
               this.c = djy.b;
               this.d = dlo.b;
               break;
            case f:
               this.c = djy.a;
               this.d = dlo.b;
               break;
            default:
               this.c = djy.a;
               this.d = dlo.a;
         }
      }
   }

   public dlo a() {
      return this.d;
   }

   public djy j() {
      return this.c;
   }

   public ejd k() {
      return this.h;
   }

   public abstract static class a {
      protected dse a = dfd.a.o();

      public abstract void a(azh var1, int var2, int var3, int var4, boolean var5);

      public dse a() {
         return this.a;
      }
   }
}
