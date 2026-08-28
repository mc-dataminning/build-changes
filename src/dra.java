import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dra extends dpg implements dcp, dre.b {
   private static final Logger a = LogUtils.getLogger();
   private dre b;

   public dra(iz $$0, dsb $$1) {
      super(dpi.Q, $$0, $$1);
      drd $$2 = drd.a;
      drd.a $$3 = drd.a.a;
      this.b = new dre(this, $$2, $$3);
   }

   @Override
   protected void a(ur $$0, jk.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         ur $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(vf.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ur $$0, jk.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(vf.a, this.b).ifSuccess($$1x -> $$0.a((ur)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aco b() {
      return aco.a(this);
   }

   @Override
   public ur a(jk.a $$0) {
      return this.b.f().a(this.n().c(dnn.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsz<?> $$0, azg $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dre c() {
      return this.b;
   }

   @Override
   public drh d() {
      return !this.n().b(dsr.by) ? drh.a : this.n().c(dsr.by);
   }

   @Override
   public void a(dbx $$0, drh $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dsr.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
