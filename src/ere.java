import com.mojang.serialization.Codec;
import java.util.List;

public class ere extends erh {
   public static final Codec<ere> a = a(ere::new);
   public static final Codec<ere> b = b(ere::new);

   ere(List<erq> $$0) {
      super($$0, ac.a($$0));
   }

   public static ere a(List<erq> $$0) {
      return new ere(List.copyOf($$0));
   }

   @Override
   public err b() {
      return ers.e;
   }

   public static ere.a a(erq.a... $$0) {
      return new ere.a($$0);
   }

   public static class a extends erh.a {
      public a(erq.a... $$0) {
         super($$0);
      }

      @Override
      public ere.a and(erq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected erq a(List<erq> $$0) {
         return new ere($$0);
      }
   }
}
