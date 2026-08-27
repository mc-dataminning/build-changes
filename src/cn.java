import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(qu b) {
   public static final Codec<cn> a = ro.i.xmap(cn::new, cn::a);

   public boolean a(cja $$0) {
      return this.a($$0.v());
   }

   public boolean a(bil $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable rn $$0) {
      return $$0 != null && rg.a(this.b, $$0, true);
   }

   public static qu b(bil $$0) {
      qu $$1 = $$0.f(new qu());
      if ($$0 instanceof cbp) {
         cja $$2 = ((cbp)$$0).fQ().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new qu()));
         }
      }

      return $$1;
   }

   public qu a() {
      return this.b;
   }
}
