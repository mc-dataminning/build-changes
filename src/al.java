import com.mojang.serialization.Codec;

public enum al implements ayz {
   a("task", n.k),
   b("challenge", n.f),
   c("goal", n.k);

   public static final Codec<al> d = ayz.a(al::values);
   private final String e;
   private final n f;
   private final wx g;

   private al(String $$0, n $$1) {
      this.e = $$0;
      this.f = $$1;
      this.g = wx.c("advancements.toast." + $$0);
   }

   public n a() {
      return this.f;
   }

   public wx b() {
      return this.g;
   }

   @Override
   public String c() {
      return this.e;
   }

   public xl a(af $$0, aqo $$1) {
      return wx.a("chat.type.advancement." + this.e, $$1.O_(), ae.a($$0));
   }
}
