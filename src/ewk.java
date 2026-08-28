import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewk extends ewm {
   public static final MapCodec<ewk> a = a(ewk::new);

   ewk(List<eww> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public ewx b() {
      return ewy.b;
   }

   public static ewk.a a(eww.a... $$0) {
      return new ewk.a($$0);
   }

   public static class a extends ewm.a {
      public a(eww.a... $$0) {
         super($$0);
      }

      @Override
      public ewk.a or(eww.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eww a(List<eww> $$0) {
         return new ewk($$0);
      }
   }
}
