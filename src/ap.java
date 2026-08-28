import com.mojang.serialization.Codec;

public enum ap implements bak {
   a("task", o.k),
   b("challenge", o.f),
   c("goal", o.k);

   public static final Codec<ap> d = bak.a(ap::values);
   private final String e;
   private final o f;
   private final wy g;

   private ap(final String $$0, final o $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wy.c("advancements.toast." + $$0);
   }

   public o a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xm a(aj $$0, arr $$1) {
      return wy.a("chat.type.advancement." + this.e, $$1.m_(), ai.a($$0));
   }
}
