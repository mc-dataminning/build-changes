import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class drk extends dpp implements dcy, drn.b {
   private static final Logger a = LogUtils.getLogger();
   private drn b;

   public drk(ja $$0, dsk $$1) {
      super(dpr.Q, $$0, $$1);
      drm $$2 = drm.a;
      drm.a $$3 = drm.a.a;
      this.b = new drn(this, $$2, $$3);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         tx $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(ul.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ul.a, this.b).ifSuccess($$1x -> $$0.a((tx)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abu b() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.b.f().a(this.n().c(dnw.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsm<?> $$0, ayo $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public drn c() {
      return this.b;
   }

   @Override
   public drq d() {
      return !this.n().b(dta.by) ? drq.a : this.n().c(dta.by);
   }

   @Override
   public void a(dcf $$0, drq $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dta.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
