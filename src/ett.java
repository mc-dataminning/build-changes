import com.mojang.serialization.MapCodec;
import java.util.List;

public class ett extends etv {
   public static final MapCodec<ett> a = a(ett::new);

   ett(List<euf> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eug b() {
      return euh.b;
   }

   public static ett.a a(euf.a... $$0) {
      return new ett.a($$0);
   }

   public static class a extends etv.a {
      public a(euf.a... $$0) {
         super($$0);
      }

      @Override
      public ett.a or(euf.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected euf a(List<euf> $$0) {
         return new ett($$0);
      }
   }
}
