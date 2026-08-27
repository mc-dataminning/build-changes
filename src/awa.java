import java.util.ArrayList;
import java.util.List;

public class awa {
   private final List<awb> a = new ArrayList<>();

   public static awa a() {
      return new awa();
   }

   public List<awb> b() {
      return List.copyOf(this.a);
   }

   public awa a(awb $$0) {
      this.a.add($$0);
      return this;
   }

   public awa a(akf $$0) {
      return this.a(awb.a($$0));
   }

   public awa b(akf $$0) {
      return this.a(awb.b($$0));
   }

   public awa c(akf $$0) {
      return this.a(awb.c($$0));
   }

   public awa d(akf $$0) {
      return this.a(awb.d($$0));
   }
}
