import com.mojang.serialization.Codec;

public enum ao implements bai {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<ao> d = bai.a(ao::values);
   private final String e;
   private final n f;
   private final ww g;

   private ao(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ww.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public ww b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xk a(ai $$0, arp $$1) {
      return ww.a("chat.type.advancement." + this.e, $$1.m_(), ah.a($$0));
   }
}
