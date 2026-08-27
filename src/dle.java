import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dle extends djl implements cww, dlh.a {
   private static final Logger a = LogUtils.getLogger();
   private dlh b;

   public dle(ib $$0, dme $$1) {
      super(djn.Q, $$0, $$1);
      dlg $$2 = dlg.a;
      dlg.a $$3 = dlg.a.a;
      this.b = new dlh(this, $$2, $$3);
   }

   @Override
   public void a(sy $$0, in.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(tm.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.f();
      }
   }

   @Override
   protected void b(sy $$0, in.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(tm.a, this.b).get().ifLeft($$1x -> $$0.a((sy)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public aap b() {
      return aap.a(this);
   }

   @Override
   public sy a(in.a $$0) {
      return this.b.c().a(this.n().c(dht.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(bol<?> $$0, awt $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dlh c() {
      return this.b;
   }

   @Override
   public dlk d() {
      return !this.n().b(dmu.by) ? dlk.a : this.n().c(dmu.by);
   }

   @Override
   public void a(cwe $$0, dlk $$1) {
      this.e();
      $$0.b(this.p, this.n().a(dmu.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.n(), this.n(), 3);
      }
   }
}
