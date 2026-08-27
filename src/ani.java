import java.util.ArrayList;
import java.util.List;

public class ani {
   private final List<anj> a = new ArrayList<>();

   public static ani a() {
      return new ani();
   }

   public List<anj> b() {
      return List.copyOf(this.a);
   }

   public ani a(anj $$0) {
      this.a.add($$0);
      return this;
   }

   public ani a(acq $$0) {
      return this.a(anj.a($$0));
   }

   public ani b(acq $$0) {
      return this.a(anj.b($$0));
   }

   public ani c(acq $$0) {
      return this.a(anj.c($$0));
   }

   public ani d(acq $$0) {
      return this.a(anj.d($$0));
   }
}
