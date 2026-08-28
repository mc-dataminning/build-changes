import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dh(tx c) {
   public static final Codec<dh> a = uv.j.xmap(dh::new, dh::a);
   public static final ys<ByteBuf, dh> b = yq.o.a(dh::new, dh::a);

   public boolean a(cua $$0) {
      cwo $$1 = $$0.a(kn.b, cwo.a);
      return $$1.b(this.c);
   }

   public boolean a(bsd $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uu $$0) {
      return $$0 != null && um.a(this.c, $$0, true);
   }

   public static tx b(bsd $$0) {
      tx $$1 = $$0.f(new tx());
      if ($$0 instanceof cmh) {
         cua $$2 = ((cmh)$$0).fY().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dR()));
         }
      }

      return $$1;
   }

   public tx a() {
      return this.c;
   }
}
