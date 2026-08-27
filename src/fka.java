import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fka extends ffe {
   private static final Logger k = LogUtils.getLogger();
   public static final drm a = new drm((long)"test1".hashCode(), true, false);
   protected final ffe b;
   private ezh l;
   private ezh m;
   private ezh n;
   private ezh o;
   protected ezq c;
   private fkf p;

   public fka(ffe $$0) {
      super(vq.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aQ_() {
      this.c = new ezq(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vq.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.e(this.c);
      this.p = this.d(new fkf(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.d(ezh.a(eim.a, $$0 -> this.p.d().ifPresent(fkf.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(ezh.a(vq.c("selectWorld.create"), $$0 -> fju.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(ezh.a(vq.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fkf.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(ezh.a(vq.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fkf.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(ezh.a(vq.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fkf.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(ezh.a(vp.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aH_() {
      this.c(this.c);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   public void a(eyu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable eim $$0) {
      if ($$0 == null) {
         this.m.b(eim.a);
         this.m.j = false;
         this.n.j = false;
         this.o.j = false;
         this.l.j = false;
      } else {
         this.m.b($$0.t());
         this.m.j = $$0.u();
         this.n.j = $$0.w();
         this.o.j = $$0.x();
         this.l.j = $$0.y();
      }
   }

   @Override
   public void k() {
      if (this.p != null) {
         this.p.l().forEach(fkf.a::close);
      }
   }
}
