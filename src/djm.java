import com.mojang.serialization.MapCodec;

public class djm extends diq {
   public static final MapCodec<djm> a = b(djm::new);
   private static final xl b = xl.c("container.loom");

   @Override
   public MapCodec<djm> a() {
      return a;
   }

   protected djm(drw.d $$0) {
      super($$0);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.ax);
         return bqp.c;
      }
   }

   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new cqu($$2x, $$3, cqa.a($$1, $$2)), b);
   }

   @Override
   public drx a(cxv $$0) {
      return this.n().a(aE, $$0.g().g());
   }

   @Override
   protected void a(dry.a<deu, drx> $$0) {
      $$0.a(aE);
   }
}
