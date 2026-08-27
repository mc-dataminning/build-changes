import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dkm extends dit implements cwf, dkp.a {
   private static final Logger a = LogUtils.getLogger();
   private dkp b;

   public dkm(hz $$0, dlf $$1) {
      super(div.Q, $$0, $$1);
      dko $$2 = dko.a;
      this.b = new dkp(this, $$2);
   }

   @Override
   public void a(sw $$0) {
      super.a($$0);
      this.b.a().parse(tk.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.g();
      }
   }

   @Override
   protected void b(sw $$0) {
      super.b($$0);
      this.b.a().encodeStart(tk.a, this.b).get().ifLeft($$1 -> $$0.a((sw)$$1)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aan c() {
      return aan.a(this);
   }

   @Override
   public sw aA_() {
      return this.b.c().a(this.r().c(dhc.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bnu<?> $$0, awo $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dkp d() {
      return this.b;
   }

   @Override
   public dks f() {
      return !this.r().b(dlv.by) ? dks.a : this.r().c(dlv.by);
   }

   @Override
   public void a(cvn $$0, dks $$1) {
      this.e();
      $$0.b(this.p, this.r().a(dlv.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
