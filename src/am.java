import com.mojang.serialization.Codec;

public enum am implements bab {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = bab.a(am::values);
   private final String e;
   private final n f;
   private final xe g;

   private am(final String $$0, final n $$1) {
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

   public xs a(ag $$0, ark $$1) {
      return xe.a("chat.type.advancement." + this.e, $$1.R_(), af.a($$0));
   }
}
