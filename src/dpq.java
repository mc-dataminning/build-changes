import com.mojang.serialization.Codec;

public class dpq implements dpv {
   public static final Codec<dpq> a = bfy.b(0, 256).fieldOf("count").xmap(dpq::new, dpq::a).codec();
   private final bfy b;

   public dpq(int $$0) {
      this.b = bfv.a($$0);
   }

   public dpq(bfy $$0) {
      this.b = $$0;
   }

   public bfy a() {
      return this.b;
   }
}
