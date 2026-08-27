import com.mojang.serialization.Codec;
import javax.annotation.Nullable;

public record cm(so b) {
   public static final Codec<cm> a = tm.i.xmap(cm::new, cm::a);

   public boolean a(cng $$0) {
      return this.a($$0.v());
   }

   public boolean a(blw $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable tl $$0) {
      return $$0 != null && td.a(this.b, $$0, true);
   }

   public static so b(blw $$0) {
      so $$1 = $$0.f(new so());
      if ($$0 instanceof cfq) {
         cng $$2 = ((cfq)$$0).fS().f();
         if (!$$2.b()) {
            $$1.a("SelectedItem", $$2.b(new so()));
         }
      }

      return $$1;
   }

   public so a() {
      return this.b;
   }
}
