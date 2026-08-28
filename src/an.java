import com.mojang.serialization.Codec;

public enum an implements bai {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<an> d = bai.a(an::values);
   private final String e;
   private final n f;
   private final xj g;

   private an(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xj.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xj b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xx a(ah $$0, arq $$1) {
      return xj.a("chat.type.advancement." + this.e, $$1.o_(), ag.a($$0));
   }
}
