import com.mojang.serialization.MapCodec;
import java.util.List;

public class eth extends etj {
   public static final MapCodec<eth> a = a(eth::new);

   eth(List<ets> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public ett b() {
      return etu.d;
   }

   public static eth.a a(ets.a... $$0) {
      return new eth.a($$0);
   }

   public static class a extends etj.a {
      public a(ets.a... $$0) {
         super($$0);
      }

      @Override
      public eth.a or(ets.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ets a(List<ets> $$0) {
         return new eth($$0);
      }
   }
}
