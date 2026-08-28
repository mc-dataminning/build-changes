import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record dao(boolean c) implements dan {
   public static final Codec<dao> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(dao::a)).apply($$0, dao::new)
   );
   public static final zt<ByteBuf, dao> b = zr.b.a(dao::new, dao::a);
   private static final xv d = xv.c("item.unbreakable").a(n.j);

   @Override
   public void a(cxg.b $$0, Consumer<xv> $$1, czc $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public dao a(boolean $$0) {
      return new dao($$0);
   }

   public boolean a() {
      return this.c;
   }
}
