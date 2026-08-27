import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqv {
   @Nullable
   private final String a;
   private final List<bnb> b;

   public static ij<cqv> a(String $$0) {
      aiy $$1 = aiy.a($$0);
      return $$1 == null ? cqy.b : kf.i.c($$1).map(Function.identity()).orElse(cqy.b);
   }

   public cqv(bnb... $$0) {
      this(null, $$0);
   }

   public cqv(@Nullable String $$0, bnb... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(ij<cqv> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         aix<cqv> $$3 = $$0.e().orElse(cqy.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<bnb> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bnb $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
