import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dh(tx c) {
   public static final Codec<dh> a = uv.j.xmap(dh::new, dh::a);
   public static final ys<ByteBuf, dh> b = yq.o.a(dh::new, dh::a);

   public boolean a(cud $$0) {
      cwr $$1 = $$0.a(kn.b, cwr.a);
      return $$1.b(this.c);
   }

   public boolean a(bsh $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uu $$0) {
      return $$0 != null && um.a(this.c, $$0, true);
   }

   public static tx b(bsh $$0) {
      tx $$1 = $$0.f(new tx());
      if ($$0 instanceof cml) {
         cud $$2 = ((cml)$$0).ga().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dT()));
         }
      }

      return $$1;
   }

   public tx a() {
      return this.c;
   }
}
