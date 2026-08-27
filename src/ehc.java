import com.mojang.serialization.Codec;

public enum ehc implements ayq {
   a("linear"),
   b("triangular");

   public static final Codec<ehc> c = ayq.a(ehc::values);
   private final String d;

   private ehc(String $$0) {
      this.d = $$0;
   }

   @Override
   public String c() {
      return this.d;
   }

   public int a(ayd $$0, int $$1) {
      return switch (this) {
         case a -> $$0.a($$1);
         case b -> ($$0.a($$1) + $$0.a($$1)) / 2;
      };
   }
}
