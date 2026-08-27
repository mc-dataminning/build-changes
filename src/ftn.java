import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftn extends fon {
   private static final Logger d = LogUtils.getLogger();
   public static final dzs a = new dzs((long)"test1".hashCode(), true, false);
   protected final fon b;
   private fin r;
   private fin s;
   private fin u;
   private fin v;
   protected fiw c;
   private fts w;

   public ftn(fon $$0) {
      super(xe.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new fiw(this.p, this.n / 2 - 100, 22, 200, 20, this.c, xe.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fts(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fin.a(erg.a, $$0 -> this.w.d().ifPresent(fts.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fin.a(xe.c("selectWorld.create"), $$0 -> fth.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(fin.a(xe.c("selectWorld.edit"), $$0 -> this.w.d().ifPresent(fts.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(fin.a(xe.c("selectWorld.delete"), $$0 -> this.w.d().ifPresent(fts.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(fin.a(xe.c("selectWorld.recreate"), $$0 -> this.w.d().ifPresent(fts.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fin.a(xd.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aC_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(fia $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable erg $$0) {
      if ($$0 == null) {
         this.s.b(erg.a);
         this.s.j = false;
         this.u.j = false;
         this.v.j = false;
         this.r.j = false;
      } else {
         this.s.b($$0.t());
         this.s.j = $$0.u();
         this.u.j = $$0.w();
         this.v.j = $$0.x();
         this.r.j = $$0.y();
      }
   }

   @Override
   public void j() {
      if (this.w != null) {
         this.w.aE_().forEach(fts.a::close);
      }
   }
}
