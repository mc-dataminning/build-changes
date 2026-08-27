import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cap extends cax {
   private static final ccq a = ccq.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cap(bsi $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(byx.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.el();
      bsa $$1 = this.e.ek();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == brn.bx && this.e.dN().aa().b(czz.O)) {
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

   public cap a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ek());
      this.g = this.e.p();
      this.d = this.e.el();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      etk $$1 = etk.a(this.e.dl()).c($$0, 10.0, $$0);
      List<? extends bsc> $$2 = this.e.dN().a((Class<? extends bsc>)this.e.getClass(), $$1, brm.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bsc $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bsc)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof bsw) || ((bsw)this.e).P_() == ((bsw)$$3).P_()) && !$$3.s(this.e.ek())) {
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

         this.a($$3, this.e.ek());
      }
   }

   protected void a(bsc $$0, bsa $$1) {
      $$0.h($$1);
   }
}
