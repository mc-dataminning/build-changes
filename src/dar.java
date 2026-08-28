import com.mojang.serialization.Codec;
import io.netty.buffer.ByteBuf;
import java.util.List;
import java.util.function.Consumer;

public record dar(List<dwk.c> d) implements dbx {
   public static final Codec<dar> a = dwk.c.b.xmap(dar::new, dar::a);
   public static final yu<ByteBuf, dar> b = dwk.c.c.a(ys.a()).a(dar::new, dar::a);
   public static final dar c = new dar(List.of());

   @Override
   public void a(cyo.b $$0, Consumer<ww> $$1, dah $$2, ke $$3) {
      $$1.accept(ww.a("container.beehive.bees", this.d.size(), 3).a(n.h));
   }

   public List<dwk.c> a() {
      return this.d;
   }
}
