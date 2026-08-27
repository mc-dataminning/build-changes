import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bty extends bug {
   private static final bvx a = bvx.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bty(blu $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bsg.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ej();
      bll $$1 = this.e.ei();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == bkz.bt && this.e.dN().Y().b(csb.O)) {
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

   public bty a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ei());
      this.g = this.e.q();
      this.d = this.e.ej();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      eju $$1 = eju.a(this.e.dl()).c($$0, 10.0, $$0);
      List<? extends bln> $$2 = this.e.dN().a((Class<? extends bln>)this.e.getClass(), $$1, bky.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bln $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bln)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bmg) || ((bmg)this.e).R_() == ((bmg)$$3).R_()) && !$$3.s(this.e.ei())) {
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

   protected void a(bln $$0, bll $$1) {
      $$0.h($$1);
   }
}
