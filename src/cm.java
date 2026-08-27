import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cm(sn b) {
   public static final Codec<cm> a = tl.i.xmap(cm::new, cm::a);

   public boolean a(cmx $$0) {
      return this.a($$0.v());
   }

   public boolean a(blu $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tk $$0) {
      return $$0 != null && tc.a(this.b, $$0, true);
   }

   public static sn b(blu $$0) {
      sn $$1 = $$0.f(new sn());
      if ($$0 instanceof cfh) {
         cmx $$2 = ((cfh)$$0).fS().f();
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
