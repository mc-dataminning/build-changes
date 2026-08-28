import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record azb(azb.a a, String b) {
   public static azb a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new azb(azb.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new azb(azb.a.b, $$2 + " jar signature invalidated")
            : new azb(azb.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public azb a(azb $$0) {
      return new azb((azb.a)ObjectUtils.max(new azb.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public azb.a c() {
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

      private a(final String $$0, final boolean $$1) {
         this.d = $$0;
         this.e = $$1;
      }
   }
}
