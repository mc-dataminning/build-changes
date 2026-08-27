import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class flm extends fll implements uk, ya {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private it.b i;
   private cgi j;

   public flm(eti $$0, tw $$1, fls $$2) {
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
   protected it.b f() {
      return this.i;
   }

   @Override
   protected void a(xh $$0) {
      this.b($$0);
   }

   private void b(xh $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(yc $$0) {
      wq.a($$0, this, this.a);
      it.b $$1 = flq.a().a(flq.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(yd $$0) {
      this.j = cgk.e.a($$0.a());
   }

   @Override
   public void a(yb $$0) {
      this.b.a();
      wq.a($$0, this, this.a);
      this.b.a(new flp(this.a, this.b, new fls(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new yf());
   }

   @Override
   public void e() {
      this.g();
   }
}
