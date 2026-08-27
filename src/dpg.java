import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dpg extends dnm implements dav, dpk.a {
   private static final Logger a = LogUtils.getLogger();
   private dpk b;

   public dpg(in $$0, dqh $$1) {
      super(dno.Q, $$0, $$1);
      dpj $$2 = dpj.a;
      dpj.a $$3 = dpj.a.a;
      this.b = new dpk(this, $$2, $$3);
   }

   @Override
   public void a(ua $$0, iy.a $$1) {
      super.a($$0, $$1);
      this.b.a().parse(uo.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.n != null) {
         this.f();
      }
   }

   @Override
   protected void b(ua $$0, iy.a $$1) {
      super.b($$0, $$1);
      this.b.a().encodeStart(uo.a, this.b).get().ifLeft($$1x -> $$0.a((ua)$$1x)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public abt b() {
      return abt.a(this);
   }

   @Override
   public ua a(iy.a $$0) {
      return this.b.c().a(this.n().c(dlt.b));
   }

   @Override
   public boolean q() {
      return true;
   }

   @Override
   public void a(brn<?> $$0, ayg $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dpk c() {
      return this.b;
   }

   @Override
   public dpn d() {
      return !this.n().b(dqx.by) ? dpn.a : this.n().c(dqx.by);
   }

   @Override
   public void a(dad $$0, dpn $$1) {
      this.e();
      $$0.b(this.o, this.n().a(dqx.by, $$1));
   }

   @Override
   public void f() {
      this.e();
      if (this.n != null) {
         this.n.a(this.o, this.n(), this.n(), 3);
      }
   }
}
