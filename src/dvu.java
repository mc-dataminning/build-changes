import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dvu extends dtx implements dhb, dvx.b {
   private static final Logger a = LogUtils.getLogger();
   private dvx b;

   public dvu(ji $$0, dwv $$1) {
      super(dtz.R, $$0, $$1);
      dvw $$2 = dvw.a;
      dvw.a $$3 = dvw.a.a;
      this.b = new dvx(this, $$2, $$3);
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

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.b.f().a(this.m().c(dse.b));
   }

   @Override
   public void a(buq<?> $$0, azg $$1) {
      if (this.o == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.o);
         this.e();
      }
   }

   public dvx c() {
      return this.b;
   }

   @Override
   public dwb d() {
      return !this.m().b(dxl.bB) ? dwb.a : this.m().c(dxl.bB);
   }

   @Override
   public void a(dgg $$0, dwb $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dxl.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
