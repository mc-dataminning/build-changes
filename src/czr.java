import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import java.util.function.Consumer;

public record czr(boolean c) implements czq {
   public static final Codec<czr> a = RecordCodecBuilder.create(
      $$0 -> $$0.group(Codec.BOOL.optionalFieldOf("show_in_tooltip", true).forGetter(czr::a)).apply($$0, czr::new)
   );
   public static final ym<ByteBuf, czr> b = yk.b.a(czr::new, czr::a);
   private static final wo d = wo.c("item.unbreakable").a(n.j);

   @Override
   public void a(cwj.b $$0, Consumer<wo> $$1, cyf $$2) {
      if (this.c) {
         $$1.accept(d);
      }
   }

   public czr a(boolean $$0) {
      return new czr($$0);
   }

   public boolean a() {
      return this.c;
   }
}
