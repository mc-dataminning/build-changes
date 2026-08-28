import com.mojang.serialization.MapCodec;

public class emh extends emw {
   public static final MapCodec<emh> a = bro.b(0, 256).fieldOf("count").xmap(emh::new, $$0 -> $$0.c);
   private final bro c;

   private emh(bro $$0) {
      this.c = $$0;
   }

   public static emh a(bro $$0) {
      return new emh($$0);
   }

   public static emh a(int $$0) {
      return a(brl.a($$0));
   }

   @Override
   protected int a(azh $$0, ji $$1) {
      return this.c.a($$0);
   }

   @Override
   public emt<?> b() {
      return emt.f;
   }
}
