import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fig extends fif implements su, wi {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private hs.b i;
   private cdv j;

   public fig(eqm $$0, sg $$1, fim $$2) {
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
   protected hs.b f() {
      return this.i;
   }

   @Override
   protected void a(vp $$0) {
      this.b($$0);
   }

   private void b(vp $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(wk $$0) {
      uz.a($$0, this, this.a);
      hs.b $$1 = fik.a().a(fik.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(wl $$0) {
      this.j = cdx.d.a($$0.a());
   }

   @Override
   public void a(wj $$0) {
      this.b.a();
      uz.a($$0, this, this.a);
      this.b.a(new fij(this.a, this.b, new fim(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new wn());
   }

   @Override
   public void e() {
      this.g();
   }
}
