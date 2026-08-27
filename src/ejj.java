import com.mojang.serialization.Codec;
import java.util.List;

public class ejj extends ejl {
   public static final Codec<ejj> a = a(ejj::new);

   ejj(List<eju> $$0) {
      super($$0, ejw.b($$0));
   }

   @Override
   public ejv b() {
      return ejw.c;
   }

   public static ejj.a a(eju.a... $$0) {
      return new ejj.a($$0);
   }

   public static class a extends ejl.a {
      public a(eju.a... $$0) {
         super($$0);
      }

      @Override
      public ejj.a or(eju.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eju a(List<eju> $$0) {
         return new ejj($$0);
      }
   }
}
