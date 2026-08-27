import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class doi extends dmo implements czy, dol.a {
   private static final Logger a = LogUtils.getLogger();
   private dol b;

   public doi(id $$0, dpi $$1) {
      super(dmq.Q, $$0, $$1);
      dok $$2 = dok.a;
      dok.a $$3 = dok.a.a;
      this.b = new dol(this, $$2, $$3);
   }

   @Override
   public void a(to $$0, ip.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(uc.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(to $$0, ip.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(uc.a, this.b).get().ifLeft($$1x -> $$0.a((to)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abh b() {
      return abh.a(this);
   }

   @Override
   public to a(ip.a $$0) {
      return this.b.c().a(this.n().c(dkv.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bqg<?> $$0, axt $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dol c() {
      return this.b;
   }

   @Override
   public doo d() {
      return !this.n().b(dpy.by) ? doo.a : this.n().c(dpy.by);
   }

   @Override
   public void a(czg $$0, doo $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dpy.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
