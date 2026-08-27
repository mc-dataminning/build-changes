import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class foc extends fob implements uv, yu {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private iu.b i;
   private cia j;

   public foc(evr $$0, uh $$1, foi $$2) {
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
   protected iu.b f() {
      return this.i;
   }

   @Override
   protected void a(yb $$0) {
      this.b($$0);
   }

   private void b(yb $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(yw $$0) {
      xi.a($$0, this, this.a);
      iu.b $$1 = fog.a().a(fog.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.c().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(yx $$0) {
      this.j = cic.e.a($$0.a());
   }

   @Override
   public void a(yv $$0) {
      this.b.a();
      xi.a($$0, this, this.a);
      this.b.a(new fof(this.a, this.b, new foi(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new yz());
   }

   @Override
   public void e() {
      this.g();
   }

   @Override
   public void a(vg $$0) {
      super.a($$0);
      this.a.z();
   }
}
