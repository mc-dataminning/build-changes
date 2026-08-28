import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class ccg extends cco {
   private static final ceh a = ceh.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public ccg(btz $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cao.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.en();
      btq $$1 = this.e.em();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ak() == btb.by && this.e.dP().ab().b(dbv.O)) {
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

   public ccg a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.em());
      this.g = this.e.p();
      this.d = this.e.en();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      evn $$1 = evn.a(this.e.dn()).c($$0, 10.0, $$0);
      List<? extends bts> $$2 = this.e.dP().a((Class<? extends bts>)this.e.getClass(), $$1, bta.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bts $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bts)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof bun) || ((bun)this.e).P_() == ((bun)$$3).P_()) && !$$3.s(this.e.em())) {
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

   protected void a(bts $$0, btq $$1) {
      $$0.h($$1);
   }
}
