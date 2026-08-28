import com.google.common.collect.Lists;
import io.netty.buffer.ByteBuf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class agm implements zo<acd> {
   public static final zf<ws, agm> a = zf.a(zd.h, agm::b, agm.a.b.a(zd.a()), agm::e, agm::new);
   private final int b;
   private final List<agm.a> c;

   public agm(int $$0, Collection<bvz> $$1) {
      this.b = $$0;
      this.c = Lists.newArrayList();

      for (bvz $$2 : $$1) {
         this.c.add(new agm.a($$2.a(), $$2.b(), $$2.c()));
      }
   }

   private agm(int $$0, List<agm.a> $$1) {
      this.b = $$0;
      this.c = $$1;
   }

   @Override
   public zq<agm> a() {
      return ags.bc;
   }

   public void a(acd $$0) {
      $$0.a(this);
   }

   public int b() {
      return this.b;
   }

   public List<agm.a> e() {
      return this.c;
   }

   public static record a(jp<bvy> c, double d, Collection<bwb> e) {
      public static final zf<ByteBuf, bwb> a = zf.a(alh.b, bwb::b, zd.k, bwb::c, bwb.a.e, bwb::d, bwb::new);
      public static final zf<ws, agm.a> b = zf.a(bvy.b, agm.a::a, zd.k, agm.a::b, a.a(zd.a(ArrayList::new)), agm.a::c, agm.a::new);

      public jp<bvy> a() {
         return this.c;
      }

      public double b() {
         return this.d;
      }

      public Collection<bwb> c() {
         return this.e;
      }
   }
}
