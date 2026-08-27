import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bhb {
   public static final int a = 100;
   public static final int b = 300;
   private static final ua c = ua.a.a(new tc(tc.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new tj(tj.a.a, te.b("MCPE-28723")));
   private final List<bgz> d = Lists.newArrayList();
   private final biw e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bhb(biw $$0) {
      this.e = $$0;
   }

   public void a(bhe $$0, float $$1) {
      this.c();
      bhj $$2 = bhj.a(this.e);
      bgz $$3 = new bgz($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bv() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.Q_();
      }
   }

   private static boolean a(bhe $$0) {
      return $$0.d() instanceof biw;
   }

   private te a(big $$0, te $$1, String $$2, String $$3) {
      ciw $$5 = $$0 instanceof biw $$4 ? $$4.eR() : ciw.b;
      return !$$5.b() && $$5.A() ? te.a($$2, this.e.H_(), $$1, $$5.J()) : te.a($$3, this.e.H_(), $$1);
   }

   private te a(bgz $$0, @Nullable big $$1) {
      bhe $$2 = $$0.a();
      if (!$$2.a(apl.m) && !$$2.a(apl.s)) {
         te $$4 = a($$1);
         big $$5 = $$2.d();
         te $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (te)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : te.a("death.fell.killer", this.e.H_()));
         }
      } else {
         bhj $$3 = Objects.requireNonNullElse($$0.c(), bhj.a);
         return te.a($$3.a(), this.e.H_());
      }
   }

   @Nullable
   private static te a(@Nullable big $$0) {
      return $$0 == null ? null : $$0.H_();
   }

   public te a() {
      if (this.d.isEmpty()) {
         return te.a("death.attack.generic", this.e.H_());
      } else {
         bgz $$0 = this.d.get(this.d.size() - 1);
         bhe $$1 = $$0.a();
         bgz $$2 = this.d();
         bhi $$3 = $$1.j().e();
         if ($$3 == bhi.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bhi.c) {
            String $$4 = "death.attack." + $$1.e();
            te $$5 = tg.a((te)te.c($$4 + ".link")).c(c);
            return te.a($$4 + ".message", this.e.H_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bgz d() {
      bgz $$0 = null;
      bgz $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bgz $$5 = this.d.get($$4);
         bgz $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bhe $$7 = $$5.a();
         boolean $$8 = $$7.a(apl.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(apl.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
            this.e.F_();
         }

         this.d.clear();
      }
   }
}
