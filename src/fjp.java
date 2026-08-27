import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fjp extends fjo implements tx, xn {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private ip.b i;
   private cfg j;

   public fjp(ero $$0, tj $$1, fjv $$2) {
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
   protected void a(wu $$0) {
      this.b($$0);
   }

   private void b(wu $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(xp $$0) {
      wd.a($$0, this, this.a);
      ip.b $$1 = fjt.a().a(fjt.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(xq $$0) {
      this.j = cfi.d.a($$0.a());
   }

   @Override
   public void a(xo $$0) {
      this.b.a();
      wd.a($$0, this, this.a);
      this.b.a(new fjs(this.a, this.b, new fjv(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new xs());
   }

   @Override
   public void e() {
      this.g();
   }
}
