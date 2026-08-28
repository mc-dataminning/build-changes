import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class drc extends dpi implements dcr, drg.b {
   private static final Logger a = LogUtils.getLogger();
   private drg b;

   public drc(iz $$0, dsd $$1) {
      super(dpk.Q, $$0, $$1);
      drf $$2 = drf.a;
      drf.a $$3 = drf.a.a;
      this.b = new drg(this, $$2, $$3);
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
      return this.b.f().a(this.n().c(dnp.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(btb<?> $$0, azh $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public drg c() {
      return this.b;
   }

   @Override
   public drj d() {
      return !this.n().b(dst.by) ? drj.a : this.n().c(dst.by);
   }

   @Override
   public void a(dbz $$0, drj $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dst.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
