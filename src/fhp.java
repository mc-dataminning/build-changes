import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhp extends fct {
   private static final Logger k = LogUtils.getLogger();
   public static final dph a = new dph((long)"test1".hashCode(), true, false);
   protected final fct b;
   private ewy l;
   private ewy m;
   private ewy n;
   private ewy o;
   protected exh c;
   private fhu p;

   public fhp(fct $$0) {
      super(vd.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new exh(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vd.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.e(this.c);
      this.p = this.d(new fhu(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.d(ewy.a(egg.a, $$0 -> this.p.d().ifPresent(fhu.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(ewy.a(vd.c("selectWorld.create"), $$0 -> fhj.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(ewy.a(vd.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fhu.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(ewy.a(vd.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fhu.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(ewy.a(vd.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fhu.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(ewy.a(vc.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(ewm $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable egg $$0) {
      if ($$0 == null) {
         this.m.b(egg.a);
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
         this.p.l().forEach(fhu.a::close);
      }
   }
}
