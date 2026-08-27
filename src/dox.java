import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dox extends dnd implements dam, dpb.a {
   private static final Logger a = LogUtils.getLogger();
   private dpb b;

   public dox(im $$0, dpy $$1) {
      super(dnf.Q, $$0, $$1);
      dpa $$2 = dpa.a;
      dpa.a $$3 = dpa.a.a;
      this.b = new dpb(this, $$2, $$3);
   }

   @Override
   public void a(ty $$0, ix.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(um.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(ty $$0, ix.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(um.a, this.b).get().ifLeft($$1x -> $$0.a((ty)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abr b() {
      return abr.a(this);
   }

   @Override
   public ty a(ix.a $$0) {
      return this.b.c().a(this.n().c(dlk.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bqr<?> $$0, ayd $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dpb c() {
      return this.b;
   }

   @Override
   public dpe d() {
      return !this.n().b(dqo.by) ? dpe.a : this.n().c(dqo.by);
   }

   @Override
   public void a(czu $$0, dpe $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dqo.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
