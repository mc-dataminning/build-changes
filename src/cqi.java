import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqi extends cqg {
   private static final dgb f = new dhb(true, false, Optional.of(1.22F), mb.e.a(awp.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = ayz.l(3.5F);
   private int i = 5;

   public cqi(bus<? extends cqg> $$0, dgi $$1) {
      super($$0, $$1);
   }

   public cqi(cox $$0, dgi $$1, double $$2, double $$3, double $$4) {
      super(bus.bG, $$1, $$0, $$2, $$3, $$4);
   }

   public cqi(dgi $$0, double $$1, double $$2, double $$3, fba $$4) {
      super(bus.bG, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cpr $$0, @Nullable bul $$1, @Nullable bul $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fba $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dgi.a.e, lt.A, lt.z, awa.De);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
