import com.mojang.serialization.Codec;

public class dmn implements dms {
   public static final Codec<dmn> a = bdc.b(0, 256).fieldOf("count").xmap(dmn::new, dmn::a).codec();
   private final bdc b;

   public dmn(int $$0) {
      this.b = bcz.a($$0);
   }

   public dmn(bdc $$0) {
      this.b = $$0;
   }

   public bdc a() {
      return this.b;
   }
}
