import com.mojang.serialization.Codec;

public enum am implements baf {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<am> d = baf.a(am::values);
   private final String e;
   private final n f;
   private final xh g;

   private am(final String $$0, final n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = xh.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public xh b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xv a(ag $$0, arn $$1) {
      return xh.a("chat.type.advancement." + this.e, $$1.S_(), af.a($$0));
   }
}
