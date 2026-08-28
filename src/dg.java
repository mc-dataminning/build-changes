import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dg(us c) {
   public static final Codec<dg> a = vq.j.xmap(dg::new, dg::a);
   public static final zn<ByteBuf, dg> b = zl.o.a(dg::new, dg::a);

   public boolean a(cuq $$0) {
      cxf $$1 = $$0.a(km.b, cxf.a);
      return $$1.b(this.c);
   }

   public boolean a(bsv $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vp $$0) {
      return $$0 != null && vh.a(this.c, $$0, true);
   }

   public static us b(bsv $$0) {
      us $$1 = $$0.f(new us());
      if ($$0 instanceof cmy) {
         cuq $$2 = ((cmy)$$0).gc().f();
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
