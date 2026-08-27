import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dxl {
   private static final Logger a = LogUtils.getLogger();
   protected static final dhi e = cvc.nc.o();
   protected dwz f;
   @Nullable
   private hx b;
   private czw c;
   private dbm d;
   protected int g;
   private final dxy h;
   private static final Set<cva> i = ImmutableSet.builder()
      .add(cvc.fo)
      .add(cvc.cp)
      .add(cvc.cq)
      .add(cvc.dU)
      .add(cvc.kd)
      .add(cvc.ki)
      .add(cvc.kg)
      .add(cvc.ke)
      .add(cvc.kf)
      .add(cvc.cO)
      .add(cvc.eW)
      .build();

   protected dxl(dxy $$0, int $$1, dwz $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dxl(dxy $$0, rz $$1) {
      this(
         $$0, $$1.h("GD"), (dwz)dwz.a.parse(sn.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hx.b($$2));
   }

   protected static dwz a(int $$0, int $$1, int $$2, hx $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hx.a.c
         ? new dwz($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dwz($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hx a(ats $$0) {
      return hx.c.a.a($$0);
   }

   public final rz a(dxx $$0) {
      rz $$1 = new rz();
      $$1.a("id", jy.T.b(this.k()).toString());
      dwz.a.encodeStart(sn.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hx $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dxx var1, rz var2);

   public void a(dxl $$0, dxm $$1, ats $$2) {
   }

   public abstract void a(csu var1, css var2, djf var3, ats var4, dwz var5, crh var6, ht var7);

   public dwz f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(crh $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public ht h() {
      return new ht(this.f.f());
   }

   protected ht.a b(int $$0, int $$1, int $$2) {
      return new ht.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      hx $$2 = this.i();
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
      hx $$2 = this.i();
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

   protected void a(csu $$0, dhi $$1, int $$2, int $$3, int $$4, dwz $$5) {
      ht $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((csd)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != czw.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dbm.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ecs $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(csd $$0, int $$1, int $$2, int $$3, dwz $$4) {
      return true;
   }

   protected dhi a(crg $$0, int $$1, int $$2, int $$3, dwz $$4) {
      ht $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cvc.a.o() : $$0.a_($$5);
   }

   protected boolean b(csd $$0, int $$1, int $$2, int $$3, dwz $$4) {
      ht $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dmr.a.c, $$5.u(), $$5.w());
   }

   protected void a(csu $$0, dwz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cvc.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(csu $$0, dwz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dhi $$8, dhi $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((crg)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(csu $$0, dwz $$1, dwz $$2, dhi $$3, dhi $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(csu $$0, dwz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ats $$9, dxl.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((crg)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(csu $$0, dwz $$1, dwz $$2, boolean $$3, ats $$4, dxl.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(csu $$0, dwz $$1, ats $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dhi $$10, dhi $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((crg)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(csu $$0, dwz $$1, ats $$2, float $$3, int $$4, int $$5, int $$6, dhi $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(csu $$0, dwz $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dhi $$8, boolean $$9) {
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
               if (!$$9 || !this.a((crg)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(csu $$0, dhi $$1, int $$2, int $$3, int $$4, dwz $$5) {
      ht.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hx.a);
         }
      }
   }

   protected boolean a(dhi $$0) {
      return $$0.i() || $$0.k() || $$0.a(cvc.fg) || $$0.a(cvc.bw) || $$0.a(cvc.bx);
   }

   protected boolean a(csu $$0, dwz $$1, ats $$2, int $$3, int $$4, int $$5, agi $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dhi a(crg $$0, ht $$1, dhi $$2) {
      hx $$3 = null;

      for (hx $$4 : hx.c.a) {
         ht $$5 = $$1.a($$4);
         dhi $$6 = $$0.a_($$5);
         if ($$6.a(cvc.cv)) {
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
         return $$2.a(cyv.aE, $$3.g());
      } else {
         hx $$7 = $$2.c(cyv.aE);
         ht $$8 = $$1.a($$7);
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

         return $$2.a(cyv.aE, $$7);
      }
   }

   protected boolean a(csp $$0, dwz $$1, ats $$2, ht $$3, agi $$4, @Nullable dhi $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cvc.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cvc.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dfd $$6 = $$0.c_($$3);
         if ($$6 instanceof dfk) {
            ((dfk)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(csu $$0, dwz $$1, ats $$2, int $$3, int $$4, int $$5, hx $$6, agi $$7) {
      ht $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cvc.aU)) {
         this.a($$0, cvc.aU.o().a(cxf.b, $$6), $$3, $$4, $$5, $$1);
         dfd $$9 = $$0.c_($$8);
         if ($$9 instanceof dfv) {
            ((dfv)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dwz a(Stream<dxl> $$0) {
      return dwz.b($$0.map(dxl::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dxl a(List<dxl> $$0, dwz $$1) {
      for (dxl $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public hx i() {
      return this.b;
   }

   public void a(@Nullable hx $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dbm.a;
         this.c = czw.a;
      } else {
         switch ($$0) {
            case d:
               this.c = czw.b;
               this.d = dbm.a;
               break;
            case e:
               this.c = czw.b;
               this.d = dbm.b;
               break;
            case f:
               this.c = czw.a;
               this.d = dbm.b;
               break;
            default:
               this.c = czw.a;
               this.d = dbm.a;
         }
      }
   }

   public dbm a() {
      return this.d;
   }

   public czw j() {
      return this.c;
   }

   public dxy k() {
      return this.h;
   }

   public abstract static class a {
      protected dhi a = cvc.a.o();

      public abstract void a(ats var1, int var2, int var3, int var4, boolean var5);

      public dhi a() {
         return this.a;
      }
   }
}
