import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dn(tq c) {
   public static final Codec<dn> a = uo.j.xmap(dn::new, dn::a);
   public static final yn<ByteBuf, dn> b = yl.r.a(dn::new, dn::a);

   public boolean a(cxh $$0) {
      czo $$1 = $$0.a(kv.b, czo.a);
      return $$1.b(this.c);
   }

   public boolean a(bva $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable un $$0) {
      return $$0 != null && uf.a(this.c, $$0, true);
   }

   public static tq b(bva $$0) {
      tq $$1 = $$0.f(new tq());
      if ($$0 instanceof cpr $$2) {
         cxh $$3 = $$2.gl().f();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dW()));
         }
      }

      return $$1;
   }

   public tq a() {
      return this.c;
   }
}
