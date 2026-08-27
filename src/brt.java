import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class brt extends bsb {
   private static final bts a = bts.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public brt(bjp $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bqb.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.eh();
      bjg $$1 = this.e.eg();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ag() == biu.bt && this.e.dL().X().b(cpr.K)) {
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

   public brt a(Class<?>... $$0) {
      this.c = true;
      this.j = $$0;
      return this;
   }

   @Override
   public void c() {
      this.e.h(this.e.eg());
      this.g = this.e.q();
      this.d = this.e.eh();
      this.h = 300;
      if (this.c) {
         this.h();
      }

      super.c();
   }

   protected void h() {
      double $$0 = this.l();
      ehi $$1 = ehi.a(this.e.dj()).c($$0, 10.0, $$0);
      List<? extends bji> $$2 = this.e.dL().a((Class<? extends bji>)this.e.getClass(), $$1, bit.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bji $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bji)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bkb) || ((bkb)this.e).O_() == ((bkb)$$3).O_()) && !$$3.s(this.e.eg())) {
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

         this.a($$3, this.e.eg());
      }
   }

   protected void a(bji $$0, bjg $$1) {
      $$0.h($$1);
   }
}
