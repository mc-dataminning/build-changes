import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class byd extends byl {
   private static final cae a = cae.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public byd(bpw $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bwl.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ek();
      bpo $$1 = this.e.ej();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == bpc.bx && this.e.dM().Z().b(cwv.O)) {
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

   public byd a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ej());
      this.g = this.e.p();
      this.d = this.e.ek();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      epm $$1 = epm.a(this.e.dk()).c($$0, 10.0, $$0);
      List<? extends bpq> $$2 = this.e.dM().a((Class<? extends bpq>)this.e.getClass(), $$1, bpb.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bpq $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bpq)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof bqk) || ((bqk)this.e).P_() == ((bqk)$$3).P_()) && !$$3.s(this.e.ej())) {
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

         this.a($$3, this.e.ej());
      }
   }

   protected void a(bpq $$0, bpo $$1) {
      $$0.h($$1);
   }
}
