import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cdy extends ceg {
   private static final cfz a = cfz.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cdy(bvq $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(ccg.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.eq();
      bvi $$1 = this.e.ep();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.aq() == but.bR && a(this.e).O().b(dgf.P)) {
            return false;
         } else {
            for (Class<?> $$2 : this.i) {
               if ($$2.isAssignableFrom($$1.getClass())) {
                  return false;
               }
            }

            return this.a($$1, a);
         }
      } else {
         return false;
      }
   }

   public cdy a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.ep());
      this.g = this.e.O_();
      this.d = this.e.eq();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      faw $$1 = faw.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends bvk> $$2 = this.e.dV().a((Class<? extends bvk>)this.e.getClass(), $$1, bur.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bvk $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bvk)var5.next();
            if (this.e != $$3 && $$3.O_() == null && (!(this.e instanceof bwf) || ((bwf)this.e).ag_() == ((bwf)$$3).ag_()) && !$$3.s(this.e.ep())) {
               if (this.j == null) {
                  break;
               }

               boolean $$4 = false;

               for (Class<?> $$5 : this.j) {
                  if ($$3.getClass() == $$5) {
                     $$4 = true;
                     break;
                  }
               }

               if (!$$4) {
                  break;
               }
            }
         }

         this.a($$3, this.e.ep());
      }
   }

   protected void a(bvk $$0, bvi $$1) {
      $$0.h($$1);
   }
}
