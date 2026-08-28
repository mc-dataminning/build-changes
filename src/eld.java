import com.mojang.serialization.Codec;

public class eld implements eli {
   public static final Codec<eld> a = btg.b(0, 256).fieldOf("count").xmap(eld::new, eld::a).codec();
   private final btg b;

   public eld(int $$0) {
      this.b = btd.a($$0);
   }

   public eld(btg $$0) {
      this.b = $$0;
   }

   public btg a() {
      return this.b;
   }
}
