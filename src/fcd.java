import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fcd {
   private final fjg a;
   private final fjo b;
   private final Predicate<fjj.a> c;
   @Nullable
   private uc d = null;
   private int e;
   private int f;
   @Nullable
   private tx g;

   public fcd(fju $$0, Predicate<fjj.a> $$1) {
      this.a = $$0.b();
      this.b = new fjo($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fcd.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fji $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fjj.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(ti.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fcd.a $$0, fjj.a $$1) {
      tx $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.j())) {
            $$0.a(ti.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.j();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fjj.a var2);

      void a(ti var1);
   }
}
