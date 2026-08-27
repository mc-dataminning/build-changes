import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fpv extends fpu implements ve, zr {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private iw.b k;
   private cjs l;

   public fpv(exh $$0, uo $$1, fqb $$2) {
      super($$0, $$1, $$2);
      this.j = $$2.a();
      this.k = $$2.c();
      this.l = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.i();
   }

   @Override
   protected iw.b f() {
      return this.k;
   }

   @Override
   protected void a(yy $$0) {
      this.b($$0);
   }

   private void b(yy $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(zt $$0) {
      ya.a($$0, this, this.a);
      iw.b $$1 = fpz.a().a(fpz.b, $$0.b()).a();
      if (!this.b.e()) {
         $$1.c().forEach($$0x -> $$0x.b().m());
      }

      this.k = $$1;
   }

   @Override
   public void a(zu $$0) {
      this.l = cju.e.a($$0.b());
   }

   @Override
   public void a(zs $$0) {
      ya.a($$0, this, this.a);
      this.b.a(aer.b.bind(vb.a(this.k)), new fpy(this.a, this.b, new fqb(this.j, this.e, this.k, this.l, this.d, this.c, this.f, this.h)));
      this.b.a(zy.a);
      this.b.a(aer.a.bind(vb.a(this.k)));
   }

   @Override
   public void e() {
      this.g();
   }

   @Override
   public void a(vq $$0) {
      super.a($$0);
      this.a.z();
   }
}
