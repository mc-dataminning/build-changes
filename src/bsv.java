import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bsv {
   public static final int a = 100;
   public static final int b = 300;
   private static final yi c = yi.a.a(new xj(xj.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xr(xr.a.a, xl.b("MCPE-28723")));
   private final List<bst> d = Lists.newArrayList();
   private final bve e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bsv(bve $$0) {
      this.e = $$0;
   }

   public void a(bsy $$0, float $$1) {
      this.c();
      btd $$2 = btd.a(this.e);
      bst $$3 = new bst($$0, $$1, $$2, this.e.aa);
      this.d.add($$3);
      this.f = this.e.ag;
      this.j = true;
      if (!this.i && this.e.bN() && a($$0)) {
         this.i = true;
         this.g = this.e.ag;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bsy $$0) {
      return $$0.d() instanceof bve;
   }

   private xl a(bui $$0, xl $$1, String $$2, String $$3) {
      cwf $$5 = $$0 instanceof bve $$4 ? $$4.fc() : cwf.k;
      return !$$5.f() && $$5.b(ku.g) ? xl.a($$2, this.e.S_(), $$1, $$5.J()) : xl.a($$3, this.e.S_(), $$1);
   }

   private xl a(bst $$0, @Nullable bui $$1) {
      bsy $$2 = $$0.a();
      if (!$$2.a(axf.m) && !$$2.a(axf.s)) {
         xl $$4 = a($$1);
         bui $$5 = $$2.d();
         xl $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xl)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xl.a("death.fell.killer", this.e.S_()));
         }
      } else {
         btd $$3 = Objects.requireNonNullElse($$0.c(), btd.a);
         return xl.a($$3.a(), this.e.S_());
      }
   }

   @Nullable
   private static xl a(@Nullable bui $$0) {
      return $$0 == null ? null : $$0.S_();
   }

   public xl a() {
      if (this.d.isEmpty()) {
         return xl.a("death.attack.generic", this.e.S_());
      } else {
         bst $$0 = this.d.get(this.d.size() - 1);
         bsy $$1 = $$0.a();
         bst $$2 = this.d();
         btc $$3 = $$1.k().e();
         if ($$3 == btc.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btc.c) {
            String $$4 = "death.attack." + $$1.f();
            xl $$5 = xo.a((xl)xl.c($$4 + ".link")).c(c);
            return xl.a($$4 + ".message", this.e.S_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bst d() {
      bst $$0 = null;
      bst $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bst $$5 = this.d.get($$4);
         bst $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bsy $$7 = $$5.a();
         boolean $$8 = $$7.a(axf.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axf.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bN() || this.e.ag - this.f > $$0)) {
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
