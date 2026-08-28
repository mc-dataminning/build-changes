import com.mojang.serialization.Codec;

public enum ao implements azv {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<ao> d = azv.a(ao::values);
   private final String e;
   private final n f;
   private final wp g;

   private ao(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wp.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wp b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xd a(ai $$0, are $$1) {
      return wp.a("chat.type.advancement." + this.e, $$1.m_(), ah.a($$0));
   }
}
