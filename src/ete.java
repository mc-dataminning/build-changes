import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class ete extends eth {
   public static final MapCodec<ete> a = a(ete::new);
   public static final Codec<ete> b = b(ete::new);

   ete(List<etq> $$0) {
      super($$0, ac.a($$0));
   }

   public static ete a(List<etq> $$0) {
      return new ete(List.copyOf($$0));
   }

   @Override
   public etr b() {
      return ets.e;
   }

   public static ete.a a(etq.a... $$0) {
      return new ete.a($$0);
   }

   public static class a extends eth.a {
      public a(etq.a... $$0) {
         super($$0);
      }

      @Override
      public ete.a and(etq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected etq a(List<etq> $$0) {
         return new ete($$0);
      }
   }
}
