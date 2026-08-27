import com.mojang.serialization.MapCodec;

public class dfu extends dea {
   public static final MapCodec<dfu> a = b(dfu::new);
   private static final wx b = wx.c("container.crafting");

   @Override
   public MapCodec<? extends dfu> a() {
      return a;
   }

   protected dfu(drc.d $$0) {
      super($$0);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.an);
         return bpw.b;
      }
   }

   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cpm($$2x, $$3, cpg.a($$1, $$2)), b);
   }
}
