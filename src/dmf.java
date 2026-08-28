import com.mojang.serialization.MapCodec;

public class dmf extends dgt {
   public static final MapCodec<dmf> b = b(dmf::new);
   private static final xp c = xp.c("container.upgrade");

   @Override
   public MapCodec<dmf> a() {
      return b;
   }

   protected dmf(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new crs($$2x, $$3, cqf.a($$1, $$2)), c);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aF);
         return bqu.c;
      }
   }
}
