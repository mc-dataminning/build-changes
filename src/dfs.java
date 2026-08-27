import com.mojang.serialization.MapCodec;

public class dfs extends ddy {
   public static final MapCodec<dfs> a = b(dfs::new);
   private static final wx b = wx.c("container.crafting");

   @Override
   public MapCodec<? extends dfs> a() {
      return a;
   }

   protected dfs(dra.d $$0) {
      super($$0);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.an);
         return bpu.b;
      }
   }

   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new cpk($$2x, $$3, cpe.a($$1, $$2)), b);
   }
}
