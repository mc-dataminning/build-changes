import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cce extends ccm {
   private static final cef a = cef.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cce(btw $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cam.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.ek();
      btn $$1 = this.e.ej();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.am() == bsx.by && this.e.dP().ab().b(dcs.O)) {
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

   public cce a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.ej());
      this.g = this.e.p();
      this.d = this.e.ek();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      ewv $$1 = ewv.a(this.e.dn()).c($$0, 10.0, $$0);
      List<? extends btp> $$2 = this.e.dP().a((Class<? extends btp>)this.e.getClass(), $$1, bsw.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         btp $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (btp)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof bul) || ((bul)this.e).T_() == ((bul)$$3).T_()) && !$$3.s(this.e.ej())) {
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

         this.a($$3, this.e.ej());
      }
   }

   protected void a(btp $$0, btn $$1) {
      $$0.h($$1);
   }
}
