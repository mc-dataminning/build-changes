import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fni extends fnh implements us, yq {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private iu.b i;
   private chl j;

   public fni(eva $$0, ue $$1, fno $$2) {
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
   protected void a(xx $$0) {
      this.b($$0);
   }

   private void b(xx $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(ys $$0) {
      xf.a($$0, this, this.a);
      iu.b $$1 = fnm.a().a(fnm.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.c().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(yt $$0) {
      this.j = chn.e.a($$0.a());
   }

   @Override
   public void a(yr $$0) {
      this.b.a();
      xf.a($$0, this, this.a);
      this.b.a(new fnl(this.a, this.b, new fno(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new yv());
   }

   @Override
   public void e() {
      this.g();
   }
}
