import io.netty.buffer.ByteBuf;
import java.util.List;

public record aan(long c, List<aan.a> d) implements zz {
   public static final zz.b<aan> a = zz.a("debug/redstone_update_order");
   public static final yn<vl, aan> b = yn.a(yl.k, aan::b, aan.a.a.a(yl.a()), aan::c, aan::new);

   @Override
   public zz.b<aan> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aan.a> c() {
      return this.d;
   }

   public static record a(ji b, eui c) {
      public static final yn<ByteBuf, aan.a> a = yn.a(ji.b, aan.a::a, eui.a, aan.a::b, aan.a::new);

      public ji a() {
         return this.b;
      }

      public eui b() {
         return this.c;
      }
   }
}
