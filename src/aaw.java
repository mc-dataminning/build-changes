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

   public static record a(iu b, exw c) {
      public static final yw<ByteBuf, aaw.a> a = yw.a(iu.b, aaw.a::a, exw.a, aaw.a::b, aaw.a::new);

      public iu a() {
         return this.b;
      }

      public exw b() {
         return this.c;
      }
   }
}
