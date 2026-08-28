import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agt implements zr<acg> {
   public static final zi<wv, agt> a = zi.a(zg.h, agt::b, agt.a.b.a(zg.a()), agt::e, agt::new);
   private final int b;
   private final List<agt.a> c;

   public agt(int $$0, Collection<bxb> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bxb $$2 : $$1) {
         this.c.add(new agt.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agt(int $$0, List<agt.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zt<agt> a() {
      return agz.bg;
   }

   public void a(acg $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agt.a> e() {
      return this.c;
   }

   public static record a(jq<bxa> c, double d, Collection<bxd> e) {
      public static final zi<ByteBuf, bxd> a = zi.a(alp.b, bxd::b, zg.m, bxd::c, bxd.a.e, bxd::d, bxd::new);
      public static final zi<wv, agt.a> b = zi.a(bxa.b, agt.a::a, zg.m, agt.a::b, a.a(zg.a(ArrayList::new)), agt.a::c, agt.a::new);

      public jq<bxa> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bxd> c() {
         return this.e;
      }
   }
}
