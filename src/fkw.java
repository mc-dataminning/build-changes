import javax.annotation.Nullable;

public enum fkw {
   a("vertex", ".vsh"),
   b("fragment", ".fsh");

   private static final fkw[] c = values();
   private final String d;
   private final String e;

   private fkw(final String $$0, final String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   public static fkw a(ali $$0) {
      for (fkw $$1 : c) {
         if ($$0.a().endsWith($$1.e)) {
            return $$1;
         }
      }

      return null;
   }

   public String a() {
      return this.d;
   }

   public alb b() {
      return new alb("shaders", this.e);
   }
}
