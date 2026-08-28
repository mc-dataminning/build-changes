import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dvv extends dty implements dhc, dvy.b {
   private static final Logger a = LogUtils.getLogger();
   private dvy b;

   public dvv(ji $$0, dww $$1) {
      super(dua.R, $$0, $$1);
      dvx $$2 = dvx.a;
      dvx.a $$3 = dvx.a.a;
      this.b = new dvy(this, $$2, $$3);
   }

   @Override
   protected void a(tq $$0, jt.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(ue.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
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
      return this.b.f().a(this.m().c(dsf.b));
   }

   @Override
   public void a(bur<?> $$0, azh $$1) {
      if (this.o == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.o);
         this.e();
      }
   }

   public dvy c() {
      return this.b;
   }

   @Override
   public dwc d() {
      return !this.m().b(dxm.bB) ? dwc.a : this.m().c(dxm.bB);
   }

   @Override
   public void a(dgh $$0, dwc $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dxm.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
