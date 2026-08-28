import io.netty.buffer.ByteBuf;
import java.util.List;

public record aaw(long c, List<aaw.a> d) implements aai {
   public static final aai.b<aaw> a = aai.a("debug/redstone_update_order");
   public static final yw<vu, aaw> b = yw.a(yu.k, aaw::b, aaw.a.a.a(yu.a()), aaw::c, aaw::new);

   @Override
   public aai.b<aaw> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aaw.a> c() {
      return this.d;
   }

   public static record a(iv b, eyi c) {
      public static final yw<ByteBuf, aaw.a> a = yw.a(iv.b, aaw.a::a, eyi.a, aaw.a::b, aaw.a::new);

      public iv a() {
         return this.b;
      }

      public eyi b() {
         return this.c;
      }
   }
}
