import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fso extends fnl {
   private static final Logger q = LogUtils.getLogger();
   public static final dze a = new dze((long)"test1".hashCode(), true, false);
   protected final fnl b;
   private fhu r;
   private fhu s;
   private fhu u;
   private fhu v;
   protected fid c;
   private fst w;

   public fso(fnl $$0) {
      super(wu.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aP_() {
      this.c = new fid(this.o, this.m / 2 - 100, 22, 200, 20, this.c, wu.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fst(this, this.l, this.m, this.n - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fhu.a(eql.a, $$0 -> this.w.c().ifPresent(fst.c::c)).a(this.m / 2 - 154, this.n - 52, 150, 20).a());
      this.c(fhu.a(wu.c("selectWorld.create"), $$0 -> fsi.a(this.l, this)).a(this.m / 2 + 4, this.n - 52, 150, 20).a());
      this.u = this.c(fhu.a(wu.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(fst.c::f)).a(this.m / 2 - 154, this.n - 28, 72, 20).a());
      this.r = this.c(fhu.a(wu.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(fst.c::d)).a(this.m / 2 - 76, this.n - 28, 72, 20).a());
      this.v = this.c(fhu.a(wu.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(fst.c::h)).a(this.m / 2 + 4, this.n - 28, 72, 20).a());
      this.c(fhu.a(wt.k, $$0 -> this.l.a(this.b)).a(this.m / 2 + 82, this.n - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aE_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.l.a(this.b);
   }

   @Override
   public void a(fhh $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
   }

   public void a(@Nullable eql $$0) {
      if ($$0 == null) {
         this.s.b(eql.a);
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
         this.w.aG_().forEach(fst.a::close);
      }
   }
}
