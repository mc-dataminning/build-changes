import com.mojang.authlib.GameProfile;
import com.mojang.logging.LogUtils;
import java.util.List;
import java.util.function.Function;
import javax.annotation.Nullable;
import org.slf4j.Logger;

public class fuf extends fue implements aah, vu {
   private static final Logger i = LogUtils.getLogger();
   private final GameProfile j;
   private cmg k;
   private final iz.b l;
   private final fuu m = new fuu();
   @Nullable
   private fun n;

   public fuf(fbp $$0, ve $$1, ful $$2) {
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
   protected void a(zo $$0) {
      this.b($$0);
   }

   private void b(zo $$0) {
      i.warn("Unknown custom packet payload: {}", $$0.a().a());
   }

   @Override
   public void a(aaj $$0) {
      yq.a($$0, this, this.a);
      this.m.a($$0.b(), $$0.e());
   }

   @Override
   public void a(zc $$0) {
      yq.a($$0, this, this.a);
      this.m.a($$0.b());
   }

   @Override
   public void a(aal $$0) {
      this.k = cmi.e.a($$0.b());
   }

   @Override
   public void a(aak $$0) {
      yq.a($$0, this, this.a);
      if (this.n == null) {
         this.n = new fun();
      }

      List<asj> $$1 = this.n.a($$0.b());
      this.b(new aaq($$1));
   }

   private <T> T a(Function<atf, T> $$0) {
      if (this.n == null) {
         return $$0.apply(atf.b);
      } else {
         Object var3;
         try (ass $$1 = this.n.a()) {
            var3 = $$0.apply($$1);
         }

         return (T)var3;
      }
   }

   @Override
   public void a(aai $$0) {
      yq.a($$0, this, this.a);
      iz.b $$1 = this.a($$0x -> this.m.a($$0x, this.l, this.b.e()));
      this.b.a(afk.b.bind(vr.a($$1)), new fui(this.a, this.b, new ful(this.j, this.e, $$1, this.k, this.d, this.c, this.f, this.h)));
      this.b.a(aap.a);
      this.b.a(afk.a.bind(vr.a($$1)));
   }

   @Override
   public void e() {
      this.f();
   }

   @Override
   public void a(wg $$0) {
      super.a($$0);
      this.a.B();
   }
}
