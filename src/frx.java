import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class frx extends fnc {
   private static final Logger d = LogUtils.getLogger();
   public static final dyr a = new dyr((long)"test1".hashCode(), true, false);
   protected final fnc b;
   private fhd r;
   private fhd s;
   private fhd u;
   private fhd v;
   protected fhm c;
   private fsc w;

   public frx(fnc $$0) {
      super(xo.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new fhm(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xo.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fsc(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fhd.a(epw.a, $$0 -> this.w.c().ifPresent(fsc.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fhd.a(xo.c("selectWorld.create"), $$0 -> frr.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(fhd.a(xo.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(fsc.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(fhd.a(xo.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(fsc.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(fhd.a(xo.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(fsc.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fhd.a(xn.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fgq $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable epw $$0) {
      if ($$0 == null) {
         this.s.b(epw.a);
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
         this.w.aD_().forEach(fsc.a::close);
      }
   }
}
