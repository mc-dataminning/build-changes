import com.mojang.serialization.MapCodec;

public class dlg extends dfu {
   public static final MapCodec<dlg> b = b(dlg::new);
   private static final wx c = wx.c("container.upgrade");

   @Override
   public MapCodec<dlg> a() {
      return b;
   }

   protected dlg(drc.d $$0) {
      super($$0);
   }

   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cqt($$2x, $$3, cpg.a($$1, $$2)), c);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.aF);
         return bpw.b;
      }
   }
}
