import java.util.EnumSet;
import java.util.Iterator;
import java.util.List;
import javax.annotation.Nullable;

public class bvc extends bvk {
   private static final bxd a = bxd.a().d().e();
   private static final int b = 10;
   private boolean c;
   private int d;
   private final Class<?>[] i;
   @Nullable
   private Class<?>[] j;

   public bvc(bmx $$0, Class<?>... $$1) {
      super($$0, true);
      this.i = $$1;
      this.a(EnumSet.of(btk.a.d));
   }

   @Override
   public boolean a() {
      int $$0 = this.e.ei();
      bmo $$1 = this.e.eh();
      if ($$0 != this.d && $$1 != null) {
         if ($$1.ai() == bmc.bw && this.e.dL().Z().b(ctt.O)) {
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

   public bvc a(Class<?>... $$0) {
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
      elx $$1 = elx.a(this.e.dj()).c($$0, 10.0, $$0);
      List<? extends bmq> $$2 = this.e.dL().a((Class<? extends bmq>)this.e.getClass(), $$1, bmb.f);
      Iterator var5 = $$2.iterator();

      while (true) {
         bmq $$3;
         while (true) {
            if (!var5.hasNext()) {
               return;
            }

            $$3 = (bmq)var5.next();
            if (this.e != $$3 && $$3.q() == null && (!(this.e instanceof bnj) || ((bnj)this.e).R_() == ((bnj)$$3).R_()) && !$$3.r(this.e.eh())) {
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

   protected void a(bmq $$0, bmo $$1) {
      $$0.h($$1);
   }
}
