import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxp extends bvh<cmk> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuq e;
   private final List<cuq> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxp(int $$0, int $$1) {
      super(ImmutableMap.of(ccs.q, cct.a), $$0, $$1);
   }

   public boolean a(aqu $$0, cmk $$1) {
      buq<?> $$2 = $$1.dT();
      if ($$2.c(ccs.q).isEmpty()) {
         return false;
      } else {
         btn $$3 = $$2.c(ccs.q).get();
         return $$3.am() == bsx.by && $$1.bE() && $$3.bE() && !$$1.o_() && $$1.g((bsr)$$3) <= 17.0;
      }
   }

   public boolean a(aqu $$0, cmk $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dT().c(ccs.q).isPresent();
   }

   public void b(aqu $$0, cmk $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqu $$0, cmk $$1, long $$2) {
      btn $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqu $$0, cmk $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dT().b(ccs.q);
      c($$1);
      this.e = null;
   }

   private void a(btn $$0, cmk $$1) {
      boolean $$2 = false;
      cuq $$3 = $$0.eT();
      if (this.e == null || !cuq.b(this.e, $$3)) {
         this.e = $$3;
         $$2 = true;
         this.f.clear();
      }

      if ($$2 && !this.e.e()) {
         this.b($$1);
         if (!this.f.isEmpty()) {
            this.i = 900;
            this.a($$1);
         }
      }
   }

   private void a(cmk $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cmk $$0) {
      for (dbu $$1 : $$0.gm()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dbu $$0) {
      return cuq.b(this.e, $$0.b()) || cuq.b(this.e, $$0.c());
   }

   private static void c(cmk $$0) {
      $$0.a(bsy.a, cuq.l);
      $$0.a(bsy.a, 0.085F);
   }

   private static void a(cmk $$0, cuq $$1) {
      $$0.a(bsy.a, $$1);
      $$0.a(bsy.a, 0.0F);
   }

   private btn d(cmk $$0) {
      buq<?> $$1 = $$0.dT();
      btn $$2 = $$1.c(ccs.q).get();
      $$1.a(ccs.n, new bvs($$2, true));
      return $$2;
   }

   private void e(cmk $$0) {
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
