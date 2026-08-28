import java.util.Optional;
import java.util.function.Function;
import javax.annotation.Nullable;

public class cqj extends cqh {
   private static final dgc f = new dhc(true, false, Optional.of(1.22F), mb.e.a(awp.cB).map(Function.identity()));
   private static final float g = 1.2F;
   private static final float h = ayz.l(3.5F);
   private int i = 5;

   public cqj(but<? extends cqh> $$0, dgj $$1) {
      super($$0, $$1);
   }

   public cqj(coy $$0, dgj $$1, double $$2, double $$3, double $$4) {
      super(but.bG, $$1, $$0, $$2, $$3, $$4);
   }

   public cqj(dgj $$0, double $$1, double $$2, double $$3, fbb $$4) {
      super(but.bG, $$1, $$2, $$3, $$4, $$0);
   }

   @Override
   public void h() {
      super.h();
      if (this.i > 0) {
         this.i--;
      }
   }

   @Override
   public boolean a(cps $$0, @Nullable bum $$1, @Nullable bum $$2, boolean $$3) {
      return this.i > 0 ? false : super.a($$0, $$1, $$2, $$3);
   }

   @Override
   protected void a(fbb $$0) {
      this.dV().a(this, null, f, $$0.a(), $$0.b(), $$0.c(), 1.2F, false, dgj.a.e, lt.A, lt.z, awa.De);
   }

   @Override
   public boolean a(double $$0) {
      return this.af < 2 && $$0 < (double)h ? false : super.a($$0);
   }
}
