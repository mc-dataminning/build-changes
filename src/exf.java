import com.mojang.serialization.MapCodec;
import java.util.List;

public class exf extends exh {
   public static final MapCodec<exf> a = a(exf::new);

   exf(List<exr> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public exs b() {
      return ext.b;
   }

   public static exf.a a(exr.a... $$0) {
      return new exf.a($$0);
   }

   public static class a extends exh.a {
      public a(exr.a... $$0) {
         super($$0);
      }

      @Override
      public exf.a or(exr.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected exr a(List<exr> $$0) {
         return new exf($$0);
      }
   }
}
