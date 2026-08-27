import com.mojang.serialization.Codec;

public enum al implements avl {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = avl.a(al::values);
   private final String e;
   private final n f;
   private final vg g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vg.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vg b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public vu a(af $$0, anf $$1) {
      return vg.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
