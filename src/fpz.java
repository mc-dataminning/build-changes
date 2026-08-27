import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fpz extends fld {
   private static final Logger d = LogUtils.getLogger();
   public static final dwx a = new dwx((long)"test1".hashCode(), true, false);
   protected final fld b;
   private ffe r;
   private ffe s;
   private ffe u;
   private ffe v;
   protected ffn c;
   private fqe w;

   public fpz(fld $$0) {
      super(wu.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aM_() {
      this.c = new ffn(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wu.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fqe(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(ffe.a(eoc.a, $$0 -> this.w.d().ifPresent(fqe.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(ffe.a(wu.c("selectWorld.create"), $$0 -> fpt.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(ffe.a(wu.c("selectWorld.edit"), $$0 -> this.w.d().ifPresent(fqe.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(ffe.a(wu.c("selectWorld.delete"), $$0 -> this.w.d().ifPresent(fqe.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(ffe.a(wu.c("selectWorld.recreate"), $$0 -> this.w.d().ifPresent(fqe.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(ffe.a(wt.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
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
   public void a(fer $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eoc $$0) {
      if ($$0 == null) {
         this.s.b(eoc.a);
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
         this.w.aE_().forEach(fqe.a::close);
      }
   }
}
