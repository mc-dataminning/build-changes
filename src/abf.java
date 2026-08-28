import io.netty.buffer.ByteBuf;
import java.util.List;

public record abf(long c, List<abf.a> d) implements aar {
   public static final aar.b<abf> a = aar.a("debug/redstone_update_order");
   public static final zf<we, abf> b = zf.a(zd.i, abf::b, abf.a.a.a(zd.a()), abf::c, abf::new);

   @Override
   public aar.b<abf> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abf.a> c() {
      return this.d;
   }

   public static record a(jg b, esm c) {
      public static final zf<ByteBuf, abf.a> a = zf.a(jg.b, abf.a::a, esm.a, abf.a::b, abf.a::new);

      public jg a() {
         return this.b;
      }

      public esm b() {
         return this.c;
      }
   }
}
