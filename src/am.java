import com.mojang.serialization.Codec;

public enum am implements azz {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = azz.a(am::values);
   private final String e;
   private final n f;
   private final xd g;

   private am(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xd.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xd b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xr a(ag $$0, ari $$1) {
      return xd.a("chat.type.advancement." + this.e, $$1.Q_(), af.a($$0));
   }
}
