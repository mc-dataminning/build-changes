import java.util.ArrayList;
import java.util.List;

public class ayh {
   private final List<ayi> a = new ArrayList<>();

   public static ayh a() {
      return new ayh();
   }

   public List<ayi> b() {
      return List.copyOf(this.a);
   }

   public ayh a(ayi $$0) {
      this.a.add($$0);
      return this;
   }

   public ayh a(alz $$0) {
      return this.a(ayi.a($$0));
   }

   public ayh b(alz $$0) {
      return this.a(ayi.b($$0));
   }

   public ayh c(alz $$0) {
      return this.a(ayi.c($$0));
   }

   public ayh d(alz $$0) {
      return this.a(ayi.d($$0));
   }
}
