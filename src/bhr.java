import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bhr {
   public static final int a = 100;
   public static final int b = 300;
   private static final ui c = ui.a.a(new tj(tj.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new tr(tr.a.a, tl.b("MCPE-28723")));
   private final List<bhp> d = Lists.newArrayList();
   private final bjm e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bhr(bjm $$0) {
      this.e = $$0;
   }

   public void a(bhu $$0, float $$1) {
      this.c();
      bhz $$2 = bhz.a(this.e);
      bhp $$3 = new bhp($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bv() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.e_();
      }
   }

   private static boolean a(bhu $$0) {
      return $$0.d() instanceof bjm;
   }

   private tl a(biw $$0, tl $$1, String $$2, String $$3) {
      cjl $$5 = $$0 instanceof bjm $$4 ? $$4.eS() : cjl.b;
      return !$$5.b() && $$5.A() ? tl.a($$2, this.e.N_(), $$1, $$5.J()) : tl.a($$3, this.e.N_(), $$1);
   }

   private tl a(bhp $$0, @Nullable biw $$1) {
      bhu $$2 = $$0.a();
      if (!$$2.a(apx.m) && !$$2.a(apx.s)) {
         tl $$4 = a($$1);
         biw $$5 = $$2.d();
         tl $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (tl)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : tl.a("death.fell.killer", this.e.N_()));
         }
      } else {
         bhz $$3 = Objects.requireNonNullElse($$0.c(), bhz.a);
         return tl.a($$3.a(), this.e.N_());
      }
   }

   @Nullable
   private static tl a(@Nullable biw $$0) {
      return $$0 == null ? null : $$0.N_();
   }

   public tl a() {
      if (this.d.isEmpty()) {
         return tl.a("death.attack.generic", this.e.N_());
      } else {
         bhp $$0 = this.d.get(this.d.size() - 1);
         bhu $$1 = $$0.a();
         bhp $$2 = this.d();
         bhy $$3 = $$1.j().e();
         if ($$3 == bhy.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bhy.c) {
            String $$4 = "death.attack." + $$1.e();
            tl $$5 = to.a((tl)tl.c($$4 + ".link")).c(c);
            return tl.a($$4 + ".message", this.e.N_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bhp d() {
      bhp $$0 = null;
      bhp $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bhp $$5 = this.d.get($$4);
         bhp $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bhu $$7 = $$5.a();
         boolean $$8 = $$7.a(apx.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(apx.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
            this.e.f_();
         }

         this.d.clear();
      }
   }
}
