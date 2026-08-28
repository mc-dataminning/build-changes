import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ccz extends cdh {
   private static final cfa a = cfa.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public ccz(bus $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cbh.a.d));
   }

   @Override
   public boolean b() {
      int $$0 = this.e.en();
      buk $$1 = this.e.em();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ao() == btv.by && this.e.dS().ac().b(dec.O)) {
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

   public ccz a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void d() {
      this.e.h(this.e.em());
      this.g = this.e.m();
      this.d = this.e.en();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.d();
   }

   protected void h() {
      double $$0 = this.l();
      eyn $$1 = eyn.a(this.e.dq()).c($$0, 10.0, $$0);
      List<? extends bum> $$2 = this.e.dS().a((Class<? extends bum>)this.e.getClass(), $$1, btt.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bum $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bum)var5.next();
            if (this.e != $$3 && $$3.m() == null && (!(this.e instanceof bvg) || ((bvg)this.e).R_() == ((bvg)$$3).R_()) && !$$3.s(this.e.em())) {
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

         this.a($$3, this.e.em());
      }
   }

   protected void a(bum $$0, buk $$1) {
      $$0.h($$1);
   }
}
