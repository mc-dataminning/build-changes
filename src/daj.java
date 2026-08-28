import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record daj(boolean c) implements dai {
   public static final Codec<daj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(daj::a)).apply($$0, daj::new)
   );
   public static final yn<ByteBuf, daj> b = yl.b.a(daj::new, daj::a);
   private static final wp d = wp.c("item.unbreakable").a(n.j);

   @Override
   public void a(cxd.b $$0, Consumer<wp> $$1, cyx $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public daj a(boolean $$0) {
      return new daj($$0);
   }

   public boolean a() {
      return this.c;
   }
}
