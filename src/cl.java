import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cl(qr b) {
   public static final Codec<cl> a = rl.i.xmap(cl::new, cl::a);

   public boolean a(ciy $$0) {
      return this.a($$0.v());
   }

   public boolean a(bii $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable rk $$0) {
      return $$0 != null && rd.a(this.b, $$0, true);
   }

   public static qr b(bii $$0) {
      qr $$1 = $$0.f(new qr());
      if ($$0 instanceof cbn) {
         ciy $$2 = ((cbn)$$0).fQ().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qr()));
         }
      }

      return $$1;
   }

   public qr a() {
      return this.b;
   }
}
