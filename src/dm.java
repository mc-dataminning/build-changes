import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dm(un c) {
   public static final Codec<dm> a = vl.j.xmap(dm::new, dm::a);
   public static final zj<ByteBuf, dm> b = zh.p.a(dm::new, dm::a);

   public boolean a(cwf $$0) {
      cyo $$1 = $$0.a(ku.b, cyo.a);
      return $$1.b(this.c);
   }

   public boolean a(bui $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vk $$0) {
      return $$0 != null && vc.a(this.c, $$0, true);
   }

   public static un b(bui $$0) {
      un $$1 = $$0.f(new un());
      if ($$0 instanceof cor) {
         cwf $$2 = ((cor)$$0).gl().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.ea()));
         }
      }

      return $$1;
   }

   public un a() {
      return this.c;
   }
}
