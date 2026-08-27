import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class det extends dea {
   public static final MapCodec<det> a = b(det::new);
   private static final wx b = wx.c("container.cartography_table");

   @Override
   public MapCodec<det> a() {
      return a;
   }

   protected det(drc.d $$0) {
      super($$0);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.aw);
         return bpw.b;
      }
   }

   @Nullable
   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cpb($$2x, $$3, cpg.a($$1, $$2)), b);
   }
}
