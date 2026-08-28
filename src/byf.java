import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import java.util.List;
import javax.annotation.Nullable;

public class byf extends bvx<cnc> {
   private static final int c = 900;
   private static final int d = 40;
   @Nullable
   private cvl e;
   private final List<cvl> f = Lists.newArrayList();
   private int g;
   private int h;
   private int i;

   public byf(int $$0, int $$1) {
      super(ImmutableMap.of(cdi.q, cdj.a), $$0, $$1);
   }

   public boolean a(arg $$0, cnc $$1) {
      bvg<?> $$2 = $$1.dX();
      if ($$2.c(cdi.q).isEmpty()) {
         return false;
      } else {
         buf $$3 = $$2.c(cdi.q).get();
         return $$3.ao() == btq.by && $$1.bI() && $$3.bI() && !$$1.o_() && $$1.g((btj)$$3) <= 17.0;
      }
   }

   public boolean a(arg $$0, cnc $$1, long $$2) {
      return this.a($$0, $$1) && this.i > 0 && $$1.dX().c(cdi.q).isPresent();
   }

   public void b(arg $$0, cnc $$1, long $$2) {
      super.d($$0, $$1, $$2);
      this.d($$1);
      this.g = 0;
      this.h = 0;
      this.i = 40;
   }

   public void c(arg $$0, cnc $$1, long $$2) {
      buf $$3 = this.d($$1);
      this.a($$3, $$1);
      if (!this.f.isEmpty()) {
         this.e($$1);
      } else {
         c($$1);
         this.i = Math.min(this.i, 40);
      }

      this.i--;
   }

   public void d(arg $$0, cnc $$1, long $$2) {
      super.b($$0, $$1, $$2);
      $$1.dX().b(cdi.q);
      c($$1);
      this.e = null;
   }

   private void a(buf $$0, cnc $$1) {
      boolean $$2 = false;
      cvl $$3 = $$0.eW();
      if (this.e == null || !cvl.b(this.e, $$3)) {
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

   private void a(cnc $$0) {
      a($$0, this.f.get(0));
   }

   private void b(cnc $$0) {
      for (dcp $$1 : $$0.gq()) {
         if (!$$1.r() && this.a($$1)) {
            this.f.add($$1.h());
         }
      }
   }

   private boolean a(dcp $$0) {
      return cvl.b(this.e, $$0.b()) || cvl.b(this.e, $$0.c());
   }

   private static void c(cnc $$0) {
      $$0.a(btr.a, cvl.k);
      $$0.a(btr.a, 0.085F);
   }

   private static void a(cnc $$0, cvl $$1) {
      $$0.a(btr.a, $$1);
      $$0.a(btr.a, 0.0F);
   }

   private buf d(cnc $$0) {
      bvg<?> $$1 = $$0.dX();
      buf $$2 = $$1.c(cdi.q).get();
      $$1.a(cdi.n, new bwi($$2, true));
      return $$2;
   }

   private void e(cnc $$0) {
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
