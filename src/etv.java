import java.util.List;
import javax.annotation.Nullable;

public class etv implements ewe {
   private static final int a = 170;
   private final tl b;
   @Nullable
   private List<arn> c;
   @Nullable
   private final tl d;

   private etv(tl $$0, @Nullable tl $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static etv a(tl $$0, @Nullable tl $$1) {
      return new etv($$0, $$1);
   }

   public static etv a(tl $$0) {
      return new etv($$0, $$0);
   }

   @Override
   public void b(ewd $$0) {
      if (this.d != null) {
         $$0.a(ewc.c, this.d);
      }
   }

   public List<arn> a(eqp $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<arn> a(eqp $$0, tl $$1) {
      return $$0.h.c($$1, 170);
   }
}
