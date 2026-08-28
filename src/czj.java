import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czj(boolean c) implements czi {
   public static final Codec<czj> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czj::a)).apply($$0, czj::new)
   );
   public static final zj<ByteBuf, czj> b = zh.b.a(czj::new, czj::a);
   private static final xl d = xl.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwb.b $$0, Consumer<xl> $$1, cxx $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czj a(boolean $$0) {
      return new czj($$0);
   }

   public boolean a() {
      return this.c;
   }
}
