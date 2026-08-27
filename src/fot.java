import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fot {
   private final fwg a;
   private final fwo b;
   private final Predicate<fwj.a> c;
   @Nullable
   private xn d = null;
   private int e;
   private int f;
   @Nullable
   private xi g;

   public fot(fwu $$0, Predicate<fwj.a> $$1) {
      this.a = $$0.b();
      this.b = new fwo($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fot.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fwi $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fwj.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(ws.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fot.a $$0, fwj.a $$1) {
      xi $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(ws.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fwj.a var2);

      void a(ws var1);
   }
}
