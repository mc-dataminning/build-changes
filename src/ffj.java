import java.util.List;
import javax.annotation.Nullable;

public class ffj implements fhv {
   private static final int a = 170;
   private final wi b;
   @Nullable
   private List<awy> c;
   @Nullable
   private final wi d;

   private ffj(wi $$0, @Nullable wi $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static ffj a(wi $$0, @Nullable wi $$1) {
      return new ffj($$0, $$1);
   }

   public static ffj a(wi $$0) {
      return new ffj($$0, $$0);
   }

   @Override
   public void b(fhu $$0) {
      if (this.d != null) {
         $$0.a(fht.c, this.d);
      }
   }

   public List<awy> a(fby $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<awy> a(fby $$0, wi $$1) {
      return $$0.h.c($$1, 170);
   }
}
