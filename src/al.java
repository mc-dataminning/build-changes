import com.mojang.serialization.Codec;

public enum al implements axq {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = axq.a(al::values);
   private final String e;
   private final n f;
   private final vu g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = vu.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public vu b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public wi a(af $$0, apg $$1) {
      return vu.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
