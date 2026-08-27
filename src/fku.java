import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fku extends fkt implements ug, xw {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private ip.b i;
   private cfv j;

   public fku(esr $$0, ts $$1, fla $$2) {
      super($$0, $$1, $$2);
      this.h = $$2.a();
      this.i = $$2.c();
      this.j = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.k();
   }

   @Override
   protected ip.b f() {
      return this.i;
   }

   @Override
   protected void a(xd $$0) {
      this.b($$0);
   }

   private void b(xd $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(xy $$0) {
      wm.a($$0, this, this.a);
      ip.b $$1 = fky.a().a(fky.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(xz $$0) {
      this.j = cfx.e.a($$0.a());
   }

   @Override
   public void a(xx $$0) {
      this.b.a();
      wm.a($$0, this, this.a);
      this.b.a(new fkx(this.a, this.b, new fla(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new yb());
   }

   @Override
   public void e() {
      this.g();
   }
}
