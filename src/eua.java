import java.util.List;
import javax.annotation.Nullable;

public class eua implements ewj {
   private static final int a = 170;
   private final tm b;
   @Nullable
   private List<ark> c;
   @Nullable
   private final tm d;

   private eua(tm $$0, @Nullable tm $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static eua a(tm $$0, @Nullable tm $$1) {
      return new eua($$0, $$1);
   }

   public static eua a(tm $$0) {
      return new eua($$0, $$0);
   }

   @Override
   public void b(ewi $$0) {
      if (this.d != null) {
         $$0.a(ewh.c, this.d);
      }
   }

   public List<ark> a(eqv $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<ark> a(eqv $$0, tm $$1) {
      return $$0.h.c($$1, 170);
   }
}
