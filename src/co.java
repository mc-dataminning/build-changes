import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record co(sy b) {
   public static final Codec<co> a = tw.i.xmap(co::new, co::a);

   public boolean a(cpq $$0) {
      return this.a($$0.w());
   }

   public boolean a(bof $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tv $$0) {
      return $$0 != null && tn.a(this.b, $$0, true);
   }

   public static sy b(bof $$0) {
      sy $$1 = $$0.f(new sy());
      if ($$0 instanceof cia) {
         cpq $$2 = ((cia)$$0).fV().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sy()));
         }
      }

      return $$1;
   }

   public sy a() {
      return this.b;
   }
}
