import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dui extends dsm implements dfv, dul.b {
   private static final Logger a = LogUtils.getLogger();
   private dul b;

   public dui(jh $$0, dvj $$1) {
      super(dso.Q, $$0, $$1);
      duk $$2 = duk.a;
      duk.a $$3 = duk.a.a;
      this.b = new dul(this, $$2, $$3);
   }

   @Override
   protected void a(uk $$0, js.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(uy.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(uk $$0, js.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(uy.a), this.b)
         .ifSuccess($$1x -> $$0.a((uk)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acl b() {
      return acl.a(this);
   }

   @Override
   public uk a(js.a $$0) {
      return this.b.f().a(this.m().c(dqt.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bul<?> $$0, azs $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dul c() {
      return this.b;
   }

   @Override
   public dup d() {
      return !this.m().b(dvz.by) ? dup.a : this.m().c(dvz.by);
   }

   @Override
   public void a(dfb $$0, dup $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dvz.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
