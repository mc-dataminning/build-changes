import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bsm {
   public static final int a = 100;
   public static final int b = 300;
   private static final ye c = ye.a.a(new xf(xf.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xn(xn.a.a, xh.b("MCPE-28723")));
   private final List<bsk> d = Lists.newArrayList();
   private final buv e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bsm(buv $$0) {
      this.e = $$0;
   }

   public void a(bsp $$0, float $$1) {
      this.c();
      bsu $$2 = bsu.a(this.e);
      bsk $$3 = new bsk($$0, $$1, $$2, this.e.aa);
      this.d.add($$3);
      this.f = this.e.ag;
      this.j = true;
      if (!this.i && this.e.bM() && a($$0)) {
         this.i = true;
         this.g = this.e.ag;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bsp $$0) {
      return $$0.d() instanceof buv;
   }

   private xh a(btz $$0, xh $$1, String $$2, String $$3) {
      cvx $$5 = $$0 instanceof buv $$4 ? $$4.fb() : cvx.k;
      return !$$5.f() && $$5.b(kt.g) ? xh.a($$2, this.e.S_(), $$1, $$5.J()) : xh.a($$3, this.e.S_(), $$1);
   }

   private xh a(bsk $$0, @Nullable btz $$1) {
      bsp $$2 = $$0.a();
      if (!$$2.a(axb.m) && !$$2.a(axb.s)) {
         xh $$4 = a($$1);
         btz $$5 = $$2.d();
         xh $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xh)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xh.a("death.fell.killer", this.e.S_()));
         }
      } else {
         bsu $$3 = Objects.requireNonNullElse($$0.c(), bsu.a);
         return xh.a($$3.a(), this.e.S_());
      }
   }

   @Nullable
   private static xh a(@Nullable btz $$0) {
      return $$0 == null ? null : $$0.S_();
   }

   public xh a() {
      if (this.d.isEmpty()) {
         return xh.a("death.attack.generic", this.e.S_());
      } else {
         bsk $$0 = this.d.get(this.d.size() - 1);
         bsp $$1 = $$0.a();
         bsk $$2 = this.d();
         bst $$3 = $$1.k().e();
         if ($$3 == bst.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bst.c) {
            String $$4 = "death.attack." + $$1.f();
            xh $$5 = xk.a((xh)xh.c($$4 + ".link")).c(c);
            return xh.a($$4 + ".message", this.e.S_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bsk d() {
      bsk $$0 = null;
      bsk $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bsk $$5 = this.d.get($$4);
         bsk $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bsp $$7 = $$5.a();
         boolean $$8 = $$7.a(axb.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axb.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ag - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bM() || this.e.ag - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ag;
         if ($$1) {
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
