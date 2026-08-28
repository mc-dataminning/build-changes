import com.mojang.serialization.Codec;

public class ein implements eis {
   public static final Codec<ein> a = bsj.b(0, 256).fieldOf("count").xmap(ein::new, ein::a).codec();
   private final bsj b;

   public ein(int $$0) {
      this.b = bsg.a($$0);
   }

   public ein(bsj $$0) {
      this.b = $$0;
   }

   public bsj a() {
      return this.b;
   }
}
