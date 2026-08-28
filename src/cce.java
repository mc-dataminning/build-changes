import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class cce extends ccm {
   private static final cef a = cef.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public cce(btx $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(cam.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.en();
      bto $$1 = this.e.em();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ak() == bsz.by && this.e.dP().ab().b(dbt.O)) {
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

   public cce a(Class<?>... $$0) {
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
      evl $$1 = evl.a(this.e.dn()).c($$0, 10.0, $$0);
      List<? extends btq> $$2 = this.e.dP().a((Class<? extends btq>)this.e.getClass(), $$1, bsy.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         btq $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (btq)var5.next();
            if (this.e != $$3 && $$3.p() == null && (!(this.e instanceof bul) || ((bul)this.e).P_() == ((bul)$$3).P_()) && !$$3.s(this.e.em())) {
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

   protected void a(btq $$0, bto $$1) {
      $$0.h($$1);
   }
}
