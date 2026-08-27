import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dan extends dag {
   public static final MapCodec<dan> e = b(dan::new);

   @Override
   public MapCodec<? extends dan> a() {
      return e;
   }

   public dan(djg.d $$0) {
      super($$0);
   }

   public static djh b() {
      return cws.G.o();
   }

   @Override
   public void a(ctp $$0, cfi $$1, hx $$2, djh $$3, @Nullable dgv $$4, cmy $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (crl.a(crn.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         djh $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(djh $$0, and $$1, hx $$2, auv $$3) {
      if ($$1.a(cty.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(djh $$0, ctp $$1, hx $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
