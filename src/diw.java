import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class diw extends dhd implements cup, diz.a {
   private static final Logger a = LogUtils.getLogger();
   private diz b;

   public diw(hx $$0, djp $$1) {
      super(dhf.Q, $$0, $$1);
      diy $$2 = diy.a;
      this.b = new diz(this, $$2);
   }

   @Override
   public void a(so $$0) {
      super.a($$0);
      this.b.a().parse(tc.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.g();
      }
   }

   @Override
   protected void b(so $$0) {
      super.b($$0);
      this.b.a().encodeStart(tc.a, this.b).get().ifLeft($$1 -> $$0.a((so)$$1)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public zi c() {
      return zi.a(this);
   }

   @Override
   public so aA_() {
      return this.b.c().a(this.r().c(dfm.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bmc<?> $$0, auw $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public diz d() {
      return this.b;
   }

   @Override
   public djc f() {
      return !this.r().b(dkf.by) ? djc.a : this.r().c(dkf.by);
   }

   @Override
   public void a(ctx $$0, djc $$1) {
      this.e();
      $$0.b(this.p, this.r().a(dkf.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
