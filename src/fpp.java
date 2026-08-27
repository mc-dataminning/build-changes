import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpp extends fkt {
   private static final Logger d = LogUtils.getLogger();
   public static final dwo a = new dwo((long)"test1".hashCode(), true, false);
   protected final fkt b;
   private feu r;
   private feu s;
   private feu u;
   private feu v;
   protected ffd c;
   private fpu w;

   public fpp(fkt $$0) {
      super(ws.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new ffd(this.p, this.n / 2 - 100, 22, 200, 20, this.c, ws.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fpu(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(feu.a(enr.a, $$0 -> this.w.d().ifPresent(fpu.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(feu.a(ws.c("selectWorld.create"), $$0 -> fpj.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(feu.a(ws.c("selectWorld.edit"), $$0 -> this.w.d().ifPresent(fpu.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(feu.a(ws.c("selectWorld.delete"), $$0 -> this.w.d().ifPresent(fpu.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(feu.a(ws.c("selectWorld.recreate"), $$0 -> this.w.d().ifPresent(fpu.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(feu.a(wr.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aC_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(feh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable enr $$0) {
      if ($$0 == null) {
         this.s.b(enr.a);
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
         this.w.aE_().forEach(fpu.a::close);
      }
   }
}
