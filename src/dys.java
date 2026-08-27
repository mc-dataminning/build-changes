import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class dys {
   private static final Logger a = LogUtils.getLogger();
   protected static final dip e = cwb.nc.o();
   protected dyg f;
   @Nullable
   private ia b;
   private dav c;
   private dcl d;
   protected int g;
   private final dzf h;
   private static final Set<cvz> i = ImmutableSet.builder()
      .add(cwb.fo)
      .add(cwb.cp)
      .add(cwb.cq)
      .add(cwb.dU)
      .add(cwb.kd)
      .add(cwb.ki)
      .add(cwb.kg)
      .add(cwb.ke)
      .add(cwb.kf)
      .add(cwb.cO)
      .add(cwb.eW)
      .build();

   protected dys(dzf $$0, int $$1, dyg $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public dys(dzf $$0, sj $$1) {
      this(
         $$0, $$1.h("GD"), (dyg)dyg.a.parse(sx.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ia.b($$2));
   }

   protected static dyg a(int $$0, int $$1, int $$2, ia $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ia.a.c
         ? new dyg($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new dyg($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ia a(auf $$0) {
      return ia.c.a.a($$0);
   }

   public final sj a(dze $$0) {
      sj $$1 = new sj();
      $$1.a("id", kb.S.b(this.k()).toString());
      dyg.a.encodeStart(sx.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ia $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(dze var1, sj var2);

   public void a(dys $$0, dyt $$1, auf $$2) {
   }

   public abstract void a(ctt var1, ctr var2, dkm var3, auf var4, dyg var5, csf var6, hv var7);

   public dyg f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(csf $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public hv h() {
      return new hv(this.f.g());
   }

   protected hv.a b(int $$0, int $$1, int $$2) {
      return new hv.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ia $$2 = this.i();
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
      ia $$2 = this.i();
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

   protected void a(ctt $$0, dip $$1, int $$2, int $$3, int $$4, dyg $$5) {
      hv $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((ctb)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dav.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dcl.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            edz $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.x($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(ctb $$0, int $$1, int $$2, int $$3, dyg $$4) {
      return true;
   }

   protected dip a(cse $$0, int $$1, int $$2, int $$3, dyg $$4) {
      hv $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? cwb.a.o() : $$0.a_($$5);
   }

   protected boolean b(ctb $$0, int $$1, int $$2, int $$3, dyg $$4) {
      hv $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dny.a.c, $$5.u(), $$5.w());
   }

   protected void a(ctt $$0, dyg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, cwb.a.o(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(ctt $$0, dyg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dip $$8, dip $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cse)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(ctt $$0, dyg $$1, dyg $$2, dip $$3, dip $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ctt $$0, dyg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, auf $$9, dys.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cse)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(ctt $$0, dyg $$1, dyg $$2, boolean $$3, auf $$4, dys.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(ctt $$0, dyg $$1, auf $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dip $$10, dip $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cse)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(ctt $$0, dyg $$1, auf $$2, float $$3, int $$4, int $$5, int $$6, dip $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(ctt $$0, dyg $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dip $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cse)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(ctt $$0, dip $$1, int $$2, int $$3, int $$4, dyg $$5) {
      hv.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.J_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ia.a);
         }
      }
   }

   protected boolean a(dip $$0) {
      return $$0.i() || $$0.k() || $$0.a(cwb.fg) || $$0.a(cwb.bw) || $$0.a(cwb.bx);
   }

   protected boolean a(ctt $$0, dyg $$1, auf $$2, int $$3, int $$4, int $$5, agt $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dip a(cse $$0, hv $$1, dip $$2) {
      ia $$3 = null;

      for (ia $$4 : ia.c.a) {
         hv $$5 = $$1.a($$4);
         dip $$6 = $$0.a_($$5);
         if ($$6.a(cwb.cv)) {
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
         return $$2.a(czu.aE, $$3.g());
      } else {
         ia $$7 = $$2.c(czu.aE);
         hv $$8 = $$1.a($$7);
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

         return $$2.a(czu.aE, $$7);
      }
   }

   protected boolean a(ctn $$0, dyg $$1, auf $$2, hv $$3, agt $$4, @Nullable dip $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(cwb.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, cwb.cv.o());
         }

         $$0.a($$3, $$5, 2);
         dgd $$6 = $$0.c_($$3);
         if ($$6 instanceof dgk) {
            ((dgk)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(ctt $$0, dyg $$1, auf $$2, int $$3, int $$4, int $$5, ia $$6, agt $$7) {
      hv $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(cwb.aU)) {
         this.a($$0, cwb.aU.o().a(cye.b, $$6), $$3, $$4, $$5, $$1);
         dgd $$9 = $$0.c_($$8);
         if ($$9 instanceof dgv) {
            ((dgv)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static dyg a(Stream<dys> $$0) {
      return dyg.b($$0.map(dys::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static dys a(List<dys> $$0, dyg $$1) {
      for (dys $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ia i() {
      return this.b;
   }

   public void a(@Nullable ia $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dcl.a;
         this.c = dav.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dav.b;
               this.d = dcl.a;
               break;
            case e:
               this.c = dav.b;
               this.d = dcl.b;
               break;
            case f:
               this.c = dav.a;
               this.d = dcl.b;
               break;
            default:
               this.c = dav.a;
               this.d = dcl.a;
         }
      }
   }

   public dcl a() {
      return this.d;
   }

   public dav j() {
      return this.c;
   }

   public dzf k() {
      return this.h;
   }

   public abstract static class a {
      protected dip a = cwb.a.o();

      public abstract void a(auf var1, int var2, int var3, int var4, boolean var5);

      public dip a() {
         return this.a;
      }
   }
}
