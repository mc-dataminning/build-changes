import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fck {
   private final fjn a;
   private final fjv b;
   private final Predicate<fjq.a> c;
   @Nullable
   private uh d = null;
   private int e;
   private int f;
   @Nullable
   private uc g;

   public fck(fkb $$0, Predicate<fjq.a> $$1) {
      this.a = $$0.b();
      this.b = new fjv($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fck.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fjp $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fjq.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(tn.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fck.a $$0, fjq.a $$1) {
      uc $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.j())) {
            $$0.a(tn.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.j();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fjq.a var2);

      void a(tn var1);
   }
}
