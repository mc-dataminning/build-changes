import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dun extends dsr implements dga, duq.b {
   private static final Logger a = LogUtils.getLogger();
   private duq b;

   public dun(jh $$0, dvo $$1) {
      super(dst.Q, $$0, $$1);
      dup $$2 = dup.a;
      dup.a $$3 = dup.a.a;
      this.b = new duq(this, $$2, $$3);
   }

   @Override
   protected void a(un $$0, js.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(vb.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(un $$0, js.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(vb.a), this.b)
         .ifSuccess($$1x -> $$0.a((un)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public un a(js.a $$0) {
      return this.b.f().a(this.m().c(dqy.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bup<?> $$0, azv $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public duq c() {
      return this.b;
   }

   @Override
   public duu d() {
      return !this.m().b(dwe.by) ? duu.a : this.m().c(dwe.by);
   }

   @Override
   public void a(dff $$0, duu $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dwe.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
