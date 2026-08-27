import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class der extends ddy {
   public static final MapCodec<der> a = b(der::new);
   private static final wx b = wx.c("container.cartography_table");

   @Override
   public MapCodec<der> a() {
      return a;
   }

   protected der(dra.d $$0) {
      super($$0);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aw);
         return bpu.b;
      }
   }

   @Nullable
   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new coz($$2x, $$3, cpe.a($$1, $$2)), b);
   }
}
