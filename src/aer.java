import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aer implements yb<aam> {
   public static final xs<vf, aer> a = xs.a(xq.d, aer::b, aer.a.b.a(xq.a()), aer::e, aer::new);
   private final int b;
   private final List<aer.a> c;

   public aer(int $$0, Collection<bqs> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bqs $$2 : $$1) {
         this.c.add(new aer.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aer(int $$0, List<aer.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public yd<aer> a() {
      return aex.bb;
   }

   public void a(aam $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aer.a> e() {
      return this.c;
   }

   public static record a(il<bqr> c, double d, Collection<bqu> e) {
      public static final xs<ByteBuf, bqu> a = xs.a(
         jf.g, bqu::a, xq.g, bqu::c, bqu.a.e, bqu::b, ($$0, $$1, $$2) -> new bqu($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final xs<vf, aer.a> b = xs.a(xq.b(kj.c), aer.a::a, xq.g, aer.a::b, a.a(xq.a(ArrayList::new)), aer.a::c, aer.a::new);

      public il<bqr> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bqu> c() {
         return this.e;
      }
   }
}
