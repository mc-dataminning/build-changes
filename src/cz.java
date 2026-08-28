import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cz(tz c) {
   public static final Codec<cz> a = ux.j.xmap(cz::new, cz::a);
   public static final yw<ByteBuf, cz> b = yu.s.a(cz::new, cz::a);

   public boolean a(kf $$0) {
      dbv $$1 = $$0.a(kk.b, dbv.a);
      return $$1.b(this.c);
   }

   public boolean a(bwi $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uw $$0) {
      return $$0 != null && uo.a(this.c, $$0, true);
   }

   public static tz b(bwi $$0) {
      tz $$1 = $$0.f(new tz());
      if ($$0 instanceof crm $$2) {
         czn $$3 = $$2.gi().g();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dW()));
         }
      }

      return $$1;
   }

   public tz a() {
      return this.c;
   }
}
