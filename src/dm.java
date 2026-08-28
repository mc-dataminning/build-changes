import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dm(um c) {
   public static final Codec<dm> a = vk.j.xmap(dm::new, dm::a);
   public static final zi<ByteBuf, dm> b = zg.r.a(dm::new, dm::a);

   public boolean a(cxg $$0) {
      czp $$1 = $$0.a(ku.b, czp.a);
      return $$1.b(this.c);
   }

   public boolean a(bvb $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vj $$0) {
      return $$0 != null && vb.a(this.c, $$0, true);
   }

   public static um b(bvb $$0) {
      um $$1 = $$0.f(new um());
      if ($$0 instanceof cpo) {
         cxg $$2 = ((cpo)$$0).gi().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dY()));
         }
      }

      return $$1;
   }

   public um a() {
      return this.c;
   }
}
