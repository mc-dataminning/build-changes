import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class din extends dgu implements cug, diq.a {
   private static final Logger a = LogUtils.getLogger();
   private diq b;

   public din(hx $$0, djg $$1) {
      super(dgw.Q, $$0, $$1);
      dip $$2 = dip.a;
      this.b = new diq(this, $$2);
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
      return this.b.c().a(this.r().c(dfd.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(bly<?> $$0, auu $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public diq d() {
      return this.b;
   }

   @Override
   public dit f() {
      return !this.r().b(djw.by) ? dit.a : this.r().c(djw.by);
   }

   @Override
   public void a(cto $$0, dit $$1) {
      this.e();
      $$0.b(this.p, this.r().a(djw.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
