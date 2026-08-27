import com.mojang.serialization.MapCodec;

public class dis extends dhw {
   public static final MapCodec<dis> a = b(dis::new);
   private static final wx b = wx.c("container.loom");

   @Override
   public MapCodec<dis> a() {
      return a;
   }

   protected dis(drc.d $$0) {
      super($$0);
   }

   @Override
   protected bpw a(drd $$0, daz $$1, io $$2, cly $$3, eui $$4) {
      if ($$1.B) {
         return bpw.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(avs.ax);
         return bpw.b;
      }
   }

   @Override
   protected bqa b(drd $$0, daz $$1, io $$2) {
      return new bqg(($$2x, $$3, $$4) -> new cqa($$2x, $$3, cpg.a($$1, $$2)), b);
   }

   @Override
   public drd a(cxb $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dre.a<dea, drd> $$0) {
      $$0.a(aE);
   }
}
