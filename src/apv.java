import java.util.ArrayList;
import java.util.List;

public class apv {
   private final List<apw> a = new ArrayList<>();

   public static apv a() {
      return new apv();
   }

   public List<apw> b() {
      return List.copyOf(this.a);
   }

   public apv a(apw $$0) {
      this.a.add($$0);
      return this;
   }

   public apv a(aep $$0) {
      return this.a(apw.a($$0));
   }

   public apv b(aep $$0) {
      return this.a(apw.b($$0));
   }

   public apv c(aep $$0) {
      return this.a(apw.c($$0));
   }

   public apv d(aep $$0) {
      return this.a(apw.d($$0));
   }
}
