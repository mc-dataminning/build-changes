import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cdu extends cec {
   private static final cfv a = cfv.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cdu(bvm $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(ccc.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.eu();
      bve $$1 = this.e.et();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ar() == bup.by && this.e.dY().ac().b(dfb.O)) {
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

   public cdu a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.et());
      this.g = this.e.m();
      this.d = this.e.eu();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      ezm $$1 = ezm.a(this.e.dw()).c($$0, 10.0, $$0);
      List<? extends bvg> $$2 = this.e.dY().a((Class<? extends bvg>)this.e.getClass(), $$1, bun.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bvg $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bvg)var5.next();
            if (this.e != $$3 && $$3.m() == null && (!(this.e instanceof bwb) || ((bwb)this.e).T_() == ((bwb)$$3).T_()) && !$$3.s(this.e.et())) {
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

         this.a($$3, this.e.et());
      }
   }

   protected void a(bvg $$0, bve $$1) {
      $$0.h($$1);
   }
}
