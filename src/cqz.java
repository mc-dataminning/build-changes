import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqz {
   @Nullable
   private final String a;
   private final List<bnd> b;

   public static ij<cqz> a(String $$0) {
      aiy $$1 = aiy.a($$0);
      return $$1 == null ? crc.b : kf.i.c($$1).map(Function.identity()).orElse(crc.b);
   }

   public cqz(bnd... $$0) {
      this(null, $$0);
   }

   public cqz(@Nullable String $$0, bnd... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(ij<cqz> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         aix<cqz> $$3 = $$0.e().orElse(crc.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<bnd> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bnd $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
