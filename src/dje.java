import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dje extends diw {
   public static final MapCodec<dje> e = b(dje::new);

   @Override
   public MapCodec<? extends dje> a() {
      return e;
   }

   public dje(dtb.d $$0) {
      super($$0);
   }

   public static dtc b() {
      return dfe.al.n();
   }

   @Override
   public void a(dca $$0, cly $$1, ir $$2, dtc $$3, @Nullable dqc $$4, cuh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (dae.a(dag.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dtc $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dtc $$0, aqt $$1, ir $$2, ayt $$3) {
      if ($$1.a(dcj.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dtc $$0, dca $$1, ir $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
