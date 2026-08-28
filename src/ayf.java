import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record ayf(ayf.a a, String b) {
   public static ayf a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new ayf(ayf.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new ayf(ayf.a.b, $$2 + " jar signature invalidated")
            : new ayf(ayf.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public ayf a(ayf $$0) {
      return new ayf((ayf.a)ObjectUtils.max(new ayf.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public ayf.a c() {
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
