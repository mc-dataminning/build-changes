import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bwx extends bxf {
   private static final byy a = byy.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bwx(boq $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bvf.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ej();
      boi $$1 = this.e.ei();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == bnw.bw && this.e.dM().Z().b(cvn.O)) {
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

   public bwx a(Class<?>... $$0) {
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
      enu $$1 = enu.a(this.e.dk()).c($$0, 10.0, $$0);
      List<? extends bok> $$2 = this.e.dM().a((Class<? extends bok>)this.e.getClass(), $$1, bnv.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bok $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bok)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bpe) || ((bpe)this.e).R_() == ((bpe)$$3).R_()) && !$$3.r(this.e.ei())) {
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

   protected void a(bok $$0, boi $$1) {
      $$0.h($$1);
   }
}
