import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record dat(boolean c) implements das {
   public static final Codec<dat> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dat::a)).apply($$0, dat::new)
   );
   public static final zt<ByteBuf, dat> b = zr.b.a(dat::new, dat::a);
   private static final xv d = xv.c("item.unbreakable").a(n.j);

   @Override
   public void a(cxl.b $$0, Consumer<xv> $$1, czh $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public dat a(boolean $$0) {
      return new dat($$0);
   }

   public boolean a() {
      return this.c;
   }
}
