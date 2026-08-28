import com.mojang.serialization.Codec;

public enum dgp implements bam {
   a("attacker"),
   b("damaging_entity"),
   c("victim");

   public static final Codec<dgp> d = bam.a(dgp::values);
   private final String e;

   private dgp(final String $$0) {
      this.e = $$0;
   }

   @Override
   public String c() {
      return this.e;
   }
}
