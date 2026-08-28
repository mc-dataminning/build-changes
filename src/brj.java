import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class brj {
   public static final int a = 100;
   public static final int b = 300;
   private static final yl c = yl.a.a(new xm(xm.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xu(xu.a.a, xo.b("MCPE-28723")));
   private final List<brh> d = Lists.newArrayList();
   private final bto e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public brj(bto $$0) {
      this.e = $$0;
   }

   public void a(brm $$0, float $$1) {
      this.c();
      brr $$2 = brr.a(this.e);
      brh $$3 = new brh($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bD() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(brm $$0) {
      return $$0.d() instanceof bto;
   }

   private xo a(bst $$0, xo $$1, String $$2, String $$3) {
      cuo $$5 = $$0 instanceof bto $$4 ? $$4.eX() : cuo.l;
      return !$$5.e() && $$5.b(km.g) ? xo.a($$2, this.e.O_(), $$1, $$5.G()) : xo.a($$3, this.e.O_(), $$1);
   }

   private xo a(brh $$0, @Nullable bst $$1) {
      brm $$2 = $$0.a();
      if (!$$2.a(awq.n) && !$$2.a(awq.t)) {
         xo $$4 = a($$1);
         bst $$5 = $$2.d();
         xo $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xo)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xo.a("death.fell.killer", this.e.O_()));
         }
      } else {
         brr $$3 = Objects.requireNonNullElse($$0.c(), brr.a);
         return xo.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static xo a(@Nullable bst $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public xo a() {
      if (this.d.isEmpty()) {
         return xo.a("death.attack.generic", this.e.O_());
      } else {
         brh $$0 = this.d.get(this.d.size() - 1);
         brm $$1 = $$0.a();
         brh $$2 = this.d();
         brq $$3 = $$1.j().e();
         if ($$3 == brq.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == brq.c) {
            String $$4 = "death.attack." + $$1.e();
            xo $$5 = xr.a((xo)xo.c($$4 + ".link")).c(c);
            return xo.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private brh d() {
      brh $$0 = null;
      brh $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         brh $$5 = this.d.get($$4);
         brh $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         brm $$7 = $$5.a();
         boolean $$8 = $$7.a(awq.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awq.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ai - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bD() || this.e.ai - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ai;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
