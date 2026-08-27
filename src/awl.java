import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record awl(awl.a a, String b) {
   public static awl a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new awl(awl.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new awl(awl.a.b, $$2 + " jar signature invalidated")
            : new awl(awl.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public awl a(awl $$0) {
      return new awl((awl.a)ObjectUtils.max(new awl.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public awl.a c() {
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
