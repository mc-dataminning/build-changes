import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dtr extends drv implements dfd, dtu.b {
   private static final Logger a = LogUtils.getLogger();
   private dtu b;

   public dtr(jf $$0, dus $$1) {
      super(drx.Q, $$0, $$1);
      dtt $$2 = dtt.a;
      dtt.a $$3 = dtt.a.a;
      this.b = new dtu(this, $$2, $$3);
   }

   @Override
   protected void a(ug $$0, jq.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(uu.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(ug $$0, jq.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(uu.a), this.b)
         .ifSuccess($$1x -> $$0.a((ug)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public ach b() {
      return ach.a(this);
   }

   @Override
   public ug a(jq.a $$0) {
      return this.b.f().a(this.m().c(dqc.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bty<?> $$0, azn $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dtu c() {
      return this.b;
   }

   @Override
   public dty d() {
      return !this.m().b(dvi.by) ? dty.a : this.m().c(dvi.by);
   }

   @Override
   public void a(dej $$0, dty $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dvi.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
