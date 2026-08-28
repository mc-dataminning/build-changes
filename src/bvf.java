import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bvf {
   public static final int a = 100;
   public static final int b = 300;
   private static final xx c = xx.a.a(new wy.e(ayj.w)).a(new xg.e(xa.b("MCPE-28723")));
   private final List<bvd> d = Lists.newArrayList();
   private final bxu e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bvf(bxu $$0) {
      this.e = $$0;
   }

   public void a(bvi $$0, float $$1) {
      this.c();
      bvn $$2 = bvn.a(this.e);
      bvd $$3 = new bvd($$0, $$1, $$2, (float)this.e.Z);
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

   private static boolean a(bvi $$0) {
      return $$0.d() instanceof bxu;
   }

   private xa a(bwt $$0, xa $$1, String $$2, String $$3) {
      czy $$5 = $$0 instanceof bxu $$4 ? $$4.fb() : czy.k;
      return !$$5.f() && $$5.c(kk.g) ? xa.a($$2, this.e.m_(), $$1, $$5.K()) : xa.a($$3, this.e.m_(), $$1);
   }

   private xa a(bvd $$0, @Nullable bwt $$1) {
      bvi $$2 = $$0.a();
      if (!$$2.a(axf.m) && !$$2.a(axf.s)) {
         xa $$4 = a($$1);
         bwt $$5 = $$2.d();
         xa $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (xa)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : xa.a("death.fell.killer", this.e.m_()));
         }
      } else {
         bvn $$3 = Objects.requireNonNullElse($$0.c(), bvn.a);
         return xa.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static xa a(@Nullable bwt $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public xa a() {
      if (this.d.isEmpty()) {
         return xa.a("death.attack.generic", this.e.m_());
      } else {
         bvd $$0 = this.d.get(this.d.size() - 1);
         bvi $$1 = $$0.a();
         bvd $$2 = this.d();
         bvm $$3 = $$1.k().e();
         if ($$3 == bvm.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bvm.c) {
            String $$4 = "death.attack." + $$1.f();
            xa $$5 = xd.a((xa)xa.c($$4 + ".link")).c(c);
            return xa.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bvd d() {
      bvd $$0 = null;
      bvd $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bvd $$5 = this.d.get($$4);
         bvd $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bvi $$7 = $$5.a();
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
