import com.mojang.serialization.MapCodec;

public class dgo extends deu {
   public static final MapCodec<dgo> a = b(dgo::new);
   private static final xl b = xl.c("container.crafting");

   @Override
   public MapCodec<? extends dgo> a() {
      return a;
   }

   protected dgo(drw.d $$0) {
      super($$0);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.an);
         return bqp.c;
      }
   }

   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new cqg($$2x, $$3, cqa.a($$1, $$2)), b);
   }
}
