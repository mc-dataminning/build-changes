import java.util.ArrayList;
import java.util.List;

public class awh {
   private final List<awi> a = new ArrayList<>();

   public static awh a() {
      return new awh();
   }

   public List<awi> b() {
      return List.copyOf(this.a);
   }

   public awh a(awi $$0) {
      this.a.add($$0);
      return this;
   }

   public awh a(akk $$0) {
      return this.a(awi.a($$0));
   }

   public awh b(akk $$0) {
      return this.a(awi.b($$0));
   }

   public awh c(akk $$0) {
      return this.a(awi.c($$0));
   }

   public awh d(akk $$0) {
      return this.a(awi.d($$0));
   }
}
