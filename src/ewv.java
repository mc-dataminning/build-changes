import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewv extends ewx {
   public static final MapCodec<ewv> a = a(ewv::new);

   ewv(List<exh> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public exi b() {
      return exj.b;
   }

   public static ewv.a a(exh.a... $$0) {
      return new ewv.a($$0);
   }

   public static class a extends ewx.a {
      public a(exh.a... $$0) {
         super($$0);
      }

      @Override
      public ewv.a or(exh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exh a(List<exh> $$0) {
         return new ewv($$0);
      }
   }
}
