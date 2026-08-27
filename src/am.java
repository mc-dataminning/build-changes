import com.mojang.serialization.Codec;

public enum am implements azg {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = azg.a(am::values);
   private final String e;
   private final n f;
   private final xe g;

   private am(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xe.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xe b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xs a(ag $$0, aqu $$1) {
      return xe.a("chat.type.advancement." + this.e, $$1.P_(), af.a($$0));
   }
}
