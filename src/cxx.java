import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxx(boolean c) implements cxw {
   public static final Codec<cxx> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxx::a)).apply($$0, cxx::new)
   );
   public static final yw<ByteBuf, cxx> b = yu.b.a(cxx::new, cxx::a);
   private static final wy d = wy.c("item.unbreakable").a(n.j);

   @Override
   public void a(cuj.b $$0, Consumer<wy> $$1, cwk $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxx a(boolean $$0) {
      return new cxx($$0);
   }

   public boolean a() {
      return this.c;
   }
}
