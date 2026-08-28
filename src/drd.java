import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class drd extends dpj implements dcs, drh.b {
   private static final Logger a = LogUtils.getLogger();
   private drh b;

   public drd(iz $$0, dse $$1) {
      super(dpl.Q, $$0, $$1);
      drg $$2 = drg.a;
      drg.a $$3 = drg.a.a;
      this.b = new drh(this, $$2, $$3);
   }

   @Override
   protected void a(us $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         us $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(vg.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(us $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(vg.a, this.b).ifSuccess($$1x -> $$0.a((us)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acp b() {
      return acp.a(this);
   }

   @Override
   public us a(jk.a $$0) {
      return this.b.f().a(this.n().c(dnq.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(btc<?> $$0, azh $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public drh c() {
      return this.b;
   }

   @Override
   public drk d() {
      return !this.n().b(dsu.by) ? drk.a : this.n().c(dsu.by);
   }

   @Override
   public void a(dca $$0, drk $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dsu.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
