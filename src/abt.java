import io.netty.buffer.ByteBuf;
import java.util.List;

public record abt(long c, List<abt.a> d) implements abf {
   public static final abf.b<abt> a = abf.a("debug/redstone_update_order");
   public static final zt<ws, abt> b = zt.a(zr.k, abt::b, abt.a.a.a(zr.a()), abt::c, abt::new);

   @Override
   public abf.b<abt> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abt.a> c() {
      return this.d;
   }

   public static record a(jh b, eux c) {
      public static final zt<ByteBuf, abt.a> a = zt.a(jh.b, abt.a::a, eux.a, abt.a::b, abt.a::new);

      public jh a() {
         return this.b;
      }

      public eux b() {
         return this.c;
      }
   }
}
