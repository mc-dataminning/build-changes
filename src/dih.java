import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class dih extends dgo implements cua, dik.a {
   private static final Logger a = LogUtils.getLogger();
   private dik b;

   public dih(hx $$0, dja $$1) {
      super(dgq.Q, $$0, $$1);
      dij $$2 = dij.a;
      this.b = new dik(this, $$2);
   }

   @Override
   public void a(sl $$0) {
      super.a($$0);
      this.b.a().parse(sz.a, $$0).resultOrPartial(a::error).ifPresent($$0x -> this.b = $$0x);
      if (this.o != null) {
         this.g();
      }
   }

   @Override
   protected void b(sl $$0) {
      super.b($$0);
      this.b.a().encodeStart(sz.a, this.b).get().ifLeft($$1 -> $$0.a((sl)$$1)).ifRight($$0x -> a.warn("Failed to encode TrialSpawner {}", $$0x.message()));
   }

   public ze c() {
      return ze.a(this);
   }

   @Override
   public sl ax_() {
      return this.b.c().a(this.r().c(dex.b));
   }

   @Override
   public boolean u() {
      return true;
   }

   @Override
   public void a(blt<?> $$0, aup $$1) {
      this.b.c().a(this.b, $$1, $$0);
      this.e();
   }

   public dik d() {
      return this.b;
   }

   @Override
   public din f() {
      return !this.r().b(djq.by) ? din.a : this.r().c(djq.by);
   }

   @Override
   public void a(cti $$0, din $$1) {
      this.e();
      $$0.b(this.p, this.r().a(djq.by, $$1));
   }

   @Override
   public void g() {
      this.e();
      if (this.o != null) {
         this.o.a(this.p, this.r(), this.r(), 3);
      }
   }
}
