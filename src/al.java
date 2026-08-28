import com.mojang.serialization.Codec;

public enum al implements azp {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = azp.a(al::values);
   private final String e;
   private final n f;
   private final xl g;

   private al(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xl.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xl b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xz a(af $$0, arc $$1) {
      return xl.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
