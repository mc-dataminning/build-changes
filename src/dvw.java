import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dvw extends dtz implements dhd, dvz.b {
   private static final Logger a = LogUtils.getLogger();
   private dvz b;

   public dvw(ji $$0, dwx $$1) {
      super(dub.R, $$0, $$1);
      dvy $$2 = dvy.a;
      dvy.a $$3 = dvy.a.a;
      this.b = new dvz(this, $$2, $$3);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(ue.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tq $$0, jt.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(ue.a), this.b)
         .ifSuccess($$1x -> $$0.a((tq)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abs b() {
      return abs.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.b.f().a(this.m().c(dsg.b));
   }

   @Override
   public void a(bus<?> $$0, azh $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.n);
         this.e();
      }
   }

   public dvz c() {
      return this.b;
   }

   @Override
   public dwd d() {
      return !this.m().b(dxn.bB) ? dwd.a : this.m().c(dxn.bB);
   }

   @Override
   public void a(dgi $$0, dwd $$1) {
      this.e();
      $$0.b(this.o, this.m().b(dxn.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
