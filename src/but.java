import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class but extends bvb {
   private static final bwt a = bwt.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public but(bmo $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(btb.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ei();
      bmf $$1 = this.e.eh();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == blt.bv && this.e.dM().Z().b(cte.O)) {
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

   public but a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.eh());
      this.g = this.e.q();
      this.d = this.e.ei();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      elh $$1 = elh.a(this.e.dk()).c($$0, 10.0, $$0);
      List<? extends bmh> $$2 = this.e.dM().a((Class<? extends bmh>)this.e.getClass(), $$1, bls.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bmh $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bmh)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bna) || ((bna)this.e).R_() == ((bna)$$3).R_()) && !$$3.s(this.e.eh())) {
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

         this.a($$3, this.e.eh());
      }
   }

   protected void a(bmh $$0, bmf $$1) {
      $$0.h($$1);
   }
}
