import java.util.function.Predicate;
import javax.annotation.Nullable;

public class fjl {
   private final fqv a;
   private final frd b;
   private final Predicate<fqy.a> c;
   @Nullable
   private wl d = null;
   private int e;
   private int f;
   @Nullable
   private wg g;

   public fjl(frj $$0, Predicate<fqy.a> $$1) {
      this.a = $$0.b();
      this.b = new frd($$0.a().b().leadingContextMessageCount());
      this.c = $$1;
      this.e = this.a.b();
   }

   public void a(int $$0, fjl.a $$1) {
      int $$2 = 0;

      while ($$2 < $$0) {
         fqx $$3 = this.a.b(this.e);
         if ($$3 == null) {
            break;
         }

         int $$4 = this.e--;
         if ($$3 instanceof fqy.a $$5 && !$$5.g().equals(this.g)) {
            if (this.a($$1, $$5)) {
               if (this.f > 0) {
                  $$1.a(vq.a("gui.chatSelection.fold", this.f));
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

   private boolean a(fjl.a $$0, fqy.a $$1) {
      wg $$2 = $$1.g();
      boolean $$3 = this.b.b($$2);
      if (this.c.test($$1)) {
         this.b.a($$2);
         if (this.d != null && !this.d.a($$2.k())) {
            $$0.a(vq.a("gui.chatSelection.join", $$1.f().getName()).a(n.o));
         }

         this.d = $$2.k();
         return true;
      } else {
         return $$3;
      }
   }

   public interface a {
      void a(int var1, fqy.a var2);

      void a(vq var1);
   }
}
