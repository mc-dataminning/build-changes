import com.mojang.serialization.MapCodec;

public class djq extends diu {
   public static final MapCodec<djq> a = b(djq::new);
   private static final xo b = xo.c("container.loom");

   @Override
   public MapCodec<djq> a() {
      return a;
   }

   protected djq(dsa.d $$0) {
      super($$0);
   }

   @Override
   protected bqt a(dsb $$0, dbx $$1, iz $$2, cmw $$3, evm $$4) {
      if ($$1.B) {
         return bqt.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awj.ax);
         return bqt.c;
      }
   }

   @Override
   protected bqx b(dsb $$0, dbx $$1, iz $$2) {
      return new brd(($$2x, $$3, $$4) -> new cqy($$2x, $$3, cqe.a($$1, $$2)), b);
   }

   @Override
   public dsb a(cxz $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dsc.a<dey, dsb> $$0) {
      $$0.a(aE);
   }
}
