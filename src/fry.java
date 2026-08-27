import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fry extends frx implements vi, zv {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private clh k;
   private final iz.b l;
   private final fsn m = new fsn();
   @Nullable
   private fsg n;

   public fry(ezi $$0, us $$1, fse $$2) {
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
   protected void a(zc $$0) {
      this.b($$0);
   }

   private void b(zc $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(zx $$0) {
      ye.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(yq $$0) {
      ye.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(zz $$0) {
      this.k = clj.e.a($$0.b());
   }

   @Override
   public void a(zy $$0) {
      ye.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fsg();
      }

      List<arv> $$1 = this.n.a($$0.b());
      this.b(new aae($$1));
   }

   private <T> T a(Function<asr, T> $$0) {
      if (this.n == null) {
         return $$0.apply(asr.b);
      } else {
         Object var3;
         try (ase $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(zw $$0) {
      ye.a($$0, this, this.a);
      iz.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(aey.b.bind(vf.a($$1)), new fsb(this.a, this.b, new fse(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(aad.a);
      this.b.a(aey.a.bind(vf.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(vu $$0) {
      super.a($$0);
      this.a.B();
   }
}
