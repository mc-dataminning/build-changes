import com.mojang.serialization.Codec;

public enum ap implements bax {
   a("task", o.k),
   b("challenge", o.f),
   c("goal", o.k);

   public static final Codec<ap> d = bax.a(ap::values);
   private final String e;
   private final o f;
   private final xg g;

   private ap(final String $$0, final o $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xg.c("advancements.toast." + $$0);
   }

   public o a() {
      return this.f;
   }

   public xg b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xu a(aj $$0, asc $$1) {
      return xg.a("chat.type.advancement." + this.e, $$1.P_(), ai.a($$0));
   }
}
