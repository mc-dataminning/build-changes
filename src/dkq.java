import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dkq extends dix implements cwj, dkt.a {
   private static final Logger a = LogUtils.getLogger();
   private dkt b;

   public dkq(hz $$0, dlj $$1) {
      super(diz.Q, $$0, $$1);
      dks $$2 = dks.a;
      this.b = new dkt(this, $$2);
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
      return this.b.c().a(this.r().c(dhg.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bnw<?> $$0, awp $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dkt d() {
      return this.b;
   }

   @Override
   public dkw f() {
      return !this.r().b(dlz.by) ? dkw.a : this.r().c(dlz.by);
   }

   @Override
   public void a(cvr $$0, dkw $$1) {
      this.e();
      $$0.b(this.p, this.r().a(dlz.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
