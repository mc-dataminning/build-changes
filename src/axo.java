import java.util.ArrayList;
import java.util.List;

public class axo {
   private final List<axp> a = new ArrayList<>();

   public static axo a() {
      return new axo();
   }

   public List<axp> b() {
      return List.copyOf(this.a);
   }

   public axo a(axp $$0) {
      this.a.add($$0);
      return this;
   }

   public axo a(alg $$0) {
      return this.a(axp.a($$0));
   }

   public axo b(alg $$0) {
      return this.a(axp.b($$0));
   }

   public axo c(alg $$0) {
      return this.a(axp.c($$0));
   }

   public axo d(alg $$0) {
      return this.a(axp.d($$0));
   }
}
