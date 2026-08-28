import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class duc extends dsg implements dfp, duf.b {
   private static final Logger a = LogUtils.getLogger();
   private duf b;

   public duc(jg $$0, dvd $$1) {
      super(dsi.Q, $$0, $$1);
      due $$2 = due.a;
      due.a $$3 = due.a.a;
      this.b = new duf(this, $$2, $$3);
   }

   @Override
   protected void a(uj $$0, jr.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(ux.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(uj $$0, jr.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(ux.a), this.b)
         .ifSuccess($$1x -> $$0.a((uj)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public ack b() {
      return ack.a(this);
   }

   @Override
   public uj a(jr.a $$0) {
      return this.b.f().a(this.m().c(dqn.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bug<?> $$0, azr $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public duf c() {
      return this.b;
   }

   @Override
   public duj d() {
      return !this.m().b(dvt.by) ? duj.a : this.m().c(dvt.by);
   }

   @Override
   public void a(dev $$0, duj $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dvt.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
