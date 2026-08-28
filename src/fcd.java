import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fcd extends fcg {
   public static final MapCodec<fcd> a = a(fcd::new);
   public static final Codec<fcd> b = b(fcd::new);

   fcd(List<fcq> $$0) {
      super($$0, af.a($$0));
   }

   public static fcd a(List<fcq> $$0) {
      return new fcd(List.copyOf($$0));
   }

   @Override
   public fcr b() {
      return fcs.c;
   }

   public static fcd.a a(fcq.a... $$0) {
      return new fcd.a($$0);
   }

   public static class a extends fcg.a {
      public a(fcq.a... $$0) {
         super($$0);
      }

      @Override
      public fcd.a and(fcq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fcq a(List<fcq> $$0) {
         return new fcd($$0);
      }
   }
}
