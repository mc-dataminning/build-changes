import java.util.ArrayList;
import java.util.List;

public class avq {
   private final List<avr> a = new ArrayList<>();

   public static avq a() {
      return new avq();
   }

   public List<avr> b() {
      return List.copyOf(this.a);
   }

   public avq a(avr $$0) {
      this.a.add($$0);
      return this;
   }

   public avq a(ajv $$0) {
      return this.a(avr.a($$0));
   }

   public avq b(ajv $$0) {
      return this.a(avr.b($$0));
   }

   public avq c(ajv $$0) {
      return this.a(avr.c($$0));
   }

   public avq d(ajv $$0) {
      return this.a(avr.d($$0));
   }
}
