import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dxl extends dvl implements dik, dxo.b {
   private static final Logger a = LogUtils.getLogger();
   private dxo b;

   public dxl(jj $$0, dym $$1) {
      super(dvn.R, $$0, $$1);
      dxn $$2 = dxn.a;
      dxn.a $$3 = dxn.a.a;
      this.b = new dxo(this, $$2, $$3);
   }

   @Override
   protected void a(tw $$0, ju.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(uk.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tw $$0, ju.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(uk.a), this.b)
         .ifSuccess($$1x -> $$0.a((tw)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abx a() {
      return abx.a(this);
   }

   @Override
   public tw a(ju.a $$0) {
      return this.b.f().a(this.m().c(dtr.b));
   }

   @Override
   public void a(bwb<?> $$0, azs $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.n);
         this.e();
      }
   }

   public dxo c() {
      return this.b;
   }

   @Override
   public dxs d() {
      return !this.m().b(dzc.bB) ? dxs.a : this.m().c(dzc.bB);
   }

   @Override
   public void a(dhp $$0, dxs $$1) {
      this.e();
      $$0.b(this.o, this.m().b(dzc.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
