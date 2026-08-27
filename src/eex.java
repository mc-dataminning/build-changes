import com.mojang.serialization.Codec;

public class eex extends eey {
   public static final Codec<eex> a = Codec.unit(() -> eex.b);
   public static final eex b = new eex();

   private eex() {
   }

   @Override
   public boolean a(hz $$0, hz $$1, hz $$2, awp $$3) {
      return true;
   }

   @Override
   protected eez<?> a() {
      return eez.a;
   }
}
