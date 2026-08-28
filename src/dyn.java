import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dyn extends dwn implements djk, dyq.b {
   private static final Logger a = LogUtils.getLogger();
   private dyq b;

   public dyn(iu $$0, dzo $$1) {
      super(dwp.R, $$0, $$1);
      dyp $$2 = dyp.a;
      dyp.a $$3 = dyp.a.a;
      this.b = new dyq(this, $$2, $$3);
   }

   @Override
   protected void a(tx $$0, jg.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse($$1.a(ul.a), $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tx $$0, jg.a $$1) {
      super.b($$0, $$1);
      this.b
         .a()
         .encodeStart($$1.a(ul.a), this.b)
         .ifSuccess($$1x -> $$0.a((tx)$$1x))
         .ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aby a() {
      return aby.a(this);
   }

   @Override
   public tx a(jg.a $$0) {
      return this.b.f().a(this.m().c(dus.b));
   }

   @Override
   public void a(bwj<?> $$0, azt $$1) {
      if (this.n == null) {
         af.b("Expected non-null level");
      } else {
         this.b.a($$0, this.n);
         this.e();
      }
   }

   public dyq c() {
      return this.b;
   }

   @Override
   public dyu d() {
      return !this.m().b(eae.bB) ? dyu.a : this.m().c(eae.bB);
   }

   @Override
   public void a(dip $$0, dyu $$1) {
      this.e();
      $$0.b(this.o, this.m().b(eae.bB, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.m(), this.m(), 3);
      }
   }
}
