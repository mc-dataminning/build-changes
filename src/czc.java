import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czc extends cyv {
   public static final MapCodec<czc> e = b(czc::new);

   @Override
   public MapCodec<? extends czc> a() {
      return e;
   }

   public czc(dhm.d $$0) {
      super($$0);
   }

   public static dhn b() {
      return cvh.G.o();
   }

   @Override
   public void a(csf $$0, cdz $$1, hx $$2, dhn $$3, @Nullable dfi $$4, clo $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cqb.a(cqd.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dhn $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dhn $$0, ami $$1, hx $$2, atw $$3) {
      if ($$1.a(cso.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dhn $$0, csf $$1, hx $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
