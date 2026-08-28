import com.mojang.serialization.Codec;

public enum an implements baj {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<an> d = baj.a(an::values);
   private final String e;
   private final n f;
   private final xl g;

   private an(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xl.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xl b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xz a(ah $$0, arr $$1) {
      return xl.a("chat.type.advancement." + this.e, $$1.S_(), ag.a($$0));
   }
}
