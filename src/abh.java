import io.netty.buffer.ByteBuf;
import java.util.List;

public record abh(long c, List<abh.a> d) implements aat {
   public static final aat.b<abh> a = aat.a("debug/redstone_update_order");
   public static final ze<vy, abh> b = ze.a(zc.k, abh::b, abh.a.a.a(zc.a()), abh::c, abh::new);

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

   public static record a(iw b, ezi c) {
      public static final ze<ByteBuf, abh.a> a = ze.a(iw.b, abh.a::a, ezi.a, abh.a::b, abh.a::new);

      public iw a() {
         return this.b;
      }

      public ezi b() {
         return this.c;
      }
   }
}
