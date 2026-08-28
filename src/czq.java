import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czq(boolean c) implements czp {
   public static final Codec<czq> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czq::a)).apply($$0, czq::new)
   );
   public static final zh<ByteBuf, czq> b = zf.b.a(czq::new, czq::a);
   private static final xj d = xj.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwi.b $$0, Consumer<xj> $$1, cye $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czq a(boolean $$0) {
      return new czq($$0);
   }

   public boolean a() {
      return this.c;
   }
}
