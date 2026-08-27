import java.util.List;
import javax.annotation.Nullable;

public class eqp implements esq {
   private static final int a = 170;
   private final sw b;
   @Nullable
   private List<aom> c;
   @Nullable
   private final sw d;

   private eqp(sw $$0, @Nullable sw $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static eqp a(sw $$0, @Nullable sw $$1) {
      return new eqp($$0, $$1);
   }

   public static eqp a(sw $$0) {
      return new eqp($$0, $$0);
   }

   @Override
   public void b(esp $$0) {
      if (this.d != null) {
         $$0.a(eso.c, this.d);
      }
   }

   public List<aom> a(enn $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<aom> a(enn $$0, sw $$1) {
      return $$0.h.c($$1, 170);
   }
}
