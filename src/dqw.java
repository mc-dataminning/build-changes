import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dqw extends dpc implements dcl, dra.b {
   private static final Logger a = LogUtils.getLogger();
   private dra b;

   public dqw(iz $$0, drx $$1) {
      super(dpe.Q, $$0, $$1);
      dqz $$2 = dqz.a;
      dqz.a $$3 = dqz.a.a;
      this.b = new dra(this, $$2, $$3);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         ur $$2 = $$0.p("normal_config").h();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(vf.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(vf.a, this.b).ifSuccess($$1x -> $$0.a((ur)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acl b() {
      return acl.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.b.f().a(this.n().c(dnj.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsv<?> $$0, azc $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dra c() {
      return this.b;
   }

   @Override
   public drd d() {
      return !this.n().b(dsn.by) ? drd.a : this.n().c(dsn.by);
   }

   @Override
   public void a(dbt $$0, drd $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dsn.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
