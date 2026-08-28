import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frt extends fmy {
   private static final Logger d = LogUtils.getLogger();
   public static final dyn a = new dyn((long)"test1".hashCode(), true, false);
   protected final fmy b;
   private fgz r;
   private fgz s;
   private fgz u;
   private fgz v;
   protected fhi c;
   private fry w;

   public frt(fmy $$0) {
      super(xl.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new fhi(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xl.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fry(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fgz.a(eps.a, $$0 -> this.w.d().ifPresent(fry.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fgz.a(xl.c("selectWorld.create"), $$0 -> frn.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(fgz.a(xl.c("selectWorld.edit"), $$0 -> this.w.d().ifPresent(fry.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(fgz.a(xl.c("selectWorld.delete"), $$0 -> this.w.d().ifPresent(fry.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(fgz.a(xl.c("selectWorld.recreate"), $$0 -> this.w.d().ifPresent(fry.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fgz.a(xk.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aD_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(fgm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eps $$0) {
      if ($$0 == null) {
         this.s.b(eps.a);
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
         this.w.aF_().forEach(fry.a::close);
      }
   }
}
