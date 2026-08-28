import com.mojang.serialization.MapCodec;

public class dgt extends dez {
   public static final MapCodec<dgt> a = b(dgt::new);
   private static final xp b = xp.c("container.crafting");

   @Override
   public MapCodec<? extends dgt> a() {
      return a;
   }

   protected dgt(dsb.d $$0) {
      super($$0);
   }

   @Override
   protected bqu a(dsc $$0, dby $$1, iz $$2, cmx $$3, evn $$4) {
      if ($$1.B) {
         return bqu.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.an);
         return bqu.c;
      }
   }

   @Override
   protected bqy b(dsc $$0, dby $$1, iz $$2) {
      return new bre(($$2x, $$3, $$4) -> new cql($$2x, $$3, cqf.a($$1, $$2)), b);
   }
}
