import com.mojang.serialization.MapCodec;
import javax.annotation.Nullable;

public class dnm extends dnd {
   public static final MapCodec<dnm> e = b(dnm::new);

   @Override
   public MapCodec<? extends dnm> a() {
      return e;
   }

   public dnm(dww.d $$0) {
      super($$0);
   }

   public static dwx b() {
      return djo.J.m();
   }

   @Override
   public void a(dgi $$0, cox $$1, ji $$2, dwx $$3, @Nullable dtz $$4, cwp $$5) {
      super.a($$0, $$1, $$2, $$3, $$4, $$5);
      if (!ddb.a($$5, aws.s)) {
         if ($$0.G_().i()) {
            $$0.a($$2, false);
            return;
         }

         dwx $$6 = $$0.a_($$2.e());
         if ($$6.d() || $$6.n()) {
            $$0.b($$2, b());
         }
      }
   }

   @Override
   protected void b(dwx $$0, ard $$1, ji $$2, azh $$3) {
      if ($$1.a(dgr.b, $$2) > 11 - $$0.g()) {
         this.e($$0, $$1, $$2);
      }
   }

   protected void e(dwx $$0, dgi $$1, ji $$2) {
      if ($$1.G_().i()) {
         $$1.a($$2, false);
      } else {
         $$1.b($$2, b());
         $$1.b($$2, b().b(), null);
      }
   }
}
