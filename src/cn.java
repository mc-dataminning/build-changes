import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cn(rz b) {
   public static final Codec<cn> a = sx.i.xmap(cn::new, cn::a);

   public boolean a(clb $$0) {
      return this.a($$0.v());
   }

   public boolean a(bki $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable sw $$0) {
      return $$0 != null && so.a(this.b, $$0, true);
   }

   public static rz b(bki $$0) {
      rz $$1 = $$0.f(new rz());
      if ($$0 instanceof cdm) {
         clb $$2 = ((cdm)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new rz()));
         }
      }

      return $$1;
   }

   public rz a() {
      return this.b;
   }
}
