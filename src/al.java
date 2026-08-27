import com.mojang.serialization.Codec;

public enum al implements axg {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = axg.a(al::values);
   private final String e;
   private final n f;
   private final vs g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vs.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vs b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public wg a(af $$0, apb $$1) {
      return vs.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
