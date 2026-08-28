import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dg(us c) {
   public static final Codec<dg> a = vq.j.xmap(dg::new, dg::a);
   public static final zn<ByteBuf, dg> b = zl.o.a(dg::new, dg::a);

   public boolean a(cur $$0) {
      cxg $$1 = $$0.a(km.b, cxg.a);
      return $$1.b(this.c);
   }

   public boolean a(bsw $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vp $$0) {
      return $$0 != null && vh.a(this.c, $$0, true);
   }

   public static us b(bsw $$0) {
      us $$1 = $$0.f(new us());
      if ($$0 instanceof cmz) {
         cur $$2 = ((cmz)$$0).gc().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dR()));
         }
      }

      return $$1;
   }

   public us a() {
      return this.c;
   }
}
