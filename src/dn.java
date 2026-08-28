import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record dn(tw c) {
   public static final Codec<dn> a = uu.j.xmap(dn::new, dn::a);
   public static final yt<ByteBuf, dn> b = yr.r.a(dn::new, dn::a);

   public boolean a(cxy $$0) {
      dae $$1 = $$0.a(kx.b, dae.a);
      return $$1.b(this.c);
   }

   public boolean a(bvs $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable ut $$0) {
      return $$0 != null && ul.a(this.c, $$0, true);
   }

   public static tw b(bvs $$0) {
      tw $$1 = $$0.f(new tw());
      if ($$0 instanceof cqi $$2) {
         cxy $$3 = $$2.gi().f();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dX()));
         }
      }

      return $$1;
   }

   public tw a() {
      return this.c;
   }
}
