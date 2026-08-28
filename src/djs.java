import com.mojang.serialization.MapCodec;

public class djs extends diw {
   public static final MapCodec<djs> a = b(djs::new);
   private static final xp b = xp.c("container.loom");

   @Override
   public MapCodec<djs> a() {
      return a;
   }

   protected djs(dsc.d $$0) {
      super($$0);
   }

   @Override
   protected bqv a(dsd $$0, dbz $$1, iz $$2, cmy $$3, evo $$4) {
      if ($$1.B) {
         return bqv.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awk.ax);
         return bqv.c;
      }
   }

   @Override
   protected bqz b(dsd $$0, dbz $$1, iz $$2) {
      return new brf(($$2x, $$3, $$4) -> new cra($$2x, $$3, cqg.a($$1, $$2)), b);
   }

   @Override
   public dsd a(cyb $$0) {
      return this.o().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dse.a<dfa, dsd> $$0) {
      $$0.a(aE);
   }
}
