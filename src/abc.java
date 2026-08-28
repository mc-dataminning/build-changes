import io.netty.buffer.ByteBuf;
import java.util.List;

public record abc(long c, List<abc.a> d) implements aao {
   public static final aao.b<abc> a = aao.a("debug/redstone_update_order");
   public static final zc<wb, abc> b = zc.a(za.i, abc::b, abc.a.a.a(za.a()), abc::c, abc::new);

   @Override
   public aao.b<abc> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abc.a> c() {
      return this.d;
   }

   public static record a(jf b, esb c) {
      public static final zc<ByteBuf, abc.a> a = zc.a(jf.b, abc.a::a, esb.a, abc.a::b, abc.a::new);

      public jf a() {
         return this.b;
      }

      public esb b() {
         return this.c;
      }
   }
}
