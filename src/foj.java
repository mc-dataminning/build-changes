import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class foj extends fjo {
   private static final Logger d = LogUtils.getLogger();
   public static final dvp a = new dvp((long)"test1".hashCode(), true, false);
   protected final fjo b;
   private fdp o;
   private fdp p;
   private fdp q;
   private fdp r;
   protected fdy c;
   private foo s;

   public foj(fjo $$0) {
      super(wg.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new fdy(this.m, this.k / 2 - 100, 22, 200, 20, this.c, wg.c("selectWorld.search"));
      this.c.b($$0 -> this.s.a($$0));
      this.d(this.c);
      this.s = this.c(new foo(this, this.j, this.k, this.l - 112, 48, 36, this.c.a(), this.s));
      this.p = this.c(fdp.a(ems.a, $$0 -> this.s.d().ifPresent(foo.c::c)).a(this.k / 2 - 154, this.l - 52, 150, 20).a());
      this.c(fdp.a(wg.c("selectWorld.create"), $$0 -> fod.a(this.j, this)).a(this.k / 2 + 4, this.l - 52, 150, 20).a());
      this.q = this.c(fdp.a(wg.c("selectWorld.edit"), $$0 -> this.s.d().ifPresent(foo.c::f)).a(this.k / 2 - 154, this.l - 28, 72, 20).a());
      this.o = this.c(fdp.a(wg.c("selectWorld.delete"), $$0 -> this.s.d().ifPresent(foo.c::d)).a(this.k / 2 - 76, this.l - 28, 72, 20).a());
      this.r = this.c(fdp.a(wg.c("selectWorld.recreate"), $$0 -> this.s.d().ifPresent(foo.c::h)).a(this.k / 2 + 4, this.l - 28, 72, 20).a());
      this.c(fdp.a(wf.k, $$0 -> this.j.a(this.b)).a(this.k / 2 + 82, this.l - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aD_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.j.a(this.b);
   }

   @Override
   public void a(fdc $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.m, this.i, this.k / 2, 8, 16777215);
   }

   public void a(@Nullable ems $$0) {
      if ($$0 == null) {
         this.p.b(ems.a);
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
         this.s.aF_().forEach(foo.a::close);
      }
   }
}
