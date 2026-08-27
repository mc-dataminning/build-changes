import java.util.ArrayList;
import java.util.List;

public class avo {
   private final List<avp> a = new ArrayList<>();

   public static avo a() {
      return new avo();
   }

   public List<avp> b() {
      return List.copyOf(this.a);
   }

   public avo a(avp $$0) {
      this.a.add($$0);
      return this;
   }

   public avo a(ajt $$0) {
      return this.a(avp.a($$0));
   }

   public avo b(ajt $$0) {
      return this.a(avp.b($$0));
   }

   public avo c(ajt $$0) {
      return this.a(avp.c($$0));
   }

   public avo d(ajt $$0) {
      return this.a(avp.d($$0));
   }
}
