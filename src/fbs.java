import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fbs {
   private final fir a;
   private final fiz b;
   private final Predicate<fiu.a> c;
   @Nullable
   private ty d = null;
   private int e;
   private int f;
   @Nullable
   private tt g;

   public fbs(fjc $$0, Predicate<fiu.a> $$1) {
      this.a = $$0.b();
      this.b = new fiz($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fbs.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fit $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fiu.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(te.a("gui.chatSelection.fold", this.f));
                  this.f = 0;
               }

               $$1.a($$4, $$5);
               $$2++;
            } else {
               this.f++;
            }

            this.g = $$5.g();
         }
      }
   }

   private boolean a(fbs.a $$0, fiu.a $$1) {
      tt $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.j())) {
            $$0.a(te.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.j();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fiu.a var2);

      void a(te var1);
   }
}
