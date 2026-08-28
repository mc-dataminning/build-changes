import com.mojang.serialization.MapCodec;

public class dgu extends dfa {
   public static final MapCodec<dgu> a = b(dgu::new);
   private static final xp b = xp.c("container.crafting");

   @Override
   public MapCodec<? extends dgu> a() {
      return a;
   }

   protected dgu(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.an);
         return bqv.c;
      }
   }

   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new cqm($$2x, $$3, cqg.a($$1, $$2)), b);
   }
}
