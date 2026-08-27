import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(qy b) {
   public static final Codec<cn> a = rt.i.xmap(cn::new, cn::a);

   public boolean a(cjh $$0) {
      return this.a($$0.v());
   }

   public boolean a(bis $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable rs $$0) {
      return $$0 != null && rl.a(this.b, $$0, true);
   }

   public static qy b(bis $$0) {
      qy $$1 = $$0.f(new qy());
      if ($$0 instanceof cbw) {
         cjh $$2 = ((cbw)$$0).fR().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qy()));
         }
      }

      return $$1;
   }

   public qy a() {
      return this.b;
   }
}
