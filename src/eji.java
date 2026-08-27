import com.mojang.serialization.Codec;
import java.util.List;

public class eji extends ejl {
   public static final Codec<eji> a = a(eji::new);
   public static final Codec<eji> b = b(eji::new);

   eji(List<eju> $$0) {
      super($$0, ejw.a($$0));
   }

   public static eji a(List<eju> $$0) {
      return new eji(List.copyOf($$0));
   }

   @Override
   public ejv b() {
      return ejw.d;
   }

   public static eji.a a(eju.a... $$0) {
      return new eji.a($$0);
   }

   public static class a extends ejl.a {
      public a(eju.a... $$0) {
         super($$0);
      }

      @Override
      public eji.a and(eju.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected eju a(List<eju> $$0) {
         return new eji($$0);
      }
   }
}
