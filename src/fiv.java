import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fiv extends fiu implements ta, wp {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private hr.b i;
   private cec j;

   public fiv(eqv $$0, sm $$1, fjb $$2) {
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
   protected hr.b f() {
      return this.i;
   }

   @Override
   protected void a(vw $$0) {
      this.b($$0);
   }

   private void b(vw $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(wr $$0) {
      vf.a($$0, this, this.a);
      hr.b $$1 = fiz.a().a(fiz.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(ws $$0) {
      this.j = cee.d.a($$0.a());
   }

   @Override
   public void a(wq $$0) {
      this.b.a();
      vf.a($$0, this, this.a);
      this.b.a(new fiy(this.a, this.b, new fjb(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new wu());
   }

   @Override
   public void e() {
      this.g();
   }
}
