import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class brm {
   public static final int a = 100;
   public static final int b = 300;
   private static final ym c = ym.a.a(new xn(xn.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xv(xv.a.a, xp.b("MCPE-28723")));
   private final List<brk> d = Lists.newArrayList();
   private final btr e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public brm(btr $$0) {
      this.e = $$0;
   }

   public void a(brp $$0, float $$1) {
      this.c();
      bru $$2 = bru.a(this.e);
      brk $$3 = new brk($$0, $$1, $$2, this.e.ac);
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

   private static boolean a(brp $$0) {
      return $$0.d() instanceof btr;
   }

   private xp a(bsw $$0, xp $$1, String $$2, String $$3) {
      cur $$5 = $$0 instanceof btr $$4 ? $$4.eX() : cur.l;
      return !$$5.e() && $$5.b(km.g) ? xp.a($$2, this.e.O_(), $$1, $$5.G()) : xp.a($$3, this.e.O_(), $$1);
   }

   private xp a(brk $$0, @Nullable bsw $$1) {
      brp $$2 = $$0.a();
      if (!$$2.a(awr.n) && !$$2.a(awr.t)) {
         xp $$4 = a($$1);
         bsw $$5 = $$2.d();
         xp $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xp)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xp.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bru $$3 = Objects.requireNonNullElse($$0.c(), bru.a);
         return xp.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static xp a(@Nullable bsw $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public xp a() {
      if (this.d.isEmpty()) {
         return xp.a("death.attack.generic", this.e.O_());
      } else {
         brk $$0 = this.d.get(this.d.size() - 1);
         brp $$1 = $$0.a();
         brk $$2 = this.d();
         brt $$3 = $$1.j().e();
         if ($$3 == brt.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == brt.c) {
            String $$4 = "death.attack." + $$1.e();
            xp $$5 = xs.a((xp)xp.c($$4 + ".link")).c(c);
            return xp.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private brk d() {
      brk $$0 = null;
      brk $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         brk $$5 = this.d.get($$4);
         brk $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         brp $$7 = $$5.a();
         boolean $$8 = $$7.a(awr.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awr.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
