import java.util.ArrayList;
import java.util.List;

public class axf {
   private final List<axg> a = new ArrayList<>();

   public static axf a() {
      return new axf();
   }

   public List<axg> b() {
      return List.copyOf(this.a);
   }

   public axf a(axg $$0) {
      this.a.add($$0);
      return this;
   }

   public axf a(alb $$0) {
      return this.a(axg.a($$0));
   }

   public axf b(alb $$0) {
      return this.a(axg.b($$0));
   }

   public axf c(alb $$0) {
      return this.a(axg.c($$0));
   }

   public axf d(alb $$0) {
      return this.a(axg.d($$0));
   }
}
