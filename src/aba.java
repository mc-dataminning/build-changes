import io.netty.buffer.ByteBuf;
import java.util.List;

public record aba(long c, List<aba.a> d) implements aam {
   public static final aam.b<aba> a = aam.a("debug/redstone_update_order");
   public static final za<vy, aba> b = za.a(yy.k, aba::b, aba.a.a.a(yy.a()), aba::c, aba::new);

   @Override
   public aam.b<aba> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aba.a> c() {
      return this.d;
   }

   public static record a(iw b, eyy c) {
      public static final za<ByteBuf, aba.a> a = za.a(iw.b, aba.a::a, eyy.a, aba.a::b, aba.a::new);

      public iw a() {
         return this.b;
      }

      public eyy b() {
         return this.c;
      }
   }
}
