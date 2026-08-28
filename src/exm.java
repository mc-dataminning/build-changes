import com.mojang.serialization.MapCodec;
import java.util.List;

public class exm extends exo {
   public static final MapCodec<exm> a = a(exm::new);

   exm(List<exy> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public exz b() {
      return eya.b;
   }

   public static exm.a a(exy.a... $$0) {
      return new exm.a($$0);
   }

   public static class a extends exo.a {
      public a(exy.a... $$0) {
         super($$0);
      }

      @Override
      public exm.a or(exy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exy a(List<exy> $$0) {
         return new exm($$0);
      }
   }
}
