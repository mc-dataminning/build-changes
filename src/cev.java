import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cev extends cfd {
   private static final cgw a = cgw.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cev(bwn $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cdd.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.er();
      bwf $$1 = this.e.eq();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.aq() == bvq.bS && a(this.e).N().b(dhd.P)) {
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

   public cev a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.eq());
      this.g = this.e.O_();
      this.d = this.e.er();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      fbs $$1 = fbs.a(this.e.du()).c($$0, 10.0, $$0);
      List<? extends bwh> $$2 = this.e.dW().a((Class<? extends bwh>)this.e.getClass(), $$1, bvo.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bwh $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bwh)var5.next();
            if (this.e != $$3 && $$3.O_() == null && (!(this.e instanceof bxc) || ((bxc)this.e).ah_() == ((bxc)$$3).ah_()) && !$$3.s(this.e.eq())) {
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

         this.a($$3, this.e.eq());
      }
   }

   protected void a(bwh $$0, bwf $$1) {
      $$0.h($$1);
   }
}
