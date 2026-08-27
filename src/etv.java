import java.util.List;
import javax.annotation.Nullable;

public class etv implements ewe {
   private static final int a = 170;
   private final ti b;
   @Nullable
   private List<arf> c;
   @Nullable
   private final ti d;

   private etv(ti $$0, @Nullable ti $$1) {
      this.b = $$0;
      this.d = $$1;
   }

   public static etv a(ti $$0, @Nullable ti $$1) {
      return new etv($$0, $$1);
   }

   public static etv a(ti $$0) {
      return new etv($$0, $$0);
   }

   @Override
   public void b(ewd $$0) {
      if (this.d != null) {
         $$0.a(ewc.c, this.d);
      }
   }

   public List<arf> a(eqq $$0) {
      if (this.c == null) {
         this.c = a($$0, this.b);
      }

      return this.c;
   }

   public static List<arf> a(eqq $$0, ti $$1) {
      return $$0.h.c($$1, 170);
   }
}
