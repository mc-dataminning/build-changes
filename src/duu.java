import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class duu extends dsy implements dgh, dux.b {
   private static final Logger a = LogUtils.getLogger();
   private dux b;

   public duu(jh $$0, dvv $$1) {
      super(dta.Q, $$0, $$1);
      duw $$2 = duw.a;
      duw.a $$3 = duw.a.a;
      this.b = new dux(this, $$2, $$3);
   }

   @Override
   protected void a(ul $$0, js.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(uz.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(ul $$0, js.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(uz.a), this.b)
         .ifSuccess($$1x -> $$0.a((ul)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acm b() {
      return acm.a(this);
   }

   @Override
   public ul a(js.a $$0) {
      return this.b.f().a(this.m().c(drf.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(bus<?> $$0, azu $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dux c() {
      return this.b;
   }

   @Override
   public dvb d() {
      return !this.m().b(dwl.by) ? dvb.a : this.m().c(dwl.by);
   }

   @Override
   public void a(dfm $$0, dvb $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dwl.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
