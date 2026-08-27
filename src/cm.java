import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cm(sj b) {
   public static final Codec<cm> a = th.i.xmap(cm::new, cm::a);

   public boolean a(cmh $$0) {
      return this.a($$0.v());
   }

   public boolean a(blf $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tg $$0) {
      return $$0 != null && sy.a(this.b, $$0, true);
   }

   public static sj b(blf $$0) {
      sj $$1 = $$0.f(new sj());
      if ($$0 instanceof cer) {
         cmh $$2 = ((cer)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new sj()));
         }
      }

      return $$1;
   }

   public sj a() {
      return this.b;
   }
}
