import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dzk {
   private static final Logger a = LogUtils.getLogger();
   protected static final djh e = cws.nc.o();
   protected dyy f;
   @Nullable
   private ic b;
   private dbm c;
   private ddc d;
   protected int g;
   private final dzx h;
   private static final Set<cwq> i = ImmutableSet.builder()
      .add(cws.fo)
      .add(cws.cp)
      .add(cws.cq)
      .add(cws.dU)
      .add(cws.kd)
      .add(cws.ki)
      .add(cws.kg)
      .add(cws.ke)
      .add(cws.kf)
      .add(cws.cO)
      .add(cws.eW)
      .build();

   protected dzk(dzx $$0, int $$1, dyy $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dzk(dzx $$0, sn $$1) {
      this(
         $$0, $$1.h("GD"), (dyy)dyy.a.parse(tb.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ic.b($$2));
   }

   protected static dyy a(int $$0, int $$1, int $$2, ic $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ic.a.c
         ? new dyy($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dyy($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ic a(auv $$0) {
      return ic.c.a.a($$0);
   }

   public final sn a(dzw $$0) {
      sn $$1 = new sn();
      $$1.a("id", kd.S.b(this.k()).toString());
      dyy.a.encodeStart(tb.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ic $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dzw var1, sn var2);

   public void a(dzk $$0, dzl $$1, auv $$2) {
   }

   public abstract void a(cuk var1, cui var2, dle var3, auv var4, dyy var5, csw var6, hx var7);

   public dyy f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(csw $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public hx h() {
      return new hx(this.f.g());
   }

   protected hx.a b(int $$0, int $$1, int $$2) {
      return new hx.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ic $$2 = this.i();
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
      ic $$2 = this.i();
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

   protected void a(cuk $$0, djh $$1, int $$2, int $$3, int $$4, dyy $$5) {
      hx $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cts)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dbm.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != ddc.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eer $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cts $$0, int $$1, int $$2, int $$3, dyy $$4) {
      return true;
   }

   protected djh a(csv $$0, int $$1, int $$2, int $$3, dyy $$4) {
      hx $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cws.a.o() : $$0.a_($$5);
   }

   protected boolean b(cts $$0, int $$1, int $$2, int $$3, dyy $$4) {
      hx $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(doq.a.c, $$5.u(), $$5.w());
   }

   protected void a(cuk $$0, dyy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cws.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cuk $$0, dyy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, djh $$8, djh $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((csv)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cuk $$0, dyy $$1, dyy $$2, djh $$3, djh $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cuk $$0, dyy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, auv $$9, dzk.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((csv)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cuk $$0, dyy $$1, dyy $$2, boolean $$3, auv $$4, dzk.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(cuk $$0, dyy $$1, auv $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, djh $$10, djh $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((csv)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cuk $$0, dyy $$1, auv $$2, float $$3, int $$4, int $$5, int $$6, djh $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cuk $$0, dyy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, djh $$8, boolean $$9) {
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
               if (!$$9 || !this.a((csv)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cuk $$0, djh $$1, int $$2, int $$3, int $$4, dyy $$5) {
      hx.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ic.a);
         }
      }
   }

   protected boolean a(djh $$0) {
      return $$0.i() || $$0.k() || $$0.a(cws.fg) || $$0.a(cws.bw) || $$0.a(cws.bx);
   }

   protected boolean a(cuk $$0, dyy $$1, auv $$2, int $$3, int $$4, int $$5, ahg $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static djh a(csv $$0, hx $$1, djh $$2) {
      ic $$3 = null;

      for (ic $$4 : ic.c.a) {
         hx $$5 = $$1.a($$4);
         djh $$6 = $$0.a_($$5);
         if ($$6.a(cws.cv)) {
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
         return $$2.a(dal.aE, $$3.g());
      } else {
         ic $$7 = $$2.c(dal.aE);
         hx $$8 = $$1.a($$7);
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

         return $$2.a(dal.aE, $$7);
      }
   }

   protected boolean a(cue $$0, dyy $$1, auv $$2, hx $$3, ahg $$4, @Nullable djh $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cws.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cws.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dgv $$6 = $$0.c_($$3);
         if ($$6 instanceof dhc) {
            ((dhc)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cuk $$0, dyy $$1, auv $$2, int $$3, int $$4, int $$5, ic $$6, ahg $$7) {
      hx $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cws.aU)) {
         this.a($$0, cws.aU.o().a(cyv.b, $$6), $$3, $$4, $$5, $$1);
         dgv $$9 = $$0.c_($$8);
         if ($$9 instanceof dhn) {
            ((dhn)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dyy a(Stream<dzk> $$0) {
      return dyy.b($$0.map(dzk::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dzk a(List<dzk> $$0, dyy $$1) {
      for (dzk $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ic i() {
      return this.b;
   }

   public void a(@Nullable ic $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = ddc.a;
         this.c = dbm.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dbm.b;
               this.d = ddc.a;
               break;
            case e:
               this.c = dbm.b;
               this.d = ddc.b;
               break;
            case f:
               this.c = dbm.a;
               this.d = ddc.b;
               break;
            default:
               this.c = dbm.a;
               this.d = ddc.a;
         }
      }
   }

   public ddc a() {
      return this.d;
   }

   public dbm j() {
      return this.c;
   }

   public dzx k() {
      return this.h;
   }

   public abstract static class a {
      protected djh a = cws.a.o();

      public abstract void a(auv var1, int var2, int var3, int var4, boolean var5);

      public djh a() {
         return this.a;
      }
   }
}
