import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dmn extends dmf {
   public static final MapCodec<dmn> e = b(dmn::new);

   @Override
   public MapCodec<? extends dmn> a() {
      return e;
   }

   public dmn(dvu.d $$0) {
      super($$0);
   }

   public static dvv b() {
      return dis.G.m();
   }

   @Override
   public void a(dfm $$0, cou $$1, jh $$2, dvv $$3, @Nullable dsy $$4, cwm $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dcf.a($$5, axf.s)) {
         if ($$0.F_().i()) {
            $$0.a($$2, false);
            return;
         }

         dvv $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dvv $$0, arp $$1, jh $$2, azu $$3) {
      if ($$1.a(dfv.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dvv $$0, dfm $$1, jh $$2) {
      if ($$1.F_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
