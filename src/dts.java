import com.mojang.serialization.Codec;

public class dts implements dtx {
   public static final Codec<dts> a = bjf.b(0, 256).fieldOf("count").xmap(dts::new, dts::a).codec();
   private final bjf b;

   public dts(int $$0) {
      this.b = bjc.a($$0);
   }

   public dts(bjf $$0) {
      this.b = $$0;
   }

   public bjf a() {
      return this.b;
   }
}
