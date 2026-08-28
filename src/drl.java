import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class drl extends dpq implements dcz, dro.b {
   private static final Logger a = LogUtils.getLogger();
   private dro b;

   public drl(ja $$0, dsl $$1) {
      super(dps.Q, $$0, $$1);
      drn $$2 = drn.a;
      drn.a $$3 = drn.a.a;
      this.b = new dro(this, $$2, $$3);
   }

   @Override
   protected void a(tx $$0, jl.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         tx $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(ul.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(tx $$0, jl.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ul.a, this.b).ifSuccess($$1x -> $$0.a((tx)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abu b() {
      return abu.a(this);
   }

   @Override
   public tx a(jl.a $$0) {
      return this.b.f().a(this.n().c(dnx.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsn<?> $$0, ayo $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dro c() {
      return this.b;
   }

   @Override
   public drr d() {
      return !this.n().b(dtb.by) ? drr.a : this.n().c(dtb.by);
   }

   @Override
   public void a(dcg $$0, drr $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dtb.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
