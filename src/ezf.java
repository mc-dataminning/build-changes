import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezf extends ezh {
   public static final MapCodec<ezf> a = a(ezf::new);

   ezf(List<ezr> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public ezs b() {
      return ezt.b;
   }

   public static ezf.a a(ezr.a... $$0) {
      return new ezf.a($$0);
   }

   public static class a extends ezh.a {
      public a(ezr.a... $$0) {
         super($$0);
      }

      @Override
      public ezf.a or(ezr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezr a(List<ezr> $$0) {
         return new ezf($$0);
      }
   }
}
