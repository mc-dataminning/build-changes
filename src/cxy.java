import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record cxy(boolean c) implements cxx {
   public static final Codec<cxy> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(cxy::a)).apply($$0, cxy::new)
   );
   public static final zn<ByteBuf, cxy> b = zl.b.a(cxy::new, cxy::a);
   private static final xp d = xp.c("item.unbreakable").a(n.j);

   @Override
   public void a(cum.b $$0, Consumer<xp> $$1, cwk $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public cxy a(boolean $$0) {
      return new cxy($$0);
   }

   public boolean a() {
      return this.c;
   }
}
