import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cgk extends cgs {
   private static final cil a = cil.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cgk(bye $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(ces.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.et();
      bxw $$1 = this.e.er();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.an() == bxe.bT && a(this.e).O().c(djv.Q)) {
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

   public cgk a(Class<?>... $$0) {
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
      ffn $$1 = ffn.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends bxy> $$2 = this.e.dV().a((Class<? extends bxy>)this.e.getClass(), $$1, bxc.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bxy $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bxy)var5.next();
            if (this.e != $$3 && $$3.f() == null && (!(this.e instanceof bys) || ((bys)this.e).e() == ((bys)$$3).e()) && !$$3.s(this.e.er())) {
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

   protected void a(bxy $$0, bxw $$1) {
      $$0.g($$1);
   }
}
