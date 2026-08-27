import com.google.common.collect.ImmutableSet;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.Set;
import java.util.stream.Stream;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public abstract class egk {
   private static final Logger a = LogUtils.getLogger();
   protected static final dpy e = dcx.nc.n();
   protected efy f;
   @Nullable
   private ir b;
   private dhs c;
   private dji d;
   protected int g;
   private final egx h;
   private static final Set<dcv> i = ImmutableSet.builder()
      .add(dcx.fo)
      .add(dcx.cp)
      .add(dcx.cq)
      .add(dcx.dU)
      .add(dcx.kd)
      .add(dcx.ki)
      .add(dcx.kg)
      .add(dcx.ke)
      .add(dcx.kf)
      .add(dcx.cO)
      .add(dcx.eW)
      .build();

   protected egk(egx $$0, int $$1, efy $$2) {
      this.h = $$0;
      this.g = $$1;
      this.f = $$2;
   }

   public egk(egx $$0, ty $$1) {
      this(
         $$0, $$1.h("GD"), (efy)efy.a.parse(um.a, $$1.c("BB")).resultOrPartial(a::error).orElseThrow(() -> new IllegalArgumentException("Invalid boundingbox"))
      );
      int $$2 = $$1.h("O");
      this.a($$2 == -1 ? null : ir.b($$2));
   }

   protected static efy a(int $$0, int $$1, int $$2, ir $$3, int $$4, int $$5, int $$6) {
      return $$3.o() == ir.a.c
         ? new efy($$0, $$1, $$2, $$0 + $$4 - 1, $$1 + $$5 - 1, $$2 + $$6 - 1)
         : new efy($$0, $$1, $$2, $$0 + $$6 - 1, $$1 + $$5 - 1, $$2 + $$4 - 1);
   }

   protected static ir a(ayd $$0) {
      return ir.c.a.a($$0);
   }

   public final ty a(egw $$0) {
      ty $$1 = new ty();
      $$1.a("id", lc.S.b(this.k()).toString());
      efy.a.encodeStart(um.a, this.f).resultOrPartial(a::error).ifPresent($$1x -> $$1.a("BB", $$1x));
      ir $$2 = this.i();
      $$1.a("O", $$2 == null ? -1 : $$2.e());
      $$1.a("GD", this.g);
      this.a($$0, $$1);
      return $$1;
   }

   protected abstract void a(egw var1, ty var2);

   public void a(egk $$0, egl $$1, ayd $$2) {
   }

   public abstract void a(dap var1, dan var2, drv var3, ayd var4, efy var5, czb var6, im var7);

   public efy f() {
      return this.f;
   }

   public int g() {
      return this.g;
   }

   public void a(int $$0) {
      this.g = $$0;
   }

   public boolean a(czb $$0, int $$1) {
      int $$2 = $$0.d();
      int $$3 = $$0.e();
      return this.f.a($$2 - $$1, $$3 - $$1, $$2 + 15 + $$1, $$3 + 15 + $$1);
   }

   public im h() {
      return new im(this.f.g());
   }

   protected im.a b(int $$0, int $$1, int $$2) {
      return new im.a(this.a($$0, $$2), this.b($$1), this.b($$0, $$2));
   }

   protected int a(int $$0, int $$1) {
      ir $$2 = this.i();
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
      ir $$2 = this.i();
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

   protected void a(dap $$0, dpy $$1, int $$2, int $$3, int $$4, efy $$5) {
      im $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         if (this.a((czx)$$0, $$2, $$3, $$4, $$5)) {
            if (this.c != dhs.a) {
               $$1 = $$1.a(this.c);
            }

            if (this.d != dji.a) {
               $$1 = $$1.a(this.d);
            }

            $$0.a($$6, $$1, 2);
            elr $$7 = $$0.b_($$6);
            if (!$$7.c()) {
               $$0.a($$6, $$7.a(), 0);
            }

            if (i.contains($$1.b())) {
               $$0.y($$6).e($$6);
            }
         }
      }
   }

   protected boolean a(czx $$0, int $$1, int $$2, int $$3, efy $$4) {
      return true;
   }

   protected dpy a(cza $$0, int $$1, int $$2, int $$3, efy $$4) {
      im $$5 = this.b($$1, $$2, $$3);
      return !$$4.b($$5) ? dcx.a.n() : $$0.a_($$5);
   }

   protected boolean b(czx $$0, int $$1, int $$2, int $$3, efy $$4) {
      im $$5 = this.b($$1, $$2 + 1, $$3);
      return !$$4.b($$5) ? false : $$5.v() < $$0.a(dvq.a.c, $$5.u(), $$5.w());
   }

   protected void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7) {
      for (int $$8 = $$3; $$8 <= $$6; $$8++) {
         for (int $$9 = $$2; $$9 <= $$5; $$9++) {
            for (int $$10 = $$4; $$10 <= $$7; $$10++) {
               this.a($$0, dcx.a.n(), $$9, $$8, $$10, $$1);
            }
         }
      }
   }

   protected void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dpy $$8, dpy $$9, boolean $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$10 || !this.a((cza)$$0, $$12, $$11, $$13, $$1).i()) {
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

   protected void a(dap $$0, efy $$1, efy $$2, dpy $$3, dpy $$4, boolean $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, boolean $$8, ayd $$9, egk.a $$10) {
      for (int $$11 = $$3; $$11 <= $$6; $$11++) {
         for (int $$12 = $$2; $$12 <= $$5; $$12++) {
            for (int $$13 = $$4; $$13 <= $$7; $$13++) {
               if (!$$8 || !this.a((cza)$$0, $$12, $$11, $$13, $$1).i()) {
                  $$10.a($$9, $$12, $$11, $$13, $$11 == $$3 || $$11 == $$6 || $$12 == $$2 || $$12 == $$5 || $$13 == $$4 || $$13 == $$7);
                  this.a($$0, $$10.a(), $$12, $$11, $$13, $$1);
               }
            }
         }
      }
   }

   protected void a(dap $$0, efy $$1, efy $$2, boolean $$3, ayd $$4, egk.a $$5) {
      this.a($$0, $$1, $$2.h(), $$2.i(), $$2.j(), $$2.k(), $$2.l(), $$2.m(), $$3, $$4, $$5);
   }

   protected void a(dap $$0, efy $$1, ayd $$2, float $$3, int $$4, int $$5, int $$6, int $$7, int $$8, int $$9, dpy $$10, dpy $$11, boolean $$12, boolean $$13) {
      for (int $$14 = $$5; $$14 <= $$8; $$14++) {
         for (int $$15 = $$4; $$15 <= $$7; $$15++) {
            for (int $$16 = $$6; $$16 <= $$9; $$16++) {
               if (!($$2.i() > $$3) && (!$$12 || !this.a((cza)$$0, $$15, $$14, $$16, $$1).i()) && (!$$13 || this.b($$0, $$15, $$14, $$16, $$1))) {
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

   protected void a(dap $$0, efy $$1, ayd $$2, float $$3, int $$4, int $$5, int $$6, dpy $$7) {
      if ($$2.i() < $$3) {
         this.a($$0, $$7, $$4, $$5, $$6, $$1);
      }
   }

   protected void a(dap $$0, efy $$1, int $$2, int $$3, int $$4, int $$5, int $$6, int $$7, dpy $$8, boolean $$9) {
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
               if (!$$9 || !this.a((cza)$$0, $$17, $$15, $$19, $$1).i()) {
                  float $$21 = $$18 * $$18 + $$16 * $$16 + $$20 * $$20;
                  if ($$21 <= 1.05F) {
                     this.a($$0, $$8, $$17, $$15, $$19, $$1);
                  }
               }
            }
         }
      }
   }

   protected void b(dap $$0, dpy $$1, int $$2, int $$3, int $$4, efy $$5) {
      im.a $$6 = this.b($$2, $$3, $$4);
      if ($$5.b($$6)) {
         while (this.a($$0.a_($$6)) && $$6.v() > $$0.I_() + 1) {
            $$0.a($$6, $$1, 2);
            $$6.c(ir.a);
         }
      }
   }

   protected boolean a(dpy $$0) {
      return $$0.i() || $$0.k() || $$0.a(dcx.fg) || $$0.a(dcx.bw) || $$0.a(dcx.bx);
   }

   protected boolean a(dap $$0, efy $$1, ayd $$2, int $$3, int $$4, int $$5, akf $$6) {
      return this.a($$0, $$1, $$2, this.b($$3, $$4, $$5), $$6, null);
   }

   public static dpy a(cza $$0, im $$1, dpy $$2) {
      ir $$3 = null;

      for (ir $$4 : ir.c.a) {
         im $$5 = $$1.a($$4);
         dpy $$6 = $$0.a_($$5);
         if ($$6.a(dcx.cv)) {
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
         return $$2.a(dgr.aE, $$3.g());
      } else {
         ir $$7 = $$2.c(dgr.aE);
         im $$8 = $$1.a($$7);
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

         return $$2.a(dgr.aE, $$7);
      }
   }

   protected boolean a(daj $$0, efy $$1, ayd $$2, im $$3, akf $$4, @Nullable dpy $$5) {
      if ($$1.b($$3) && !$$0.a_($$3).a(dcx.cv)) {
         if ($$5 == null) {
            $$5 = a($$0, $$3, dcx.cv.n());
         }

         $$0.a($$3, $$5, 2);
         dnd $$6 = $$0.c_($$3);
         if ($$6 instanceof dnk) {
            ((dnk)$$6).a($$4, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   protected boolean a(dap $$0, efy $$1, ayd $$2, int $$3, int $$4, int $$5, ir $$6, akf $$7) {
      im $$8 = this.b($$3, $$4, $$5);
      if ($$1.b($$8) && !$$0.a_($$8).a(dcx.aU)) {
         this.a($$0, dcx.aU.n().a(dfa.b, $$6), $$3, $$4, $$5, $$1);
         dnd $$9 = $$0.c_($$8);
         if ($$9 instanceof dnv) {
            ((dnv)$$9).a($$7, $$2.g());
         }

         return true;
      } else {
         return false;
      }
   }

   public void a(int $$0, int $$1, int $$2) {
      this.f.a($$0, $$1, $$2);
   }

   public static efy a(Stream<egk> $$0) {
      return efy.b($$0.map(egk::f)::iterator).orElseThrow(() -> new IllegalStateException("Unable to calculate boundingbox without pieces"));
   }

   @Nullable
   public static egk a(List<egk> $$0, efy $$1) {
      for (egk $$2 : $$0) {
         if ($$2.f().a($$1)) {
            return $$2;
         }
      }

      return null;
   }

   @Nullable
   public ir i() {
      return this.b;
   }

   public void a(@Nullable ir $$0) {
      this.b = $$0;
      if ($$0 == null) {
         this.d = dji.a;
         this.c = dhs.a;
      } else {
         switch ($$0) {
            case d:
               this.c = dhs.b;
               this.d = dji.a;
               break;
            case e:
               this.c = dhs.b;
               this.d = dji.b;
               break;
            case f:
               this.c = dhs.a;
               this.d = dji.b;
               break;
            default:
               this.c = dhs.a;
               this.d = dji.a;
         }
      }
   }

   public dji a() {
      return this.d;
   }

   public dhs j() {
      return this.c;
   }

   public egx k() {
      return this.h;
   }

   public abstract static class a {
      protected dpy a = dcx.a.n();

      public abstract void a(ayd var1, int var2, int var3, int var4, boolean var5);

      public dpy a() {
         return this.a;
      }
   }
}
