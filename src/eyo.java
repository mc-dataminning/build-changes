import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyo extends eyq {
   public static final MapCodec<eyo> a = a(eyo::new);

   eyo(List<eza> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public ezb b() {
      return ezc.b;
   }

   public static eyo.a a(eza.a... $$0) {
      return new eyo.a($$0);
   }

   public static class a extends eyq.a {
      public a(eza.a... $$0) {
         super($$0);
      }

      @Override
      public eyo.a or(eza.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eza a(List<eza> $$0) {
         return new eyo($$0);
      }
   }
}
