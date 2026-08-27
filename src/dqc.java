import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dqc extends doi implements dbr, dqg.b {
   private static final Logger a = LogUtils.getLogger();
   private dqg b;

   public dqc(io $$0, drd $$1) {
      super(dok.Q, $$0, $$1);
      dqf $$2 = dqf.a;
      dqf.a $$3 = dqf.a.a;
      this.b = new dqg(this, $$2, $$3);
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
      return this.b.f().a(this.n().c(dmp.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsc<?> $$0, aym $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dqg c() {
      return this.b;
   }

   @Override
   public dqj d() {
      return !this.n().b(drt.by) ? dqj.a : this.n().c(drt.by);
   }

   @Override
   public void a(daz $$0, dqj $$1) {
      this.e();
      $$0.b(this.o, this.n().a(drt.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
