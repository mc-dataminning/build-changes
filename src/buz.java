import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class buz extends bvh {
   private static final bwz a = bwz.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public buz(bmu $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(bth.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ei();
      bml $$1 = this.e.eh();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == blz.bv && this.e.dM().Z().b(ctl.O)) {
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

   public buz a(Class<?>... $$0) {
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
      elo $$1 = elo.a(this.e.dk()).c($$0, 10.0, $$0);
      List<? extends bmn> $$2 = this.e.dM().a((Class<? extends bmn>)this.e.getClass(), $$1, bly.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bmn $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bmn)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bng) || ((bng)this.e).R_() == ((bng)$$3).R_()) && !$$3.s(this.e.eh())) {
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

   protected void a(bmn $$0, bml $$1) {
      $$0.h($$1);
   }
}
