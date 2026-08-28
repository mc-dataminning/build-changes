import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cbt extends bzl<crj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private czy e;
   private final List<czy> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cbt(int $$0, int $$1) {
      super(ImmutableMap.of(cgw.r, cgx.a), $$0, $$1);
   }

   public boolean a(ars $$0, crj $$1) {
      byu<?> $$2 = $$1.ec();
      if ($$2.c(cgw.r).isEmpty()) {
         return false;
      } else {
         bxu $$3 = $$2.c(cgw.r).get();
         return $$3.an() == bxc.bT && $$1.bJ() && $$3.bJ() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ars $$0, crj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cgw.r).isPresent();
   }

   public void b(ars $$0, crj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ars $$0, crj $$1, long $$2) {
      bxu $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ars $$0, crj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cgw.r);
      c($$1);
      this.e = null;
   }

   private void a(bxu $$0, crj $$1) {
      boolean $$2 = false;
      czy $$3 = $$0.fb();
      if (this.e == null || !czy.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.f()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(crj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(crj $$0) {
      for (dit $$1 : $$0.gv()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dit $$0) {
      return czy.b(this.e, $$0.b()) || czy.b(this.e, $$0.c());
   }

   private static void c(crj $$0) {
      $$0.a(bxd.a, czy.k);
      $$0.a(bxd.a, 0.085F);
   }

   private static void a(crj $$0, czy $$1) {
      $$0.a(bxd.a, $$1);
      $$0.a(bxd.a, 0.0F);
   }

   private bxu d(crj $$0) {
      byu<?> $$1 = $$0.ec();
      bxu $$2 = $$1.c(cgw.r).get();
      $$1.a(cgw.o, new bzw($$2, true));
      return $$2;
   }

   private void e(crj $$0) {
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
