import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cff extends cfn {
   private static final chg a = chg.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cff(bwz $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cdn.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.es();
      bwr $$1 = this.e.eq();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.aq() == bwb.bR && a(this.e).O().c(dhl.P)) {
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

   public cff a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.eq());
      this.g = this.e.f();
      this.d = this.e.es();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      fcp $$1 = fcp.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends bwt> $$2 = this.e.dV().a((Class<? extends bwt>)this.e.getClass(), $$1, bvz.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bwt $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bwt)var5.next();
            if (this.e != $$3 && $$3.f() == null && (!(this.e instanceof bxn) || ((bxn)this.e).e() == ((bxn)$$3).e()) && !$$3.s(this.e.eq())) {
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

   protected void a(bwt $$0, bwr $$1) {
      $$0.h($$1);
   }
}
