import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dn(tq c) {
   public static final Codec<dn> a = uo.j.xmap(dn::new, dn::a);
   public static final yn<ByteBuf, dn> b = yl.r.a(dn::new, dn::a);

   public boolean a(cwo $$0) {
      cyx $$1 = $$0.a(kv.b, cyx.a);
      return $$1.b(this.c);
   }

   public boolean a(buk $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable un $$0) {
      return $$0 != null && uf.a(this.c, $$0, true);
   }

   public static tq b(buk $$0) {
      tq $$1 = $$0.f(new tq());
      if ($$0 instanceof cow) {
         cwo $$2 = ((cow)$$0).gi().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dX()));
         }
      }

      return $$1;
   }

   public tq a() {
      return this.c;
   }
}
