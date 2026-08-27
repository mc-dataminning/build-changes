import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fcz extends eyf {
   private static final Logger k = LogUtils.getLogger();
   public static final dll a = new dll((long)"test1".hashCode(), true, false);
   protected final eyf b;
   private esl l;
   private esl m;
   private esl n;
   private esl o;
   protected esu c;
   private fde p;

   public fcz(eyf $$0) {
      super(ti.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aD_() {
      this.c = new esu(this.i, this.g / 2 - 100, 22, 200, 20, this.c, ti.c("selectWorld.search"));
      this.c.b($$0 -> this.p.a($$0));
      this.p = new fde(this, this.f, this.g, this.h, 48, this.h - 64, 36, this.c.a(), this.p);
      this.e(this.c);
      this.e(this.p);
      this.m = this.d(esl.a(ti.c("selectWorld.select"), $$0 -> this.p.d().ifPresent(fde.c::d)).a(this.g / 2 - 154, this.h - 52, 150, 20).a());
      this.d(esl.a(ti.c("selectWorld.create"), $$0 -> fct.a(this.f, this)).a(this.g / 2 + 4, this.h - 52, 150, 20).a());
      this.n = this.d(esl.a(ti.c("selectWorld.edit"), $$0 -> this.p.d().ifPresent(fde.c::g)).a(this.g / 2 - 154, this.h - 28, 72, 20).a());
      this.l = this.d(esl.a(ti.c("selectWorld.delete"), $$0 -> this.p.d().ifPresent(fde.c::e)).a(this.g / 2 - 76, this.h - 28, 72, 20).a());
      this.o = this.d(esl.a(ti.c("selectWorld.recreate"), $$0 -> this.p.d().ifPresent(fde.c::h)).a(this.g / 2 + 4, this.h - 28, 72, 20).a());
      this.d(esl.a(th.k, $$0 -> this.f.a(this.b)).a(this.g / 2 + 82, this.h - 28, 72, 20).a());
      this.a(false, false);
      this.c(this.c);
   }

   @Override
   public boolean a(int $$0, int $$1, int $$2) {
      return super.a($$0, $$1, $$2) ? true : this.c.a($$0, $$1, $$2);
   }

   @Override
   public void au_() {
      this.f.a(this.b);
   }

   @Override
   public boolean a(char $$0, int $$1) {
      return this.c.a($$0, $$1);
   }

   @Override
   public void a(esa $$0, int $$1, int $$2, float $$3) {
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
   public void av_() {
      if (this.p != null) {
         this.p.i().forEach(fde.a::close);
      }
   }
}
