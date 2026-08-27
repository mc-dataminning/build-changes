import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dnz extends dmf implements czp, doc.a {
   private static final Logger a = LogUtils.getLogger();
   private doc b;

   public dnz(ib $$0, doz $$1) {
      super(dmh.Q, $$0, $$1);
      dob $$2 = dob.a;
      dob.a $$3 = dob.a.a;
      this.b = new doc(this, $$2, $$3);
   }

   @Override
   public void a(tm $$0, in.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(ua.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(tm $$0, in.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ua.a, this.b).get().ifLeft($$1x -> $$0.a((tm)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abf b() {
      return abf.a(this);
   }

   @Override
   public tm a(in.a $$0) {
      return this.b.c().a(this.n().c(dkm.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bqb<?> $$0, axr $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public doc c() {
      return this.b;
   }

   @Override
   public dof d() {
      return !this.n().b(dpp.by) ? dof.a : this.n().c(dpp.by);
   }

   @Override
   public void a(cyx $$0, dof $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dpp.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
