import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bts {
   public static final int a = 100;
   public static final int b = 300;
   private static final ys c = ys.a.a(new xt(xt.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new yb(yb.a.a, xv.b("MCPE-28723")));
   private final List<btq> d = Lists.newArrayList();
   private final bwb e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bts(bwb $$0) {
      this.e = $$0;
   }

   public void a(btv $$0, float $$1) {
      this.c();
      bua $$2 = bua.a(this.e);
      btq $$3 = new btq($$0, $$1, $$2, this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bL() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.i_();
      }
   }

   private static boolean a(btv $$0) {
      return $$0.d() instanceof bwb;
   }

   private xv a(bvf $$0, xv $$1, String $$2, String $$3) {
      cxk $$5 = $$0 instanceof bwb $$4 ? $$4.eX() : cxk.k;
      return !$$5.f() && $$5.b(ku.g) ? xv.a($$2, this.e.p_(), $$1, $$5.J()) : xv.a($$3, this.e.p_(), $$1);
   }

   private xv a(btq $$0, @Nullable bvf $$1) {
      btv $$2 = $$0.a();
      if (!$$2.a(axw.m) && !$$2.a(axw.s)) {
         xv $$4 = a($$1);
         bvf $$5 = $$2.d();
         xv $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xv)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xv.a("death.fell.killer", this.e.p_()));
         }
      } else {
         bua $$3 = Objects.requireNonNullElse($$0.c(), bua.a);
         return xv.a($$3.a(), this.e.p_());
      }
   }

   @Nullable
   private static xv a(@Nullable bvf $$0) {
      return $$0 == null ? null : $$0.p_();
   }

   public xv a() {
      if (this.d.isEmpty()) {
         return xv.a("death.attack.generic", this.e.p_());
      } else {
         btq $$0 = this.d.get(this.d.size() - 1);
         btv $$1 = $$0.a();
         btq $$2 = this.d();
         btz $$3 = $$1.k().e();
         if ($$3 == btz.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btz.c) {
            String $$4 = "death.attack." + $$1.f();
            xv $$5 = xy.a((xv)xv.c($$4 + ".link")).c(c);
            return xv.a($$4 + ".message", this.e.p_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private btq d() {
      btq $$0 = null;
      btq $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         btq $$5 = this.d.get($$4);
         btq $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         btv $$7 = $$5.a();
         boolean $$8 = $$7.a(axw.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axw.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
            if ($$4 > 0) {
               $$0 = $$6;
            } else {
               $$0 = $$5;
            }

            $$3 = $$9;
         }

         if ($$5.c() != null && ($$1 == null || $$5.b() > $$2)) {
            $$1 = $$5;
            $$2 = $$5.b();
         }
      }

      if ($$3 > 5.0F && $$0 != null) {
         return $$0;
      } else {
         return $$2 > 5.0F && $$1 != null ? $$1 : null;
      }
   }

   public int b() {
      return this.i ? this.e.af - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bL() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.j_();
         }

         this.d.clear();
      }
   }
}
