import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bsy {
   public static final int a = 100;
   public static final int b = 300;
   private static final yg c = yg.a.a(new xh(xh.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new xp(xp.a.a, xj.b("MCPE-28723")));
   private final List<bsw> d = Lists.newArrayList();
   private final bvh e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bsy(bvh $$0) {
      this.e = $$0;
   }

   public void a(btb $$0, float $$1) {
      this.c();
      btg $$2 = btg.a(this.e);
      bsw $$3 = new bsw($$0, $$1, $$2, this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bL() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.h_();
      }
   }

   private static boolean a(btb $$0) {
      return $$0.d() instanceof bvh;
   }

   private xj a(bul $$0, xj $$1, String $$2, String $$3) {
      cwm $$5 = $$0 instanceof bvh $$4 ? $$4.eX() : cwm.k;
      return !$$5.f() && $$5.b(ku.g) ? xj.a($$2, this.e.o_(), $$1, $$5.J()) : xj.a($$3, this.e.o_(), $$1);
   }

   private xj a(bsw $$0, @Nullable bul $$1) {
      btb $$2 = $$0.a();
      if (!$$2.a(axe.m) && !$$2.a(axe.s)) {
         xj $$4 = a($$1);
         bul $$5 = $$2.d();
         xj $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xj)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xj.a("death.fell.killer", this.e.o_()));
         }
      } else {
         btg $$3 = Objects.requireNonNullElse($$0.c(), btg.a);
         return xj.a($$3.a(), this.e.o_());
      }
   }

   @Nullable
   private static xj a(@Nullable bul $$0) {
      return $$0 == null ? null : $$0.o_();
   }

   public xj a() {
      if (this.d.isEmpty()) {
         return xj.a("death.attack.generic", this.e.o_());
      } else {
         bsw $$0 = this.d.get(this.d.size() - 1);
         btb $$1 = $$0.a();
         bsw $$2 = this.d();
         btf $$3 = $$1.k().e();
         if ($$3 == btf.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == btf.c) {
            String $$4 = "death.attack." + $$1.f();
            xj $$5 = xm.a((xj)xj.c($$4 + ".link")).c(c);
            return xj.a($$4 + ".message", this.e.o_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bsw d() {
      bsw $$0 = null;
      bsw $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bsw $$5 = this.d.get($$4);
         bsw $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         btb $$7 = $$5.a();
         boolean $$8 = $$7.a(axe.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axe.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      return this.i ? this.e.af - this.g : this.h - this.g;
   }

   public void c() {
      int $$0 = this.i ? 300 : 100;
      if (this.j && (!this.e.bL() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.i_();
         }

         this.d.clear();
      }
   }
}
