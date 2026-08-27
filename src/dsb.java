import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dsb extends dqc implements dcs, dsf.a {
   private static final Logger a = LogUtils.getLogger();
   private dsf b;

   public dsb(ir $$0, dtc $$1) {
      super(dqe.R, $$0, $$1);
      dse $$2 = dse.a;
      dse.a $$3 = dse.a.a;
      this.b = new dsf(this, $$2, $$3);
   }

   @Override
   public void a(uk $$0, jc.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(uy.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(uk $$0, jc.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(uy.a, this.b).get().ifLeft($$1x -> $$0.a((uk)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public ace b() {
      return ace.a(this);
   }

   @Override
   public uk a(jc.a $$0) {
      return this.b.c().a(this.n().c(dog.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsb<?> $$0, ayt $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dsf c() {
      return this.b;
   }

   @Override
   public dsi d() {
      return !this.n().b(dts.by) ? dsi.a : this.n().c(dts.by);
   }

   @Override
   public void a(dca $$0, dsi $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dts.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
