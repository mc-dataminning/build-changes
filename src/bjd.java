import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bjd {
   public static final int a = 100;
   public static final int b = 300;
   private static final vo c = vo.a.a(new up(up.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new ux(ux.a.a, ur.b("MCPE-28723")));
   private final List<bjb> d = Lists.newArrayList();
   private final bky e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bjd(bky $$0) {
      this.e = $$0;
   }

   public void a(bjg $$0, float $$1) {
      this.c();
      bjl $$2 = bjl.a(this.e);
      bjb $$3 = new bjb($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bv() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bjg $$0) {
      return $$0.d() instanceof bky;
   }

   private ur a(bki $$0, ur $$1, String $$2, String $$3) {
      clb $$5 = $$0 instanceof bky $$4 ? $$4.eS() : clb.b;
      return !$$5.b() && $$5.A() ? ur.a($$2, this.e.O_(), $$1, $$5.J()) : ur.a($$3, this.e.O_(), $$1);
   }

   private ur a(bjb $$0, @Nullable bki $$1) {
      bjg $$2 = $$0.a();
      if (!$$2.a(are.m) && !$$2.a(are.s)) {
         ur $$4 = a($$1);
         bki $$5 = $$2.d();
         ur $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (ur)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : ur.a("death.fell.killer", this.e.O_()));
         }
      } else {
         bjl $$3 = Objects.requireNonNullElse($$0.c(), bjl.a);
         return ur.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static ur a(@Nullable bki $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public ur a() {
      if (this.d.isEmpty()) {
         return ur.a("death.attack.generic", this.e.O_());
      } else {
         bjb $$0 = this.d.get(this.d.size() - 1);
         bjg $$1 = $$0.a();
         bjb $$2 = this.d();
         bjk $$3 = $$1.j().e();
         if ($$3 == bjk.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bjk.c) {
            String $$4 = "death.attack." + $$1.e();
            ur $$5 = uu.a((ur)ur.c($$4 + ".link")).c(c);
            return ur.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bjb d() {
      bjb $$0 = null;
      bjb $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bjb $$5 = this.d.get($$4);
         bjb $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bjg $$7 = $$5.a();
         boolean $$8 = $$7.a(are.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(are.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bv() || this.e.ah - this.f > $$0)) {
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
