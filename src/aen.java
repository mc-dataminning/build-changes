import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aen implements xz<aai> {
   public static final xq<vd, aen> a = xq.a(xo.d, aen::b, aen.a.b.a(xo.a()), aen::e, aen::new);
   private final int b;
   private final List<aen.a> c;

   public aen(int $$0, Collection<bqa> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bqa $$2 : $$1) {
         this.c.add(new aen.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aen(int $$0, List<aen.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yb<aen> a() {
      return aet.bb;
   }

   public void a(aai $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aen.a> e() {
      return this.c;
   }

   public static record a(il<bpz> c, double d, Collection<bqc> e) {
      public static final xq<ByteBuf, bqc> a = xq.a(
         je.g, bqc::a, xo.g, bqc::c, bqc.a.e, bqc::b, ($$0, $$1, $$2) -> new bqc($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final xq<vd, aen.a> b = xq.a(xo.b(ki.c), aen.a::a, xo.g, aen.a::b, a.a(xo.a(ArrayList::new)), aen.a::c, aen.a::new);

      public il<bpz> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bqc> c() {
         return this.e;
      }
   }
}
