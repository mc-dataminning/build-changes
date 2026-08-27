import java.util.ArrayList;
import java.util.List;

public class arw {
   private final List<arx> a = new ArrayList<>();

   public static arw a() {
      return new arw();
   }

   public List<arx> b() {
      return List.copyOf(this.a);
   }

   public arw a(arx $$0) {
      this.a.add($$0);
      return this;
   }

   public arw a(agm $$0) {
      return this.a(arx.a($$0));
   }

   public arw b(agm $$0) {
      return this.a(arx.b($$0));
   }

   public arw c(agm $$0) {
      return this.a(arx.c($$0));
   }

   public arw d(agm $$0) {
      return this.a(arx.d($$0));
   }
}
