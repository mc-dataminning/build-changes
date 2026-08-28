import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czs(boolean c) implements czr {
   public static final Codec<czs> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czs::a)).apply($$0, czs::new)
   );
   public static final yn<ByteBuf, czs> b = yl.b.a(czs::new, czs::a);
   private static final wp d = wp.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwk.b $$0, Consumer<wp> $$1, cyg $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czs a(boolean $$0) {
      return new czs($$0);
   }

   public boolean a() {
      return this.c;
   }
}
