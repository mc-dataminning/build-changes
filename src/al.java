import com.mojang.serialization.Codec;

public enum al implements azt {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = azt.a(al::values);
   private final String e;
   private final n f;
   private final xo g;

   private al(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xo.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xo b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public yc a(af $$0, arf $$1) {
      return xo.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
