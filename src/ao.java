import com.mojang.serialization.Codec;

public enum ao implements bag {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<ao> d = bag.a(ao::values);
   private final String e;
   private final n f;
   private final wv g;

   private ao(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wv.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wv b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xj a(ai $$0, aro $$1) {
      return wv.a("chat.type.advancement." + this.e, $$1.m_(), ah.a($$0));
   }
}
