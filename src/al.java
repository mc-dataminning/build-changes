import com.mojang.serialization.Codec;

public enum al implements azc {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = azc.a(al::values);
   private final String e;
   private final n f;
   private final wu g;

   private al(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wu.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wu b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xi a(af $$0, aqn $$1) {
      return wu.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
