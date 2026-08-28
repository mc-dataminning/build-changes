import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dwt extends duw implements dic, dww.b {
   private static final Logger a = LogUtils.getLogger();
   private dww b;

   public dwt(jh $$0, dxu $$1) {
      super(duy.R, $$0, $$1);
      dwv $$2 = dwv.a;
      dwv.a $$3 = dwv.a.a;
      this.b = new dww(this, $$2, $$3);
   }

   @Override
   protected void a(ux $$0, js.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(vl.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(ux $$0, js.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(vl.a), this.b)
         .ifSuccess($$1x -> $$0.a((ux)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acy b() {
      return acy.a(this);
   }

   @Override
   public ux a(js.a $$0) {
      return this.b.f().a(this.m().c(dtd.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bvq<?> $$0, bam $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dww c() {
      return this.b;
   }

   @Override
   public dxa d() {
      return !this.m().b(dyk.bz) ? dxa.a : this.m().c(dyk.bz);
   }

   @Override
   public void a(dhh $$0, dxa $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dyk.bz, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
