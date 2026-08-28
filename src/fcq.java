import com.mojang.serialization.MapCodec;
import java.util.List;

public class fcq extends fcs {
   public static final MapCodec<fcq> a = a(fcq::new);

   fcq(List<fdc> $$0) {
      super($$0, ag.b($$0));
   }

   @Override
   public fdd b() {
      return fde.b;
   }

   public static fcq.a a(fdc.a... $$0) {
      return new fcq.a($$0);
   }

   public static class a extends fcs.a {
      public a(fdc.a... $$0) {
         super($$0);
      }

      @Override
      public fcq.a or(fdc.a $$0) {
         this.a($$0);
         return this;
      }

      @Override
      protected fdc a(List<fdc> $$0) {
         return new fcq($$0);
      }
   }
}
