import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dfn extends deu {
   public static final MapCodec<dfn> a = b(dfn::new);
   private static final xl b = xl.c("container.cartography_table");

   @Override
   public MapCodec<dfn> a() {
      return a;
   }

   protected dfn(drw.d $$0) {
      super($$0);
   }

   @Override
   protected bqp a(drx $$0, dbt $$1, iz $$2, cms $$3, evi $$4) {
      if ($$1.B) {
         return bqp.a;
      } else {
         $$3.a($$0.b($$1, $$2));
         $$3.a(awg.aw);
         return bqp.c;
      }
   }

   @Nullable
   @Override
   protected bqt b(drx $$0, dbt $$1, iz $$2) {
      return new bqz(($$2x, $$3, $$4) -> new cpv($$2x, $$3, cqa.a($$1, $$2)), b);
   }
}
