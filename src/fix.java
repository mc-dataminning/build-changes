import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fix extends fiw implements tc, wr {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private hu.b i;
   private cee j;

   public fix(eqx $$0, so $$1, fjd $$2) {
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
   protected void a(vy $$0) {
      this.b($$0);
   }

   private void b(vy $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(wt $$0) {
      vh.a($$0, this, this.a);
      hu.b $$1 = fjb.a().a(fjb.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(wu $$0) {
      this.j = ceg.d.a($$0.a());
   }

   @Override
   public void a(ws $$0) {
      this.b.a();
      vh.a($$0, this, this.a);
      this.b.a(new fja(this.a, this.b, new fjd(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new ww());
   }

   @Override
   public void e() {
      this.g();
   }
}
