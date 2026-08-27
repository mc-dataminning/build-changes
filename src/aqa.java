import java.util.ArrayList;
import java.util.List;

public class aqa {
   private final List<aqb> a = new ArrayList<>();

   public static aqa a() {
      return new aqa();
   }

   public List<aqb> b() {
      return List.copyOf(this.a);
   }

   public aqa a(aqb $$0) {
      this.a.add($$0);
      return this;
   }

   public aqa a(aeu $$0) {
      return this.a(aqb.a($$0));
   }

   public aqa b(aeu $$0) {
      return this.a(aqb.b($$0));
   }

   public aqa c(aeu $$0) {
      return this.a(aqb.c($$0));
   }

   public aqa d(aeu $$0) {
      return this.a(aqb.d($$0));
   }
}
