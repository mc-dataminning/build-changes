import com.mojang.serialization.Codec;
import java.util.List;

public class eqv extends eqy {
   public static final Codec<eqv> a = a(eqv::new);
   public static final Codec<eqv> b = b(eqv::new);

   eqv(List<erh> $$0) {
      super($$0, ac.a($$0));
   }

   public static eqv a(List<erh> $$0) {
      return new eqv(List.copyOf($$0));
   }

   @Override
   public eri b() {
      return erj.d;
   }

   public static eqv.a a(erh.a... $$0) {
      return new eqv.a($$0);
   }

   public static class a extends eqy.a {
      public a(erh.a... $$0) {
         super($$0);
      }

      @Override
      public eqv.a and(erh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected erh a(List<erh> $$0) {
         return new eqv($$0);
      }
   }
}
