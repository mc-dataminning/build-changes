import com.mojang.serialization.Codec;

public enum al implements ayq {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = ayq.a(al::values);
   private final String e;
   private final n f;
   private final ws g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = ws.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public ws b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xg a(af $$0, aqf $$1) {
      return ws.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
