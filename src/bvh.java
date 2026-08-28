import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bvh {
   public static final int a = 100;
   public static final int b = 300;
   private static final xz c = xz.a.a(new xa.e(ayl.w)).a(new xi.e(xc.b("MCPE-28723")));
   private final List<bvf> d = Lists.newArrayList();
   private final bxw e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bvh(bxw $$0) {
      this.e = $$0;
   }

   public void a(bvk $$0, float $$1) {
      this.c();
      bvp $$2 = bvp.a(this.e);
      bvf $$3 = new bvf($$0, $$1, $$2, (float)this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bJ() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.e_();
      }
   }

   private static boolean a(bvk $$0) {
      return $$0.d() instanceof bxw;
   }

   private xc a(bwv $$0, xc $$1, String $$2, String $$3) {
      daa $$5 = $$0 instanceof bxw $$4 ? $$4.fb() : daa.k;
      return !$$5.f() && $$5.c(kl.g) ? xc.a($$2, this.e.m_(), $$1, $$5.K()) : xc.a($$3, this.e.m_(), $$1);
   }

   private xc a(bvf $$0, @Nullable bwv $$1) {
      bvk $$2 = $$0.a();
      if (!$$2.a(axh.m) && !$$2.a(axh.s)) {
         xc $$4 = a($$1);
         bwv $$5 = $$2.d();
         xc $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xc)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xc.a("death.fell.killer", this.e.m_()));
         }
      } else {
         bvp $$3 = Objects.requireNonNullElse($$0.c(), bvp.a);
         return xc.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static xc a(@Nullable bwv $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public xc a() {
      if (this.d.isEmpty()) {
         return xc.a("death.attack.generic", this.e.m_());
      } else {
         bvf $$0 = this.d.get(this.d.size() - 1);
         bvk $$1 = $$0.a();
         bvf $$2 = this.d();
         bvo $$3 = $$1.k().e();
         if ($$3 == bvo.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bvo.c) {
            String $$4 = "death.attack." + $$1.f();
            xc $$5 = xf.a((xc)xc.c($$4 + ".link")).c(c);
            return xc.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bvf d() {
      bvf $$0 = null;
      bvf $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bvf $$5 = this.d.get($$4);
         bvf $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bvk $$7 = $$5.a();
         boolean $$8 = $$7.a(axh.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axh.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bJ() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.N_();
         }

         this.d.clear();
      }
   }
}
