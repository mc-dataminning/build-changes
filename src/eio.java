import com.mojang.serialization.Codec;

public class eio implements eit {
   public static final Codec<eio> a = bsf.b(0, 256).fieldOf("count").xmap(eio::new, eio::a).codec();
   private final bsf b;

   public eio(int $$0) {
      this.b = bsc.a($$0);
   }

   public eio(bsf $$0) {
      this.b = $$0;
   }

   public bsf a() {
      return this.b;
   }
}
