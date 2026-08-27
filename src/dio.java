import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dio extends dgv implements cuh, dir.a {
   private static final Logger a = LogUtils.getLogger();
   private dir b;

   public dio(hx $$0, djh $$1) {
      super(dgx.Q, $$0, $$1);
      diq $$2 = diq.a;
      this.b = new dir(this, $$2);
   }

   @Override
   public void a(sn $$0) {
      super.a($$0);
      this.b.a().parse(tb.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.g();
      }
   }

   @Override
   protected void b(sn $$0) {
      super.b($$0);
      this.b.a().encodeStart(tb.a, this.b).get().ifLeft($$1 -> $$0.a((sn)$$1)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public zh c() {
      return zh.a(this);
   }

   @Override
   public sn ax_() {
      return this.b.c().a(this.r().c(dfe.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(blz<?> $$0, auv $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dir d() {
      return this.b;
   }

   @Override
   public diu f() {
      return !this.r().b(djx.by) ? diu.a : this.r().c(djx.by);
   }

   @Override
   public void a(ctp $$0, diu $$1) {
      this.e();
      $$0.b(this.p, this.r().a(djx.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
