import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record auh(auh.a a, String b) {
   public static auh a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new auh(auh.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new auh(auh.a.b, $$2 + " jar signature invalidated")
            : new auh(auh.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public auh a(auh $$0) {
      return new auh((auh.a)ObjectUtils.max(new auh.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public auh.a c() {
      return this.a;
   }

   public String d() {
      return this.b;
   }

   public static enum a {
      a("Probably not.", false),
      b("Very likely;", true),
      c("Definitely;", true);

      final String d;
      final boolean e;

      private a(String $$0, boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }
}
