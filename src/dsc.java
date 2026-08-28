import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dsc extends dqh implements ddp, dsf.b {
   private static final Logger a = LogUtils.getLogger();
   private dsf b;

   public dsc(jd $$0, dtc $$1) {
      super(dqj.Q, $$0, $$1);
      dse $$2 = dse.a;
      dse.a $$3 = dse.a.a;
      this.b = new dsf(this, $$2, $$3);
   }

   @Override
   protected void a(ub $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         ub $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(up.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ub $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(up.a, this.b).ifSuccess($$1x -> $$0.a((ub)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acb b() {
      return acb.a(this);
   }

   @Override
   public ub a(jo.a $$0) {
      return this.b.f().a(this.n().c(doo.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsx<?> $$0, ayw $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dsf c() {
      return this.b;
   }

   @Override
   public dsi d() {
      return !this.n().b(dts.by) ? dsi.a : this.n().c(dts.by);
   }

   @Override
   public void a(dcw $$0, dsi $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dts.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
