import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dn(tq c) {
   public static final Codec<dn> a = uo.j.xmap(dn::new, dn::a);
   public static final ym<ByteBuf, dn> b = yk.r.a(dn::new, dn::a);

   public boolean a(cwn $$0) {
      cyw $$1 = $$0.a(kv.b, cyw.a);
      return $$1.b(this.c);
   }

   public boolean a(buj $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable un $$0) {
      return $$0 != null && uf.a(this.c, $$0, true);
   }

   public static tq b(buj $$0) {
      tq $$1 = $$0.f(new tq());
      if ($$0 instanceof cov) {
         cwn $$2 = ((cov)$$0).gi().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dY()));
         }
      }

      return $$1;
   }

   public tq a() {
      return this.c;
   }
}
