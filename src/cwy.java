import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cwy extends cwr {
   public static final MapCodec<cwy> e = b(cwy::new);

   @Override
   public MapCodec<? extends cwy> a() {
      return e;
   }

   public cwy(dfc.d $$0) {
      super($$0);
   }

   public static dfd b() {
      return cte.G.o();
   }

   @Override
   public void a(cqb $$0, cca $$1, gw $$2, dfd $$3, @Nullable dcz $$4, cjl $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cnw.a(cny.v, $$5) == 0) {
         if ($$0.C_().i()) {
            $$0.a($$2, false);
            return;
         }

         dfd $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dfd $$0, akt $$1, gw $$2, ash $$3) {
      if ($$1.a(cqk.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dfd $$0, cqb $$1, gw $$2) {
      if ($$1.C_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
