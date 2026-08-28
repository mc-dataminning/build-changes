import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dm(ux c) {
   public static final Codec<dm> a = vv.j.xmap(dm::new, dm::a);
   public static final zt<ByteBuf, dm> b = zr.r.a(dm::new, dm::a);

   public boolean a(cxo $$0) {
      czx $$1 = $$0.a(ku.b, czx.a);
      return $$1.b(this.c);
   }

   public boolean a(bvj $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vu $$0) {
      return $$0 != null && vm.a(this.c, $$0, true);
   }

   public static ux b(bvj $$0) {
      ux $$1 = $$0.f(new ux());
      if ($$0 instanceof cpw) {
         cxo $$2 = ((cpw)$$0).gg().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dX()));
         }
      }

      return $$1;
   }

   public ux a() {
      return this.c;
   }
}
