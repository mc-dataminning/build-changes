import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cz(tz c) {
   public static final Codec<cz> a = uz.f.xmap(cz::new, cz::a);
   public static final yy<ByteBuf, cz> b = yw.s.a(cz::new, cz::a);

   public boolean a(kf $$0) {
      dcg $$1 = $$0.a(kk.b, dcg.a);
      return $$1.b(this.c);
   }

   public boolean a(bwt $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uy $$0) {
      return $$0 != null && uo.a(this.c, $$0, true);
   }

   public static tz b(bwt $$0) {
      tz $$1 = $$0.h(new tz());
      if ($$0 instanceof crx $$2) {
         czy $$3 = $$2.gj().g();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dX()));
         }
      }

      return $$1;
   }

   public tz a() {
      return this.c;
   }
}
