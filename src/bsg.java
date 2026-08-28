import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bsg {
   public static final int a = 100;
   public static final int b = 300;
   private static final yb c = yb.a.a(new xc(xc.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xk(xk.a.a, xe.b("MCPE-28723")));
   private final List<bse> d = Lists.newArrayList();
   private final bun e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bsg(bun $$0) {
      this.e = $$0;
   }

   public void a(bsj $$0, float $$1) {
      this.c();
      bso $$2 = bso.a(this.e);
      bse $$3 = new bse($$0, $$1, $$2, this.e.aa);
      this.d.add($$3);
      this.f = this.e.ag;
      this.j = true;
      if (!this.i && this.e.bI() && a($$0)) {
         this.i = true;
         this.g = this.e.ag;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bsj $$0) {
      return $$0.d() instanceof bun;
   }

   private xe a(btr $$0, xe $$1, String $$2, String $$3) {
      cvs $$5 = $$0 instanceof bun $$4 ? $$4.eW() : cvs.k;
      return !$$5.f() && $$5.b(ks.g) ? xe.a($$2, this.e.R_(), $$1, $$5.I()) : xe.a($$3, this.e.R_(), $$1);
   }

   private xe a(bse $$0, @Nullable btr $$1) {
      bsj $$2 = $$0.a();
      if (!$$2.a(awx.m) && !$$2.a(awx.s)) {
         xe $$4 = a($$1);
         btr $$5 = $$2.d();
         xe $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xe)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xe.a("death.fell.killer", this.e.R_()));
         }
      } else {
         bso $$3 = Objects.requireNonNullElse($$0.c(), bso.a);
         return xe.a($$3.a(), this.e.R_());
      }
   }

   @Nullable
   private static xe a(@Nullable btr $$0) {
      return $$0 == null ? null : $$0.R_();
   }

   public xe a() {
      if (this.d.isEmpty()) {
         return xe.a("death.attack.generic", this.e.R_());
      } else {
         bse $$0 = this.d.get(this.d.size() - 1);
         bsj $$1 = $$0.a();
         bse $$2 = this.d();
         bsn $$3 = $$1.k().e();
         if ($$3 == bsn.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bsn.c) {
            String $$4 = "death.attack." + $$1.f();
            xe $$5 = xh.a((xe)xe.c($$4 + ".link")).c(c);
            return xe.a($$4 + ".message", this.e.R_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bse d() {
      bse $$0 = null;
      bse $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bse $$5 = this.d.get($$4);
         bse $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bsj $$7 = $$5.a();
         boolean $$8 = $$7.a(awx.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(awx.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
