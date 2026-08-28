import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agj implements zl<aca> {
   public static final zc<wp, agj> a = zc.a(za.h, agj::b, agj.a.b.a(za.a()), agj::e, agj::new);
   private final int b;
   private final List<agj.a> c;

   public agj(int $$0, Collection<bvq> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bvq $$2 : $$1) {
         this.c.add(new agj.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agj(int $$0, List<agj.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zn<agj> a() {
      return agp.bc;
   }

   public void a(aca $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agj.a> e() {
      return this.c;
   }

   public static record a(jo<bvp> c, double d, Collection<bvs> e) {
      public static final zc<ByteBuf, bvs> a = zc.a(ale.b, bvs::b, za.k, bvs::c, bvs.a.e, bvs::d, bvs::new);
      public static final zc<wp, agj.a> b = zc.a(bvp.b, agj.a::a, za.k, agj.a::b, a.a(za.a(ArrayList::new)), agj.a::c, agj.a::new);

      public jo<bvp> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bvs> c() {
         return this.e;
      }
   }
}
