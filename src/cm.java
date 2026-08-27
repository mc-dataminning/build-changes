import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cm(sn b) {
   public static final Codec<cm> a = tl.i.xmap(cm::new, cm::a);

   public boolean a(cmy $$0) {
      return this.a($$0.v());
   }

   public boolean a(blv $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tk $$0) {
      return $$0 != null && tc.a(this.b, $$0, true);
   }

   public static sn b(blv $$0) {
      sn $$1 = $$0.f(new sn());
      if ($$0 instanceof cfi) {
         cmy $$2 = ((cfi)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sn()));
         }
      }

      return $$1;
   }

   public sn a() {
      return this.b;
   }
}
