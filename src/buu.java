import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class buu {
   public static final int a = 100;
   public static final int b = 300;
   private static final xv c = xv.a.a(new ww.e(ayh.w)).a(new xe.e(wy.b("MCPE-28723")));
   private final List<bus> d = Lists.newArrayList();
   private final bxj e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public buu(bxj $$0) {
      this.e = $$0;
   }

   public void a(bux $$0, float $$1) {
      this.c();
      bvc $$2 = bvc.a(this.e);
      bus $$3 = new bus($$0, $$1, $$2, (float)this.e.Z);
      this.d.add($$3);
      this.f = this.e.af;
      this.j = true;
      if (!this.i && this.e.bI() && a($$0)) {
         this.i = true;
         this.g = this.e.af;
         this.h = this.g;
         this.e.e_();
      }
   }

   private static boolean a(bux $$0) {
      return $$0.d() instanceof bxj;
   }

   private wy a(bwi $$0, wy $$1, String $$2, String $$3) {
      czn $$5 = $$0 instanceof bxj $$4 ? $$4.fa() : czn.k;
      return !$$5.f() && $$5.c(kk.g) ? wy.a($$2, this.e.m_(), $$1, $$5.K()) : wy.a($$3, this.e.m_(), $$1);
   }

   private wy a(bus $$0, @Nullable bwi $$1) {
      bux $$2 = $$0.a();
      if (!$$2.a(axd.m) && !$$2.a(axd.s)) {
         wy $$4 = a($$1);
         bwi $$5 = $$2.d();
         wy $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (wy)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : wy.a("death.fell.killer", this.e.m_()));
         }
      } else {
         bvc $$3 = Objects.requireNonNullElse($$0.c(), bvc.a);
         return wy.a($$3.a(), this.e.m_());
      }
   }

   @Nullable
   private static wy a(@Nullable bwi $$0) {
      return $$0 == null ? null : $$0.m_();
   }

   public wy a() {
      if (this.d.isEmpty()) {
         return wy.a("death.attack.generic", this.e.m_());
      } else {
         bus $$0 = this.d.get(this.d.size() - 1);
         bux $$1 = $$0.a();
         bus $$2 = this.d();
         bvb $$3 = $$1.k().e();
         if ($$3 == bvb.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bvb.c) {
            String $$4 = "death.attack." + $$1.f();
            wy $$5 = xb.a((wy)wy.c($$4 + ".link")).c(c);
            return wy.a($$4 + ".message", this.e.m_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bus d() {
      bus $$0 = null;
      bus $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bus $$5 = this.d.get($$4);
         bus $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bux $$7 = $$5.a();
         boolean $$8 = $$7.a(axd.s);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(axd.m) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bI() || this.e.af - this.f > $$0)) {
         boolean $$1 = this.i;
         this.j = false;
         this.i = false;
         this.h = this.e.af;
         if ($$1) {
            this.e.J_();
         }

         this.d.clear();
      }
   }
}
