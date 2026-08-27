import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fii extends fdm {
   private static final Logger k = LogUtils.getLogger();
   public static final dpw a = new dpw((long)"test1".hashCode(), true, false);
   protected final fdm b;
   private exr l;
   private exr m;
   private exr n;
   private exr o;
   protected eya c;
   private fin p;

   public fii(fdm $$0) {
      super(vg.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aP_() {
      this.c = new eya(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vg.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.e(this.c);
      this.p = this.d(new fin(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.d(exr.a(egw.a, $$0 -> this.p.d().ifPresent(fin.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(exr.a(vg.c("selectWorld.create"), $$0 -> fic.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(exr.a(vg.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fin.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(exr.a(vg.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fin.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(exr.a(vg.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fin.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(exr.a(vf.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
      this.c(this.c);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   public void a(exe $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable egw $$0) {
      if ($$0 == null) {
         this.m.b(egw.a);
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
   public void k() {
      if (this.p != null) {
         this.p.l().forEach(fin.a::close);
      }
   }
}
