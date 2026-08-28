import com.mojang.serialization.Codec;

public class emj implements emp {
   public static final Codec<emj> a = btw.b(0, 256).fieldOf("count").xmap(emj::new, emj::a).codec();
   private final btw b;

   public emj(int $$0) {
      this.b = btt.a($$0);
   }

   public emj(btw $$0) {
      this.b = $$0;
   }

   public btw a() {
      return this.b;
   }
}
