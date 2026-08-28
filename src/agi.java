import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agi implements zk<abz> {
   public static final zb<wo, agi> a = zb.a(yz.g, agi::b, agi.a.b.a(yz.a()), agi::e, agi::new);
   private final int b;
   private final List<agi.a> c;

   public agi(int $$0, Collection<bvi> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bvi $$2 : $$1) {
         this.c.add(new agi.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agi(int $$0, List<agi.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zm<agi> a() {
      return ago.bc;
   }

   public void a(abz $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agi.a> e() {
      return this.c;
   }

   public static record a(jn<bvh> c, double d, Collection<bvk> e) {
      public static final zb<ByteBuf, bvk> a = zb.a(alb.b, bvk::b, yz.j, bvk::c, bvk.a.e, bvk::d, bvk::new);
      public static final zb<wo, agi.a> b = zb.a(bvh.b, agi.a::a, yz.j, agi.a::b, a.a(yz.a(ArrayList::new)), agi.a::c, agi.a::new);

      public jn<bvh> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bvk> c() {
         return this.e;
      }
   }
}
