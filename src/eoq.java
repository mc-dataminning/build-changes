import com.mojang.serialization.MapCodec;

public class eoq extends eor {
   public static final MapCodec<eoq> a = MapCodec.unit(() -> eoq.b);
   public static final eoq b = new eoq();

   private eoq() {
   }

   @Override
   public boolean a(je $$0, je $$1, je $$2, azl $$3) {
      return true;
   }

   @Override
   protected eos<?> a() {
      return eos.a;
   }
}
