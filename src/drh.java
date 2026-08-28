import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class drh extends dpn implements dcw, drk.b {
   private static final Logger a = LogUtils.getLogger();
   private drk b;

   public drh(ja $$0, dsh $$1) {
      super(dpp.Q, $$0, $$1);
      drj $$2 = drj.a;
      drj.a $$3 = drj.a.a;
      this.b = new drk(this, $$2, $$3);
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
      return this.b.f().a(this.n().c(dnu.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsj<?> $$0, aym $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public drk c() {
      return this.b;
   }

   @Override
   public drn d() {
      return !this.n().b(dsx.by) ? drn.a : this.n().c(dsx.by);
   }

   @Override
   public void a(dcd $$0, drn $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dsx.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
