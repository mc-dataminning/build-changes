import com.mojang.serialization.MapCodec;
import java.util.List;

public class etf extends eth {
   public static final MapCodec<etf> a = a(etf::new);

   etf(List<etq> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public etr b() {
      return ets.d;
   }

   public static etf.a a(etq.a... $$0) {
      return new etf.a($$0);
   }

   public static class a extends eth.a {
      public a(etq.a... $$0) {
         super($$0);
      }

      @Override
      public etf.a or(etq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etq a(List<etq> $$0) {
         return new etf($$0);
      }
   }
}
