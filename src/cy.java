import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cy(tz c) {
   public static final Codec<cy> a = ux.j.xmap(cy::new, cy::a);
   public static final yw<ByteBuf, cy> b = yu.r.a(cy::new, cy::a);

   public boolean a(ke $$0) {
      dbl $$1 = $$0.a(kj.b, dbl.a);
      return $$1.b(this.c);
   }

   public boolean a(bwf $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uw $$0) {
      return $$0 != null && uo.a(this.c, $$0, true);
   }

   public static tz b(bwf $$0) {
      tz $$1 = $$0.f(new tz());
      if ($$0 instanceof crc $$2) {
         czd $$3 = $$2.gj().g();
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
