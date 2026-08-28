import com.mojang.serialization.Codec;

public enum ao implements bak {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<ao> d = bak.a(ao::values);
   private final String e;
   private final n f;
   private final wy g;

   private ao(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wy.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xm a(ai $$0, arr $$1) {
      return wy.a("chat.type.advancement." + this.e, $$1.m_(), ah.a($$0));
   }
}
