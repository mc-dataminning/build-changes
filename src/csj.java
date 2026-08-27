import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csj {
   @Nullable
   private final String a;
   private final List<bok> b;

   public static il<csj> a(String $$0) {
      ajh $$1 = ajh.a($$0);
      return $$1 == null ? csm.b : ki.i.c($$1).map(Function.identity()).orElse(csm.b);
   }

   public csj(bok... $$0) {
      this(null, $$0);
   }

   public csj(@Nullable String $$0, bok... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(il<csj> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         ajg<csj> $$3 = $$0.e().orElse(csm.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<bok> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (bok $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
