import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;

public class csh {
   @Nullable
   private final String a;
   private final List<boj> b;

   public static il<csh> a(String $$0) {
      ajh $$1 = ajh.a($$0);
      return $$1 == null ? csk.b : ki.i.c($$1).map(Function.identity()).orElse(csk.b);
   }

   public csh(boj... $$0) {
      this(null, $$0);
   }

   public csh(@Nullable String $$0, boj... $$1) {
      this.a = $$0;
      this.b = List.of($$1);
   }

   public static String a(il<csh> $$0, String $$1) {
      String $$2 = $$0.a().a;
      if ($$2 != null) {
         return $$1 + $$2;
      } else {
         ajg<csh> $$3 = $$0.e().orElse(csk.a);
         return $$1 + $$3.a().a();
      }
   }

   public List<boj> a() {
      return this.b;
   }

   public boolean b() {
      if (!this.b.isEmpty()) {
         for (boj $$0 : this.b) {
            if ($$0.b().a().a()) {
               return true;
            }
         }
      }

      return false;
   }
}
