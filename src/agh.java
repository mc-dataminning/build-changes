import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agh implements zf<abu> {
   public static final yw<wj, agh> a = yw.a(yu.h, agh::b, agh.a.b.a(yu.a()), agh::e, agh::new);
   private final int b;
   private final List<agh.a> c;

   public agh(int $$0, Collection<bye> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bye $$2 : $$1) {
         this.c.add(new agh.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agh(int $$0, List<agh.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zh<agh> a() {
      return agn.bg;
   }

   public void a(abu $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agh.a> e() {
      return this.c;
   }

   public static record a(je<byd> c, double d, Collection<byg> e) {
      public static final yw<ByteBuf, byg> a = yw.a(alg.b, byg::a, yu.m, byg::b, byg.a.e, byg::c, byg::new);
      public static final yw<wj, agh.a> b = yw.a(byd.b, agh.a::a, yu.m, agh.a::b, a.a(yu.a(ArrayList::new)), agh.a::c, agh.a::new);

      public je<byd> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<byg> c() {
         return this.e;
      }
   }
}
