import io.netty.buffer.ByteBuf;
import java.util.List;

public record aay(long c, List<aay.a> d) implements aak {
   public static final aak.b<aay> a = aak.a("debug/redstone_update_order");
   public static final yy<vw, aay> b = yy.a(yw.k, aay::b, aay.a.a.a(yw.a()), aay::c, aay::new);

   @Override
   public aak.b<aay> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aay.a> c() {
      return this.d;
   }

   public static record a(iv b, eyw c) {
      public static final yy<ByteBuf, aay.a> a = yy.a(iv.b, aay.a::a, eyw.a, aay.a::b, aay.a::new);

      public iv a() {
         return this.b;
      }

      public eyw b() {
         return this.c;
      }
   }
}
