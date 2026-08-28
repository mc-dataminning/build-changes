import com.mojang.serialization.Codec;

public enum ap implements bao {
   a("task", o.k),
   b("challenge", o.f),
   c("goal", o.k);

   public static final Codec<ap> d = bao.a(ap::values);
   private final String e;
   private final o f;
   private final xc g;

   private ap(final String $$0, final o $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xc.c("advancements.toast." + $$0);
   }

   public o a() {
      return this.f;
   }

   public xc b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xq a(aj $$0, arv $$1) {
      return xc.a("chat.type.advancement." + this.e, $$1.m_(), ai.a($$0));
   }
}
