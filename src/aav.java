import io.netty.buffer.ByteBuf;
import java.util.List;

public record aav(ake<? extends ji<?>> b, List<jm.a> c) implements yz<aat> {
   private static final yq<ByteBuf, ake<? extends ji<?>>> d = akf.b.a(ake::a, ake::a);
   public static final yq<vs, aav> a = yq.a(d, aav::b, jm.a.a.a(yo.a()), aav::e, aav::new);

   @Override
   public zb<aav> a() {
      return aay.b;
   }

   public void a(aat $$0) {
      $$0.a(this);
   }

   public List<jm.a> e() {
      return this.c;
   }
}
