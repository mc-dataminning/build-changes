import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bto {
   public static final int a = 100;
   public static final int b = 300;
   private static final yh c = yh.a.a(new xi(xi.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xq(xq.a.a, xk.b("MCPE-28723")));
   private final List<btm> d = Lists.newArrayList();
   private final bvx e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bto(bvx $$0) {
      this.e = $$0;
   }

   public void a(btr $$0, float $$1) {
      this.c();
      btw $$2 = btw.a(this.e);
      btm $$3 = new btm($$0, $$1, $$2, this.e.Z);
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

   private static boolean a(btr $$0) {
      return $$0.d() instanceof bvx;
   }

   private xk a(bvb $$0, xk $$1, String $$2, String $$3) {
      cxg $$5 = $$0 instanceof bvx $$4 ? $$4.eZ() : cxg.j;
      return !$$5.f() && $$5.b(ku.g) ? xk.a($$2, this.e.p_(), $$1, $$5.K()) : xk.a($$3, this.e.p_(), $$1);
   }

   private xk a(btm $$0, @Nullable bvb $$1) {
      btr $$2 = $$0.a();
      if (!$$2.a(axm.m) && !$$2.a(axm.s)) {
         xk $$4 = a($$1);
         bvb $$5 = $$2.d();
         xk $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xk)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xk.a("death.fell.killer", this.e.p_()));
         }
      } else {
         btw $$3 = Objects.requireNonNullElse($$0.c(), btw.a);
         return xk.a($$3.a(), this.e.p_());
      }
   }

   @Nullable
   private static xk a(@Nullable bvb $$0) {
      return $$0 == null ? null : $$0.p_();
   }

   public xk a() {
      if (this.d.isEmpty()) {
         return xk.a("death.attack.generic", this.e.p_());
      } else {
         btm $$0 = this.d.get(this.d.size() - 1);
         btr $$1 = $$0.a();
         btm $$2 = this.d();
         btv $$3 = $$1.k().e();
         if ($$3 == btv.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btv.c) {
            String $$4 = "death.attack." + $$1.f();
            xk $$5 = xn.a((xk)xk.c($$4 + ".link")).c(c);
            return xk.a($$4 + ".message", this.e.p_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private btm d() {
      btm $$0 = null;
      btm $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         btm $$5 = this.d.get($$4);
         btm $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         btr $$7 = $$5.a();
         boolean $$8 = $$7.a(axm.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axm.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
