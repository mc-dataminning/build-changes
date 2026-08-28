import com.mojang.serialization.MapCodec;
import java.util.List;

public class ezm extends ezo {
   public static final MapCodec<ezm> a = a(ezm::new);

   ezm(List<ezy> $$0) {
      super($$0, ae.b($$0));
   }

   @Override
   public ezz b() {
      return faa.b;
   }

   public static ezm.a a(ezy.a... $$0) {
      return new ezm.a($$0);
   }

   public static class a extends ezo.a {
      public a(ezy.a... $$0) {
         super($$0);
      }

      @Override
      public ezm.a or(ezy.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected ezy a(List<ezy> $$0) {
         return new ezm($$0);
      }
   }
}
