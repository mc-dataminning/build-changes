import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cah extends bxz<cpj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cxp e;
   private final List<cxp> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cah(int $$0, int $$1) {
      super(ImmutableMap.of(cfk.q, cfl.a), $$0, $$1);
   }

   public boolean a(ash $$0, cpj $$1) {
      bxi<?> $$2 = $$1.ec();
      if ($$2.c(cfk.q).isEmpty()) {
         return false;
      } else {
         bwg $$3 = $$2.c(cfk.q).get();
         return $$3.aq() == bvr.bS && $$1.bL() && $$3.bL() && !$$1.e_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(ash $$0, cpj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cfk.q).isPresent();
   }

   public void b(ash $$0, cpj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(ash $$0, cpj $$1, long $$2) {
      bwg $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(ash $$0, cpj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cfk.q);
      c($$1);
      this.e = null;
   }

   private void a(bwg $$0, cpj $$1) {
      boolean $$2 = false;
      cxp $$3 = $$0.eZ();
      if (this.e == null || !cxp.b(this.e, $$3)) {
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

   private void a(cpj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cpj $$0) {
      for (dgf $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dgf $$0) {
      return cxp.b(this.e, $$0.b()) || cxp.b(this.e, $$0.c());
   }

   private static void c(cpj $$0) {
      $$0.a(bvs.a, cxp.j);
      $$0.a(bvs.a, 0.085F);
   }

   private static void a(cpj $$0, cxp $$1) {
      $$0.a(bvs.a, $$1);
      $$0.a(bvs.a, 0.0F);
   }

   private bwg d(cpj $$0) {
      bxi<?> $$1 = $$0.ec();
      bwg $$2 = $$1.c(cfk.q).get();
      $$1.a(cfk.n, new byk($$2, true));
      return $$2;
   }

   private void e(cpj $$0) {
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
