import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bsw extends bte {
   private static final buv a = buv.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bsw(bks $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bre.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.eh();
      bkj $$1 = this.e.eg();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ag() == bjx.bt && this.e.dL().X().b(cqv.L)) {
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

   public bsw a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.eg());
      this.g = this.e.q();
      this.d = this.e.eh();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      eia $$1 = eia.a(this.e.dj()).c($$0, 10.0, $$0);
      List<? extends bkl> $$2 = this.e.dL().a((Class<? extends bkl>)this.e.getClass(), $$1, bjw.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bkl $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bkl)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof ble) || ((ble)this.e).P_() == ((ble)$$3).P_()) && !$$3.s(this.e.eg())) {
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

         this.a($$3, this.e.eg());
      }
   }

   protected void a(bkl $$0, bkj $$1) {
      $$0.h($$1);
   }
}
