import com.mojang.serialization.Codec;
import java.util.List;

public class efv extends efy {
   public static final Codec<efv> a = a(efv::new);
   public static final Codec<efv> b = b(efv::new);

   efv(List<egh> $$0) {
      super($$0, egj.a($$0));
   }

   public static efv a(List<egh> $$0) {
      return new efv(List.copyOf($$0));
   }

   @Override
   public egi b() {
      return egj.d;
   }

   public static efv.a a(egh.a... $$0) {
      return new efv.a($$0);
   }

   public static class a extends efy.a {
      public a(egh.a... $$0) {
         super($$0);
      }

      @Override
      public efv.a and(egh.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected egh a(List<egh> $$0) {
         return new efv($$0);
      }
   }
}
