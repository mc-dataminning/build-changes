import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dvm {
   private static final Logger a = LogUtils.getLogger();
   protected static final dfj e = csw.nc.n();
   protected dva f;
   @Nullable
   private hc b;
   private cxq c;
   private czh d;
   protected int g;
   private final dvz h;
   private static final Set<csv> i = ImmutableSet.builder()
      .add(csw.fo)
      .add(csw.cp)
      .add(csw.cq)
      .add(csw.dU)
      .add(csw.kd)
      .add(csw.ki)
      .add(csw.kg)
      .add(csw.ke)
      .add(csw.kf)
      .add(csw.cO)
      .add(csw.eX)
      .build();

   protected dvm(dvz $$0, int $$1, dva $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dvm(dvz $$0, qx $$1) {
      this(
         $$0, $$1.h("GD"), (dva)dva.a.parse(ri.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hc.b($$2));
   }

   protected static dva a(int $$0, int $$1, int $$2, hc $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hc.a.c
         ? new dva($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dva($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hc a(asc $$0) {
      return hc.c.a.a($$0);
   }

   public final qx a(dvy $$0) {
      qx $$1 = new qx();
      $$1.a("id", jd.T.b(this.k()).toString());
      dva.a.encodeStart(ri.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hc $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dvy var1, qx var2);

   public void a(dvm $$0, dvn $$1, asc $$2) {
   }

   public abstract void a(cqp var1, cqn var2, dhg var3, asc var4, dva var5, cpc var6, gw var7);

   public dva f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cpc $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public gw h() {
      return new gw(this.f.f());
   }

   protected gw.a b(int $$0, int $$1, int $$2) {
      return new gw.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      hc $$2 = this.i();
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
      hc $$2 = this.i();
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

   protected void a(cqp $$0, dfj $$1, int $$2, int $$3, int $$4, dva $$5) {
      gw $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cpy)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cxq.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != czh.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eam $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cpy $$0, int $$1, int $$2, int $$3, dva $$4) {
      return true;
   }

   protected dfj a(cpb $$0, int $$1, int $$2, int $$3, dva $$4) {
      gw $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? csw.a.n() : $$0.a_($$5);
   }

   protected boolean b(cpy $$0, int $$1, int $$2, int $$3, dva $$4) {
      gw $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dks.a.c, $$5.u(), $$5.w());
   }

   protected void a(cqp $$0, dva $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, csw.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cqp $$0, dva $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfj $$8, dfj $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cpb)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cqp $$0, dva $$1, dva $$2, dfj $$3, dfj $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqp $$0, dva $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, asc $$9, dvm.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cpb)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cqp $$0, dva $$1, dva $$2, boolean $$3, asc $$4, dvm.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqp $$0, dva $$1, asc $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dfj $$10, dfj $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cpb)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cqp $$0, dva $$1, asc $$2, float $$3, int $$4, int $$5, int $$6, dfj $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cqp $$0, dva $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfj $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cpb)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cqp $$0, dfj $$1, int $$2, int $$3, int $$4, dva $$5) {
      gw.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.H_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hc.a);
         }
      }
   }

   protected boolean a(dfj $$0) {
      return $$0.i() || $$0.k() || $$0.a(csw.fg) || $$0.a(csw.bw) || $$0.a(csw.bx);
   }

   protected boolean a(cqp $$0, dva $$1, asc $$2, int $$3, int $$4, int $$5, aex $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dfj a(cpb $$0, gw $$1, dfj $$2) {
      hc $$3 = null;

      for (hc $$4 : hc.c.a) {
         gw $$5 = $$1.a($$4);
         dfj $$6 = $$0.a_($$5);
         if ($$6.a(csw.cv)) {
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
         return $$2.a(cwo.aC, $$3.g());
      } else {
         hc $$7 = $$2.c(cwo.aC);
         gw $$8 = $$1.a($$7);
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

         return $$2.a(cwo.aC, $$7);
      }
   }

   protected boolean a(cqk $$0, dva $$1, asc $$2, gw $$3, aex $$4, @Nullable dfj $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(csw.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, csw.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dcv $$6 = $$0.c_($$3);
         if ($$6 instanceof ddc) {
            ((ddc)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cqp $$0, dva $$1, asc $$2, int $$3, int $$4, int $$5, hc $$6, aex $$7) {
      gw $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(csw.aU)) {
         this.a($$0, csw.aU.n().a(cuw.a, $$6), $$3, $$4, $$5, $$1);
         dcv $$9 = $$0.c_($$8);
         if ($$9 instanceof ddm) {
            ((ddm)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dva a(Stream<dvm> $$0) {
      return dva.b($$0.map(dvm::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dvm a(List<dvm> $$0, dva $$1) {
      for (dvm $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public hc i() {
      return this.b;
   }

   public void a(@Nullable hc $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = czh.a;
         this.c = cxq.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cxq.b;
               this.d = czh.a;
               break;
            case e:
               this.c = cxq.b;
               this.d = czh.b;
               break;
            case f:
               this.c = cxq.a;
               this.d = czh.b;
               break;
            default:
               this.c = cxq.a;
               this.d = czh.a;
         }
      }
   }

   public czh a() {
      return this.d;
   }

   public cxq j() {
      return this.c;
   }

   public dvz k() {
      return this.h;
   }

   public abstract static class a {
      protected dfj a = csw.a.n();

      public abstract void a(asc var1, int var2, int var3, int var4, boolean var5);

      public dfj a() {
         return this.a;
      }
   }
}
