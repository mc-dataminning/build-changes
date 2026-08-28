import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cch extends ccp {
   private static final cei a = cei.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cch(bua $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cap.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.en();
      btr $$1 = this.e.em();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ak() == btc.by && this.e.dP().ab().b(dbw.O)) {
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

   public cch a(Class<?>... $$0) {
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
      evo $$1 = evo.a(this.e.dn()).c($$0, 10.0, $$0);
      List<? extends btt> $$2 = this.e.dP().a((Class<? extends btt>)this.e.getClass(), $$1, btb.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         btt $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (btt)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof buo) || ((buo)this.e).P_() == ((buo)$$3).P_()) && !$$3.s(this.e.em())) {
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

   protected void a(btt $$0, btr $$1) {
      $$0.h($$1);
   }
}
