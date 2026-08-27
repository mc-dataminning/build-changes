import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dvh {
   private static final Logger a = LogUtils.getLogger();
   protected static final dfe e = csr.nc.n();
   protected duv f;
   @Nullable
   private hc b;
   private cxl c;
   private czc d;
   protected int g;
   private final dvu h;
   private static final Set<csq> i = ImmutableSet.builder()
      .add(csr.fo)
      .add(csr.cp)
      .add(csr.cq)
      .add(csr.dU)
      .add(csr.kd)
      .add(csr.ki)
      .add(csr.kg)
      .add(csr.ke)
      .add(csr.kf)
      .add(csr.cO)
      .add(csr.eX)
      .build();

   protected dvh(dvu $$0, int $$1, duv $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dvh(dvu $$0, qu $$1) {
      this(
         $$0, $$1.h("GD"), (duv)duv.a.parse(rf.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : hc.b($$2));
   }

   protected static duv a(int $$0, int $$1, int $$2, hc $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == hc.a.c
         ? new duv($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new duv($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static hc a(arx $$0) {
      return hc.c.a.a($$0);
   }

   public final qu a(dvt $$0) {
      qu $$1 = new qu();
      $$1.a("id", jd.T.b(this.k()).toString());
      duv.a.encodeStart(rf.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      hc $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dvt var1, qu var2);

   public void a(dvh $$0, dvi $$1, arx $$2) {
   }

   public abstract void a(cqk var1, cqi var2, dhb var3, arx var4, duv var5, cox var6, gw var7);

   public duv f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(cox $$0, int $$1) {
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

   protected void a(cqk $$0, dfe $$1, int $$2, int $$3, int $$4, duv $$5) {
      gw $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((cpt)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != cxl.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != czc.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            eah $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(cpt $$0, int $$1, int $$2, int $$3, duv $$4) {
      return true;
   }

   protected dfe a(cow $$0, int $$1, int $$2, int $$3, duv $$4) {
      gw $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? csr.a.n() : $$0.a_($$5);
   }

   protected boolean b(cpt $$0, int $$1, int $$2, int $$3, duv $$4) {
      gw $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dkn.a.c, $$5.u(), $$5.w());
   }

   protected void a(cqk $$0, duv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, csr.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(cqk $$0, duv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfe $$8, dfe $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cow)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(cqk $$0, duv $$1, duv $$2, dfe $$3, dfe $$4, boolean $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqk $$0, duv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, arx $$9, dvh.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cow)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(cqk $$0, duv $$1, duv $$2, boolean $$3, arx $$4, dvh.a $$5) {
      this.a($$0, $$1, $$2.g(), $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$3, $$4, $$5);
   }

   protected void a(cqk $$0, duv $$1, arx $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dfe $$10, dfe $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cow)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(cqk $$0, duv $$1, arx $$2, float $$3, int $$4, int $$5, int $$6, dfe $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(cqk $$0, duv $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dfe $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cow)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(cqk $$0, dfe $$1, int $$2, int $$3, int $$4, duv $$5) {
      gw.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.C_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(hc.a);
         }
      }
   }

   protected boolean a(dfe $$0) {
      return $$0.i() || $$0.k() || $$0.a(csr.fg) || $$0.a(csr.bw) || $$0.a(csr.bx);
   }

   protected boolean a(cqk $$0, duv $$1, arx $$2, int $$3, int $$4, int $$5, aeu $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dfe a(cow $$0, gw $$1, dfe $$2) {
      hc $$3 = null;

      for (hc $$4 : hc.c.a) {
         gw $$5 = $$1.a($$4);
         dfe $$6 = $$0.a_($$5);
         if ($$6.a(csr.cv)) {
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
         return $$2.a(cwj.aC, $$3.g());
      } else {
         hc $$7 = $$2.c(cwj.aC);
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

         return $$2.a(cwj.aC, $$7);
      }
   }

   protected boolean a(cqf $$0, duv $$1, arx $$2, gw $$3, aeu $$4, @Nullable dfe $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(csr.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, csr.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dcq $$6 = $$0.c_($$3);
         if ($$6 instanceof dcx) {
            ((dcx)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(cqk $$0, duv $$1, arx $$2, int $$3, int $$4, int $$5, hc $$6, aeu $$7) {
      gw $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(csr.aU)) {
         this.a($$0, csr.aU.n().a(cur.a, $$6), $$3, $$4, $$5, $$1);
         dcq $$9 = $$0.c_($$8);
         if ($$9 instanceof ddh) {
            ((ddh)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static duv a(Stream<dvh> $$0) {
      return duv.b($$0.map(dvh::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dvh a(List<dvh> $$0, duv $$1) {
      for (dvh $$2 : $$0) {
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
         this.d = czc.a;
         this.c = cxl.a;
      } else {
         switch ($$0) {
            case d:
               this.c = cxl.b;
               this.d = czc.a;
               break;
            case e:
               this.c = cxl.b;
               this.d = czc.b;
               break;
            case f:
               this.c = cxl.a;
               this.d = czc.b;
               break;
            default:
               this.c = cxl.a;
               this.d = czc.a;
         }
      }
   }

   public czc a() {
      return this.d;
   }

   public cxl j() {
      return this.c;
   }

   public dvu k() {
      return this.h;
   }

   public abstract static class a {
      protected dfe a = csr.a.n();

      public abstract void a(arx var1, int var2, int var3, int var4, boolean var5);

      public dfe a() {
         return this.a;
      }
   }
}
