import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cbd extends cbl {
   private static final cde a = cde.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cbd(bsw $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bzl.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ev();
      bso $$1 = this.e.eu();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ak() == bsb.bE && this.e.dU().ab().b(dbw.P)) {
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

   public cbd a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.eu());
      this.g = this.e.p();
      this.d = this.e.ev();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      ewp $$1 = ewp.a(this.e.ds()).c($$0, 10.0, $$0);
      List<? extends bsq> $$2 = this.e.dU().a((Class<? extends bsq>)this.e.getClass(), $$1, bsa.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bsq $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bsq)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof btk) || ((btk)this.e).Q_() == ((btk)$$3).Q_()) && !$$3.s(this.e.eu())) {
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

         this.a($$3, this.e.eu());
      }
   }

   protected void a(bsq $$0, bso $$1) {
      $$0.h($$1);
   }
}
