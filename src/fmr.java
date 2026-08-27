import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fmr extends fmq implements uq, yh {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private is.b i;
   private chb j;

   public fmr(euk $$0, uc $$1, fmx $$2) {
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
   protected is.b f() {
      return this.i;
   }

   @Override
   protected void a(xo $$0) {
      this.b($$0);
   }

   private void b(xo $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(yj $$0) {
      ww.a($$0, this, this.a);
      is.b $$1 = fmv.a().a(fmv.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.c().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(yk $$0) {
      this.j = chd.e.a($$0.a());
   }

   @Override
   public void a(yi $$0) {
      this.b.a();
      ww.a($$0, this, this.a);
      this.b.a(new fmu(this.a, this.b, new fmx(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new ym());
   }

   @Override
   public void e() {
      this.g();
   }
}
