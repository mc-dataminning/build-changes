import io.netty.buffer.ByteBuf;
import java.util.List;

public record aav(akt<? extends ke<?>> b, List<ki.a> c) implements yw<aat> {
   private static final yn<ByteBuf, akt<? extends ke<?>>> d = aku.b.a(akt::a, akt::a);
   public static final yn<vl, aav> a = yn.a(d, aav::b, ki.a.a.a(yl.a()), aav::e, aav::new);

   @Override
   public yy<aav> a() {
      return aaz.b;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }

   public List<ki.a> e() {
      return this.c;
   }
}
