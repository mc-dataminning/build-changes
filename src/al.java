import com.mojang.serialization.Codec;

public enum al implements avj {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = avj.a(al::values);
   private final String e;
   private final n f;
   private final vf g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vf.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vf b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public vt a(af $$0, ane $$1) {
      return vf.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
