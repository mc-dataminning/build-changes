import io.netty.buffer.ByteBuf;
import java.util.List;

public record abg(long c, List<abg.a> d) implements aas {
   public static final aas.b<abg> a = aas.a("debug/redstone_update_order");
   public static final zg<wf, abg> b = zg.a(ze.i, abg::b, abg.a.a.a(ze.a()), abg::c, abg::new);

   @Override
   public aas.b<abg> a() {
      return a;
   }

   public long b() {
      return this.c;
   }

   public List<abg.a> c() {
      return this.d;
   }

   public static record a(jh b, ess c) {
      public static final zg<ByteBuf, abg.a> a = zg.a(jh.b, abg.a::a, ess.a, abg.a::b, abg.a::new);

      public jh a() {
         return this.b;
      }

      public ess b() {
         return this.c;
      }
   }
}
