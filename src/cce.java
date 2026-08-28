import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cce extends bzw<cru> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private dak e;
   private final List<dak> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cce(int $$0, int $$1) {
      super(ImmutableMap.of(chh.r, chi.a), $$0, $$1);
   }

   public boolean a(asb $$0, cru $$1) {
      bzf<?> $$2 = $$1.ec();
      if ($$2.c(chh.r).isEmpty()) {
         return false;
      } else {
         byf $$3 = $$2.c(chh.r).get();
         return $$3.an() == bxn.bT && $$1.bJ() && $$3.bJ() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(asb $$0, cru $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(chh.r).isPresent();
   }

   public void b(asb $$0, cru $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(asb $$0, cru $$1, long $$2) {
      byf $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(asb $$0, cru $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(chh.r);
      c($$1);
      this.e = null;
   }

   private void a(byf $$0, cru $$1) {
      boolean $$2 = false;
      dak $$3 = $$0.fb();
      if (this.e == null || !dak.b(this.e, $$3)) {
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

   private void a(cru $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cru $$0) {
      for (djf $$1 : $$0.gv()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(djf $$0) {
      return dak.b(this.e, $$0.b()) || dak.b(this.e, $$0.c());
   }

   private static void c(cru $$0) {
      $$0.a(bxo.a, dak.l);
      $$0.a(bxo.a, 0.085F);
   }

   private static void a(cru $$0, dak $$1) {
      $$0.a(bxo.a, $$1);
      $$0.a(bxo.a, 0.0F);
   }

   private byf d(cru $$0) {
      bzf<?> $$1 = $$0.ec();
      byf $$2 = $$1.c(chh.r).get();
      $$1.a(chh.o, new cah($$2, true));
      return $$2;
   }

   private void e(cru $$0) {
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
