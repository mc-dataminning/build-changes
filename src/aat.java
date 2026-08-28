import io.netty.buffer.ByteBuf;
import java.util.List;

public record aat(long c, List<aat.a> d) implements aaf {
   public static final aaf.b<aat> a = aaf.a("debug/redstone_update_order");
   public static final yt<vr, aat> b = yt.a(yr.k, aat::b, aat.a.a.a(yr.a()), aat::c, aat::new);

   @Override
   public aaf.b<aat> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<aat.a> c() {
      return this.d;
   }

   public static record a(jj b, ewb c) {
      public static final yt<ByteBuf, aat.a> a = yt.a(jj.b, aat.a::a, ewb.a, aat.a::b, aat.a::new);

      public jj a() {
         return this.b;
      }

      public ewb b() {
         return this.c;
      }
   }
}
