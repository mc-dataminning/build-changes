import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cvh(boolean c) implements cvg {
   public static final Codec<cvh> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(axe.a(Codec.BOOL, "show_in_tooltip", true).forGetter(cvh::a)).apply($$0, cvh::new)
   );
   public static final yq<ByteBuf, cvh> b = yo.b.a(cvh::new, cvh::a);
   private static final ws d = ws.c("item.unbreakable").a(n.j);

   @Override
   public void a(Consumer<ws> $$0, ctu $$1) {
      if (this.c) {
         $$0.accept(d);
      }
   }

   public boolean a() {
      return this.c;
   }
}
