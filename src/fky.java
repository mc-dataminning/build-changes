import javax.annotation.Nullable;

public enum fky {
   a("vertex", ".vsh"),
   b("fragment", ".fsh");

   private static final fky[] c = values();
   private final String d;
   private final String e;

   private fky(final String $$0, final String $$1) {
      this.d = $$0;
      this.e = $$1;
   }

   @Nullable
   public static fky a(alk $$0) {
      for (fky $$1 : c) {
         if ($$0.a().endsWith($$1.e)) {
            return $$1;
         }
      }

      return null;
   }

   public String a() {
      return this.d;
   }

   public ald b() {
      return new ald("shaders", this.e);
   }
}
