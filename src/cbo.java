import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cbo extends cbw {
   private static final cdp a = cdp.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cbo(bth $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bzw.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ej();
      bsy $$1 = this.e.ei();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ak() == bsj.by && this.e.dP().ab().b(dbz.O)) {
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

   public cbo a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ei());
      this.g = this.e.p();
      this.d = this.e.ej();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      evu $$1 = evu.a(this.e.dn()).c($$0, 10.0, $$0);
      List<? extends bta> $$2 = this.e.dP().a((Class<? extends bta>)this.e.getClass(), $$1, bsi.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bta $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bta)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof btv) || ((btv)this.e).P_() == ((btv)$$3).P_()) && !$$3.s(this.e.ei())) {
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

         this.a($$3, this.e.ei());
      }
   }

   protected void a(bta $$0, bsy $$1) {
      $$0.h($$1);
   }
}
