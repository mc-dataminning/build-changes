import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dm(uk c) {
   public static final Codec<dm> a = vi.j.xmap(dm::new, dm::a);
   public static final zg<ByteBuf, dm> b = ze.p.a(dm::new, dm::a);

   public boolean a(cwb $$0) {
      cyk $$1 = $$0.a(ku.b, cyk.a);
      return $$1.b(this.c);
   }

   public boolean a(bue $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable vh $$0) {
      return $$0 != null && uz.a(this.c, $$0, true);
   }

   public static uk b(bue $$0) {
      uk $$1 = $$0.f(new uk());
      if ($$0 instanceof com) {
         cwb $$2 = ((com)$$0).gk().f();
         if (!$$2.f()) {
            $$1.a("SelectedItem", $$2.a($$0.dZ()));
         }
      }

      return $$1;
   }

   public uk a() {
      return this.c;
   }
}
