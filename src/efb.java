import com.mojang.serialization.Codec;

public class efb implements efg {
   public static final Codec<efb> a = bqp.b(0, 256).fieldOf("count").xmap(efb::new, efb::a).codec();
   private final bqp b;

   public efb(int $$0) {
      this.b = bqm.a($$0);
   }

   public efb(bqp $$0) {
      this.b = $$0;
   }

   public bqp a() {
      return this.b;
   }
}
