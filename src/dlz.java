import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dlz extends dkg implements cxr, dmc.a {
   private static final Logger a = LogUtils.getLogger();
   private dmc b;

   public dlz(ib $$0, dmz $$1) {
      super(dki.Q, $$0, $$1);
      dmb $$2 = dmb.a;
      dmb.a $$3 = dmb.a.a;
      this.b = new dmc(this, $$2, $$3);
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
      return this.b.c().a(this.n().c(dio.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bpc<?> $$0, axd $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dmc c() {
      return this.b;
   }

   @Override
   public dmf d() {
      return !this.n().b(dnp.by) ? dmf.a : this.n().c(dnp.by);
   }

   @Override
   public void a(cwz $$0, dmf $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dnp.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
