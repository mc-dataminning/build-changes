import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fdy extends ezd {
   private static final Logger k = LogUtils.getLogger();
   public static final dmi a = new dmi((long)"test1".hashCode(), true, false);
   protected final ezd b;
   private etj l;
   private etj m;
   private etj n;
   private etj o;
   protected ets c;
   private fed p;

   public fdy(ezd $$0) {
      super(ui.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new ets(this.i, this.g / 2 - 100, 22, 200, 20, this.c, ui.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.p = new fed(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.a(), this.p);
      this.e(this.c);
      this.e(this.p);
      this.m = this.d(etj.a(ui.c("selectWorld.select"), $$0 -> this.p.e().ifPresent(fed.c::c)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(etj.a(ui.c("selectWorld.create"), $$0 -> fds.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(etj.a(ui.c("selectWorld.edit"), $$0 -> this.p.e().ifPresent(fed.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(etj.a(ui.c("selectWorld.delete"), $$0 -> this.p.e().ifPresent(fed.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(etj.a(ui.c("selectWorld.recreate"), $$0 -> this.p.e().ifPresent(fed.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(etj.a(uh.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(false, false);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void aC_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(esy $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.p.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
   }

   public void a(boolean $$0, boolean $$1) {
      this.m.i = $$0;
      this.n.i = $$0;
      this.o.i = $$0;
      this.l.i = $$1;
   }

   @Override
   public void aD_() {
      if (this.p != null) {
         this.p.i().forEach(fed.a::close);
      }
   }
}
