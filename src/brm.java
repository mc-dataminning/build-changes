import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class brm extends bru {
   private static final btl a = btl.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public brm(bjh $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bpu.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.eg();
      biy $$1 = this.e.ef();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ag() == bim.bt && this.e.dK().X().b(cpi.K)) {
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

   public brm a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ef());
      this.g = this.e.j();
      this.d = this.e.eg();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      egz $$1 = egz.a(this.e.di()).c($$0, 10.0, $$0);
      List<? extends bja> $$2 = this.e.dK().a((Class<? extends bja>)this.e.getClass(), $$1, bil.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bja $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bja)var5.next();
            if (this.e != $$3 && $$3.j() == null && (!(this.e instanceof bju) || ((bju)this.e).I_() == ((bju)$$3).I_()) && !$$3.s(this.e.ef())) {
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

         this.a($$3, this.e.ef());
      }
   }

   protected void a(bja $$0, biy $$1) {
      $$0.h($$1);
   }
}
