import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class eyn extends eyq {
   public static final MapCodec<eyn> a = a(eyn::new);
   public static final Codec<eyn> b = b(eyn::new);

   eyn(List<eza> $$0) {
      super($$0, af.a($$0));
   }

   public static eyn a(List<eza> $$0) {
      return new eyn(List.copyOf($$0));
   }

   @Override
   public ezb b() {
      return ezc.c;
   }

   public static eyn.a a(eza.a... $$0) {
      return new eyn.a($$0);
   }

   public static class a extends eyq.a {
      public a(eza.a... $$0) {
         super($$0);
      }

      @Override
      public eyn.a and(eza.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eza a(List<eza> $$0) {
         return new eyn($$0);
      }
   }
}
