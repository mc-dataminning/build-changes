import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record co(ta b) {
   public static final Codec<co> a = ty.i.xmap(co::new, co::a);

   public boolean a(cqk $$0) {
      return this.a($$0.w());
   }

   public boolean a(bow $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tx $$0) {
      return $$0 != null && tp.a(this.b, $$0, true);
   }

   public static ta b(bow $$0) {
      ta $$1 = $$0.f(new ta());
      if ($$0 instanceof cis) {
         cqk $$2 = ((cis)$$0).fZ().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new ta()));
         }
      }

      return $$1;
   }

   public ta a() {
      return this.b;
   }
}
