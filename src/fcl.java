import com.mojang.serialization.MapCodec;
import java.util.List;

public class fcl extends fcn {
   public static final MapCodec<fcl> a = a(fcl::new);

   fcl(List<fcx> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fcy b() {
      return fcz.b;
   }

   public static fcl.a a(fcx.a... $$0) {
      return new fcl.a($$0);
   }

   public static class a extends fcn.a {
      public a(fcx.a... $$0) {
         super($$0);
      }

      @Override
      public fcl.a or(fcx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fcx a(List<fcx> $$0) {
         return new fcl($$0);
      }
   }
}
