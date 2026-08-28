import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class ftc extends fnx {
   private static final Logger q = LogUtils.getLogger();
   public static final dzt a = new dzt((long)"test1".hashCode(), true, false);
   protected final fnx b;
   private fig r;
   private fig s;
   private fig u;
   private fig v;
   protected fip c;
   private fth w;

   public ftc(fnx $$0) {
      super(wy.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aP_() {
      this.c = new fip(this.o, this.m / 2 - 100, 22, 200, 20, this.c, wy.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fth(this, this.l, this.m, this.n - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fig.a(era.a, $$0 -> this.w.c().ifPresent(fth.c::c)).a(this.m / 2 - 154, this.n - 52, 150, 20).a());
      this.c(fig.a(wy.c("selectWorld.create"), $$0 -> fsw.a(this.l, this)).a(this.m / 2 + 4, this.n - 52, 150, 20).a());
      this.u = this.c(fig.a(wy.c("selectWorld.edit"), $$0 -> this.w.c().ifPresent(fth.c::f)).a(this.m / 2 - 154, this.n - 28, 72, 20).a());
      this.r = this.c(fig.a(wy.c("selectWorld.delete"), $$0 -> this.w.c().ifPresent(fth.c::d)).a(this.m / 2 - 76, this.n - 28, 72, 20).a());
      this.v = this.c(fig.a(wy.c("selectWorld.recreate"), $$0 -> this.w.c().ifPresent(fth.c::h)).a(this.m / 2 + 4, this.n - 28, 72, 20).a());
      this.c(fig.a(wx.k, $$0 -> this.l.a(this.b)).a(this.m / 2 + 82, this.n - 28, 72, 20).a());
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
   public void a(fht $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.o, this.k, this.m / 2, 8, 16777215);
   }

   public void a(@Nullable era $$0) {
      if ($$0 == null) {
         this.s.b(era.a);
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
         this.w.aG_().forEach(fth.a::close);
      }
   }
}
