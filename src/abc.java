import io.netty.buffer.ByteBuf;
import java.util.List;

public record abc(ald<? extends jr<?>> b, List<jv.a> c) implements zd<aba> {
   private static final yu<ByteBuf, ald<? extends jr<?>>> d = ale.b.a(ald::a, ald::a);
   public static final yu<vs, abc> a = yu.a(d, abc::b, jv.a.a.a(ys.a()), abc::e, abc::new);

   @Override
   public zf<abc> a() {
      return abg.b;
   }

   public void a(aba $$0) {
      $$0.a(this);
   }

   public List<jv.a> e() {
      return this.c;
   }
}
