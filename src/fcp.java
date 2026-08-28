import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import java.util.List;

public class fcp extends fcs {
   public static final MapCodec<fcp> a = a(fcp::new);
   public static final Codec<fcp> b = b(fcp::new);

   fcp(List<fdc> $$0) {
      super($$0, ag.a($$0));
   }

   public static fcp a(List<fdc> $$0) {
      return new fcp(List.copyOf($$0));
   }

   @Override
   public fdd b() {
      return fde.c;
   }

   public static fcp.a a(fdc.a... $$0) {
      return new fcp.a($$0);
   }

   public static class a extends fcs.a {
      public a(fdc.a... $$0) {
         super($$0);
      }

      @Override
      public fcp.a and(fdc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fdc a(List<fdc> $$0) {
         return new fcp($$0);
      }
   }
}
