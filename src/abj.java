import io.netty.buffer.ByteBuf;
import java.util.List;

public record abj(long c, List<abj.a> d) implements aav {
   public static final aav.b<abj> a = aav.a("debug/redstone_update_order");
   public static final zj<wi, abj> b = zj.a(zh.i, abj::b, abj.a.a.a(zh.a()), abj::c, abj::new);

   @Override
   public aav.b<abj> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abj.a> c() {
      return this.d;
   }

   public static record a(jh b, esw c) {
      public static final zj<ByteBuf, abj.a> a = zj.a(jh.b, abj.a::a, esw.a, abj.a::b, abj.a::new);

      public jh a() {
         return this.b;
      }

      public esw b() {
         return this.c;
      }
   }
}
