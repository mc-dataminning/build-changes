import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fld extends fgh {
   private static final Logger k = LogUtils.getLogger();
   public static final dso a = new dso((long)"test1".hashCode(), true, false);
   protected final fgh b;
   private fak l;
   private fak m;
   private fak n;
   private fak o;
   protected fat c;
   private fli p;

   public fld(fgh $$0) {
      super(vs.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aP_() {
      this.c = new fat(this.i, this.g / 2 - 100, 22, 200, 20, this.c, vs.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.d(this.c);
      this.p = this.c(new fli(this, this.f, this.g, this.h - 112, 48, 36, this.c.a(), this.p));
      this.m = this.c(fak.a(ejp.a, $$0 -> this.p.d().ifPresent(fli.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.c(fak.a(vs.c("selectWorld.create"), $$0 -> fkx.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.c(fak.a(vs.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fli.c::f)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.c(fak.a(vs.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fli.c::d)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.c(fak.a(vs.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fli.c::g)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.c(fak.a(vr.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aG_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.f.a(this.b);
   }

   @Override
   public void a(ezx $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(@Nullable ejp $$0) {
      if ($$0 == null) {
         this.m.b(ejp.a);
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
         this.p.l().forEach(fli.a::close);
      }
   }
}
