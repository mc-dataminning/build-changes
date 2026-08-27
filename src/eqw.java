import com.mojang.serialization.Codec;
import java.util.List;

public class eqw extends eqy {
   public static final Codec<eqw> a = a(eqw::new);

   eqw(List<erh> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public eri b() {
      return erj.c;
   }

   public static eqw.a a(erh.a... $$0) {
      return new eqw.a($$0);
   }

   public static class a extends eqy.a {
      public a(erh.a... $$0) {
         super($$0);
      }

      @Override
      public eqw.a or(erh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected erh a(List<erh> $$0) {
         return new eqw($$0);
      }
   }
}
