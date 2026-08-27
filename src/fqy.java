import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fqy extends fqx implements vg, zt {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private ckl k;
   private final iy.b l;
   private final frm m = new frm();

   public fqy(eyk $$0, uq $$1, fre $$2) {
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
   protected void a(za $$0) {
      this.b($$0);
   }

   private void b(za $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(zv $$0) {
      yc.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(yo $$0) {
      yc.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(zw $$0) {
      this.k = ckn.e.a($$0.b());
   }

   @Override
   public void a(zu $$0) {
      yc.a($$0, this, this.a);
      iy.b $$1 = this.m.a(this.l, this.b.e());
      this.b.a(aeu.b.bind(vd.a($$1)), new frb(this.a, this.b, new fre(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(aaa.a);
      this.b.a(aeu.a.bind(vd.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(vs $$0) {
      super.a($$0);
      this.a.y();
   }
}
