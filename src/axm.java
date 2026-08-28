import java.util.ArrayList;
import java.util.List;

public class axm {
   private final List<axn> a = new ArrayList<>();

   public static axm a() {
      return new axm();
   }

   public List<axn> b() {
      return List.copyOf(this.a);
   }

   public axm a(axn $$0) {
      this.a.add($$0);
      return this;
   }

   public axm a(ale $$0) {
      return this.a(axn.a($$0));
   }

   public axm b(ale $$0) {
      return this.a(axn.b($$0));
   }

   public axm c(ale $$0) {
      return this.a(axn.c($$0));
   }

   public axm d(ale $$0) {
      return this.a(axn.d($$0));
   }
}
