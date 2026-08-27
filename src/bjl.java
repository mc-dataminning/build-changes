import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bjl {
   public static final int a = 100;
   public static final int b = 300;
   private static final vo c = vo.a.a(new up(up.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new ux(ux.a.a, ur.b("MCPE-28723")));
   private final List<bjj> d = Lists.newArrayList();
   private final blg e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bjl(blg $$0) {
      this.e = $$0;
   }

   public void a(bjo $$0, float $$1) {
      this.c();
      bjt $$2 = bjt.a(this.e);
      bjj $$3 = new bjj($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bx() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bjo $$0) {
      return $$0.d() instanceof blg;
   }

   private ur a(bkq $$0, ur $$1, String $$2, String $$3) {
      clj $$5 = $$0 instanceof blg $$4 ? $$4.eU() : clj.b;
      return !$$5.b() && $$5.A() ? ur.a($$2, this.e.P_(), $$1, $$5.J()) : ur.a($$3, this.e.P_(), $$1);
   }

   private ur a(bjj $$0, @Nullable bkq $$1) {
      bjo $$2 = $$0.a();
      if (!$$2.a(ari.m) && !$$2.a(ari.s)) {
         ur $$4 = a($$1);
         bkq $$5 = $$2.d();
         ur $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (ur)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : ur.a("death.fell.killer", this.e.P_()));
         }
      } else {
         bjt $$3 = Objects.requireNonNullElse($$0.c(), bjt.a);
         return ur.a($$3.a(), this.e.P_());
      }
   }

   @Nullable
   private static ur a(@Nullable bkq $$0) {
      return $$0 == null ? null : $$0.P_();
   }

   public ur a() {
      if (this.d.isEmpty()) {
         return ur.a("death.attack.generic", this.e.P_());
      } else {
         bjj $$0 = this.d.get(this.d.size() - 1);
         bjo $$1 = $$0.a();
         bjj $$2 = this.d();
         bjs $$3 = $$1.j().e();
         if ($$3 == bjs.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bjs.c) {
            String $$4 = "death.attack." + $$1.e();
            ur $$5 = uu.a((ur)ur.c($$4 + ".link")).c(c);
            return ur.a($$4 + ".message", this.e.P_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bjj d() {
      bjj $$0 = null;
      bjj $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bjj $$5 = this.d.get($$4);
         bjj $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bjo $$7 = $$5.a();
         boolean $$8 = $$7.a(ari.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(ari.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.ah - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bx() || this.e.ah - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.ah;
         if ($$1) {
            this.e.g_();
         }

         this.d.clear();
      }
   }
}
