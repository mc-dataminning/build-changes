import com.mojang.serialization.Codec;
import java.util.List;

public class efd extends efg {
   public static final Codec<efd> a = a(efd::new);
   public static final Codec<efd> b = b(efd::new);

   efd(List<efp> $$0) {
      super($$0, efr.a($$0));
   }

   public static efd a(List<efp> $$0) {
      return new efd(List.copyOf($$0));
   }

   @Override
   public efq b() {
      return efr.d;
   }

   public static efd.a a(efp.a... $$0) {
      return new efd.a($$0);
   }

   public static class a extends efg.a {
      public a(efp.a... $$0) {
         super($$0);
      }

      @Override
      public efd.a and(efp.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected efp a(List<efp> $$0) {
         return new efd($$0);
      }
   }
}
