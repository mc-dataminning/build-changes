import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cm(sl b) {
   public static final Codec<cm> a = tj.i.xmap(cm::new, cm::a);

   public boolean a(cmr $$0) {
      return this.a($$0.v());
   }

   public boolean a(blp $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ti $$0) {
      return $$0 != null && ta.a(this.b, $$0, true);
   }

   public static sl b(blp $$0) {
      sl $$1 = $$0.f(new sl());
      if ($$0 instanceof cfb) {
         cmr $$2 = ((cfb)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sl()));
         }
      }

      return $$1;
   }

   public sl a() {
      return this.b;
   }
}
