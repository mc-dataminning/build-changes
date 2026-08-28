import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record da(ua c) {
   public static final Codec<da> a = vb.f.xmap(da::new, da::a);
   public static final ze<ByteBuf, da> b = zc.s.a(da::new, da::a);

   public boolean a(kg $$0) {
      dcs $$1 = $$0.a(kl.b, dcs.a);
      return $$1.b(this.c);
   }

   public boolean a(bxe $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable va $$0) {
      return $$0 != null && up.a(this.c, $$0, true);
   }

   public static ua b(bxe $$0) {
      ua $$1 = $$0.h(new ua());
      if ($$0 instanceof csi $$2) {
         dak $$3 = $$2.gj().g();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dX()));
         }
      }

      return $$1;
   }

   public ua a() {
      return this.c;
   }
}
