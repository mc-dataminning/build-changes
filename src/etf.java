import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etf extends eti {
   public static final MapCodec<etf> a = a(etf::new);
   public static final Codec<etf> b = b(etf::new);

   etf(List<etr> $$0) {
      super($$0, ac.a($$0));
   }

   public static etf a(List<etr> $$0) {
      return new etf(List.copyOf($$0));
   }

   @Override
   public ets b() {
      return ett.e;
   }

   public static etf.a a(etr.a... $$0) {
      return new etf.a($$0);
   }

   public static class a extends eti.a {
      public a(etr.a... $$0) {
         super($$0);
      }

      @Override
      public etf.a and(etr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etr a(List<etr> $$0) {
         return new etf($$0);
      }
   }
}
