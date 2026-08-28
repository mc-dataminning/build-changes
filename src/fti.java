import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fti extends fod {
   private static final Logger r = LogUtils.getLogger();
   public static final dzw a = new dzw((long)"test1".hashCode(), true, false);
   protected final fod b;
   private fim s;
   private fim u;
   private fim v;
   private fim w;
   protected fiv c;
   private ftn x;

   public fti(fod $$0) {
      super(wz.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aT_() {
      this.c = new fiv(this.o, this.m / 2 - 100, 22, 200, 20, this.c, wz.c("selectWorld.search"));
      this.c.b($$0 -> this.x.a($$0));
      this.d(this.c);
      this.x = this.c(new ftn(this, this.l, this.m, this.n - 112, 48, 36, this.c.a(), this.x));
      this.u = this.c(fim.a(erg.a, $$0 -> this.x.c().ifPresent(ftn.c::c)).a(this.m / 2 - 154, this.n - 52, 150, 20).a());
      this.c(fim.a(wz.c("selectWorld.create"), $$0 -> ftc.a(this.l, this)).a(this.m / 2 + 4, this.n - 52, 150, 20).a());
      this.v = this.c(fim.a(wz.c("selectWorld.edit"), $$0 -> this.x.c().ifPresent(ftn.c::f)).a(this.m / 2 - 154, this.n - 28, 72, 20).a());
      this.s = this.c(fim.a(wz.c("selectWorld.delete"), $$0 -> this.x.c().ifPresent(ftn.c::d)).a(this.m / 2 - 76, this.n - 28, 72, 20).a());
      this.w = this.c(fim.a(wz.c("selectWorld.recreate"), $$0 -> this.x.c().ifPresent(ftn.c::h)).a(this.m / 2 + 4, this.n - 28, 72, 20).a());
      this.c(fim.a(wy.k, $$0 -> this.l.a(this.b)).a(this.m / 2 + 82, this.n - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aI_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.l.a(this.b);
   }

   @Override
   public void a(fhz $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
   }

   public void a(@Nullable erg $$0) {
      if ($$0 == null) {
         this.u.b(erg.a);
         this.u.j = false;
         this.v.j = false;
         this.w.j = false;
         this.s.j = false;
      } else {
         this.u.b($$0.t());
         this.u.j = $$0.u();
         this.v.j = $$0.w();
         this.w.j = $$0.x();
         this.s.j = $$0.y();
      }
   }

   @Override
   public void j() {
      if (this.x != null) {
         this.x.aK_().forEach(ftn.a::close);
      }
   }
}
