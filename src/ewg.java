import com.mojang.serialization.MapCodec;
import java.util.List;

public class ewg extends ewi {
   public static final MapCodec<ewg> a = a(ewg::new);

   ewg(List<ews> $$0) {
      super($$0, ad.b($$0));
   }

   @Override
   public ewt b() {
      return ewu.b;
   }

   public static ewg.a a(ews.a... $$0) {
      return new ewg.a($$0);
   }

   public static class a extends ewi.a {
      public a(ews.a... $$0) {
         super($$0);
      }

      @Override
      public ewg.a or(ews.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ews a(List<ews> $$0) {
         return new ewg($$0);
      }
   }
}
