import com.mojang.serialization.Codec;

public enum an implements bag {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<an> d = bag.a(an::values);
   private final String e;
   private final n f;
   private final xi g;

   private an(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xi.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xi b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xw a(ah $$0, aro $$1) {
      return xi.a("chat.type.advancement." + this.e, $$1.S_(), ag.a($$0));
   }
}
