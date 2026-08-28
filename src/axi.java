import java.util.ArrayList;
import java.util.List;

public class axi {
   private final List<axj> a = new ArrayList<>();

   public static axi a() {
      return new axi();
   }

   public List<axj> b() {
      return List.copyOf(this.a);
   }

   public axi a(axj $$0) {
      this.a.add($$0);
      return this;
   }

   public axi a(ale $$0) {
      return this.a(axj.a($$0));
   }

   public axi b(ale $$0) {
      return this.a(axj.b($$0));
   }

   public axi c(ale $$0) {
      return this.a(axj.c($$0));
   }

   public axi d(ale $$0) {
      return this.a(axj.d($$0));
   }
}
