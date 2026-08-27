import com.mojang.serialization.Codec;

public enum al implements axc {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = axc.a(al::values);
   private final String e;
   private final n f;
   private final vq g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vq.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vq b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public we a(af $$0, aox $$1) {
      return vq.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
