import io.netty.buffer.ByteBuf;
import java.util.List;

public record abi(long c, List<abi.a> d) implements aau {
   public static final aau.b<abi> a = aau.a("debug/redstone_update_order");
   public static final zi<wh, abi> b = zi.a(zg.k, abi::b, abi.a.a.a(zg.a()), abi::c, abi::new);

   @Override
   public aau.b<abi> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abi.a> c() {
      return this.d;
   }

   public static record a(jh b, euy c) {
      public static final zi<ByteBuf, abi.a> a = zi.a(jh.b, abi.a::a, euy.a, abi.a::b, abi.a::new);

      public jh a() {
         return this.b;
      }

      public euy b() {
         return this.c;
      }
   }
}
