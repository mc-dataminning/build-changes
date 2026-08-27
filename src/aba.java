import io.netty.buffer.ByteBuf;
import java.util.List;

public record aba(akm<? extends jk<?>> b, List<jo.a> c) implements ze<aay> {
   private static final yv<ByteBuf, akm<? extends jk<?>>> d = akn.b.a(akm::a, akm::a);
   public static final yv<vx, aba> a = yv.a(d, aba::b, jo.a.a.a(yt.a()), aba::e, aba::new);

   @Override
   public zg<aba> a() {
      return abe.b;
   }

   public void a(aay $$0) {
      $$0.a(this);
   }

   public List<jo.a> e() {
      return this.c;
   }
}
