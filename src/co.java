import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record co(to c) {
   public static final Codec<co> a = um.i.xmap(co::new, co::a);
   public static final yg<ByteBuf, co> b = ye.n.a(co::new, co::a);

   public boolean a(crs $$0) {
      cuc $$1 = $$0.a(jr.a, cuc.a);
      return $$1.b(this.c);
   }

   public boolean a(bqa $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ul $$0) {
      return $$0 != null && ud.a(this.c, $$0, true);
   }

   public static to b(bqa $$0) {
      to $$1 = $$0.f(new to());
      if ($$0 instanceof cka) {
         crs $$2 = ((cka)$$0).fZ().f();
         if (!$$2.d()) {
            $$1.a("SelectedItem", $$2.a($$0.dO()));
         }
      }

      return $$1;
   }

   public to a() {
      return this.c;
   }
}
