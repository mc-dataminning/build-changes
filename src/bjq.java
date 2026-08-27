import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bjq {
   public static final int a = 100;
   public static final int b = 300;
   private static final vs c = vs.a.a(new ut(ut.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new vb(vb.a.a, uv.b("MCPE-28723")));
   private final List<bjo> d = Lists.newArrayList();
   private final bll e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bjq(bll $$0) {
      this.e = $$0;
   }

   public void a(bjt $$0, float $$1) {
      this.c();
      bjy $$2 = bjy.a(this.e);
      bjo $$3 = new bjo($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bx() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.g_();
      }
   }

   private static boolean a(bjt $$0) {
      return $$0.d() instanceof bll;
   }

   private uv a(bkv $$0, uv $$1, String $$2, String $$3) {
      clo $$5 = $$0 instanceof bll $$4 ? $$4.eU() : clo.b;
      return !$$5.b() && $$5.A() ? uv.a($$2, this.e.Q_(), $$1, $$5.J()) : uv.a($$3, this.e.Q_(), $$1);
   }

   private uv a(bjo $$0, @Nullable bkv $$1) {
      bjt $$2 = $$0.a();
      if (!$$2.a(arm.m) && !$$2.a(arm.s)) {
         uv $$4 = a($$1);
         bkv $$5 = $$2.d();
         uv $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (uv)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : uv.a("death.fell.killer", this.e.Q_()));
         }
      } else {
         bjy $$3 = Objects.requireNonNullElse($$0.c(), bjy.a);
         return uv.a($$3.a(), this.e.Q_());
      }
   }

   @Nullable
   private static uv a(@Nullable bkv $$0) {
      return $$0 == null ? null : $$0.Q_();
   }

   public uv a() {
      if (this.d.isEmpty()) {
         return uv.a("death.attack.generic", this.e.Q_());
      } else {
         bjo $$0 = this.d.get(this.d.size() - 1);
         bjt $$1 = $$0.a();
         bjo $$2 = this.d();
         bjx $$3 = $$1.j().e();
         if ($$3 == bjx.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bjx.c) {
            String $$4 = "death.attack." + $$1.e();
            uv $$5 = uy.a((uv)uv.c($$4 + ".link")).c(c);
            return uv.a($$4 + ".message", this.e.Q_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bjo d() {
      bjo $$0 = null;
      bjo $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bjo $$5 = this.d.get($$4);
         bjo $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bjt $$7 = $$5.a();
         boolean $$8 = $$7.a(arm.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(arm.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
            this.e.h_();
         }

         this.d.clear();
      }
   }
}
