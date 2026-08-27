import com.mojang.serialization.Codec;
import java.util.List;

public class erf extends erh {
   public static final Codec<erf> a = a(erf::new);

   erf(List<erq> $$0) {
      super($$0, ac.b($$0));
   }

   @Override
   public err b() {
      return ers.d;
   }

   public static erf.a a(erq.a... $$0) {
      return new erf.a($$0);
   }

   public static class a extends erh.a {
      public a(erq.a... $$0) {
         super($$0);
      }

      @Override
      public erf.a or(erq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected erq a(List<erq> $$0) {
         return new erf($$0);
      }
   }
}
