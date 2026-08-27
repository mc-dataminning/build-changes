import java.util.EnumSet;

public class bpf extends bqf {
   private final bul g;

   public bpf(bul $$0, double $$1, int $$2) {
      super($$0, $$1, $$2, 6);
      this.g = $$0;
      this.f = -2;
      this.a(EnumSet.of(bps.a.c, bps.a.a));
   }

   @Override
   public boolean a() {
      return this.g.p() && !this.g.fZ() && !this.g.gh() && super.a();
   }

   @Override
   public void c() {
      super.c();
      this.g.y(false);
   }

   @Override
   protected int a(bjf $$0) {
      return 40;
   }

   @Override
   public void d() {
      super.d();
      this.g.A(false);
   }

   @Override
   public void e() {
      super.e();
      this.g.y(false);
      if (!this.m()) {
         this.g.A(false);
      } else if (!this.g.gh()) {
         this.g.A(true);
      }
   }

   @Override
   protected boolean a(cpn $$0, gv $$1) {
      return $$0.t($$1.c()) && $$0.a_($$1).a(apj.R);
   }
}
