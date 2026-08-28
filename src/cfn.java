import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cfn extends cfv {
   private static final cho a = cho.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cfn(bxh $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cdv.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.es();
      bwz $$1 = this.e.eq();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.aq() == bwj.bS && a(this.e).O().c(dil.P)) {
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

   public cfn a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.g(this.e.eq());
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
      fdr $$1 = fdr.a(this.e.dt()).c($$0, 10.0, $$0);
      List<? extends bxb> $$2 = this.e.dV().a((Class<? extends bxb>)this.e.getClass(), $$1, bwh.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bxb $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bxb)var5.next();
            if (this.e != $$3 && $$3.f() == null && (!(this.e instanceof bxv) || ((bxv)this.e).e() == ((bxv)$$3).e()) && !$$3.s(this.e.eq())) {
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

   protected void a(bxb $$0, bwz $$1) {
      $$0.g($$1);
   }
}
