import java.util.ArrayList;
import java.util.List;

public class asn {
   private final List<aso> a = new ArrayList<>();

   public static asn a() {
      return new asn();
   }

   public List<aso> b() {
      return List.copyOf(this.a);
   }

   public asn a(aso $$0) {
      this.a.add($$0);
      return this;
   }

   public asn a(ahd $$0) {
      return this.a(aso.a($$0));
   }

   public asn b(ahd $$0) {
      return this.a(aso.b($$0));
   }

   public asn c(ahd $$0) {
      return this.a(aso.c($$0));
   }

   public asn d(ahd $$0) {
      return this.a(aso.d($$0));
   }
}
