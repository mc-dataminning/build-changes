import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class bwp extends buh<clj> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cto e;
   private final List<cto> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public bwp(int $$0, int $$1) {
      super(ImmutableMap.of(cbs.q, cbt.a), $$0, $$1);
   }

   public boolean a(aqm $$0, clj $$1) {
      btq<?> $$2 = $$1.dS();
      if ($$2.c(cbs.q).isEmpty()) {
         return false;
      } else {
         bso $$3 = $$2.c(cbs.q).get();
         return $$3.ak() == bsa.by && $$1.bD() && $$3.bD() && !$$1.p_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aqm $$0, clj $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dS().c(cbs.q).isPresent();
   }

   public void b(aqm $$0, clj $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aqm $$0, clj $$1, long $$2) {
      bso $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aqm $$0, clj $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dS().b(cbs.q);
      c($$1);
      this.e = null;
   }

   private void a(bso $$0, clj $$1) {
      boolean $$2 = false;
      cto $$3 = $$0.eX();
      if (this.e == null || !cto.b(this.e, $$3)) {
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

   private void a(clj $$0) {
      a($$0, this.f.get(0));
   }

   private void b(clj $$0) {
      for (czv $$1 : $$0.gr()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(czv $$0) {
      return cto.b(this.e, $$0.b()) || cto.b(this.e, $$0.c());
   }

   private static void c(clj $$0) {
      $$0.a(bsb.a, cto.i);
      $$0.a(bsb.a, 0.085F);
   }

   private static void a(clj $$0, cto $$1) {
      $$0.a(bsb.a, $$1);
      $$0.a(bsb.a, 0.0F);
   }

   private bso d(clj $$0) {
      btq<?> $$1 = $$0.dS();
      bso $$2 = $$1.c(cbs.q).get();
      $$1.a(cbs.n, new bus($$2, true));
      return $$2;
   }

   private void e(clj $$0) {
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
