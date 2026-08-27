import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fhm {
   private final fou a;
   private final fpc b;
   private final Predicate<fox.a> c;
   @Nullable
   private wb d = null;
   private int e;
   private int f;
   @Nullable
   private vw g;

   public fhm(fpi $$0, Predicate<fox.a> $$1) {
      this.a = $$0.b();
      this.b = new fpc($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fhm.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fow $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fox.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(vg.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fhm.a $$0, fox.a $$1) {
      vw $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(vg.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fox.a var2);

      void a(vg var1);
   }
}
