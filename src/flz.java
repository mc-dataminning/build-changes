import java.util.List;
import javax.annotation.Nullable;

public class flz implements fom {
   private static final int a = 170;
   private final xe b;
   @Nullable
   private List<ayr> c;
   @Nullable
   private ub d;
   @Nullable
   private final xe e;

   private flz(xe $$0, @Nullable xe $$1) {
      this.b = $$0;
      this.e = $$1;
   }

   public static flz a(xe $$0, @Nullable xe $$1) {
      return new flz($$0, $$1);
   }

   public static flz a(xe $$0) {
      return new flz($$0, $$0);
   }

   @Override
   public void b(fol $$0) {
      if (this.e != null) {
         $$0.a(fok.c, this.e);
      }
   }

   public List<ayr> a(fip $$0) {
      ub $$1 = ub.a();
      if (this.c == null || $$1 != this.d) {
         this.c = a($$0, this.b);
         this.d = $$1;
      }

      return this.c;
   }

   public static List<ayr> a(fip $$0, xe $$1) {
      return $$0.h.c($$1, 170);
   }
}
