import com.mojang.serialization.MapCodec;
import java.util.List;

public class etg extends eti {
   public static final MapCodec<etg> a = a(etg::new);

   etg(List<etr> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public ets b() {
      return ett.d;
   }

   public static etg.a a(etr.a... $$0) {
      return new etg.a($$0);
   }

   public static class a extends eti.a {
      public a(etr.a... $$0) {
         super($$0);
      }

      @Override
      public etg.a or(etr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etr a(List<etr> $$0) {
         return new etg($$0);
      }
   }
}
