import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhw extends fda {
   private static final Logger k = LogUtils.getLogger();
   public static final dpn a = new dpn((long)"test1".hashCode(), true, false);
   protected final fda b;
   private exf l;
   private exf m;
   private exf n;
   private exf o;
   protected exo c;
   private fib p;

   public fhw(fda $$0) {
      super(vf.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new exo(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vf.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.e(this.c);
      this.p = this.d(new fib(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.d(exf.a(egm.a, $$0 -> this.p.d().ifPresent(fib.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(exf.a(vf.c("selectWorld.create"), $$0 -> fhq.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(exf.a(vf.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fib.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(exf.a(vf.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fib.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(exf.a(vf.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fib.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(exf.a(ve.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
      this.c(this.c);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   public void a(ewt $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable egm $$0) {
      if ($$0 == null) {
         this.m.b(egm.a);
         this.m.j = false;
         this.n.j = false;
         this.o.j = false;
         this.l.j = false;
      } else {
         this.m.b($$0.t());
         this.m.j = $$0.u();
         this.n.j = $$0.v();
         this.o.j = $$0.w();
         this.l.j = $$0.x();
      }
   }

   @Override
   public void j() {
      if (this.p != null) {
         this.p.l().forEach(fib.a::close);
      }
   }
}
