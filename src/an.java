import com.mojang.serialization.Codec;

public enum an implements baq {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<an> d = baq.a(an::values);
   private final String e;
   private final n f;
   private final xk g;

   private an(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xk.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xk b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xy a(ah $$0, ary $$1) {
      return xk.a("chat.type.advancement." + this.e, $$1.p_(), ag.a($$0));
   }
}
