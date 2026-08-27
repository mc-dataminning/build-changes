import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class cyq extends cyj {
   public static final MapCodec<cyq> e = b(cyq::new);

   @Override
   public MapCodec<? extends cyq> a() {
      return e;
   }

   public cyq(dgv.d $$0) {
      super($$0);
   }

   public static dgw b() {
      return cuv.G.o();
   }

   @Override
   public void a(crs $$0, cdm $$1, ht $$2, dgw $$3, @Nullable der $$4, clb $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cpo.a(cpq.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dgw $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dgw $$0, ama $$1, ht $$2, ato $$3) {
      if ($$1.a(csb.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dgw $$0, crs $$1, ht $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
