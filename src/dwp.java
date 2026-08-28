import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dwp extends dus implements dhu, dws.b {
   private static final Logger a = LogUtils.getLogger();
   private dws b;

   public dwp(ji $$0, dxq $$1) {
      super(duu.R, $$0, $$1);
      dwr $$2 = dwr.a;
      dwr.a $$3 = dwr.a.a;
      this.b = new dws(this, $$2, $$3);
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

   public abr b() {
      return abr.a(this);
   }

   @Override
   public tq a(jt.a $$0) {
      return this.b.f().a(this.m().c(dsz.b));
   }

   @Override
   public void a(bvi<?> $$0, azh $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.n);
         this.e();
      }
   }

   public dws c() {
      return this.b;
   }

   @Override
   public dww d() {
      return !this.m().b(dyg.bB) ? dww.a : this.m().c(dyg.bB);
   }

   @Override
   public void a(dgz $$0, dww $$1) {
      this.e();
      $$0.b(this.o, this.m().b(dyg.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
