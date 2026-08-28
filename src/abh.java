import io.netty.buffer.ByteBuf;
import java.util.List;

public record abh(long c, List<abh.a> d) implements aat {
   public static final aat.b<abh> a = aat.a("debug/redstone_update_order");
   public static final zh<wg, abh> b = zh.a(zf.j, abh::b, abh.a.a.a(zf.a()), abh::c, abh::new);

   @Override
   public aat.b<abh> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abh.a> c() {
      return this.d;
   }

   public static record a(jh b, etd c) {
      public static final zh<ByteBuf, abh.a> a = zh.a(jh.b, abh.a::a, etd.a, abh.a::b, abh.a::new);

      public jh a() {
         return this.b;
      }

      public etd b() {
         return this.c;
      }
   }
}
