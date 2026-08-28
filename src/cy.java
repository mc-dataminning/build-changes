import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cy(tz c) {
   public static final Codec<cy> a = ux.j.xmap(cy::new, cy::a);
   public static final yw<ByteBuf, cy> b = yu.r.a(cy::new, cy::a);

   public boolean a(ke $$0) {
      dbg $$1 = $$0.a(kj.b, dbg.a);
      return $$1.b(this.c);
   }

   public boolean a(bwd $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uw $$0) {
      return $$0 != null && uo.a(this.c, $$0, true);
   }

   public static tz b(bwd $$0) {
      tz $$1 = $$0.f(new tz());
      if ($$0 instanceof cqy $$2) {
         cyy $$3 = $$2.gi().f();
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
