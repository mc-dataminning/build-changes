import io.netty.buffer.ByteBuf;
import java.util.List;

public record abb(long c, List<abb.a> d) implements aan {
   public static final aan.b<abb> a = aan.a("debug/redstone_update_order");
   public static final zb<wa, abb> b = zb.a(yz.h, abb::b, abb.a.a.a(yz.a()), abb::c, abb::new);

   @Override
   public aan.b<abb> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abb.a> c() {
      return this.d;
   }

   public static record a(je b, erj c) {
      public static final zb<ByteBuf, abb.a> a = zb.a(je.b, abb.a::a, erj.a, abb.a::b, abb.a::new);

      public je a() {
         return this.b;
      }

      public erj b() {
         return this.c;
      }
   }
}
