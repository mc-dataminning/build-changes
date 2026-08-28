import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class brh {
   public static final int a = 100;
   public static final int b = 300;
   private static final xw c = xw.a.a(new wx(wx.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xf(xf.a.a, wz.b("MCPE-28723")));
   private final List<brf> d = Lists.newArrayList();
   private final btn e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public brh(btn $$0) {
      this.e = $$0;
   }

   public void a(brk $$0, float $$1) {
      this.c();
      brp $$2 = brp.a(this.e);
      brf $$3 = new brf($$0, $$1, $$2, this.e.ac);
      this.d.add($$3);
      this.f = this.e.ai;
      this.j = true;
      if (!this.i && this.e.bE() && a($$0)) {
         this.i = true;
         this.g = this.e.ai;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(brk $$0) {
      return $$0.d() instanceof btn;
   }

   private wz a(bsr $$0, wz $$1, String $$2, String $$3) {
      cuq $$5 = $$0 instanceof btn $$4 ? $$4.eT() : cuq.l;
      return !$$5.e() && $$5.b(kq.g) ? wz.a($$2, this.e.S_(), $$1, $$5.F()) : wz.a($$3, this.e.S_(), $$1);
   }

   private wz a(brf $$0, @Nullable bsr $$1) {
      brk $$2 = $$0.a();
      if (!$$2.a(awg.m) && !$$2.a(awg.s)) {
         wz $$4 = a($$1);
         bsr $$5 = $$2.d();
         wz $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wz)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wz.a("death.fell.killer", this.e.S_()));
         }
      } else {
         brp $$3 = Objects.requireNonNullElse($$0.c(), brp.a);
         return wz.a($$3.a(), this.e.S_());
      }
   }

   @Nullable
   private static wz a(@Nullable bsr $$0) {
      return $$0 == null ? null : $$0.S_();
   }

   public wz a() {
      if (this.d.isEmpty()) {
         return wz.a("death.attack.generic", this.e.S_());
      } else {
         brf $$0 = this.d.get(this.d.size() - 1);
         brk $$1 = $$0.a();
         brf $$2 = this.d();
         bro $$3 = $$1.k().e();
         if ($$3 == bro.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bro.c) {
            String $$4 = "death.attack." + $$1.f();
            wz $$5 = xc.a((wz)wz.c($$4 + ".link")).c(c);
            return wz.a($$4 + ".message", this.e.S_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private brf d() {
      brf $$0 = null;
      brf $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         brf $$5 = this.d.get($$4);
         brf $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         brk $$7 = $$5.a();
         boolean $$8 = $$7.a(awg.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awg.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bE() || this.e.ai - this.f > $$0)) {
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
