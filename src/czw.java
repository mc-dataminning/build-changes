import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class czw extends czp {
   public static final MapCodec<czw> e = b(czw::new);

   @Override
   public MapCodec<? extends czw> a() {
      return e;
   }

   public czw(dio.d $$0) {
      super($$0);
   }

   public static dip b() {
      return cwb.G.o();
   }

   @Override
   public void a(csy $$0, cer $$1, hv $$2, dip $$3, @Nullable dgd $$4, cmh $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cqu.a(cqw.v, $$5) == 0) {
         if ($$0.E_().i()) {
            $$0.a($$2, false);
            return;
         }

         dip $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   public void b(dip $$0, amp $$1, hv $$2, auf $$3) {
      if ($$1.a(cth.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dip $$0, csy $$1, hv $$2) {
      if ($$1.E_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
