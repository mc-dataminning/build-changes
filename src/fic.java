import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fic extends fib implements st, wh {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private ht.b i;
   private cdt j;

   public fic(eqn $$0, sf $$1, fii $$2) {
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
   protected ht.b f() {
      return this.i;
   }

   @Override
   protected void a(vo $$0) {
      this.b($$0);
   }

   private void b(vo $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(wj $$0) {
      uy.a($$0, this, this.a);
      ht.b $$1 = fig.a().a(fig.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.b().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(wk $$0) {
      this.j = cdv.d.a($$0.a());
   }

   @Override
   public void a(wi $$0) {
      this.b.a();
      uy.a($$0, this, this.a);
      this.b.a(new fif(this.a, this.b, new fii(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new wm());
   }

   @Override
   public void e() {
      this.g();
   }
}
