import javax.annotation.Nullable;

public class csn extends cru {
   private int d = 200;

   public csn(bwr<? extends csn> $$0, djm $$1) {
      super($$0, $$1);
   }

   public csn(djm $$0, bxj $$1, czn $$2, @Nullable czn $$3) {
      super(bwr.bn, $$1, $$0, $$2, $$3);
   }

   public csn(djm $$0, double $$1, double $$2, double $$3, czn $$4, @Nullable czn $$5) {
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
   protected czn o() {
      return new czn(czr.wA);
   }
}
