import com.mojang.serialization.MapCodec;
import java.util.List;

public class etv extends etx {
   public static final MapCodec<etv> a = a(etv::new);

   etv(List<euh> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eui b() {
      return euj.b;
   }

   public static etv.a a(euh.a... $$0) {
      return new etv.a($$0);
   }

   public static class a extends etx.a {
      public a(euh.a... $$0) {
         super($$0);
      }

      @Override
      public etv.a or(euh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euh a(List<euh> $$0) {
         return new etv($$0);
      }
   }
}
