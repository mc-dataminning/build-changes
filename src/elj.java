import com.mojang.serialization.Codec;
import java.util.List;

public class elj extends ell {
   public static final Codec<elj> a = a(elj::new);

   elj(List<elu> $$0) {
      super($$0, elw.b($$0));
   }

   @Override
   public elv b() {
      return elw.c;
   }

   public static elj.a a(elu.a... $$0) {
      return new elj.a($$0);
   }

   public static class a extends ell.a {
      public a(elu.a... $$0) {
         super($$0);
      }

      @Override
      public elj.a or(elu.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected elu a(List<elu> $$0) {
         return new elj($$0);
      }
   }
}
