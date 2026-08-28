import com.mojang.serialization.MapCodec;
import java.util.List;

public class fce extends fcg {
   public static final MapCodec<fce> a = a(fce::new);

   fce(List<fcq> $$0) {
      super($$0, af.b($$0));
   }

   @Override
   public fcr b() {
      return fcs.b;
   }

   public static fce.a a(fcq.a... $$0) {
      return new fce.a($$0);
   }

   public static class a extends fcg.a {
      public a(fcq.a... $$0) {
         super($$0);
      }

      @Override
      public fce.a or(fcq.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fcq a(List<fcq> $$0) {
         return new fce($$0);
      }
   }
}
