import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class ezg extends euq {
   private static final Logger k = LogUtils.getLogger();
   public static final dii a = new dii((long)"test1".hashCode(), true, false);
   protected final euq b;
   private epi l;
   private epi m;
   private epi n;
   private epi o;
   protected epr c;
   private ezl p;

   public ezg(euq $$0) {
      super(sw.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   public void f() {
      this.c.a();
   }

   @Override
   protected void b() {
      this.c = new epr(this.i, this.g / 2 - 100, 22, 200, 20, this.c, sw.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.p = new ezl(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.b(), this.p);
      this.e(this.c);
      this.e(this.p);
      this.m = this.d(epi.a(sw.c("selectWorld.select"), $$0 -> this.p.d().ifPresent(ezl.c::d)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(epi.a(sw.c("selectWorld.create"), $$0 -> eza.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(epi.a(sw.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(ezl.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(epi.a(sw.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(ezl.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(epi.a(sw.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(ezl.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(epi.a(sv.e, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(false, false);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void aw_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(eox $$0, int $$1, int $$2, float $$3) {
      this.p.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.i, this.e, this.g / 2, 8, 16777215);
      super.a($$0, $$1, $$2, $$3);
   }

   public void a(boolean $$0, boolean $$1) {
      this.m.r = $$0;
      this.n.r = $$0;
      this.o.r = $$0;
      this.l.r = $$1;
   }

   @Override
   public void ax_() {
      if (this.p != null) {
         this.p.i().forEach(ezl.a::close);
      }
   }
}
