import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fck extends fcn {
   public static final MapCodec<fck> a = a(fck::new);
   public static final Codec<fck> b = b(fck::new);

   fck(List<fcx> $$0) {
      super($$0, ag.a($$0));
   }

   public static fck a(List<fcx> $$0) {
      return new fck(List.copyOf($$0));
   }

   @Override
   public fcy b() {
      return fcz.c;
   }

   public static fck.a a(fcx.a... $$0) {
      return new fck.a($$0);
   }

   public static class a extends fcn.a {
      public a(fcx.a... $$0) {
         super($$0);
      }

      @Override
      public fck.a and(fcx.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fcx a(List<fcx> $$0) {
         return new fck($$0);
      }
   }
}
