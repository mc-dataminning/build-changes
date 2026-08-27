import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fmb extends fhf {
   private static final Logger k = LogUtils.getLogger();
   public static final dtk a = new dtk((long)"test1".hashCode(), true, false);
   protected final fhf b;
   private fbg l;
   private fbg m;
   private fbg n;
   private fbg o;
   protected fbp c;
   private fmg p;

   public fmb(fhf $$0) {
      super(vu.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aO_() {
      this.c = new fbp(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vu.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.d(this.c);
      this.p = this.c(new fmg(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.c(fbg.a(ekl.a, $$0 -> this.p.d().ifPresent(fmg.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.c(fbg.a(vu.c("selectWorld.create"), $$0 -> flv.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.c(fbg.a(vu.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fmg.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.c(fbg.a(vu.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fmg.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.c(fbg.a(vu.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fmg.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.c(fbg.a(vt.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aF_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   public void a(fat $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable ekl $$0) {
      if ($$0 == null) {
         this.m.b(ekl.a);
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
         this.p.l().forEach(fmg.a::close);
      }
   }
}
