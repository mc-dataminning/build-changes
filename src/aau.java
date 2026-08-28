import io.netty.buffer.ByteBuf;
import java.util.List;

public record aau(long c, List<aau.a> d) implements aag {
   public static final aag.b<aau> a = aag.a("debug/redstone_update_order");
   public static final yu<vs, aau> b = yu.a(ys.k, aau::b, aau.a.a.a(ys.a()), aau::c, aau::new);

   @Override
   public aag.b<aau> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aau.a> c() {
      return this.d;
   }

   public static record a(iu b, exd c) {
      public static final yu<ByteBuf, aau.a> a = yu.a(iu.b, aau.a::a, exd.a, aau.a::b, aau.a::new);

      public iu a() {
         return this.b;
      }

      public exd b() {
         return this.c;
      }
   }
}
