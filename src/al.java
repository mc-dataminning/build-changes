import com.mojang.serialization.Codec;

public enum al implements aye {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = aye.a(al::values);
   private final String e;
   private final n f;
   private final wg g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wg.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wg b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public wu a(af $$0, apt $$1) {
      return wg.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
