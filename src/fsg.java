import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fsg extends fnd {
   private static final Logger q = LogUtils.getLogger();
   public static final dyx a = new dyx((long)"test1".hashCode(), true, false);
   protected final fnd b;
   private fhm r;
   private fhm s;
   private fhm u;
   private fhm v;
   protected fhv c;
   private fsl w;

   public fsg(fnd $$0) {
      super(wu.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aO_() {
      this.c = new fhv(this.o, this.m / 2 - 100, 22, 200, 20, this.c, wu.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fsl(this, this.l, this.m, this.n - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fhm.a(eqd.a, $$0 -> this.w.c().ifPresent(fsl.c::c)).a(this.m / 2 - 154, this.n - 52, 150, 20).a());
      this.c(fhm.a(wu.c("selectWorld.create"), $$0 -> fsa.a(this.l, this)).a(this.m / 2 + 4, this.n - 52, 150, 20).a());
      this.u = this.c(fhm.a(wu.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(fsl.c::f)).a(this.m / 2 - 154, this.n - 28, 72, 20).a());
      this.r = this.c(fhm.a(wu.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(fsl.c::d)).a(this.m / 2 - 76, this.n - 28, 72, 20).a());
      this.v = this.c(fhm.a(wu.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(fsl.c::h)).a(this.m / 2 + 4, this.n - 28, 72, 20).a());
      this.c(fhm.a(wt.k, $$0 -> this.l.a(this.b)).a(this.m / 2 + 82, this.n - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aD_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.l.a(this.b);
   }

   @Override
   public void a(fgz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
   }

   public void a(@Nullable eqd $$0) {
      if ($$0 == null) {
         this.s.b(eqd.a);
         this.s.j = false;
         this.u.j = false;
         this.v.j = false;
         this.r.j = false;
      } else {
         this.s.b($$0.t());
         this.s.j = $$0.u();
         this.u.j = $$0.w();
         this.v.j = $$0.x();
         this.r.j = $$0.y();
      }
   }

   @Override
   public void j() {
      if (this.w != null) {
         this.w.aF_().forEach(fsl.a::close);
      }
   }
}
