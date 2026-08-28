import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dwn extends duq implements dhu, dwq.b {
   private static final Logger a = LogUtils.getLogger();
   private dwq b;

   public dwn(jh $$0, dxo $$1) {
      super(dus.R, $$0, $$1);
      dwp $$2 = dwp.a;
      dwp.a $$3 = dwp.a.a;
      this.b = new dwq(this, $$2, $$3);
   }

   @Override
   protected void a(um $$0, js.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(va.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(um $$0, js.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(va.a), this.b)
         .ifSuccess($$1x -> $$0.a((um)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acn b() {
      return acn.a(this);
   }

   @Override
   public um a(js.a $$0) {
      return this.b.f().a(this.m().c(dsx.b));
   }

   @Override
   public void a(bvi<?> $$0, bac $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dwq c() {
      return this.b;
   }

   @Override
   public dwu d() {
      return !this.m().b(dye.bB) ? dwu.a : this.m().c(dye.bB);
   }

   @Override
   public void a(dgz $$0, dwu $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dye.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
