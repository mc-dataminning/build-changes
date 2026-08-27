import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bse extends bpw<cgu> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private coz e;
   private final List<coz> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bse(int $$0, int $$1) {
      super(ImmutableMap.of(bxh.q, bxi.a), $$0, $$1);
   }

   public boolean a(aov $$0, cgu $$1) {
      bpf<?> $$2 = $$1.dO();
      if ($$2.c(bxh.q).isEmpty()) {
         return false;
      } else {
         bog $$3 = $$2.c(bxh.q).get();
         return $$3.ai() == bnu.bw && $$1.bx() && $$3.bx() && !$$1.o_() && $$1.f($$3) <= 17.0;
      }
   }

   public boolean a(aov $$0, cgu $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dO().c(bxh.q).isPresent();
   }

   public void b(aov $$0, cgu $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aov $$0, cgu $$1, long $$2) {
      bog $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aov $$0, cgu $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dO().b(bxh.q);
      c($$1);
      this.e = null;
   }

   private void a(bog $$0, cgu $$1) {
      boolean $$2 = false;
      coz $$3 = $$0.eT();
      if (this.e == null || !coz.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.b()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cgu $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cgu $$0) {
      for (cul $$1 : $$0.gi()) {
         if (!$$1.q() && this.a($$1)) {
            this.f.add($$1.f());
         }
      }
   }

   private boolean a(cul $$0) {
      return coz.b(this.e, $$0.b()) || coz.b(this.e, $$0.c());
   }

   private static void c(cgu $$0) {
      $$0.a(bnv.a, coz.h);
      $$0.a(bnv.a, 0.085F);
   }

   private static void a(cgu $$0, coz $$1) {
      $$0.a(bnv.a, $$1);
      $$0.a(bnv.a, 0.0F);
   }

   private bog d(cgu $$0) {
      bpf<?> $$1 = $$0.dO();
      bog $$2 = $$1.c(bxh.q).get();
      $$1.a(bxh.n, new bqh($$2, true));
      return $$2;
   }

   private void e(cgu $$0) {
      if (this.f.size() >= 2 && ++this.g >= 40) {
         this.h++;
         this.g = 0;
         if (this.h > this.f.size() - 1) {
            this.h = 0;
         }

         a($$0, this.f.get(this.h));
      }
   }
}
