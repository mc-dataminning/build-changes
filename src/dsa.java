import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dsa extends dqf implements ddn, dsd.b {
   private static final Logger a = LogUtils.getLogger();
   private dsd b;

   public dsa(jd $$0, dta $$1) {
      super(dqh.Q, $$0, $$1);
      dsc $$2 = dsc.a;
      dsc.a $$3 = dsc.a.a;
      this.b = new dsd(this, $$2, $$3);
   }

   @Override
   protected void a(ua $$0, jo.a $$1) {
      super.a($$0, $$1);
      if ($$0.e("normal_config")) {
         ua $$2 = $$0.p("normal_config").i();
         $$0.a("ominous_config", $$2.a($$0.p("ominous_config")));
      }

      this.b.a().parse(uo.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ua $$0, jo.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(uo.a, this.b).ifSuccess($$1x -> $$0.a((ua)$$1x)).ifError($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aca b() {
      return aca.a(this);
   }

   @Override
   public ua a(jo.a $$0) {
      return this.b.f().a(this.n().c(dom.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bsw<?> $$0, ayv $$1) {
      this.b.f().a(this.b, $$1, $$0);
      this.e();
   }

   public dsd c() {
      return this.b;
   }

   @Override
   public dsg d() {
      return !this.n().b(dtq.by) ? dsg.a : this.n().c(dtq.by);
   }

   @Override
   public void a(dcu $$0, dsg $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dtq.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
