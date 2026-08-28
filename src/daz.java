import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record daz(boolean c) implements day {
   public static final Codec<daz> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(daz::a)).apply($$0, daz::new)
   );
   public static final yt<ByteBuf, daz> b = yr.b.a(daz::new, daz::a);
   private static final wv d = wv.c("item.unbreakable").a(n.j);

   @Override
   public void a(cxu.b $$0, Consumer<wv> $$1, czn $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public daz a(boolean $$0) {
      return new daz($$0);
   }

   public boolean a() {
      return this.c;
   }
}
