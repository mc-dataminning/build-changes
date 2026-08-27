import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(qy b) {
   public static final Codec<cn> a = rs.i.xmap(cn::new, cn::a);

   public boolean a(cjf $$0) {
      return this.a($$0.v());
   }

   public boolean a(biq $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable rr $$0) {
      return $$0 != null && rk.a(this.b, $$0, true);
   }

   public static qy b(biq $$0) {
      qy $$1 = $$0.f(new qy());
      if ($$0 instanceof cbu) {
         cjf $$2 = ((cbu)$$0).fR().f();
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
