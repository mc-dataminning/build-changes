import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record co(sw b) {
   public static final Codec<co> a = tu.i.xmap(co::new, co::a);

   public boolean a(coz $$0) {
      return this.a($$0.w());
   }

   public boolean a(bno $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tt $$0) {
      return $$0 != null && tl.a(this.b, $$0, true);
   }

   public static sw b(bno $$0) {
      sw $$1 = $$0.f(new sw());
      if ($$0 instanceof chh) {
         coz $$2 = ((chh)$$0).fT().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sw()));
         }
      }

      return $$1;
   }

   public sw a() {
      return this.b;
   }
}
