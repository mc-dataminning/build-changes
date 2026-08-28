import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cgi extends cgq {
   private static final cij a = cij.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cgi(byc $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(ceq.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.et();
      bxu $$1 = this.e.er();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.an() == bxc.bT && a(this.e).O().c(djt.Q)) {
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

   public cgi a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.g(this.e.er());
      this.g = this.e.f();
      this.d = this.e.et();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      ffl $$1 = ffl.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends bxw> $$2 = this.e.dV().a((Class<? extends bxw>)this.e.getClass(), $$1, bxa.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bxw $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bxw)var5.next();
            if (this.e != $$3 && $$3.f() == null && (!(this.e instanceof byq) || ((byq)this.e).e() == ((byq)$$3).e()) && !$$3.s(this.e.er())) {
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

   protected void a(bxw $$0, bxu $$1) {
      $$0.g($$1);
   }
}
