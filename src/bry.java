import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bry {
   public static final int a = 100;
   public static final int b = 300;
   private static final ya c = ya.a.a(new xb(xb.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xj(xj.a.a, xd.b("MCPE-28723")));
   private final List<brw> d = Lists.newArrayList();
   private final buf e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bry(buf $$0) {
      this.e = $$0;
   }

   public void a(bsb $$0, float $$1) {
      this.c();
      bsg $$2 = bsg.a(this.e);
      brw $$3 = new brw($$0, $$1, $$2, this.e.aa);
      this.d.add($$3);
      this.f = this.e.ag;
      this.j = true;
      if (!this.i && this.e.bI() && a($$0)) {
         this.i = true;
         this.g = this.e.ag;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bsb $$0) {
      return $$0.d() instanceof buf;
   }

   private xd a(btj $$0, xd $$1, String $$2, String $$3) {
      cvl $$5 = $$0 instanceof buf $$4 ? $$4.eW() : cvl.k;
      return !$$5.f() && $$5.b(kr.g) ? xd.a($$2, this.e.Q_(), $$1, $$5.H()) : xd.a($$3, this.e.Q_(), $$1);
   }

   private xd a(brw $$0, @Nullable btj $$1) {
      bsb $$2 = $$0.a();
      if (!$$2.a(awu.m) && !$$2.a(awu.s)) {
         xd $$4 = a($$1);
         btj $$5 = $$2.d();
         xd $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xd)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xd.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bsg $$3 = Objects.requireNonNullElse($$0.c(), bsg.a);
         return xd.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static xd a(@Nullable btj $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public xd a() {
      if (this.d.isEmpty()) {
         return xd.a("death.attack.generic", this.e.Q_());
      } else {
         brw $$0 = this.d.get(this.d.size() - 1);
         bsb $$1 = $$0.a();
         brw $$2 = this.d();
         bsf $$3 = $$1.k().e();
         if ($$3 == bsf.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bsf.c) {
            String $$4 = "death.attack." + $$1.f();
            xd $$5 = xg.a((xd)xd.c($$4 + ".link")).c(c);
            return xd.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private brw d() {
      brw $$0 = null;
      brw $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         brw $$5 = this.d.get($$4);
         brw $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bsb $$7 = $$5.a();
         boolean $$8 = $$7.a(awu.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awu.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bI() || this.e.ag - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ag;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
