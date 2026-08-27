import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bon extends bov {
   private static final bqm a = bqm.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bon(bgi $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bmv.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ee();
      bfz $$1 = this.e.ed();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ae() == bfn.bt && this.e.dI().X().b(cmi.K)) {
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

   public bon a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.ed());
      this.g = this.e.j();
      this.d = this.e.ee();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      eed $$1 = eed.a(this.e.dg()).c($$0, 10.0, $$0);
      List<? extends bgb> $$2 = this.e.dI().a((Class<? extends bgb>)this.e.getClass(), $$1, bfm.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bgb $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bgb)var5.next();
            if (this.e != $$3 && $$3.j() == null && (!(this.e instanceof bgv) || ((bgv)this.e).I_() == ((bgv)$$3).I_()) && !$$3.p(this.e.ed())) {
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

         this.a($$3, this.e.ed());
      }
   }

   protected void a(bgb $$0, bfz $$1) {
      $$0.h($$1);
   }
}
