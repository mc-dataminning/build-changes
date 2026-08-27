import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dhc extends dgu {
   public static final MapCodec<dhc> e = b(dhc::new);

   @Override
   public MapCodec<? extends dhc> a() {
      return e;
   }

   public dhc(dqg.d $$0) {
      super($$0);
   }

   public static dqh b() {
      return ddg.G.n();
   }

   @Override
   public void a(dad $$0, clh $$1, in $$2, dqh $$3, @Nullable dnm $$4, csz $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (cyh.a(cyj.v, $$5) == 0) {
         if ($$0.D_().i()) {
            $$0.a($$2, false);
            return;
         }

         dqh $$6 = $$0.a_($$2.d());
         if ($$6.d() || $$6.k()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dqh $$0, aqh $$1, in $$2, ayg $$3) {
      if ($$1.a(dam.b, $$2) > 11 - $$0.b($$1, $$2)) {
         this.d($$0, $$1, $$2);
      }
   }

   protected void d(dqh $$0, dad $$1, in $$2) {
      if ($$1.D_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.a($$2, b().b(), $$2);
      }
   }
}
