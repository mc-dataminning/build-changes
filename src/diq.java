import com.mojang.serialization.MapCodec;

public class diq extends dhu {
   public static final MapCodec<diq> a = b(diq::new);
   private static final wx b = wx.c("container.loom");

   @Override
   public MapCodec<diq> a() {
      return a;
   }

   protected diq(dra.d $$0) {
      super($$0);
   }

   @Override
   protected bpu a(drb $$0, dax $$1, io $$2, clw $$3, eug $$4) {
      if ($$1.B) {
         return bpu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avr.ax);
         return bpu.b;
      }
   }

   @Override
   protected bpy b(drb $$0, dax $$1, io $$2) {
      return new bqe(($$2x, $$3, $$4) -> new cpy($$2x, $$3, cpe.a($$1, $$2)), b);
   }

   @Override
   public drb a(cwz $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(drc.a<ddy, drb> $$0) {
      $$0.a(aE);
   }
}
