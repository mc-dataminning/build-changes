import java.util.function.Supplier;
import org.apache.commons.lang3.ObjectUtils;

public record ayy(ayy.a a, String b) {
   public static ayy a(String $$0, Supplier<String> $$1, String $$2, Class<?> $$3) {
      String $$4 = $$1.get();
      if (!$$0.equals($$4)) {
         return new ayy(ayy.a.c, $$2 + " brand changed to '" + $$4 + "'");
      } else {
         return $$3.getSigners() == null
            ? new ayy(ayy.a.b, $$2 + " jar signature invalidated")
            : new ayy(ayy.a.a, $$2 + " jar signature and brand is untouched");
      }
   }

   public boolean a() {
      return this.a.e;
   }

   public ayy a(ayy $$0) {
      return new ayy((ayy.a)ObjectUtils.max(new ayy.a[]{this.a, $$0.a}), this.b + "; " + $$0.b);
   }

   public String b() {
      return this.a.d + " " + this.b;
   }

   public ayy.a c() {
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
