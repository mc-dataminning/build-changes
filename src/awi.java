import java.util.ArrayList;
import java.util.List;

public class awi {
   private final List<awj> a = new ArrayList<>();

   public static awi a() {
      return new awi();
   }

   public List<awj> b() {
      return List.copyOf(this.a);
   }

   public awi a(awj $$0) {
      this.a.add($$0);
      return this;
   }

   public awi a(akm $$0) {
      return this.a(awj.a($$0));
   }

   public awi b(akm $$0) {
      return this.a(awj.b($$0));
   }

   public awi c(akm $$0) {
      return this.a(awj.c($$0));
   }

   public awi d(akm $$0) {
      return this.a(awj.d($$0));
   }
}
