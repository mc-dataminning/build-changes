import com.mojang.serialization.MapCodec;
import java.util.List;

public class etj extends etl {
   public static final MapCodec<etj> a = a(etj::new);

   etj(List<etu> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public etv b() {
      return etw.d;
   }

   public static etj.a a(etu.a... $$0) {
      return new etj.a($$0);
   }

   public static class a extends etl.a {
      public a(etu.a... $$0) {
         super($$0);
      }

      @Override
      public etj.a or(etu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etu a(List<etu> $$0) {
         return new etj($$0);
      }
   }
}
