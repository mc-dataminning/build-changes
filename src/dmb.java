import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dmb extends dki implements cxt, dme.a {
   private static final Logger a = LogUtils.getLogger();
   private dme b;

   public dmb(ib $$0, dnb $$1) {
      super(dkk.Q, $$0, $$1);
      dmd $$2 = dmd.a;
      dmd.a $$3 = dmd.a.a;
      this.b = new dme(this, $$2, $$3);
   }

   @Override
   public void a(ta $$0, in.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(to.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(ta $$0, in.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(to.a, this.b).get().ifLeft($$1x -> $$0.a((ta)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aat b() {
      return aat.a(this);
   }

   @Override
   public ta a(in.a $$0) {
      return this.b.c().a(this.n().c(diq.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bpd<?> $$0, axd $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dme c() {
      return this.b;
   }

   @Override
   public dmh d() {
      return !this.n().b(dnr.by) ? dmh.a : this.n().c(dnr.by);
   }

   @Override
   public void a(cxb $$0, dmh $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dnr.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
