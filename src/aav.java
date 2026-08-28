import io.netty.buffer.ByteBuf;
import java.util.List;

public record aav(aku<? extends ke<?>> b, List<ki.a> c) implements yw<aat> {
   private static final yn<ByteBuf, aku<? extends ke<?>>> d = akv.b.a(aku::a, aku::a);
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
