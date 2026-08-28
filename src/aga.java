import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class aga implements zg<abu> {
   public static final yx<wk, aga> a = yx.a(yv.g, aga::b, aga.a.b.a(yv.a()), aga::e, aga::new);
   private final int b;
   private final List<aga.a> c;

   public aga(int $$0, Collection<bus> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bus $$2 : $$1) {
         this.c.add(new aga.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private aga(int $$0, List<aga.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zi<aga> a() {
      return agg.bb;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<aga.a> e() {
      return this.c;
   }

   public static record a(jm<bur> c, double d, Collection<buu> e) {
      public static final yx<ByteBuf, buu> a = yx.a(akr.b, buu::b, yv.j, buu::c, buu.a.e, buu::d, buu::new);
      public static final yx<wk, aga.a> b = yx.a(bur.b, aga.a::a, yv.j, aga.a::b, a.a(yv.a(ArrayList::new)), aga.a::c, aga.a::new);

      public jm<bur> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<buu> c() {
         return this.e;
      }
   }
}
