import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cza(boolean c) implements cyz {
   public static final Codec<cza> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cza::a)).apply($$0, cza::new)
   );
   public static final zc<ByteBuf, cza> b = za.b.a(cza::new, cza::a);
   private static final xe d = xe.c("item.unbreakable").a(n.j);

   @Override
   public void a(cvn.b $$0, Consumer<xe> $$1, cxk $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cza a(boolean $$0) {
      return new cza($$0);
   }

   public boolean a() {
      return this.c;
   }
}
