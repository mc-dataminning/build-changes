import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dm(ul c) {
   public static final Codec<dm> a = vj.j.xmap(dm::new, dm::a);
   public static final zh<ByteBuf, dm> b = zf.q.a(dm::new, dm::a);

   public boolean a(cwm $$0) {
      cyv $$1 = $$0.a(ku.b, cyv.a);
      return $$1.b(this.c);
   }

   public boolean a(bul $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vi $$0) {
      return $$0 != null && va.a(this.c, $$0, true);
   }

   public static ul b(bul $$0) {
      ul $$1 = $$0.f(new ul());
      if ($$0 instanceof cou) {
         cwm $$2 = ((cou)$$0).gg().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dX()));
         }
      }

      return $$1;
   }

   public ul a() {
      return this.c;
   }
}
