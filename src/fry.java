import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fry extends fnd {
   private static final Logger d = LogUtils.getLogger();
   public static final dys a = new dys((long)"test1".hashCode(), true, false);
   protected final fnd b;
   private fhe r;
   private fhe s;
   private fhe u;
   private fhe v;
   protected fhn c;
   private fsd w;

   public fry(fnd $$0) {
      super(xp.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new fhn(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xp.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fsd(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fhe.a(epx.a, $$0 -> this.w.c().ifPresent(fsd.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fhe.a(xp.c("selectWorld.create"), $$0 -> frs.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(fhe.a(xp.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(fsd.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(fhe.a(xp.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(fsd.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(fhe.a(xp.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(fsd.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fhe.a(xo.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aB_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(fgr $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable epx $$0) {
      if ($$0 == null) {
         this.s.b(epx.a);
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
         this.w.aD_().forEach(fsd.a::close);
      }
   }
}
