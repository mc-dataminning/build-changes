import com.mojang.serialization.Codec;

public enum al implements azu {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = azu.a(al::values);
   private final String e;
   private final n f;
   private final xp g;

   private al(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xp.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xp b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public yd a(af $$0, arg $$1) {
      return xp.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
