import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class etg extends etj {
   public static final MapCodec<etg> a = a(etg::new);
   public static final Codec<etg> b = b(etg::new);

   etg(List<ets> $$0) {
      super($$0, ac.a($$0));
   }

   public static etg a(List<ets> $$0) {
      return new etg(List.copyOf($$0));
   }

   @Override
   public ett b() {
      return etu.e;
   }

   public static etg.a a(ets.a... $$0) {
      return new etg.a($$0);
   }

   public static class a extends etj.a {
      public a(ets.a... $$0) {
         super($$0);
      }

      @Override
      public etg.a and(ets.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ets a(List<ets> $$0) {
         return new etg($$0);
      }
   }
}
