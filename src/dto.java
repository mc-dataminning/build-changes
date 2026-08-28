import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dto extends drs implements dfa, dtr.b {
   private static final Logger a = LogUtils.getLogger();
   private dtr b;

   public dto(je $$0, duo $$1) {
      super(dru.Q, $$0, $$1);
      dtq $$2 = dtq.a;
      dtq.a $$3 = dtq.a.a;
      this.b = new dtr(this, $$2, $$3);
   }

   @Override
   protected void a(uf $$0, jp.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         uf $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(ut.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(uf $$0, jp.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(ut.a, this.b).ifSuccess($$1x -> $$0.a((uf)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public acg b() {
      return acg.a(this);
   }

   @Override
   public uf a(jp.a $$0) {
      return this.b.f().a(this.m().c(dpz.b));
   }

   @Override
   public boolean p() {
      return true;
   }

   @Override
   public void a(btv<?> $$0, azl $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dtr c() {
      return this.b;
   }

   @Override
   public dtu d() {
      return !this.m().b(dve.by) ? dtu.a : this.m().c(dve.by);
   }

   @Override
   public void a(deg $$0, dtu $$1) {
      this.e();
      $$0.b(this.p, this.m().b(dve.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.m(), this.m(), 3);
      }
   }
}
