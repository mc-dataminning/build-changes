import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dlh extends dkz {
   public static final MapCodec<dlh> e = b(dlh::new);

   @Override
   public MapCodec<? extends dlh> a() {
      return e;
   }

   public dlh(dun.d $$0) {
      super($$0);
   }

   public static duo b() {
      return dhl.G.o();
   }

   @Override
   public void a(deg $$0, cnu $$1, je $$2, duo $$3, @Nullable drs $$4, cvp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!dbm.a($$5, aww.s)) {
         if ($$0.B_().i()) {
            $$0.a($$2, false);
            return;
         }

         duo $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(duo $$0, arh $$1, je $$2, azl $$3) {
      if ($$1.a(dep.b, $$2) > 11 - $$0.g()) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(duo $$0, deg $$1, je $$2) {
      if ($$1.B_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
