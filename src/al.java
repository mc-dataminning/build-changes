import com.mojang.serialization.Codec;

public enum al implements aut {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = aut.a(al::values);
   private final String e;
   private final n f;
   private final vb g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vb.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vb b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public vp a(af $$0, amq $$1) {
      return vb.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
