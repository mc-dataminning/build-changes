import java.util.ArrayList;
import java.util.List;

public class ava {
   private final List<avb> a = new ArrayList<>();

   public static ava a() {
      return new ava();
   }

   public List<avb> b() {
      return List.copyOf(this.a);
   }

   public ava a(avb $$0) {
      this.a.add($$0);
      return this;
   }

   public ava a(ajh $$0) {
      return this.a(avb.a($$0));
   }

   public ava b(ajh $$0) {
      return this.a(avb.b($$0));
   }

   public ava c(ajh $$0) {
      return this.a(avb.c($$0));
   }

   public ava d(ajh $$0) {
      return this.a(avb.d($$0));
   }
}
