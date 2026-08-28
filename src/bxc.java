import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bxc extends buu<clx> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cuc e;
   private final List<cuc> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bxc(int $$0, int $$1) {
      super(ImmutableMap.of(ccf.q, ccg.a), $$0, $$1);
   }

   public boolean a(aqm $$0, clx $$1) {
      bud<?> $$2 = $$1.dU();
      if ($$2.c(ccf.q).isEmpty()) {
         return false;
      } else {
         btb $$3 = $$2.c(ccf.q).get();
         return $$3.al() == bsm.by && $$1.bE() && $$3.bE() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqm $$0, clx $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dU().c(ccf.q).isPresent();
   }

   public void b(aqm $$0, clx $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqm $$0, clx $$1, long $$2) {
      btb $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqm $$0, clx $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dU().b(ccf.q);
      c($$1);
      this.e = null;
   }

   private void a(btb $$0, clx $$1) {
      boolean $$2 = false;
      cuc $$3 = $$0.eU();
      if (this.e == null || !cuc.b(this.e, $$3)) {
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

   private void a(clx $$0) {
      a($$0, this.f.get(0));
   }

   private void b(clx $$0) {
      for (dbd $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dbd $$0) {
      return cuc.b(this.e, $$0.b()) || cuc.b(this.e, $$0.c());
   }

   private static void c(clx $$0) {
      $$0.a(bsn.a, cuc.l);
      $$0.a(bsn.a, 0.085F);
   }

   private static void a(clx $$0, cuc $$1) {
      $$0.a(bsn.a, $$1);
      $$0.a(bsn.a, 0.0F);
   }

   private btb d(clx $$0) {
      bud<?> $$1 = $$0.dU();
      btb $$2 = $$1.c(ccf.q).get();
      $$1.a(ccf.n, new bvf($$2, true));
      return $$2;
   }

   private void e(clx $$0) {
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
