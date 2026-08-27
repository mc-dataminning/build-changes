import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class esb extends ese {
   public static final MapCodec<esb> a = a(esb::new);
   public static final Codec<esb> b = b(esb::new);

   esb(List<esn> $$0) {
      super($$0, ac.a($$0));
   }

   public static esb a(List<esn> $$0) {
      return new esb(List.copyOf($$0));
   }

   @Override
   public eso b() {
      return esp.e;
   }

   public static esb.a a(esn.a... $$0) {
      return new esb.a($$0);
   }

   public static class a extends ese.a {
      public a(esn.a... $$0) {
         super($$0);
      }

      @Override
      public esb.a and(esn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected esn a(List<esn> $$0) {
         return new esb($$0);
      }
   }
}
