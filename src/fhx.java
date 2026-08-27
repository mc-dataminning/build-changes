import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fhx extends fdb {
   private static final Logger k = LogUtils.getLogger();
   public static final dpo a = new dpo((long)"test1".hashCode(), true, false);
   protected final fdb b;
   private exg l;
   private exg m;
   private exg n;
   private exg o;
   protected exp c;
   private fic p;

   public fhx(fdb $$0) {
      super(vf.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new exp(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vf.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.e(this.c);
      this.p = this.d(new fic(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.d(exg.a(egn.a, $$0 -> this.p.d().ifPresent(fic.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(exg.a(vf.c("selectWorld.create"), $$0 -> fhr.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(exg.a(vf.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fic.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(exg.a(vf.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fic.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(exg.a(vf.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fic.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(exg.a(ve.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
      this.c(this.c);
   }

   @Override
   public void aE_() {
      this.f.a(this.b);
   }

   @Override
   public void a(ewu $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable egn $$0) {
      if ($$0 == null) {
         this.m.b(egn.a);
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
         this.p.l().forEach(fic.a::close);
      }
   }
}
