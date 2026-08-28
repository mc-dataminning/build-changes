import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import javax.annotation.Nullable;

public record cy(tx c) {
   public static final Codec<cy> a = uv.j.xmap(cy::new, cy::a);
   public static final yu<ByteBuf, cy> b = ys.r.a(cy::new, cy::a);

   public boolean a(ke $$0) {
      dba $$1 = $$0.a(kj.b, dba.a);
      return $$1.b(this.c);
   }

   public boolean a(bwa $$0) {
      return this.a(b($$0));
   }

   public boolean a(@Nullable uu $$0) {
      return $$0 != null && um.a(this.c, $$0, true);
   }

   public static tx b(bwa $$0) {
      tx $$1 = $$0.f(new tx());
      if ($$0 instanceof cqs $$2) {
         cys $$3 = $$2.gi().f();
         if (!$$3.f()) {
            $$1.a("SelectedItem", $$3.a($$0.dX()));
         }
      }

      return $$1;
   }

   public tx a() {
      return this.c;
   }
}
