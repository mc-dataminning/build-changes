import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agf implements zd<abs> {
   public static final yu<wh, agf> a = yu.a(ys.h, agf::b, agf.a.b.a(ys.a()), agf::e, agf::new);
   private final int b;
   private final List<agf.a> c;

   public agf(int $$0, Collection<byb> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (byb $$2 : $$1) {
         this.c.add(new agf.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agf(int $$0, List<agf.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zf<agf> a() {
      return agl.bg;
   }

   public void a(abs $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agf.a> e() {
      return this.c;
   }

   public static record a(je<bya> c, double d, Collection<byd> e) {
      public static final yu<ByteBuf, byd> a = yu.a(ale.b, byd::b, ys.m, byd::c, byd.a.e, byd::d, byd::new);
      public static final yu<wh, agf.a> b = yu.a(bya.b, agf.a::a, ys.m, agf.a::b, a.a(ys.a(ArrayList::new)), agf.a::c, agf.a::new);

      public je<bya> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<byd> c() {
         return this.e;
      }
   }
}
