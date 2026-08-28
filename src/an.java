import com.mojang.serialization.Codec;

public enum an implements bba {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<an> d = bba.a(an::values);
   private final String e;
   private final n f;
   private final xv g;

   private an(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xv.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xv b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public yj a(ah $$0, asi $$1) {
      return xv.a("chat.type.advancement." + this.e, $$1.p_(), ag.a($$0));
   }
}
