import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agn implements zv<ach> {
   public static final zm<wz, agn> a = zm.a(zk.g, agn::b, agn.a.b.a(zk.a()), agn::e, agn::new);
   private final int b;
   private final List<agn.a> c;

   public agn(int $$0, Collection<bur> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bur $$2 : $$1) {
         this.c.add(new agn.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agn(int $$0, List<agn.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zx<agn> a() {
      return agt.bb;
   }

   public void a(ach $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agn.a> e() {
      return this.c;
   }

   public static record a(ji<buq> c, double d, Collection<but> e) {
      public static final zm<ByteBuf, but> a = zm.a(
         kc.g, but::b, zk.j, but::d, but.a.e, but::e, ($$0, $$1, $$2) -> new but($$0, "Unknown synced attribute modifier", $$1, $$2)
      );
      public static final zm<wz, agn.a> b = zm.a(zk.b(lq.c), agn.a::a, zk.j, agn.a::b, a.a(zk.a(ArrayList::new)), agn.a::c, agn.a::new);

      public ji<buq> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<but> c() {
         return this.e;
      }
   }
}
