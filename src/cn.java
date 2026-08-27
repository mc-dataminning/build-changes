import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(rt b) {
   public static final Codec<cn> a = so.i.xmap(cn::new, cn::a);

   public boolean a(ckj $$0) {
      return this.a($$0.v());
   }

   public boolean a(bjt $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable sn $$0) {
      return $$0 != null && sg.a(this.b, $$0, true);
   }

   public static rt b(bjt $$0) {
      rt $$1 = $$0.f(new rt());
      if ($$0 instanceof ccx) {
         ckj $$2 = ((ccx)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new rt()));
         }
      }

      return $$1;
   }

   public rt a() {
      return this.b;
   }
}
