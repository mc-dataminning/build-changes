import com.mojang.serialization.MapCodec;

public class ent extends enl {
   public static final MapCodec<ent> a = awu.a(lu.f).fieldOf("tag").xmap(ent::new, $$0 -> $$0.b);
   private final awu<dfy> b;

   public ent(awu<dfy> $$0) {
      this.b = $$0;
   }

   @Override
   public boolean a(dtc $$0, ayw $$1) {
      return $$0.a(this.b);
   }

   @Override
   protected enm<?> a() {
      return enm.d;
   }
}
