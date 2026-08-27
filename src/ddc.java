import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class ddc extends dcv {
   public static final MapCodec<ddc> e = b(ddc::new);

   @Override
   public MapCodec<? extends ddc> a() {
      return e;
   }

   public ddc(dmd.d $$0) {
      super($$0);
   }

   public static dme b() {
      return czh.G.o();
   }

   @Override
   public void a(cwe $$0, cia $$1, ib $$2, dme $$3, @Nullable djl $$4, cpq $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cua.a(cuc.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dme $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dme $$0, apa $$1, ib $$2, awt $$3) {
      if ($$1.a(cwn.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dme $$0, cwe $$1, ib $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
