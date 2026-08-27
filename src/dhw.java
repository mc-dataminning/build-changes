import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dhw extends dgd implements ctq, dhz.a {
   private static final Logger a = LogUtils.getLogger();
   private dhz b;

   public dhw(hv $$0, dip $$1) {
      super(dgf.Q, $$0, $$1);
      dhy $$2 = dhy.a;
      this.b = new dhz(this, $$2);
   }

   @Override
   public void a(sj $$0) {
      super.a($$0);
      this.b.a().parse(sx.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.g();
      }
   }

   @Override
   protected void b(sj $$0) {
      super.b($$0);
      this.b.a().encodeStart(sx.a, this.b).get().ifLeft($$1 -> $$0.a((sj)$$1)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public yv c() {
      return yv.a(this);
   }

   @Override
   public sj ax_() {
      return this.b.c().a(this.r().c(den.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(blj<?> $$0, auf $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dhz d() {
      return this.b;
   }

   @Override
   public dic f() {
      return !this.r().b(djf.by) ? dic.a : this.r().c(djf.by);
   }

   @Override
   public void a(csy $$0, dic $$1) {
      this.e();
      $$0.b(this.p, this.r().a(djf.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
