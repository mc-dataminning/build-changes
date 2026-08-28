import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cgt extends chb {
   private static final ciu a = ciu.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cgt(byn $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cfb.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.et();
      byf $$1 = this.e.er();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.an() == bxn.bT && a(this.e).O().c(dkf.Q)) {
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

   public cgt a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.g(this.e.er());
      this.g = this.e.e();
      this.d = this.e.et();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      ffx $$1 = ffx.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends byh> $$2 = this.e.dV().a((Class<? extends byh>)this.e.getClass(), $$1, bxl.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         byh $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (byh)var5.next();
            if (this.e != $$3 && $$3.e() == null && (!(this.e instanceof bzb) || ((bzb)this.e).T_() == ((bzb)$$3).T_()) && !$$3.s(this.e.er())) {
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

         this.a($$3, this.e.er());
      }
   }

   protected void a(byh $$0, byf $$1) {
      $$0.g($$1);
   }
}
