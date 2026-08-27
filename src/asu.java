import java.util.ArrayList;
import java.util.List;

public class asu {
   private final List<asv> a = new ArrayList<>();

   public static asu a() {
      return new asu();
   }

   public List<asv> b() {
      return List.copyOf(this.a);
   }

   public asu a(asv $$0) {
      this.a.add($$0);
      return this;
   }

   public asu a(ahh $$0) {
      return this.a(asv.a($$0));
   }

   public asu b(ahh $$0) {
      return this.a(asv.b($$0));
   }

   public asu c(ahh $$0) {
      return this.a(asv.c($$0));
   }

   public asu d(ahh $$0) {
      return this.a(asv.d($$0));
   }
}
