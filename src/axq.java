import java.util.ArrayList;
import java.util.List;

public class axq {
   private final List<axr> a = new ArrayList<>();

   public static axq a() {
      return new axq();
   }

   public List<axr> b() {
      return List.copyOf(this.a);
   }

   public axq a(axr $$0) {
      this.a.add($$0);
      return this;
   }

   public axq a(ali $$0) {
      return this.a(axr.a($$0));
   }

   public axq b(ali $$0) {
      return this.a(axr.b($$0));
   }

   public axq c(ali $$0) {
      return this.a(axr.c($$0));
   }

   public axq d(ali $$0) {
      return this.a(axr.d($$0));
   }
}
