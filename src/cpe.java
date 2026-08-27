import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cpe {
   @Nullable
   private final String a;
   private final List<blj> b;

   public static ih<cpe> a(String $$0) {
      ahh $$1 = ahh.a($$0);
      return $$1 == null ? cph.b : kd.i.c($$1).map(Function.identity()).orElse(cph.b);
   }

   public cpe(blj... $$0) {
      this(null, $$0);
   }

   public cpe(@Nullable String $$0, blj... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(ih<cpe> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         ahg<cpe> $$3 = $$0.e().orElse(cph.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<blj> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (blj $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
