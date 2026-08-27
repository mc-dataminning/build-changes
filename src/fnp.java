import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import org.slf4j.Logger;

public class fnp extends fno implements uu, yt {
   private static final Logger g = LogUtils.getLogger();
   private final GameProfile h;
   private iu.b i;
   private chr j;

   public fnp(evh $$0, ug $$1, fnv $$2) {
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
   protected void a(ya $$0) {
      this.b($$0);
   }

   private void b(ya $$0) {
      g.warn("Unknown custom packet payload: {}", $$0.a());
   }

   @Override
   public void a(yv $$0) {
      xh.a($$0, this, this.a);
      iu.b $$1 = fnt.a().a(fnt.b, $$0.a()).a();
      if (!this.b.g()) {
         $$1.c().forEach($$0x -> $$0x.b().m());
      }

      this.i = $$1;
   }

   @Override
   public void a(yw $$0) {
      this.j = cht.e.a($$0.a());
   }

   @Override
   public void a(yu $$0) {
      this.b.a();
      xh.a($$0, this, this.a);
      this.b.a(new fns(this.a, this.b, new fnv(this.h, this.e, this.i, this.j, this.d, this.c, this.f)));
      this.b.b();
      this.b.a(new yy());
   }

   @Override
   public void e() {
      this.g();
   }

   @Override
   public void a(vf $$0) {
      super.a($$0);
      this.a.z();
   }
}
