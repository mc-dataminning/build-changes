import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class crc extends cra {
   private static final dgt f = new dhs(true, false, Optional.of(1.22F), mb.e.a(awp.cD).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = ayz.l(3.5F);
   private int i = 5;

   public crc(bvi<? extends cra> $$0, dgz $$1) {
      super($$0, $$1);
   }

   public crc(cpr $$0, dgz $$1, double $$2, double $$3, double $$4) {
      super(bvi.bG, $$1, $$0, $$2, $$3, $$4);
   }

   public crc(dgz $$0, double $$1, double $$2, double $$3, fbx $$4) {
      super(bvi.bG, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cql $$0, @Nullable bva $$1, @Nullable bva $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fbx $$0) {
      this.dU().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dgz.a.e, lt.A, lt.z, awa.Do);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
