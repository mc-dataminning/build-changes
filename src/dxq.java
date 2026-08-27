import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dxq {
   private static final Logger a = LogUtils.getLogger();
   protected static final dhn e = cvh.nc.o();
   protected dxe f;
   @Nullable
   private ib b;
   private dab c;
   private dbr d;
   protected int g;
   private final dyd h;
   private static final Set<cvf> i = ImmutableSet.builder()
      .add(cvh.fo)
      .add(cvh.cp)
      .add(cvh.cq)
      .add(cvh.dU)
      .add(cvh.kd)
      .add(cvh.ki)
      .add(cvh.kg)
      .add(cvh.ke)
      .add(cvh.kf)
      .add(cvh.cO)
      .add(cvh.eW)
      .build();

   protected dxq(dyd $$0, int $$1, dxe $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dxq(dyd $$0, sd $$1) {
      this(
         $$0, $$1.h("GD"), (dxe)dxe.a.parse(sr.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ib.b($$2));
   }

   protected static dxe a(int $$0, int $$1, int $$2, ib $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ib.a.c
         ? new dxe($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dxe($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ib a(atw $$0) {
      return ib.c.a.a($$0);
   }

   public final sd a(dyc $$0) {
      sd $$1 = new sd();
      $$1.a("id", kc.T.b(this.k()).toString());
      dxe.a.encodeStart(sr.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ib $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dyc var1, sd var2);

   public void a(dxq $$0, dxr $$1, atw $$2) {
   }

   public abstract void a(csz var1, csx var2, djk var3, atw var4, dxe var5, crm var6, hx var7);

   public dxe f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(crm $$0, int $$1) {
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
      ib $$2 = this.i();
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
      ib $$2 = this.i();
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

   protected void a(csz $$0, dhn $$1, int $$2, int $$3, int $$4, dxe $$5) {
      hx $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((csi)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dab.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dbr.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            ecx $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(csi $$0, int $$1, int $$2, int $$3, dxe $$4) {
      return true;
   }

   protected dhn a(crl $$0, int $$1, int $$2, int $$3, dxe $$4) {
      hx $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cvh.a.o() : $$0.a_($$5);
   }

   protected boolean b(csi $$0, int $$1, int $$2, int $$3, dxe $$4) {
      hx $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dmw.a.c, $$5.u(), $$5.w());
   }

   protected void a(csz $$0, dxe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cvh.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(csz $$0, dxe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dhn $$8, dhn $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((crl)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(csz $$0, dxe $$1, dxe $$2, dhn $$3, dhn $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(csz $$0, dxe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, atw $$9, dxq.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((crl)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(csz $$0, dxe $$1, dxe $$2, boolean $$3, atw $$4, dxq.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(csz $$0, dxe $$1, atw $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dhn $$10, dhn $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((crl)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(csz $$0, dxe $$1, atw $$2, float $$3, int $$4, int $$5, int $$6, dhn $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(csz $$0, dxe $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dhn $$8, boolean $$9) {
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
               if (!$$9 || !this.a((crl)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(csz $$0, dhn $$1, int $$2, int $$3, int $$4, dxe $$5) {
      hx.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ib.a);
         }
      }
   }

   protected boolean a(dhn $$0) {
      return $$0.i() || $$0.k() || $$0.a(cvh.fg) || $$0.a(cvh.bw) || $$0.a(cvh.bx);
   }

   protected boolean a(csz $$0, dxe $$1, atw $$2, int $$3, int $$4, int $$5, agm $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dhn a(crl $$0, hx $$1, dhn $$2) {
      ib $$3 = null;

      for (ib $$4 : ib.c.a) {
         hx $$5 = $$1.a($$4);
         dhn $$6 = $$0.a_($$5);
         if ($$6.a(cvh.cv)) {
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
         return $$2.a(cza.aE, $$3.g());
      } else {
         ib $$7 = $$2.c(cza.aE);
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

         return $$2.a(cza.aE, $$7);
      }
   }

   protected boolean a(csu $$0, dxe $$1, atw $$2, hx $$3, agm $$4, @Nullable dhn $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cvh.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cvh.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dfi $$6 = $$0.c_($$3);
         if ($$6 instanceof dfp) {
            ((dfp)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(csz $$0, dxe $$1, atw $$2, int $$3, int $$4, int $$5, ib $$6, agm $$7) {
      hx $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cvh.aU)) {
         this.a($$0, cvh.aU.o().a(cxk.b, $$6), $$3, $$4, $$5, $$1);
         dfi $$9 = $$0.c_($$8);
         if ($$9 instanceof dga) {
            ((dga)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dxe a(Stream<dxq> $$0) {
      return dxe.b($$0.map(dxq::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dxq a(List<dxq> $$0, dxe $$1) {
      for (dxq $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ib i() {
      return this.b;
   }

   public void a(@Nullable ib $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dbr.a;
         this.c = dab.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dab.b;
               this.d = dbr.a;
               break;
            case e:
               this.c = dab.b;
               this.d = dbr.b;
               break;
            case f:
               this.c = dab.a;
               this.d = dbr.b;
               break;
            default:
               this.c = dab.a;
               this.d = dbr.a;
         }
      }
   }

   public dbr a() {
      return this.d;
   }

   public dab j() {
      return this.c;
   }

   public dyd k() {
      return this.h;
   }

   public abstract static class a {
      protected dhn a = cvh.a.o();

      public abstract void a(atw var1, int var2, int var3, int var4, boolean var5);

      public dhn a() {
         return this.a;
      }
   }
}
