import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dqa extends dog implements dbp, dqe.b {
   private static final Logger a = LogUtils.getLogger();
   private dqe b;

   public dqa(io $$0, drb $$1) {
      super(doi.Q, $$0, $$1);
      dqd $$2 = dqd.a;
      dqd.a $$3 = dqd.a.a;
      this.b = new dqe(this, $$2, $$3);
   }

   @Override
   protected void a(ud $$0, iz.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         ud $$2 = $$0.p("normal_config").h();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(ur.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ud $$0, iz.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ur.a, this.b).ifSuccess($$1x -> $$0.a((ud)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abx b() {
      return abx.a(this);
   }

   @Override
   public ud a(iz.a $$0) {
      return this.b.f().a(this.n().c(dmn.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsa<?> $$0, ayk $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dqe c() {
      return this.b;
   }

   @Override
   public dqh d() {
      return !this.n().b(drr.by) ? dqh.a : this.n().c(drr.by);
   }

   @Override
   public void a(dax $$0, dqh $$1) {
      this.e();
      $$0.b(this.o, this.n().a(drr.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
