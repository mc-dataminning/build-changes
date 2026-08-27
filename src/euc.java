import java.util.List;
import javax.annotation.Nullable;

public class euc implements ewl {
   private static final int a = 170;
   private final tn b;
   @Nullable
   private List<arl> c;
   @Nullable
   private final tn d;

   private euc(tn $$0, @Nullable tn $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static euc a(tn $$0, @Nullable tn $$1) {
      return new euc($$0, $$1);
   }

   public static euc a(tn $$0) {
      return new euc($$0, $$0);
   }

   @Override
   public void b(ewk $$0) {
      if (this.d != null) {
         $$0.a(ewj.c, this.d);
      }
   }

   public List<arl> a(eqx $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<arl> a(eqx $$0, tn $$1) {
      return $$0.h.c($$1, 170);
   }
}
