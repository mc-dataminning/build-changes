import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxr(boolean c) implements cxq {
   public static final Codec<cxr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxr::a)).apply($$0, cxr::new)
   );
   public static final zj<ByteBuf, cxr> b = zh.b.a(cxr::new, cxr::a);
   private static final xl d = xl.c("item.unbreakable").a(n.j);

   @Override
   public void a(cuf.b $$0, Consumer<xl> $$1, cwd $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxr a(boolean $$0) {
      return new cxr($$0);
   }

   public boolean a() {
      return this.c;
   }
}
