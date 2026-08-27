import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(sd b) {
   public static final Codec<cn> a = tb.i.xmap(cn::new, cn::a);

   public boolean a(clo $$0) {
      return this.a($$0.v());
   }

   public boolean a(bkv $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ta $$0) {
      return $$0 != null && ss.a(this.b, $$0, true);
   }

   public static sd b(bkv $$0) {
      sd $$1 = $$0.f(new sd());
      if ($$0 instanceof cdz) {
         clo $$2 = ((cdz)$$0).fT().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sd()));
         }
      }

      return $$1;
   }

   public sd a() {
      return this.b;
   }
}
