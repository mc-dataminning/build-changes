import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqc extends fqb implements ve, zr {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cjw k;
   private final iw.b l;
   private final fqp m = new fqp();

   public fqc(exo $$0, uo $$1, fqi $$2) {
      super($$0, $$1, $$2);
      this.j = $$2.a();
      this.l = $$2.c();
      this.k = $$2.d();
   }

   @Override
   public boolean c() {
      return this.b.i();
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
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(ym $$0) {
      ya.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(zu $$0) {
      this.k = cjy.e.a($$0.b());
   }

   @Override
   public void a(zs $$0) {
      ya.a($$0, this, this.a);
      iw.b $$1 = this.m.a(this.l, this.b.e());
      this.b.a(aer.b.bind(vb.a($$1)), new fqf(this.a, this.b, new fqi(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(zy.a);
      this.b.a(aer.a.bind(vb.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(vq $$0) {
      super.a($$0);
      this.a.A();
   }
}
