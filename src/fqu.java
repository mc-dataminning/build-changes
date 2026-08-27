import com.mojang.logging.LogUtils;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fqu extends flz {
   private static final Logger d = LogUtils.getLogger();
   public static final dxt a = new dxt((long)"test1".hashCode(), true, false);
   protected final flz b;
   private fga r;
   private fga s;
   private fga u;
   private fga v;
   protected fgj c;
   private fqz w;

   public fqu(flz $$0) {
      super(wx.c("selectWorld.title"));
      this.b = $$0;
   }

   @Override
   protected void aN_() {
      this.c = new fgj(this.p, this.n / 2 - 100, 22, 200, 20, this.c, wx.c("selectWorld.search"));
      this.c.b($$0 -> this.w.a($$0));
      this.d(this.c);
      this.w = this.c(new fqz(this, this.m, this.n, this.o - 112, 48, 36, this.c.a(), this.w));
      this.s = this.c(fga.a(eoy.a, $$0 -> this.w.d().ifPresent(fqz.c::c)).a(this.n / 2 - 154, this.o - 52, 150, 20).a());
      this.c(fga.a(wx.c("selectWorld.create"), $$0 -> fqo.a(this.m, this)).a(this.n / 2 + 4, this.o - 52, 150, 20).a());
      this.u = this.c(fga.a(wx.c("selectWorld.edit"), $$0 -> this.w.d().ifPresent(fqz.c::f)).a(this.n / 2 - 154, this.o - 28, 72, 20).a());
      this.r = this.c(fga.a(wx.c("selectWorld.delete"), $$0 -> this.w.d().ifPresent(fqz.c::d)).a(this.n / 2 - 76, this.o - 28, 72, 20).a());
      this.v = this.c(fga.a(wx.c("selectWorld.recreate"), $$0 -> this.w.d().ifPresent(fqz.c::h)).a(this.n / 2 + 4, this.o - 28, 72, 20).a());
      this.c(fga.a(ww.k, $$0 -> this.m.a(this.b)).a(this.n / 2 + 82, this.o - 28, 72, 20).a());
      this.a(null);
   }

   @Override
   protected void aD_() {
      this.b(this.c);
   }

   @Override
   public void d() {
      this.m.a(this.b);
   }

   @Override
   public void a(ffn $$0, int $$1, int $$2, float $$3) {
      super.a($$0, $$1, $$2, $$3);
      this.c.a($$0, $$1, $$2, $$3);
      $$0.a(this.p, this.l, this.n / 2, 8, 16777215);
   }

   public void a(@Nullable eoy $$0) {
      if ($$0 == null) {
         this.s.b(eoy.a);
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
         this.w.aF_().forEach(fqz.a::close);
      }
   }
}
