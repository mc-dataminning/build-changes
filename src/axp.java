import java.util.ArrayList;
import java.util.List;

public class axp {
   private final List<axq> a = new ArrayList<>();

   public static axp a() {
      return new axp();
   }

   public List<axq> b() {
      return List.copyOf(this.a);
   }

   public axp a(axq $$0) {
      this.a.add($$0);
      return this;
   }

   public axp a(alj $$0) {
      return this.a(axq.a($$0));
   }

   public axp b(alj $$0) {
      return this.a(axq.b($$0));
   }

   public axp c(alj $$0) {
      return this.a(axq.c($$0));
   }

   public axp d(alj $$0) {
      return this.a(axq.d($$0));
   }
}
