import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dta extends dre implements dem, dtd.b {
   private static final Logger a = LogUtils.getLogger();
   private dtd b;

   public dta(je $$0, dua $$1) {
      super(drg.Q, $$0, $$1);
      dtc $$2 = dtc.a;
      dtc.a $$3 = dtc.a.a;
      this.b = new dtd(this, $$2, $$3);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         uf $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(ut.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ut.a, this.b).ifSuccess($$1x -> $$0.a((uf)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acg b() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.b.f().a(this.m().c(dpl.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(btq<?> $$0, azk $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dtd c() {
      return this.b;
   }

   @Override
   public dtg d() {
      return !this.m().b(duq.by) ? dtg.a : this.m().c(duq.by);
   }

   @Override
   public void a(dds $$0, dtg $$1) {
      this.e();
      $$0.b(this.p, this.m().b(duq.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
