import io.netty.buffer.ByteBuf;
import java.util.List;

public record aam(long c, List<aam.a> d) implements zy {
   public static final zy.b<aam> a = zy.a("debug/redstone_update_order");
   public static final ym<vl, aam> b = ym.a(yk.k, aam::b, aam.a.a.a(yk.a()), aam::c, aam::new);

   @Override
   public zy.b<aam> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aam.a> c() {
      return this.d;
   }

   public static record a(ji b, euh c) {
      public static final ym<ByteBuf, aam.a> a = ym.a(ji.b, aam.a::a, euh.a, aam.a::b, aam.a::new);

      public ji a() {
         return this.b;
      }

      public euh b() {
         return this.c;
      }
   }
}
