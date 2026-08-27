import com.mojang.serialization.MapCodec;
import java.util.List;

public class esc extends ese {
   public static final MapCodec<esc> a = a(esc::new);

   esc(List<esn> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eso b() {
      return esp.d;
   }

   public static esc.a a(esn.a... $$0) {
      return new esc.a($$0);
   }

   public static class a extends ese.a {
      public a(esn.a... $$0) {
         super($$0);
      }

      @Override
      public esc.a or(esn.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected esn a(List<esn> $$0) {
         return new esc($$0);
      }
   }
}
