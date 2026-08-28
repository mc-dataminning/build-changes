import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cdq extends cdy {
   private static final cfr a = cfr.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cdq(bvi $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cby.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.et();
      bva $$1 = this.e.es();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ar() == bul.by && this.e.dX().ac().b(dex.O)) {
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

   public cdq a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.es());
      this.g = this.e.m();
      this.d = this.e.et();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      ezi $$1 = ezi.a(this.e.dv()).c($$0, 10.0, $$0);
      List<? extends bvc> $$2 = this.e.dX().a((Class<? extends bvc>)this.e.getClass(), $$1, buj.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bvc $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bvc)var5.next();
            if (this.e != $$3 && $$3.m() == null && (!(this.e instanceof bvx) || ((bvx)this.e).T_() == ((bvx)$$3).T_()) && !$$3.s(this.e.es())) {
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

         this.a($$3, this.e.es());
      }
   }

   protected void a(bvc $$0, bva $$1) {
      $$0.h($$1);
   }
}
