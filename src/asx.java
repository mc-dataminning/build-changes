import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record asx(asx.a a, String b) {
   public static asx a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new asx(asx.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new asx(asx.a.b, $$2 + " jar signature invalidated")
            : new asx(asx.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public asx a(asx $$0) {
      return new asx((asx.a)ObjectUtils.max(new asx.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public asx.a c() {
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
