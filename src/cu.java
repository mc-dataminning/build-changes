import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cu(ty c) {
   public static final Codec<cu> a = uw.i.xmap(cu::new, cu::a);
   public static final yq<ByteBuf, cu> b = yo.n.a(cu::new, cu::a);

   public boolean a(csd $$0) {
      cuq $$1 = $$0.a(jz.a, cuq.a);
      return $$1.b(this.c);
   }

   public boolean a(bql $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uv $$0) {
      return $$0 != null && un.a(this.c, $$0, true);
   }

   public static ty b(bql $$0) {
      ty $$1 = $$0.f(new ty());
      if ($$0 instanceof ckl) {
         csd $$2 = ((ckl)$$0).ga().f();
         if (!$$2.d()) {
            $$1.a("SelectedItem", $$2.a($$0.dP()));
         }
      }

      return $$1;
   }

   public ty a() {
      return this.c;
   }
}
