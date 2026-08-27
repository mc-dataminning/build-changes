import com.mojang.serialization.MapCodec;

public class dle extends dfs {
   public static final MapCodec<dle> b = b(dle::new);
   private static final wx c = wx.c("container.upgrade");

   @Override
   public MapCodec<dle> a() {
      return b;
   }

   protected dle(dra.d $$0) {
      super($$0);
   }

   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new cqr($$2x, $$3, cpe.a($$1, $$2)), c);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.aF);
         return bpu.b;
      }
   }
}
