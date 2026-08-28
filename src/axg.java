import java.util.ArrayList;
import java.util.List;

public class axg {
   private final List<axh> a = new ArrayList<>();

   public static axg a() {
      return new axg();
   }

   public List<axh> b() {
      return List.copyOf(this.a);
   }

   public axg a(axh $$0) {
      this.a.add($$0);
      return this;
   }

   public axg a(alc $$0) {
      return this.a(axh.a($$0));
   }

   public axg b(alc $$0) {
      return this.a(axh.b($$0));
   }

   public axg c(alc $$0) {
      return this.a(axh.c($$0));
   }

   public axg d(alc $$0) {
      return this.a(axh.d($$0));
   }
}
