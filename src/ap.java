import com.mojang.serialization.Codec;

public enum ap implements bam {
   a("task", o.k),
   b("challenge", o.f),
   c("goal", o.k);

   public static final Codec<ap> d = bam.a(ap::values);
   private final String e;
   private final o f;
   private final xa g;

   private ap(final String $$0, final o $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xa.c("advancements.toast." + $$0);
   }

   public o a() {
      return this.f;
   }

   public xa b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xo a(aj $$0, art $$1) {
      return xa.a("chat.type.advancement." + this.e, $$1.m_(), ai.a($$0));
   }
}
