import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class cbv extends bzn<crl> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private daa e;
   private final List<daa> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public cbv(int $$0, int $$1) {
      super(ImmutableMap.of(cgy.r, cgz.a), $$0, $$1);
   }

   public boolean a(aru $$0, crl $$1) {
      byw<?> $$2 = $$1.ec();
      if ($$2.c(cgy.r).isEmpty()) {
         return false;
      } else {
         bxw $$3 = $$2.c(cgy.r).get();
         return $$3.an() == bxe.bT && $$1.bJ() && $$3.bJ() && !$$1.n_() && $$1.g($$3) <= 17.0;
      }
   }

   public boolean a(aru $$0, crl $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.ec().c(cgy.r).isPresent();
   }

   public void b(aru $$0, crl $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(aru $$0, crl $$1, long $$2) {
      bxw $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(aru $$0, crl $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.ec().b(cgy.r);
      c($$1);
      this.e = null;
   }

   private void a(bxw $$0, crl $$1) {
      boolean $$2 = false;
      daa $$3 = $$0.fb();
      if (this.e == null || !daa.b(this.e, $$3)) {
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

   private void a(crl $$0) {
      a($$0, this.f.get(0));
   }

   private void b(crl $$0) {
      for (div $$1 : $$0.gv()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(div $$0) {
      return daa.b(this.e, $$0.b()) || daa.b(this.e, $$0.c());
   }

   private static void c(crl $$0) {
      $$0.a(bxf.a, daa.k);
      $$0.a(bxf.a, 0.085F);
   }

   private static void a(crl $$0, daa $$1) {
      $$0.a(bxf.a, $$1);
      $$0.a(bxf.a, 0.0F);
   }

   private bxw d(crl $$0) {
      byw<?> $$1 = $$0.ec();
      bxw $$2 = $$1.c(cgy.r).get();
      $$1.a(cgy.o, new bzy($$2, true));
      return $$2;
   }

   private void e(crl $$0) {
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
