import javax.annotation.Nullable;

public class csk extends crr {
   private int d = 200;

   public csk(bwr<? extends csk> $$0, djh $$1) {
      super($$0, $$1);
   }

   public csk(djh $$0, bxj $$1, czk $$2, @Nullable czk $$3) {
      super(bwr.bn, $$1, $$0, $$2, $$3);
   }

   public csk(djh $$0, double $$1, double $$2, double $$3, czk $$4, @Nullable czk $$5) {
      super(bwr.bn, $$1, $$2, $$3, $$0, $$4, $$5);
   }

   @Override
   public void h() {
      super.h();
      if (this.dU().C && !this.f()) {
         this.dU().a(ly.T, this.dz(), this.dB(), this.dF(), 0.0, 0.0, 0.0);
      }
   }

   @Override
   protected void a(bxj $$0) {
      super.a($$0);
      bvm $$1 = new bvm(bvo.x, this.d, 0);
      $$0.b($$1, this.z());
   }

   @Override
   public void a(tz $$0) {
      super.a($$0);
      if ($$0.c("Duration")) {
         this.d = $$0.f("Duration");
      }
   }

   @Override
   public void b(tz $$0) {
      super.b($$0);
      $$0.a("Duration", this.d);
   }

   @Override
   protected czk o() {
      return new czk(czo.wA);
   }
}
