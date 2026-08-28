import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlk extends dlc {
   public static final MapCodec<dlk> e = b(dlk::new);

   @Override
   public MapCodec<? extends dlk> a() {
      return e;
   }

   public dlk(dur.d $$0) {
      super($$0);
   }

   public static dus b() {
      return dho.G.n();
   }

   @Override
   public void a(dej $$0, cnx $$1, jf $$2, dus $$3, @Nullable drv $$4, cvs $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dbp.a($$5, awy.s)) {
         if ($$0.C_().i()) {
            $$0.a($$2, false);
            return;
         }

         dus $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dus $$0, arj $$1, jf $$2, azn $$3) {
      if ($$1.a(des.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dus $$0, dej $$1, jf $$2) {
      if ($$1.C_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
