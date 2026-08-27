import com.mojang.serialization.Codec;
import java.util.List;

public class eeu extends eew {
   public static final Codec<eeu> a = a(eeu::new);

   eeu(List<eff> $$0) {
      super($$0, efh.b($$0));
   }

   @Override
   public efg b() {
      return efh.c;
   }

   public static eeu.a a(eff.a... $$0) {
      return new eeu.a($$0);
   }

   public static class a extends eew.a {
      public a(eff.a... $$0) {
         super($$0);
      }

      @Override
      public eeu.a or(eff.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eff a(List<eff> $$0) {
         return new eeu($$0);
      }
   }
}
