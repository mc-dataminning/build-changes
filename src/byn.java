import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class byn extends bwf<cnk> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cvs e;
   private final List<cvs> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public byn(int $$0, int $$1) {
      super(ImmutableMap.of(cdq.q, cdr.a), $$0, $$1);
   }

   public boolean a(arj $$0, cnk $$1) {
      bvo<?> $$2 = $$1.dY();
      if ($$2.c(cdq.q).isEmpty()) {
         return false;
      } else {
         bun $$3 = $$2.c(cdq.q).get();
         return $$3.ao() == bty.by && $$1.bI() && $$3.bI() && !$$1.p_() && $$1.g((btr)$$3) <= 17.0;
      }
   }

   public boolean a(arj $$0, cnk $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dY().c(cdq.q).isPresent();
   }

   public void b(arj $$0, cnk $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arj $$0, cnk $$1, long $$2) {
      bun $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arj $$0, cnk $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dY().b(cdq.q);
      c($$1);
      this.e = null;
   }

   private void a(bun $$0, cnk $$1) {
      boolean $$2 = false;
      cvs $$3 = $$0.eW();
      if (this.e == null || !cvs.b(this.e, $$3)) {
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

   private void a(cnk $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cnk $$0) {
      for (ddg $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(ddg $$0) {
      return cvs.b(this.e, $$0.b()) || cvs.b(this.e, $$0.c());
   }

   private static void c(cnk $$0) {
      $$0.a(btz.a, cvs.k);
      $$0.a(btz.a, 0.085F);
   }

   private static void a(cnk $$0, cvs $$1) {
      $$0.a(btz.a, $$1);
      $$0.a(btz.a, 0.0F);
   }

   private bun d(cnk $$0) {
      bvo<?> $$1 = $$0.dY();
      bun $$2 = $$1.c(cdq.q).get();
      $$1.a(cdq.n, new bwq($$2, true));
      return $$2;
   }

   private void e(cnk $$0) {
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
