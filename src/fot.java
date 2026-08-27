import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fot extends fjx {
   private static final Logger d = LogUtils.getLogger();
   public static final dvy a = new dvy((long)"test1".hashCode(), true, false);
   protected final fjx b;
   private fdy o;
   private fdy p;
   private fdy q;
   private fdy r;
   protected feh c;
   private foy s;

   public fot(fjx $$0) {
      super(wi.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new feh(this.m, this.k / 2 - 100, 22, 200, 20, this.c, wi.c("selectWorld.search"));
      this.c.b($$0 -> this.s.a($$0));
      this.d(this.c);
      this.s = this.c(new foy(this, this.j, this.k, this.l - 112, 48, 36, this.c.a(), this.s));
      this.p = this.c(fdy.a(enb.a, $$0 -> this.s.d().ifPresent(foy.c::c)).a(this.k / 2 - 154, this.l - 52, 150, 20).a());
      this.c(fdy.a(wi.c("selectWorld.create"), $$0 -> fom.a(this.j, this)).a(this.k / 2 + 4, this.l - 52, 150, 20).a());
      this.q = this.c(fdy.a(wi.c("selectWorld.edit"), $$0 -> this.s.d().ifPresent(foy.c::f)).a(this.k / 2 - 154, this.l - 28, 72, 20).a());
      this.o = this.c(fdy.a(wi.c("selectWorld.delete"), $$0 -> this.s.d().ifPresent(foy.c::d)).a(this.k / 2 - 76, this.l - 28, 72, 20).a());
      this.r = this.c(fdy.a(wi.c("selectWorld.recreate"), $$0 -> this.s.d().ifPresent(foy.c::h)).a(this.k / 2 + 4, this.l - 28, 72, 20).a());
      this.c(fdy.a(wh.k, $$0 -> this.j.a(this.b)).a(this.k / 2 + 82, this.l - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aC_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.j.a(this.b);
   }

   @Override
   public void a(fdl $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 8, 16777215);
   }

   public void a(@Nullable enb $$0) {
      if ($$0 == null) {
         this.p.b(enb.a);
         this.p.j = false;
         this.q.j = false;
         this.r.j = false;
         this.o.j = false;
      } else {
         this.p.b($$0.t());
         this.p.j = $$0.u();
         this.q.j = $$0.w();
         this.r.j = $$0.x();
         this.o.j = $$0.y();
      }
   }

   @Override
   public void j() {
      if (this.s != null) {
         this.s.aE_().forEach(foy.a::close);
      }
   }
}
