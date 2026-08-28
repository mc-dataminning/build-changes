import com.mojang.serialization.MapCodec;

public class dmg extends dgu {
   public static final MapCodec<dmg> b = b(dmg::new);
   private static final xp c = xp.c("container.upgrade");

   @Override
   public MapCodec<dmg> a() {
      return b;
   }

   protected dmg(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new crt($$2x, $$3, cqg.a($$1, $$2)), c);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.aF);
         return bqv.c;
      }
   }
}
