import com.mojang.serialization.Codec;

public enum am implements azk {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = azk.a(am::values);
   private final String e;
   private final n f;
   private final wz g;

   private am(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wz.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wz b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xn a(ag $$0, aqv $$1) {
      return wz.a("chat.type.advancement." + this.e, $$1.S_(), af.a($$0));
   }
}
