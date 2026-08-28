import com.mojang.serialization.Codec;

public enum am implements azj {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = azj.a(am::values);
   private final String e;
   private final n f;
   private final wy g;

   private am(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wy.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wy b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xm a(ag $$0, aqu $$1) {
      return wy.a("chat.type.advancement." + this.e, $$1.O_(), af.a($$0));
   }
}
