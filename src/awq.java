import java.util.ArrayList;
import java.util.List;

public class awq {
   private final List<awr> a = new ArrayList<>();

   public static awq a() {
      return new awq();
   }

   public List<awr> b() {
      return List.copyOf(this.a);
   }

   public awq a(awr $$0) {
      this.a.add($$0);
      return this;
   }

   public awq a(akt $$0) {
      return this.a(awr.a($$0));
   }

   public awq b(akt $$0) {
      return this.a(awr.b($$0));
   }

   public awq c(akt $$0) {
      return this.a(awr.c($$0));
   }

   public awq d(akt $$0) {
      return this.a(awr.d($$0));
   }
}
