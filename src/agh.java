import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agh implements zf<abu> {
   public static final yw<wj, agh> a = yw.a(yu.h, agh::b, agh.a.b.a(yu.a()), agh::e, agh::new);
   private final int b;
   private final List<agh.a> c;

   public agh(int $$0, Collection<byl> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (byl $$2 : $$1) {
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

   public static record a(jf<byk> c, double d, Collection<byn> e) {
      public static final yw<ByteBuf, byn> a = yw.a(alg.b, byn::a, yu.m, byn::b, byn.a.e, byn::c, byn::new);
      public static final yw<wj, agh.a> b = yw.a(byk.b, agh.a::a, yu.m, agh.a::b, a.a(yu.a(ArrayList::new)), agh.a::c, agh.a::new);

      public jf<byk> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<byn> c() {
         return this.e;
      }
   }
}
