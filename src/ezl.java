import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezl extends ezn {
   public static final MapCodec<ezl> a = a(ezl::new);

   ezl(List<ezx> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public ezy b() {
      return ezz.b;
   }

   public static ezl.a a(ezx.a... $$0) {
      return new ezl.a($$0);
   }

   public static class a extends ezn.a {
      public a(ezx.a... $$0) {
         super($$0);
      }

      @Override
      public ezl.a or(ezx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezx a(List<ezx> $$0) {
         return new ezl($$0);
      }
   }
}
