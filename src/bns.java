import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

public class bns {
   public static final int a = 100;
   public static final int b = 300;
   private static final wr c = wr.a.a(new vs(vs.a.a, "https://bugs.mojang.com/browse/MCPE-28723")).a(new wa(wa.a.a, vu.b("MCPE-28723")));
   private final List<bnq> d = Lists.newArrayList();
   private final bpo e;
   private int f;
   private int g;
   private int h;
   private boolean i;
   private boolean j;

   public bns(bpo $$0) {
      this.e = $$0;
   }

   public void a(bnv $$0, float $$1) {
      this.c();
      boa $$2 = boa.a(this.e);
      bnq $$3 = new bnq($$0, $$1, $$2, this.e.ab);
      this.d.add($$3);
      this.f = this.e.ah;
      this.j = true;
      if (!this.i && this.e.bA() && a($$0)) {
         this.i = true;
         this.g = this.e.ah;
         this.h = this.g;
         this.e.f_();
      }
   }

   private static boolean a(bnv $$0) {
      return $$0.d() instanceof bpo;
   }

   private vu a(bow $$0, vu $$1, String $$2, String $$3) {
      cqk $$5 = $$0 instanceof bpo $$4 ? $$4.eU() : cqk.h;
      return !$$5.b() && $$5.B() ? vu.a($$2, this.e.O_(), $$1, $$5.K()) : vu.a($$3, this.e.O_(), $$1);
   }

   private vu a(bnq $$0, @Nullable bow $$1) {
      bnv $$2 = $$0.a();
      if (!$$2.a(aup.n) && !$$2.a(aup.t)) {
         vu $$4 = a($$1);
         bow $$5 = $$2.d();
         vu $$6 = a($$5);
         if ($$6 != null && !$$6.equals($$4)) {
            return this.a($$5, $$6, "death.fell.assist.item", "death.fell.assist");
         } else {
            return (vu)($$4 != null ? this.a($$1, $$4, "death.fell.finish.item", "death.fell.finish") : vu.a("death.fell.killer", this.e.O_()));
         }
      } else {
         boa $$3 = Objects.requireNonNullElse($$0.c(), boa.a);
         return vu.a($$3.a(), this.e.O_());
      }
   }

   @Nullable
   private static vu a(@Nullable bow $$0) {
      return $$0 == null ? null : $$0.O_();
   }

   public vu a() {
      if (this.d.isEmpty()) {
         return vu.a("death.attack.generic", this.e.O_());
      } else {
         bnq $$0 = this.d.get(this.d.size() - 1);
         bnv $$1 = $$0.a();
         bnq $$2 = this.d();
         bnz $$3 = $$1.j().e();
         if ($$3 == bnz.b && $$2 != null) {
            return this.a($$2, $$1.d());
         } else if ($$3 == bnz.c) {
            String $$4 = "death.attack." + $$1.e();
            vu $$5 = vx.a((vu)vu.c($$4 + ".link")).c(c);
            return vu.a($$4 + ".message", this.e.O_(), $$5);
         } else {
            return $$1.a(this.e);
         }
      }
   }

   @Nullable
   private bnq d() {
      bnq $$0 = null;
      bnq $$1 = null;
      float $$2 = 0.0F;
      float $$3 = 0.0F;

      for (int $$4 = 0; $$4 < this.d.size(); $$4++) {
         bnq $$5 = this.d.get($$4);
         bnq $$6 = $$4 > 0 ? this.d.get($$4 - 1) : null;
         bnv $$7 = $$5.a();
         boolean $$8 = $$7.a(aup.t);
         float $$9 = $$8 ? Float.MAX_VALUE : $$5.d();
         if (($$7.a(aup.n) || $$8) && $$9 > 0.0F && ($$0 == null || $$9 > $$3)) {
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
      if (this.j && (!this.e.bA() || this.e.ah - this.f > $$0)) {
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
