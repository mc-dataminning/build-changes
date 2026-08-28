import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dg(ur c) {
   public static final Codec<dg> a = vp.j.xmap(dg::new, dg::a);
   public static final zm<ByteBuf, dg> b = zk.o.a(dg::new, dg::a);

   public boolean a(cuo $$0) {
      cxd $$1 = $$0.a(km.b, cxd.a);
      return $$1.b(this.c);
   }

   public boolean a(bst $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vo $$0) {
      return $$0 != null && vg.a(this.c, $$0, true);
   }

   public static ur b(bst $$0) {
      ur $$1 = $$0.f(new ur());
      if ($$0 instanceof cmw) {
         cuo $$2 = ((cmw)$$0).gc().f();
         if (!$$2.e()) {
            $$1.a("SelectedItem", $$2.a($$0.dR()));
         }
      }

      return $$1;
   }

   public ur a() {
      return this.c;
   }
}
