import java.util.ArrayList;
import java.util.List;

public class axs {
   private final List<axt> a = new ArrayList<>();

   public static axs a() {
      return new axs();
   }

   public List<axt> b() {
      return List.copyOf(this.a);
   }

   public axs a(axt $$0) {
      this.a.add($$0);
      return this;
   }

   public axs a(alk $$0) {
      return this.a(axt.a($$0));
   }

   public axs b(alk $$0) {
      return this.a(axt.b($$0));
   }

   public axs c(alk $$0) {
      return this.a(axt.c($$0));
   }

   public axs d(alk $$0) {
      return this.a(axt.d($$0));
   }
}
