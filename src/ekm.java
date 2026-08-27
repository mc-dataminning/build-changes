import java.util.Locale;
import javax.annotation.Nullable;

public class ekm extends Exception {
   public final int a;
   public final String b;
   @Nullable
   public final ejb c;

   public ekm(int $$0, String $$1, ejb $$2) {
      super($$1);
      this.a = $$0;
      this.b = $$1;
      this.c = $$2;
   }

   public ekm(int $$0, String $$1) {
      super($$1);
      this.a = $$0;
      this.b = $$1;
      this.c = null;
   }

   @Override
   public String getMessage() {
      if (this.c != null) {
         String $$0 = "mco.errorMessage." + this.c.b();
         String $$1 = fvz.a($$0) ? fvz.a($$0) : this.c.a();
         return String.format(Locale.ROOT, "Realms service error (%d/%d) %s", this.a, this.c.b(), $$1);
      } else {
         return String.format(Locale.ROOT, "Realms service error (%d) %s", this.a, this.b);
      }
   }

   public int a(int $$0) {
      return this.c != null ? this.c.b() : $$0;
   }
}
