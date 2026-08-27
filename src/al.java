import com.mojang.serialization.Codec;

public enum al implements ave {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = ave.a(al::values);
   private final String e;
   private final n f;
   private final vd g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vd.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vd b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public vr a(af $$0, ana $$1) {
      return vd.a("chat.type.advancement." + this.e, $$1.Q_(), ae.a($$0));
   }
}
