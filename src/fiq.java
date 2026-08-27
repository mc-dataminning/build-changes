import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fiq extends fip implements sx, wl {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private hu.b i;
   private cdx j;

   public fiq(eqq $$0, sj $$1, fiw $$2) {
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
   protected hu.b f() {
      return this.i;
   }

   @Override
   protected void a(vs $$0) {
      this.b($$0);
   }

   private void b(vs $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(wn $$0) {
      vc.a($$0, this, this.a);
      hu.b $$1 = fiu.a().a(fiu.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(wo $$0) {
      this.j = cdz.d.a($$0.a());
   }

   @Override
   public void a(wm $$0) {
      this.b.a();
      vc.a($$0, this, this.a);
      this.b.a(new fit(this.a, this.b, new fiw(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new wq());
   }

   @Override
   public void e() {
      this.g();
   }
}
